/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

/**
 *
 * @author vasanth
 */
public interface AmazonSQLQueries {

    public final String SELECT_SHOPPING_CART_DETAILS = "SELECT SHOPPING_CART_ITEM_DATE, "
            + "SHOPPING_CART_ITEM_NAME, SHOPPING_CART_ITEM_PRICE, SHOPPING_CART_ITEM_QTY"
            + " FROM AMAZON.SHOPPING_CART";
}
