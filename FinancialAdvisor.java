import javax.persistence.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advisorID;
    private String name;
    private String email;
    private String password;

    public FinancialAdvisor() {
        // Default constructor
    }

    // Getters and setters
}

