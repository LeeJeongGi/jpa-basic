package jpabook.jpashop.domain.animal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Animal {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
