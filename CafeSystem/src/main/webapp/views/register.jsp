<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #f2f2ff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
        .form-group button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            border: none;
            color: white;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-group button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Register Here</h2>
		<c:if test="${not empty successMsg}">
			<h4 style="color: green"> ${successMsg}</h4>
		</c:if>	
		
		<c:if test="${not empty errorMsg}">
			<h4 style="color: red"> ${errorMsg}</h4>
		</c:if>	
        <form action="regform" method="post">
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="text" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="phone">Phone Number</label>
                <input type="number" id="phone" name="phone" required>
            </div>
			<div class="form-group">
			               <label for="address">Address</label>
			               <input type="text" id="address" name="address" required>
			           </div>
            <div class="form-group">
                <button type="submit">Register</button>
            </div>			
        </form>
		
    </div>
	<h3>If already registered...<a href="loginpage"><b>Click Here</b></a></h3>
</body>
</html>