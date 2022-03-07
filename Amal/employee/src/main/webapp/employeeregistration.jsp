<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="reg.css">

</head>
<body>
<form action="add-details.html"  method="post">
		<div>
			<label for="idDoorNumber"> Door Number: </label> <input type="text"
				id="idDoorNumber" name="doorNumber">
		</div>
		<div>
			<label for="idStreetName"> Street Name: </label> <input
				type="text" id="idStreetName" name="streetName">
		</div>
		<div>
			<label for="idAreaName"> Area Name: </label> <input type="text"
				id="idAreaName" name="areaName">
		</div>

		<div>
			<label for="idCity"> City: </label> <input type="text"
				id="idCity" name="city">
		</div>
		<div>
			<label for="idState"> State: </label> <input type="text"
				id="idState" name="state">
		</div>
		<div>
			<label for="idPincode"> Pincode: </label> <input
				type="text" id="idPincode" name="pincode">
		</div>
		
		<div class="btns">
			<input type="submit" value="Add Data"> <input type="reset"
				value="Clear Data">
		</div>
	</form>
</body>
</html>