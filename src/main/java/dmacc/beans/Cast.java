package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Data;

import lombok.NoArgsConstructor;


/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 21, 2023
 */
@Data
@Entity
@NoArgsConstructor
public class Cast {
	

	@Id
	@GeneratedValue
	public long id;
	public String actorName;
	public String characterName;
	public String seriesName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getSeriesName() {
		return seriesName;
	}
	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}
}
