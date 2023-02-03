package tacos.data;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import tacos.TacoOrder;
import java.time.LocalDateTime;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip,
            LocalDateTime startDate, LocalDateTime endDate);
}
