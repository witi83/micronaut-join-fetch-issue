package test.data.mn.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "role_mapping")
public final class RoleMapping {
    @Id
    Long id;

    @ManyToOne
    @Column(name = "user_id")
    User user;

    @OneToMany(mappedBy = "roleMapping")
    List<Role> roles;

    String name;
}
