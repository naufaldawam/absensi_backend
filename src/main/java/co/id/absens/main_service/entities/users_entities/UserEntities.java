package co.id.absens.main_service.entities.users_entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "user")
public class UserEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private String users;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "datetime", nullable = false)
    private String datetime;

    @Column(name = "geolocation")
    private String geolocation;

    @Column(name = "notes")
    private String notes;

    @Column(name = "created_at", nullable = false)
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

}