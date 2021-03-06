package client.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    private List<Order> orders;

    public Customer() {
        orders = new ArrayList<>();
    }
}
