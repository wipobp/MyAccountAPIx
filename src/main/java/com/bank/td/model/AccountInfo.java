package com.bank.td.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * AccountInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-05-22T05:39:06.669Z")

public class AccountInfo   {
  private String accountid = null;

  private String type = null;

  private String balance = null;

  public AccountInfo accountid(String accountid) {
    this.accountid = accountid;
    return this;
  }

   /**
   * Get accountid
   * @return accountid
  **/
  @ApiModelProperty(value = "")
  public String getAccountid() {
    return accountid;
  }

  public void setAccountid(String accountid) {
    this.accountid = accountid;
  }

  public AccountInfo type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccountInfo balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(this.accountid, accountInfo.accountid) &&
        Objects.equals(this.type, accountInfo.type) &&
        Objects.equals(this.balance, accountInfo.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountid, type, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    
    sb.append("    accountid: ").append(toIndentedString(accountid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

