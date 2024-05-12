package com.ss.android.ugc.aweme.sticker.model;

import X.InterfaceC65349Pkn;
import Y.IDCreatorS55S0000000_12;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class FaceStickerCommerceBean implements Parcelable {
    public static final Parcelable.Creator<FaceStickerCommerceBean> CREATOR = new IDCreatorS55S0000000_12(2);

    @InterfaceC65349Pkn("commerce_sticker_buy_text")
    public String commerceStickerBuyText;

    @InterfaceC65349Pkn("commerce_sticker_open_url")
    public String commerceStickerOpenUrl;

    @InterfaceC65349Pkn("commerce_sticker_type")
    public int commerceStickerType;

    @InterfaceC65349Pkn("commerce_sticker_web_url")
    public String commerceStickerWebUrl;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FaceStickerCommerceBean(Parcel parcel) {
        this.commerceStickerWebUrl = parcel.readString();
        this.commerceStickerOpenUrl = parcel.readString();
        this.commerceStickerBuyText = parcel.readString();
        this.commerceStickerType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.commerceStickerWebUrl);
        parcel.writeString(this.commerceStickerOpenUrl);
        parcel.writeString(this.commerceStickerBuyText);
        parcel.writeInt(this.commerceStickerType);
    }
}
