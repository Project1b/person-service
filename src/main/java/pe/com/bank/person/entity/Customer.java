package pe.com.bank.person.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="customer")
public class Customer {
	
	private String id;
	private String customerType;
	private String dateAssociated;

}
