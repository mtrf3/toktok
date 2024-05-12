package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.util.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Product implements Parcelable {
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() { // from class: com.amazon.device.iap.model.Product.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Product createFromParcel(Parcel parcel) {
            return new Product(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Product[] newArray(int i) {
            return new Product[i];
        }
    };
    public final CoinsReward coinsReward;
    public final String description;
    public final String price;
    public final ProductType productType;
    public final String sku;
    public final String smallIconUrl;
    public final String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private int getCoinsRewardAmount() {
        CoinsReward coinsReward = this.coinsReward;
        if (coinsReward == null) {
            return 0;
        }
        return coinsReward.getAmount();
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sku", this.sku);
        jSONObject.put("productType", this.productType);
        jSONObject.put("description", this.description);
        jSONObject.put("price", this.price);
        jSONObject.put("smallIconUrl", this.smallIconUrl);
        jSONObject.put("title", this.title);
        jSONObject.put("coinsRewardAmount", getCoinsRewardAmount());
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public CoinsReward getCoinsReward() {
        return this.coinsReward;
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

    public Product(ProductBuilder productBuilder) {
        d.a((Object) productBuilder.getSku(), "sku");
        d.a(productBuilder.getProductType(), "productType");
        d.a((Object) productBuilder.getDescription(), "description");
        d.a((Object) productBuilder.getTitle(), "title");
        d.a((Object) productBuilder.getSmallIconUrl(), "smallIconUrl");
        if (ProductType.SUBSCRIPTION != productBuilder.getProductType()) {
            d.a((Object) productBuilder.getPrice(), "price");
        }
        this.sku = productBuilder.getSku();
        this.productType = productBuilder.getProductType();
        this.description = productBuilder.getDescription();
        this.price = productBuilder.getPrice();
        this.smallIconUrl = productBuilder.getSmallIconUrl();
        this.title = productBuilder.getTitle();
        this.coinsReward = CoinsReward.from(productBuilder.getCoinsRewardAmount());
    }

    public Product(Parcel parcel) {
        int i;
        this.sku = parcel.readString();
        this.productType = ProductType.valueOf(parcel.readString());
        this.description = parcel.readString();
        this.price = parcel.readString();
        this.smallIconUrl = parcel.readString();
        this.title = parcel.readString();
        if (parcel.dataAvail() > 0) {
            i = parcel.readInt();
        } else {
            i = 0;
        }
        this.coinsReward = CoinsReward.from(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sku);
        parcel.writeString(this.productType.toString());
        parcel.writeString(this.description);
        parcel.writeString(this.price);
        parcel.writeString(this.smallIconUrl);
        parcel.writeString(this.title);
        parcel.writeInt(getCoinsRewardAmount());
    }
}
