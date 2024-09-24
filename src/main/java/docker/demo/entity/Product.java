package docker.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Document(collection = "products")
public class Product
{
    @Id
    private Integer id;
    private String name;
    private Double price;
    private Boolean isAvailable;
}
