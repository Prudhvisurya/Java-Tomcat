<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h1>User Details</h1>
    <p>Hi <%= request.getAttribute("name") %>, you have entered:</p>
    <p>Name: <%= request.getAttribute("name") %></p>
    <p>Mobile: <%= request.getAttribute("mobile") %></p>
</body>
</html>

