drop user 'springstudent'@'localhost';
flush privileges;
create user admin@localhost identified by 'springstudent'

CREATE USER 'springstudent'@'localhost' IDENTIFIED BY 'springstudent';

GRANT ALL PRIVILEGES ON * . * TO 'springstudent'@'localhost';
