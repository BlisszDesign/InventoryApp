package com.example.android.inventoryapp.data;

import android.provider.BaseColumns;

public final class InventoryContract {
    private InventoryContract() {}

    public static final class InventoryEntry implements BaseColumns {
//        table name
        public final static String TABLE_NAME = "inventory";
//        id number, type INTEGER
        public final static String _ID = BaseColumns._ID;
        //       type TEXT
        public final static String COLUMN_PRODUCT_NAME = "product_name";
        //       type INTEGER
        public final static String COLUMN_PRICE = "price";
        //       type INTEGER
        public final static String COLUMN_QUANTITY = "quantity";
        //       type TEXT
        public final static String COLUMN_SUPPLIER_NAME = "supplier_name";
        //       type TEXT
        public final static String COLUMN_SUPPLIER_PHONE_NUMBER= "supplier_phone_number";
    }
}
