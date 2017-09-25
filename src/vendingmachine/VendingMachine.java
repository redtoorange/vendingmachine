package vendingmachine;

import vendingmachine.io.InputController;
import vendingmachine.money.CurrencyController;
import vendingmachine.product.ProductController;

/**
 * ${FILE_NAME}.java - Description
 *
 * @author
 * @version 15/Sep/2017
 */
public class VendingMachine {
    private ProductController productController;
    private InputController inputController;
    private CurrencyController currencyController;

    public VendingMachine() {
        productController = new ProductController( 3, 3 );

        inputController = new InputController( this );
        currencyController = new CurrencyController();
    }

    public ProductController getProductController() {
        return productController;
    }

    public InputController getInputController() {
        return inputController;
    }

    public CurrencyController getCurrencyController() {
        return currencyController;
    }


}