package iuh.edu.vn.dhktpm17a.productservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product    {
    @Id
    private Long id;
    private String name;
    private String price;
    private String description;
    private int stock;

}
