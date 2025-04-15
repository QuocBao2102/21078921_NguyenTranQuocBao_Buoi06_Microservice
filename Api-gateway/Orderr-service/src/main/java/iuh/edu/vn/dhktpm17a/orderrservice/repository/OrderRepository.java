package iuh.edu.vn.dhktpm17a.orderrservice.repository;

import iuh.edu.vn.dhktpm17a.orderrservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
