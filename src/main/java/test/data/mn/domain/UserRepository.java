package test.data.mn.domain;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import edu.umd.cs.findbugs.annotations.NonNull;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.H2)
public interface UserRepository extends CrudRepository<User, Long> {

    @NonNull
    @Override
    @Join(value = "roleMappings", alias = "rm", type = Join.Type.LEFT_FETCH)
    @Join(value = "roleMappings.roles", alias = "r", type = Join.Type.LEFT_FETCH)
    Optional<User> findById(@NonNull @NotNull Long aLong);
}
