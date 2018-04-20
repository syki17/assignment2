package assignment2;

import java.math.BigDecimal;

public final class coinInfo {

private String symbol;
private BigDecimal price;

/**
* No args constructor for use in serialization
*
*/


/**
*
* @param price
* @param symbol
*/
public coinInfo(String symbol, BigDecimal price) {
setSymbol(symbol);
setPrice(price);
}

public String getSymbol() {
return symbol;
}

public void setSymbol(String symbol) {
this.symbol = symbol;
}

public BigDecimal getPrice() {
return price;
}

public void setPrice(BigDecimal price) {
this.price = price;
}

}