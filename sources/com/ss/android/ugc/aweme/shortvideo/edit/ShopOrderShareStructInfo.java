package com.ss.android.ugc.aweme.shortvideo.edit;

import Y.IDCreatorS55S0000000_12;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class ShopOrderShareStructInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShopOrderShareStructInfo> CREATOR = new IDCreatorS55S0000000_12(1);
    public ShopOrderShareStruct LJLIL;
    public String LJLILLLLZI;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStructInfo() {
    }

    public ShopOrderShareStruct getShopOrderShareStruct() {
        return this.LJLIL;
    }

    public String getTitle() {
        return this.LJLILLLLZI;
    }

    public ShopOrderShareStructInfo(Parcel parcel) {
        this.LJLIL = (ShopOrderShareStruct) parcel.readParcelable(ShopOrderShareStruct.class.getClassLoader());
        this.LJLILLLLZI = parcel.readString();
    }

    public void setShopOrderShareStruct(ShopOrderShareStruct shopOrderShareStruct) {
        this.LJLIL = shopOrderShareStruct;
    }

    public void setTitle(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.LJLIL, i);
        parcel.writeString(this.LJLILLLLZI);
    }
}
