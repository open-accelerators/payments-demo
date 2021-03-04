package rtp.demo.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rtp.demo.domain.OBWriteDomesticConsent4DataAuthorisation;
import rtp.demo.domain.OBWriteDomesticConsent4DataSCASupportData;
import rtp.demo.domain.OBWriteInternationalStandingOrder4DataInitiation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBWriteInternationalStandingOrderConsent6Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-17T07:50:58.428-04:00[America/New_York]")
public class OBWriteInternationalStandingOrderConsent6Data   {
  /**
   * Specifies the Open Banking service request types.
   */
  public enum PermissionEnum {
    CREATE("Create");

    private String value;

    PermissionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionEnum fromValue(String text) {
      for (PermissionEnum b : PermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Permission")
  private PermissionEnum permission = null;

  /**
   * Specifies to share the refund account details with PISP
   */
  public enum ReadRefundAccountEnum {
    NO("No"),
    
    YES("Yes");

    private String value;

    ReadRefundAccountEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReadRefundAccountEnum fromValue(String text) {
      for (ReadRefundAccountEnum b : ReadRefundAccountEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("ReadRefundAccount")
  private ReadRefundAccountEnum readRefundAccount = null;

  @JsonProperty("Initiation")
  private OBWriteInternationalStandingOrder4DataInitiation initiation = null;

  @JsonProperty("Authorisation")
  private OBWriteDomesticConsent4DataAuthorisation authorisation = null;

  @JsonProperty("SCASupportData")
  private OBWriteDomesticConsent4DataSCASupportData scASupportData = null;

  public OBWriteInternationalStandingOrderConsent6Data permission(PermissionEnum permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Specifies the Open Banking service request types.
   * @return permission
  **/
  @ApiModelProperty(required = true, value = "Specifies the Open Banking service request types.")
      @NotNull

    public PermissionEnum getPermission() {
    return permission;
  }

  public void setPermission(PermissionEnum permission) {
    this.permission = permission;
  }

  public OBWriteInternationalStandingOrderConsent6Data readRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
    return this;
  }

  /**
   * Specifies to share the refund account details with PISP
   * @return readRefundAccount
  **/
  @ApiModelProperty(value = "Specifies to share the refund account details with PISP")
  
    public ReadRefundAccountEnum getReadRefundAccount() {
    return readRefundAccount;
  }

  public void setReadRefundAccount(ReadRefundAccountEnum readRefundAccount) {
    this.readRefundAccount = readRefundAccount;
  }

  public OBWriteInternationalStandingOrderConsent6Data initiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
    this.initiation = initiation;
    return this;
  }

  /**
   * Get initiation
   * @return initiation
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBWriteInternationalStandingOrder4DataInitiation getInitiation() {
    return initiation;
  }

  public void setInitiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
    this.initiation = initiation;
  }

  public OBWriteInternationalStandingOrderConsent6Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
    this.authorisation = authorisation;
    return this;
  }

  /**
   * Get authorisation
   * @return authorisation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteDomesticConsent4DataAuthorisation getAuthorisation() {
    return authorisation;
  }

  public void setAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
    this.authorisation = authorisation;
  }

  public OBWriteInternationalStandingOrderConsent6Data scASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
    return this;
  }

  /**
   * Get scASupportData
   * @return scASupportData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBWriteDomesticConsent4DataSCASupportData getScASupportData() {
    return scASupportData;
  }

  public void setScASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
    this.scASupportData = scASupportData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBWriteInternationalStandingOrderConsent6Data obWriteInternationalStandingOrderConsent6Data = (OBWriteInternationalStandingOrderConsent6Data) o;
    return Objects.equals(this.permission, obWriteInternationalStandingOrderConsent6Data.permission) &&
        Objects.equals(this.readRefundAccount, obWriteInternationalStandingOrderConsent6Data.readRefundAccount) &&
        Objects.equals(this.initiation, obWriteInternationalStandingOrderConsent6Data.initiation) &&
        Objects.equals(this.authorisation, obWriteInternationalStandingOrderConsent6Data.authorisation) &&
        Objects.equals(this.scASupportData, obWriteInternationalStandingOrderConsent6Data.scASupportData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, readRefundAccount, initiation, authorisation, scASupportData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBWriteInternationalStandingOrderConsent6Data {\n");
    
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
    sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
    sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
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
