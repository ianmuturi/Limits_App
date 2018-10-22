package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-21T22:34:37")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Date> createddate;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile SingularAttribute<Users, String> usertype;
    public static volatile SingularAttribute<Users, Integer> userid;

}