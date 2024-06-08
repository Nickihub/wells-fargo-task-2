// FinancialAdvisor.java
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

    // Getters and Setters
    public Long getAdvisorID() {
        return advisorID;
    }

    public void setAdvisorID(Long advisorID) {
        this.advisorID = advisorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}