<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css" />
	<title>This is my project</title>
</head>
<body>
	<div class="container">
		<h1>Welcome to the new project</h1>	
	
	<script src="<%= request.getContextPath() %>/js/script.js"></script>

	<form id="myForm">
		<input name="message" type="text" placeholder="Enter your name chigga"/>
		<button type="submit"> Submit </button>
	</form>
	</div>
	<script>
	document.getElementById("myForm").addEventListener("submit", async (e) => {
		e.preventDefault();

		// Step 1: Grab the form data
		const formData = new FormData(e.target);

		// Step 2: Convert FormData to a plain JS object
		const jsonObject = Object.fromEntries(formData.entries());

		// Step 3: Send as JSON via fetch
		const response = await fetch("<%=request.getContextPath()%>/third", {
			method: "POST",
			headers: {
				"Content-Type": "application/json"
			},
			body: JSON.stringify(jsonObject)
		});

		const result = await response.text();
		console.log(result); // Or alert(result)
	});
</script>

</body>
</html>
