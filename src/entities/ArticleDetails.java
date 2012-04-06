package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ArticleDetails database table.
 * 
 */
@Entity
@Table(name="ArticleDetails")
public class ArticleDetails extends AbstractDB implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

    @Lob()
	private String articleContent;

	private String articleTitle;

	private String articleURL;

	private String farkCategory;

	private String farkHeadline;

	private String farkTag;

	private int numberOfComments;

	private String sourceName;

	private String sourceURL;

    public ArticleDetails() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticleContent() {
		return this.articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleTitle() {
		return this.articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleURL() {
		return this.articleURL;
	}

	public void setArticleURL(String articleURL) {
		this.articleURL = articleURL;
	}

	public String getFarkCategory() {
		return this.farkCategory;
	}

	public void setFarkCategory(String farkCategory) {
		this.farkCategory = farkCategory;
	}

	public String getFarkHeadline() {
		return this.farkHeadline;
	}

	public void setFarkHeadline(String farkHeadline) {
		this.farkHeadline = farkHeadline;
	}

	public String getFarkTag() {
		return this.farkTag;
	}

	public void setFarkTag(String farkTag) {
		this.farkTag = farkTag;
	}

	public int getNumberOfComments() {
		return this.numberOfComments;
	}

	public void setNumberOfComments(int numberOfComments) {
		this.numberOfComments = numberOfComments;
	}

	public String getSourceName() {
		return this.sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceURL() {
		return this.sourceURL;
	}

	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}
	
	public String toString()
	{
		return "[ Article URL: "+ this.getArticleURL() + "   Fark Headline:"+ this.getFarkHeadline() +"     Source: " + this.getSourceName() + "    FarkCategory:"+ this.getFarkCategory()
					+ "   Fark Tag: " + this.getFarkTag() + "    Comments : " + this.getNumberOfComments() +"]";
	}

}