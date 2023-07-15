import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientID;
    private String name;
    private String address;
    private String contactInformation;

    @ManyToOne
    @JoinColumn(name = "advisorID")
    private FinancialAdvisor advisor;

    public Client() {
        // Default constructor
    }

    // Getters and setters
}

