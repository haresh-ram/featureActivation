package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class entityClass {

	
	@Id
	private int VID;
	private String featureCode;
	private String activationDate;
	private String deactivationDate;
	private boolean enabled;
	
	public int getVID() {
		return VID;
	}
	public void setVID(int vID) {
		VID = vID;
	}
	public String getFeatureCode() {
		return featureCode;
	}
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}
	public String getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}
	public String getDeactivationDate() {
		return deactivationDate;
	}
	public void setDeactivationDate(String deactivationDate) {
		this.deactivationDate = deactivationDate;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
