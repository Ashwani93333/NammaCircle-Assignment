# Internship Assignment - NammaCircle

1. Implementing Unique Referrals Logic In backend
Implementation: 
 I used a composite unique constraint in the database and a check in the Service layer.
 at every time i have to check whether the user is associated with pre existing company or not.

 if the user is already associated with the the own referraled COmpany then no need for the registration or referrals!!

is that show the Signal message as 'Already Referraled by other user'.

By this we can implement this functionality. 


 2. What happens when you type a URL in the browser?

1. Client Side Detail = User when type url on browser , it start evaluation the destination source.
2. HTTP Request = The browser sends a GET request.
4. Server Processing = Spring Boot processes the request and returns a response.
5. Rendering = The browser displays the HTML/CSS/JS.

3. Tech Stack>>>
Java Version: 21 ,
Spring Boot Version: 3.5.11

4. Annotation Explanations

@SpringBootApplication : The starting point that enables auto-configuration.
@Entity : Marks a class as a database table(mainly Schema).
@Service : Defines a class as a business logic Activates.
@Autowired: Injects dependencies automatically >> Spring boot do it.
@Repository : Handles data access and exceptions.
@Transactional : Ensures a set of database operations succeed or fail as a single unit.

5. Performance Observations (nammacircle.in)
My Observation to this Website as Point of view of BAckend Developer are : 
1. Use the Redis cache memory system do that it enhance the performance of the user and UI/UX also.
2. Use Pagination to evaluate the list data that will help for better optimization.
3. Using of Microservices Architecture to use many more jobs and recuiter process easily.
Proposed Improvements: 
1. Implement Redis caching for frequently accessed profile data.
    2. Optimize database queries using indexing on user IDs.
