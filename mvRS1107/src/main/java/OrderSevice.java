import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("orders")
public class OrderSevice {

	@GET
	public String getOrders() {
		return "Returning All Orders";
	}
	
	@GET
	@Path("{orderId}")
	public String getOrderId(@PathParam("orderId") String orderId) {
		return "Returning Order with ID "+ orderId;
	}
}
