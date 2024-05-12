package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;

/* loaded from: classes.dex */
public class ProductBuilder {
    public int coinsRewardAmount;
    public String description;
    public String price;
    public ProductType productType;
    public String sku;
    public String smallIconUrl;
    public String title;

    public Product build() {
        return new Product(this);
    }

    public int getCoinsRewardAmount() {
        return this.coinsRewardAmount;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPrice() {
        return this.price;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public String getSku() {
        return this.sku;
    }

    public String getSmallIconUrl() {
        return this.smallIconUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public ProductBuilder setCoinsRewardAmount(int i) {
        this.coinsRewardAmount = i;
        return this;
    }

    public ProductBuilder setDescription(String str) {
        this.description = str;
        return this;
    }

    public ProductBuilder setPrice(String str) {
        this.price = str;
        return this;
    }

    public ProductBuilder setProductType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    public ProductBuilder setSku(String str) {
        this.sku = str;
        return this;
    }

    public ProductBuilder setSmallIconUrl(String str) {
        this.smallIconUrl = str;
        return this;
    }

    public ProductBuilder setTitle(String str) {
        this.title = str;
        return this;
    }
}
