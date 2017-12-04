# Design-and-Analysis-of-Algorithm-Project

 

DESIGN AND ANALYSIS OF ALGORITHMS (CS 5592)
PROJECT REPORT
“EMERGENCY VEHICLE DISPATCHING  System"
Problem Statement
Here the problem statement states that we have to create an “Emergency Vehicle Dispatching System” which can be used to keep the track of emergency vehicle at each zip code and will be helpful in case of emergency dispatching. Emergency vehicles include basically three types of vehicles which are Type1-Ambulance, Type 2-Fire Truck, Type 3-Police. This system can be very helpful and used as a real time application system.

Approach to the above Problem Statement
As per the problem statement the system which we should design should be real time and can be implemented in real time. So our approach to solve this problem statement was decided after many brain storming sessions so that it could really be implemented efficiently.
Here we tried to implement a system with each zip codes having an availability of all types of vehicle with the initial count of 3 at each system. So let us say if we request for a particular type of vehicle from a specific zip code. The system will check the availability of that vehicle at that zip code by checking the no of count and the fetching the vehicle. If the vehicle is not present at that particular node then the system will fetch the nearest neighbor and check the availability of that vehicle at those zip codes.
For this system we used an approach of graphs to solve this. Every zip code was considered as a node and distance between each node can be fetched from tables in the database. We have used the SQL Queries to fetch data from our SQL database. This is the brief description of approach we used to solve the above problem statement. The implementation in details has been discussed in implementation section of this report.

Assumptions
	Every node is assumed to have a maximum of 3 neighbours
	When a zip code is selected and if it doesn’t have the resources when requested, it goes to the neighbour closest in distance
	The selection of the neighbour is done based on shortest path distance

Implementation
Languages and Platforms
	Java
	SQL
	HTML
	CSS
	Eclipse IDE

The number of available resources at a given zip code is stored in the database.
The code is run on the server which displays a web page where the selection for the service is done. Once the service is selected and the request is made for a zip code, if resources are available at the given zip code, the number of available resources reduces by one in the database. If the given zip code has no available resources, it checks for the nearest neighboring zip codes which holds the resources. This is done using SQL. 

 

The code contains two main functions
	Compute / Min. Distance
	Return Shortest Distance
 
Compute / Min. Distance
If a zip code contains 2 neighbours, the code runs compute function. It computes the length of the paths to the available neighbours simply compares them and returns the neighbour with the shortest path. If a zip code has 3 neighbours, the code runs min. distance and returns the zip code with the minimum distance. This function contains one recursive function.

 

Return Shortest Distance
This function returns the path between requested zip code and the shortest length zip code with available resources and prints the path. This function contains one recursive function.
 

 

Complexity
The complexity of the algorithm is given by n(logn)
This can be justified by the following explanation.

T(n) = 2T(n/2) + n
As we have 2 functions that will be run with one recursive function each, we have a total of two recursive functions with function of ‘n’ for each iteration. Here, ‘n’ is the number of zip codes we consider for the service.


