package client.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class InputOrder implements Serializable {
    //@Id
    private Integer id;
    //private Integer customerId;
    private String productName;
}
