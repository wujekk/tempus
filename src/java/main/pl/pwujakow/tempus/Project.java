package pl.pwujakow.tempus;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;



public class Project {

	private String name; 
	
	public Project(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public final boolean equals(Object obj) {
		if(!(obj instanceof Project)){
			return false;
		}
		return new EqualsBuilder()
			.append(((Project)obj).getName(), getName())
			.isEquals();
	}
	
	@Override
	public final int hashCode() {
		return new HashCodeBuilder()
			.append(getName())
			.toHashCode();
	}
}
