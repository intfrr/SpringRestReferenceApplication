DROP TABLE IF EXISTS student_entity;
  
CREATE TABLE student_entity (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  FIRST_NAME VARCHAR(250) NOT NULL,
  LAST_NAME VARCHAR(250) NOT NULL
);