package pl.dgorecki.orderhandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dgorecki.orderhandler.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
