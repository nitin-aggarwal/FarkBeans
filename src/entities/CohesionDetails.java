package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CohesionDetails database table.
 * 
 */
@Entity
@Table(name="CohesionDetails")
public class CohesionDetails extends AbstractDB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int posADJ;

	private int posAVB;

	private int posNP;

	private int posVB;

	private int wordESW;

	private int wordISW;

    public CohesionDetails() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosADJ() {
		return this.posADJ;
	}

	public void setPosADJ(int posADJ) {
		this.posADJ = posADJ;
	}

	public int getPosAVB() {
		return this.posAVB;
	}

	public void setPosAVB(int posAVB) {
		this.posAVB = posAVB;
	}

	public int getPosNP() {
		return this.posNP;
	}

	public void setPosNP(int posNP) {
		this.posNP = posNP;
	}

	public int getPosVB() {
		return this.posVB;
	}

	public void setPosVB(int posVB) {
		this.posVB = posVB;
	}

	public int getWordESW() {
		return this.wordESW;
	}

	public void setWordESW(int wordESW) {
		this.wordESW = wordESW;
	}

	public int getWordISW() {
		return this.wordISW;
	}

	public void setWordISW(int wordISW) {
		this.wordISW = wordISW;
	}

}