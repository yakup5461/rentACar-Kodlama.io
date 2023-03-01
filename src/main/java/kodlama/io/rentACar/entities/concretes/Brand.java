package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Getter
@Setter
@Data		
@AllArgsConstructor		//parametreli constructorsun
@NoArgsConstructor		//parametresiz constructorsun
@Entity					//sen bir  DATABASE varlığısın.
public class Brand {
	
	@Id			//veritabanındaki PK(primry key) alanısın ona göre demek.
	@GeneratedValue(strategy = GenerationType.IDENTITY)		//veritabanındaki "id" kolonuna eklenen her veri için ıd yi 1 er artır demek.
	@Column(name="id")										//veritabanındaki "id" kolonuna denk geleceksin demek.
	private int id;
	
	@Column(name="name")									//veritabanındaki "name" kolonuna denk geleceksin demek.
	private String name;
	
	@OneToMany(mappedBy = "brand")
	private List<Model> models;
}
