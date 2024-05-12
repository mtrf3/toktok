package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes16.dex */
public class ChargeDeal implements Parcelable {
    public static final Parcelable.Creator<ChargeDeal> CREATOR = new IDCreatorS57S0000000_15(2);
    public boolean mChosen;

    @InterfaceC65349Pkn("coupon_id")
    public String mCouponId;

    @InterfaceC65349Pkn("currency_price")
    public List<CurrencyPrice> mCurrencyPrice;

    @InterfaceC65349Pkn("describe")
    public String mDescribe;

    @InterfaceC65349Pkn("diamond_count")
    public int mDiamondCount;

    @InterfaceC65349Pkn("exchange_price")
    public int mExchangePrice;

    @InterfaceC65349Pkn("id")
    public long mId;

    @InterfaceC65349Pkn("price")
    public int mPrice;

    @InterfaceC65349Pkn("giving_count")
    public int mRewardDiamondCount;

    @InterfaceC65349Pkn("iap_id")
    public String mSku;
    public transient HsSkuDetail mSkuDetail;
    public int totalDiamond;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ChargeDeal() {
        this.mDescribe = "";
    }

    /* loaded from: classes16.dex */
    public static class CurrencyPrice implements Parcelable {
        public static final Parcelable.Creator<CurrencyPrice> CREATOR = new IDCreatorS57S0000000_15(0);

        @InterfaceC65349Pkn("currency")
        public String currency;

        @InterfaceC65349Pkn("price")
        public String price;

        @InterfaceC65349Pkn("price_show_form")
        public String priceShowForm;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public CurrencyPrice(Parcel parcel) {
            this.currency = parcel.readString();
            this.price = parcel.readString();
            this.priceShowForm = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.currency);
            parcel.writeString(this.price);
            parcel.writeString(this.priceShowForm);
        }
    }

    /* loaded from: classes16.dex */
    public static class HsSkuDetail implements Parcelable {
        public static final Parcelable.Creator<HsSkuDetail> CREATOR = new IDCreatorS57S0000000_15(1);
        public final String description;
        public final String price;
        public final String priceCurrencyCode;
        public final String sku;
        public final String title;
        public final String type;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public HsSkuDetail(Parcel parcel) {
            this.sku = parcel.readString();
            this.type = parcel.readString();
            this.price = parcel.readString();
            this.title = parcel.readString();
            this.description = parcel.readString();
            this.priceCurrencyCode = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.sku);
            parcel.writeString(this.type);
            parcel.writeString(this.price);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.priceCurrencyCode);
        }
    }

    public ChargeDeal(Parcel parcel) {
        boolean z;
        this.mDescribe = "";
        this.mId = parcel.readLong();
        this.mExchangePrice = parcel.readInt();
        this.mPrice = parcel.readInt();
        this.mDescribe = parcel.readString();
        this.mDiamondCount = parcel.readInt();
        this.mRewardDiamondCount = parcel.readInt();
        this.mSku = parcel.readString();
        this.mCurrencyPrice = parcel.createTypedArrayList(CurrencyPrice.CREATOR);
        this.totalDiamond = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mChosen = z;
        this.mCouponId = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mId);
        parcel.writeInt(this.mExchangePrice);
        parcel.writeInt(this.mPrice);
        parcel.writeString(this.mDescribe);
        parcel.writeInt(this.mDiamondCount);
        parcel.writeInt(this.mRewardDiamondCount);
        parcel.writeString(this.mSku);
        parcel.writeTypedList(this.mCurrencyPrice);
        parcel.writeInt(this.totalDiamond);
        parcel.writeByte(this.mChosen ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mCouponId);
    }
}
