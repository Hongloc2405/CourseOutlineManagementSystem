package com.comwe.pojo;

import com.comwe.pojo.Admin;
import com.comwe.pojo.Lecturer;
import com.comwe.pojo.Student;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-05-17T20:29:12")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> birthday;
    public static volatile SingularAttribute<User, String> role;
    public static volatile SingularAttribute<User, Student> student;
    public static volatile SingularAttribute<User, String> hotline;
    public static volatile SingularAttribute<User, Boolean> sex;
    public static volatile SingularAttribute<User, Admin> admin;
    public static volatile SingularAttribute<User, Lecturer> lecturer;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, Boolean> isActive;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Date> createdDatetime;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}