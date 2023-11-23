package fr.hummaction.inventaire.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;

@Entity
@Table(name="alimentaire")
public class Aliment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="code")
	private String code;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="categories_tags")
	private String categoriesTags; 
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="nutriscore")
	private String nutriscore;
	
	@Column(name="allergens")
	private String allergens;
	
	@Column(name="number")
	private int number;
	
	public Aliment() {
		super();
	}

	public Aliment(String code, String productName, String categoriesTags, String brand, String nutriscore,
			String allergens, int number) {
		super();
		this.code = code;
		this.productName = productName;
		this.categoriesTags = categoriesTags;
		this.brand = brand;
		this.nutriscore = nutriscore;
		this.allergens = allergens;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategoriesTags() {
		return categoriesTags;
	}

	public void setCategoriesTags(String categoriesTags) {
		this.categoriesTags = categoriesTags;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNutriscore() {
		return nutriscore;
	}

	public void setNutriscore(String nutriscore) {
		this.nutriscore = nutriscore;
	}

	public String getAllergens() {
		return allergens;
	}

	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Aliment [id=" + id + ", code=" + code + ", productName=" + productName + ", categoriesTags="
				+ categoriesTags + ", brand=" + brand + ", nutriscore=" + nutriscore + ", allergens=" + allergens
				+ ", number=" + number + "]";
	}
	
}
