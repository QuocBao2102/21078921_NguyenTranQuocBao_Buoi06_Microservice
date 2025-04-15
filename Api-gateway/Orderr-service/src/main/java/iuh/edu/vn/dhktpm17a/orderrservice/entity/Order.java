package iuh.edu.vn.dhktpm17a.orderrservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Order {
    @Id
    private Long id;
    private Long customerId;
    private Long productId;
    private int quantity;
    private String status;

}
