package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK(); //Criado um objeto do tipo ScorePK para fazer a chave primaria composta atraves do objeto
	private Double value; 				// que contem o usuario e o movie
	
	public Score() {
		
	}
	
	public void setMovie (Movie movie) { //Refencia para vincular o ScorePK ao Movie 
		id.setMovie(movie);
	}
	
	public void setUser(User user) { //Referencia para vinclar o ScorePK ao User
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	

}
