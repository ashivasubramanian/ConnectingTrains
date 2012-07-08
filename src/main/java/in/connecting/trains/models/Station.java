package in.connecting.trains.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Station {

	@Id
	private String code;
	
	private String name;
	
}
