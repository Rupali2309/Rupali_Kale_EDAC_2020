create database assignment3;
use assignment3;

CREATE TABLE department1(
id integer,
dept_no integer,
dept_name varchar(50),
CONSTRAINT dept1_pk PRIMARY KEY(id)
);




CREATE TABLE employee23(
  id         integer,
  emp_name   varchar(100),
  dept_id    integer,
  CONSTRAINT emp1_pk PRIMARY KEY (id),
  CONSTRAINT emp1_dept1_fk FOREIGN KEY (dept_id) REFERENCES department1(id)
);


INSERT INTO department1 values(1,10,'finance');
INSERT INTO department1 values(2,11,'training');
INSERT INTO department1 values(3,12,'marketing');
alter table employee23 add salary integer;

alter table employee23 add designation char(20);
truncate table  employee;

desc employee23;

INSERT INTO employee23 values(1,'Arun',1,6000,'manager');
INSERT INTO employee23 values(2,'kiran',1,86000,'manager');
INSERT INTO employee23 values(3,'scott',1,7000,'developer');

INSERT INTO employee23 values(4,'max',2,8000,'tester');
INSERT INTO employee23 values(5,'king',2,90000,'DBA');


select * from employee23;
select sum(salary) from employee23 group by (dept_id) ;
select dept_id ,sum(salary) from employee23 where salary>7000 group by(dept_id);

select count(dept_id),sum(salary) from employee23 group by dept_id having  sum(salary)>7000;
select count(dept_id),sum(salary)from employee23 group by dept_id having sum(salary)<18000;