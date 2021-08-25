create database miniProject;
use miniProject;
create table student
(	prn int NOT NULL,
	sname varchar(45) NOT NULL,
	constraint prn_pk primary key(prn)
);
select * from student;
select * from subject;
create table subject
(	EMIII int,
	DSA int,
    DMS int,
    PCom int,
    PCPF int
);
alter table subject
add prn int NOT NULL;
alter table subject
add constraint prn_fk foreign key (prn)
references student (prn);
alter table subject
add EMIII_1 int;
alter table subject
add DSA_1 int;
alter table subject
add DMS_1 int;
alter table subject
add PCom_1 int;
alter table subject
add PCPF_1 int;
alter table subject
add status varchar(5);
alter table subject
add tmarks int;
alter table subject
add percentage float;
alter table subject
add pointer float;
alter table subject
add grade char(2);
select * from student
inner join subject
on (student.prn = subject.prn) order by prn;
select student.prn, student.sname, subject.EMIII, subject.EMIII_1, 
subject.DSA, subject.DSA_1, subject.DMS, subject.DMS_1, subject.PCom,
subject.PCom_1, subject.PCPF, subject.PCPF_1, subject.status, subject.tmarks,
subject.percentage, subject.pointer, subject.grade from student, subject
where (student.prn = subject.prn)
group by student.prn, student.sname
order by student.prn;
truncate table subject;
truncate table student;
set foreign_key_checks = 1;