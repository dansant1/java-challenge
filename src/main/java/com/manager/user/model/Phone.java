import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String number;
    private String citycode;
    private String contrycode;
}
