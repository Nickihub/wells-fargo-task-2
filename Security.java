import javax.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long securityID;
    private String name;
    private String category;
    private String purchaseDate;
    private double purchasePrice;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioID")
    private Portfolio portfolio;

    public Security() {
        // Default constructor
    }

    // Getters and setters
}

