
package com.example.types;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cusgoodsno",
    "cuscode",
    "outtype"
})
public class WmsQueryStockWithTypeRequest implements Serializable
{

    @JsonProperty("cusgoodsno")
    private String cusgoodsno;
    @JsonProperty("cuscode")
    private String cuscode;
    @JsonProperty("outtype")
    private String outtype;
    private final static long serialVersionUID = -4676659752861608589L;

    @JsonProperty("cusgoodsno")
    public String getCusgoodsno() {
        return cusgoodsno;
    }

    @JsonProperty("cusgoodsno")
    public void setCusgoodsno(String cusgoodsno) {
        this.cusgoodsno = cusgoodsno;
    }

    @JsonProperty("cuscode")
    public String getCuscode() {
        return cuscode;
    }

    @JsonProperty("cuscode")
    public void setCuscode(String cuscode) {
        this.cuscode = cuscode;
    }

    @JsonProperty("outtype")
    public String getOuttype() {
        return outtype;
    }

    @JsonProperty("outtype")
    public void setOuttype(String outtype) {
        this.outtype = outtype;
    }

}
