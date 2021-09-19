<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://unpkg.com/@picocss/pico@latest/css/pico.min.css">
<title>Hello, world!</title>
<style type="text/css">
.error {
	color: red;
	font-style: italics;
}
</style>
</head>
<body>
	<main class="container">
		<div class="grid">
			<div>
				<h1>Please Register</h1>
				<!-- Put nice image here later..  -->
				<img src="/resources/register.png">
			</div>
			
			<div>


				<!-- Grid -->
				<div class="grid">
					<form:form method="POST" action="/register"
						modelAttribute="newUser">

						<!-- Markup example 1: input is inside label -->
						<label for="firstname"> First name <input type="text"
							id="firstname" name="firstName" placeholder="First name" required>
						</label>
						<form:errors path="firstName" cssClass="error" />

						<label for="lastname"> Last name <input type="text"
							id="lastname" name="lastName" placeholder="Last name" required>
						</label>
						<form:errors path="lastName" cssClass="error" />


						<!-- Markup example 2: input is after label -->
						<label for="email">Email address</label>
						<input type="email" id="email" name="email"
							placeholder="Email address" required>
						<small>We'll never share your email with anyone else.</small>
						<label for="dob">DateOfBirth</label>
						<input type="date" id="dob" name="dob" placeholder="Date of Birth"
							required>
						<small>We'll never share your email with anyone else.</small>

						<!-- Button -->
						<input type="submit" value="Register">

					</form:form>
				</div>
			</div>
		</div>

	</main>
</body>
</html>