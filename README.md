# Java Servlet Crash Repo 🔥

## 🤔 What the F*** is a Servlet?

A **Servlet** is a Java class that handles HTTP requests and responses on the server side. It's the bare-metal way to build web apps in Java before frameworks like Spring Boot took over.

### Think of it like:
```
🧠 Controller class in Spring Boot = 💩 Servlet in legacy Java EE
```

---

## ⚙️ How It Works (Simple Flow)

1. User hits a URL like `http://localhost:8080/hello`
2. Server (like Apache Tomcat) receives that request
3. A **Servlet** mapped to `/hello` is triggered
4. It runs Java code and sends back a response (HTML, JSON, etc.)

---

## 🧱 Basic Servlet Example

```java
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getWriter().println("Hello from Servlet");
    }
}
```

- `@WebServlet("/hello")` — maps this class to the URL `/hello`
- `doGet` — runs on GET requests
- `HttpServletRequest` — incoming data
- `HttpServletResponse` — output data

---

## 🔄 Servlet Lifecycle

- `init()` → runs once when servlet is created
- `service()` → called on every request
- `doGet()` / `doPost()` → called depending on HTTP method
- `destroy()` → called before servlet is removed

---

## 🤬 Why Servlets Feel Like Pain

- Too verbose
- Mix of logic and HTML (via JSP)
- No auto-routing, no dependency injection
- Manual everything (sessions, routing, response structure)

---

## 🧠 What You *Should* Know Before Spring Boot

| Concept | Why it matters |
|--------|----------------|
| HTTP basics | GET/POST, Headers, Body |
| Servlet API | So you understand what Spring abstracts |
| JSP (just a bit) | Legacy templating engine |
| Web.xml | Old-school config, optional |
| Maven | Project and dependency management |

---

## 🚀 What Spring Boot Does for You

| Servlet Style | Spring Boot |
|---------------|-------------|
| `HttpServlet` | `@RestController` |
| Manual routing | `@RequestMapping("/route")` |
| Manual dependency creation | `@Autowired` for DI |
| JSP | Thymeleaf or frontend frameworks |
| Tedious | Minimal, auto-configured |

---

## ✅ TL;DR

- Servlets are the **raw HTTP layer** of Java web apps
- Learning them helps you understand **what Spring Boot hides**
- You’ll never *want* to use them — just know how they work

---

## ☕ Author

Sahiljeet Singh Kalsi  
Writing raw Java backend so I can master Spring Boot like a boss.
