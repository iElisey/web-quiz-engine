package engine.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Complete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @JsonProperty(namespace = "id", value = "id")
    private Long quiz_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;


    private LocalDateTime completedAt;

    public Complete(Long id, User user, LocalDateTime completedAt) {
        this.quiz_id = id;
        this.user = user;
        this.completedAt = completedAt;
    }
}
