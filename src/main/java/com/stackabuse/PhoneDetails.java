package com.stackabuse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "internal_memory", "display_size", "phone_name", "manufacturer" })
public class PhoneDetails {
  @JsonProperty("phone_name")
  private String name;
  @JsonProperty("display_size")
  private String displaySize;
  @JsonProperty("internal_memory")
  private String memory;
  @JsonProperty("manufacturer")
  private Manufacturer manufacturer;

  public PhoneDetails() {
    // default contructor
  }

  public PhoneDetails(String name, String displaySize, String memory, Manufacturer manufacturer) {
    this.name = name;
    this.displaySize = displaySize;
    this.memory = memory;
    this.manufacturer = manufacturer;
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
     * @return String return the displaySize
     */
    public String getDisplaySize() {
        return displaySize;
    }

    /**
     * @param displaySize the displaySize to set
     */
    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    /**
     * @return String return the memory
     */
    public String getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * @return Manufacturer return the manufacturer
     */
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
