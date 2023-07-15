import javax.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioID;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client;

    public Portfolio() {
        // Default constructor
    }

    // Getters and setters
}


