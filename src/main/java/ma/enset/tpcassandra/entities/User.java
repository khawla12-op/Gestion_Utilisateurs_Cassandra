package ma.enset.tpcassandra.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.util.UUID;

@Table("users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @PrimaryKey
    private UUID id;
    private String fname;
    private String lname;
    private int age;



}
