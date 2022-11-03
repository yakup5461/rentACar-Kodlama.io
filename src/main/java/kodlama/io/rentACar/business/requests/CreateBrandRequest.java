package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		
@AllArgsConstructor		//parametreli constructorsun
@NoArgsConstructor		//parametresiz constructorsun
public class CreateBrandRequest {
	
	private String name;

}
