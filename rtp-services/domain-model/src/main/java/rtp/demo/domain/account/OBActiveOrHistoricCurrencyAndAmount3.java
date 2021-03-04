package rtp.demo.domain.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The amount of the next Standing Order.
 */
//@ApiModel(description = "The amount of the next Standing Order.")
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-20T02:23:06.926-04:00[America/New_York]")
public class OBActiveOrHistoricCurrencyAndAmount3 {
	@JsonProperty("Amount")
	private String amount = null;

	@JsonProperty("Currency")
	private String currency = null;

	public OBActiveOrHistoricCurrencyAndAmount3 amount(String amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 * 
	 * @return amount
	 **/
//  @ApiModelProperty(required = true, value = "")
//      @NotNull
//
//  @Pattern(regexp="^\d{1,13}$|^\d{1,13}\.\d{1,5}$")   
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public OBActiveOrHistoricCurrencyAndAmount3 currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 * 
	 * @return currency
	 **/
//	@ApiModelProperty(required = true, value = "")
//	@NotNull
//
//	@Pattern(regexp = "^[A-Z]{3,3}$")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OBActiveOrHistoricCurrencyAndAmount3 obActiveOrHistoricCurrencyAndAmount3 = (OBActiveOrHistoricCurrencyAndAmount3) o;
		return Objects.equals(this.amount, obActiveOrHistoricCurrencyAndAmount3.amount)
				&& Objects.equals(this.currency, obActiveOrHistoricCurrencyAndAmount3.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, currency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OBActiveOrHistoricCurrencyAndAmount3 {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
