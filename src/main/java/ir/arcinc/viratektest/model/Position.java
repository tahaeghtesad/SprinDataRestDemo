package ir.arcinc.viratektest.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Position {
    @Id
    @GeneratedValue
    private long id;

    private String name;
}
