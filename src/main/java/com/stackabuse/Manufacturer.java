package com.stackabuse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

@JsonPropertyOrder({ "manufacturer_name", "country", "other_phones" })
public class Manufacturer {
  @JsonProperty("manufacturer_name")
  private String name;
  @JsonProperty("country")
  private String country;
  @JacksonXmlElementWrapper(localName = "other_phones")
  private List<String> phone;

  public Manufacturer() {

  }

  public Manufacturer(String name, String country, List<String> phone) {
    this.name = name;
    this.country = country;
    this.phone = phone;
  }

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return String return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * @param country the country to set
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * @return List<String> return the other_phone
   */
  public List<String> getPhone() {
    return phone;
  }

  /**
   * @param other_phone the other_phone to set
   */
  public void setPhone(List<String> phone) {
    this.phone = phone;
  }

}
