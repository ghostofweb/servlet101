package sarvlet;

import java.io.BufferedReader;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class httpservlets extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing do get request by third servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuilder jsonBuffer = new StringBuilder();
		String line;
		BufferedReader reader = req.getReader();
		while ((line = reader.readLine()) != null) {
			jsonBuffer.append(line);
		}

		String json = jsonBuffer.toString();
		System.out.println("Raw JSON: " + json);

		// Optional: parse JSON using Gson
		// MessageDTO data = new Gson().fromJson(json, MessageDTO.class);
		// System.out.println("Message: " + data.getMessage());

		resp.setContentType("text/plain");
		resp.getWriter().write("JSON received");
	}
	
	
	
}
