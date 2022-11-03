package kodlama.io.rentACar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		
@AllArgsConstructor		//parametreli constructorsun
@NoArgsConstructor		//parametresiz constructorsun
public class GetAllBrandsResponse {
 private int Id;
 private String name ;
}
