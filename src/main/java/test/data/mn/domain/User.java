package test.data.mn.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public final class User {
    @Id
    @Column(name = "user_id")
    Long id;
    String name;

    @OneToMany(mappedBy = "user")
    List<RoleMapping> roleMappings;
}
