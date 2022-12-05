package Example2;

import java.util.Date;

public class User {
    @DbField(name = "id",isPrimaryKey = true, type = Long.class)
    private int id;

    @DbField(name = "name",type = String.class)
    private String name;

    @DbField(name = "email", type = String.class)
    private String email;

    @DbField(name = "created", type = Date.class)
    private Date created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                '}';
    }

    public User() {

    }

}
