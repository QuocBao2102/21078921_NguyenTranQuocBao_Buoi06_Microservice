package iuh.edu.vn.dhktpm17a.customerservice.repository;

import iuh.edu.vn.dhktpm17a.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
