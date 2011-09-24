package pl.pwujakow.tempus;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class WorkUnit {

	private Project project;
	private Date startDate;
	private Date endDate;
	private String description;
	
	public WorkUnit(Project project) {
		this.project = project;
		this.startDate = new Date();
	}
	
	public WorkUnit(Project project, String decription) {
		this.project = project;
		this.startDate = new Date();
		this.description = decription;
	}
	
	public Project getProject() {
		return project;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public final boolean equals(Object obj) {
		if(!(obj instanceof WorkUnit)){
			return false;
		}
		WorkUnit other = (WorkUnit)obj; 
		return new EqualsBuilder()
			.append(this.getProject(), other.getProject())
			.append(this.getStartDate(), other.getStartDate())
			.isEquals();
	}
	
	@Override
	public final int hashCode() {
		return new HashCodeBuilder()
			.append(this.getProject())
			.append(this.getStartDate())
			.toHashCode();
	}
}
