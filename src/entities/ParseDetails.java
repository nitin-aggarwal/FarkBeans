package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parseDetails database table.
 * 
 */
@Entity
@Table(name="parseDetails")
public class ParseDetails extends AbstractDB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private double adjPhrases;

	private double conjPhrases;

	private double depth;

	private double nounPhrases;

	private double score;

	private double sentences;

	private double sentPhrases;

	private double size;

	private double verbPhrases;

	//bi-directional one-to-one association to ArticleDetails
	@OneToOne(mappedBy="parseDetail")
	private ArticleDetails articleDetail;

    public ParseDetails() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAdjPhrases() {
		return this.adjPhrases;
	}

	public void setAdjPhrases(double adjPhrases) {
		this.adjPhrases = adjPhrases;
	}

	public double getConjPhrases() {
		return this.conjPhrases;
	}

	public void setConjPhrases(double conjPhrases) {
		this.conjPhrases = conjPhrases;
	}

	public double getDepth() {
		return this.depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getNounPhrases() {
		return this.nounPhrases;
	}

	public void setNounPhrases(double nounPhrases) {
		this.nounPhrases = nounPhrases;
	}

	public double getScore() {
		return this.score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getSentences() {
		return this.sentences;
	}

	public void setSentences(double sentences) {
		this.sentences = sentences;
	}

	public double getSentPhrases() {
		return this.sentPhrases;
	}

	public void setSentPhrases(double sentPhrases) {
		this.sentPhrases = sentPhrases;
	}

	public double getSize() {
		return this.size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getVerbPhrases() {
		return this.verbPhrases;
	}

	public void setVerbPhrases(double verbPhrases) {
		this.verbPhrases = verbPhrases;
	}

	public ArticleDetails getArticleDetail() {
		return this.articleDetail;
	}

	public void setArticleDetail(ArticleDetails articleDetail) {
		this.articleDetail = articleDetail;
	}
	
}