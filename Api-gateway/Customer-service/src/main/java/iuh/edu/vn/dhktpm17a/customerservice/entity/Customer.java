package iuh.edu.vn.dhktpm17a.customerservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    private Long id;
    private String name;
    private String address;
    private String phone;
}
