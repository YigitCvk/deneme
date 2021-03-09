/*
 * Copyright (C) 2021 yigit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package labs.pm.data;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;

/**
 * {@code Product} class represents properties and behaviours of product objects
 * in the Product Management System.
 * <br>
 * Each product has an id,name,and price
 * <br>
 * Each product can hava a discount, calculated based on a
 * {@link Discount_Rate discount rate}
 *
 * @version 4.0
 * @author yigit
 */
public class Product {

    /**
     * A constat that defines a {@link java.math.BigDecimal BigDecimal} value of
     * the discount rate
     * <br>
     * Discount rate is %10
     */
    public static final BigDecimal Discount_Rate = BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        // price=BigDecimal.ONE;
        this.price = price;
    }

    /**
     * Calculates discount based on a product prica and
     * {@link Discount_Rate discount rate}
     *
     * @return a{@link java.math.BigDecimal BigDecimal} value of the discount
     */
    public BigDecimal getDiscount() {
        return price.multiply(Discount_Rate).setScale(2, HALF_UP);
    }
}
