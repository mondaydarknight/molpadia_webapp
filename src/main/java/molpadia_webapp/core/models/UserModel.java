package molpadia_webapp.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public UserModel setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }

    public UserModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }
}
