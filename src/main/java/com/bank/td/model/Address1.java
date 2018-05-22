package com.bank.td.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Address1
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-05-22T05:39:06.669Z")

public class Address1   {
  private String houseNo = null;

  private String street = null;

  private String city = null;

  public Address1 houseNo(String houseNo) {
    this.houseNo = houseNo;
    return this;
  }

   /**
   * Get houseNo
   * @return houseNo
  **/
  @ApiModelProperty(value = "")
  public String getHouseNo() {
    return houseNo;
  }

  public void setHouseNo(String houseNo) {
    this.houseNo = houseNo;
  }

  public Address1 street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address1 city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address1 address1 = (Address1) o;
    return Objects.equals(this.houseNo, address1.houseNo) &&
        Objects.equals(this.street, address1.street) &&
        Objects.equals(this.city, address1.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseNo, street, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address1 {\n");
    
    sb.append("    houseNo: ").append(toIndentedString(houseNo)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

