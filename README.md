This is a University Managment System Back-end-API. Build using spring boot.
For data storage, I am using MySQL Database. 
To query database from spring boot, I have used ORM Tool, Hibernate here.
Hibernate helps in achieving Object-Relational-Mapping.

Project Structure :-
- Presentation Layer = Created myController class, that handles any web-client request, hence
                       serving, web-services from services classes.
- Services Layer = Business logic for the code resides here. Service classes calls dao classes for data.
- Dao Layer = Data access layer bridges between service classes and the database. Providing the service
              classes with required data.


  
