public class OracleDataAdapter implements IDataAdapter {
    public int connect(String path) {
        //...
        return CONNECTION_OPEN_OK;
    }

    public int disconnect() {
        // ...
        return CONNECTION_CLOSE_OK;

    }

    public ProductModel loadProduct(int id) {
        return null;
    }
    public int saveProduct(ProductModel model) {
        return PRODUCT_SAVED_OK;
    }

    @Override
    public CustomerModel loadCustomer(int id) {
        return null;
    }


    public int saveCustomer(CustomerModel model) {
        return PRODUCT_SAVED_OK;
    }

    @Override
    public int savePurchase(PurchaseModel model) {
        return 0;
    }

}

