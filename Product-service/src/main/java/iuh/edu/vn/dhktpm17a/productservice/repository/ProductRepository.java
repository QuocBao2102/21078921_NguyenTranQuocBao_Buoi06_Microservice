package iuh.edu.vn.dhktpm17a.productservice.repository;

import iuh.edu.vn.dhktpm17a.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
