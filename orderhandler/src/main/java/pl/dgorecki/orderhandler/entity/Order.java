package pl.dgorecki.orderhandler.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Instant created;

    private Boolean smsDelivered;

    private Boolean emailDelivered;

    private Integer orderNumber;

    private Integer received;

}
