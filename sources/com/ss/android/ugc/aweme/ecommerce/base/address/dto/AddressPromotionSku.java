package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27216AmC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressPromotionSku implements Parcelable {
    public static final Parcelable.Creator<AddressPromotionSku> CREATOR = new C27216AmC();

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    @InterfaceC65349Pkn("source_info")
    public final String sourceInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressPromotionSku)) {
            return false;
        }
        AddressPromotionSku addressPromotionSku = (AddressPromotionSku) obj;
        return o.LJ(this.productId, addressPromotionSku.productId) && o.LJ(this.skuId, addressPromotionSku.skuId) && o.LJ(this.sellerId, addressPromotionSku.sellerId) && o.LJ(this.sourceInfo, addressPromotionSku.sourceInfo);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sellerId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceInfo;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productId);
        out.writeString(this.skuId);
        out.writeString(this.sellerId);
        out.writeString(this.sourceInfo);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressPromotionSku(productId=");
        LIZ.append(this.productId);
        LIZ.append(", skuId=");
        LIZ.append(this.skuId);
        LIZ.append(", sellerId=");
        LIZ.append(this.sellerId);
        LIZ.append(", sourceInfo=");
        return q.LIZIZ(LIZ, this.sourceInfo, ')', LIZ);
    }

    public AddressPromotionSku(String str, String str2, String str3, String str4) {
        this.productId = str;
        this.skuId = str2;
        this.sellerId = str3;
        this.sourceInfo = str4;
    }
}
