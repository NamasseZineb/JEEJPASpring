package ma.enset.jpaap.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity // Entity JPA
@Data //Pour les getters et les setters
@NoArgsConstructor //Constructeur sans paramètre
@AllArgsConstructor //Constructeur avec tous les paramètres
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOM",length = 50) // Champ nom = 50 caractères au max
    private String nom;
    @Temporal(TemporalType.DATE)//Pour les dates
    private Date dateNaissance;
    private boolean malade;
    private int score;


}
