<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Select your vehicle</title>
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style2.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
    
</head>
<body>
 <div class="container">
            
            <div class="codrops-top">
                <a href="">
                    <strong></strong>
                </a>
                <span class="right">
                    <a href=" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/">
                        <strong></strong>
                    </a>
                </span>
                <div class="clr"></div>
            </div>
            <header>
                <h1>Please select your service<span></span></h1>
				<nav class="codrops-demos">
					<span><strong></strong></span>
					
					
				</nav>
            </header>
            <section>				
                <div id="container_demo" >
                   
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="MysqlConnection" autocomplete="on" method="post"> 
                                <h1>Services</h1> 
                                <p> Please select your service
                                   <select name="cars">
									<option value="1">ambulance</option>
									<option value="2">fire</option>
									<option value="3">police</option>
									</select>
                                </p>
                                <p> 
                          
                                   Enter the zip code <input type="text" name="zipcode" required="required"  placeholder="eg. 64510" /> 
                                </p>
                               
                                <p class="login button"> 
                                    <input type="submit" value="Request" /> 
								</p>
                                
                            </form>
                        </div>

                       
						
                    </div>
                </div>  
            </section>
        </div>
</body>
</html>