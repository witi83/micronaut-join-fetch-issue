package test.data.mn.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public final class Role {
    @Id
    Long id;
    String name;

    @ManyToOne
    @Column(name = "role_mapping_id")
    RoleMapping roleMapping;
}
