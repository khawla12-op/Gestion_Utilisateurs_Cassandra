package ma.enset.tpcassandra.repositories;

import ma.enset.tpcassandra.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {
}
