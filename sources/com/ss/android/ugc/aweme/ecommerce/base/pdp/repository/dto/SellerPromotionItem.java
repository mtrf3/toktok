package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26823Afr;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SellerPromotionItem implements Parcelable {
    public static final Parcelable.Creator<SellerPromotionItem> CREATOR = new C26823Afr();

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("promotion_text")
    public final String name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerPromotionItem)) {
            return false;
        }
        SellerPromotionItem sellerPromotionItem = (SellerPromotionItem) obj;
        return o.LJ(this.id, sellerPromotionItem.id) && o.LJ(this.name, sellerPromotionItem.name) && o.LJ(this.daInfo, sellerPromotionItem.daInfo);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.name);
        out.writeString(this.daInfo);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerPromotionItem(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public SellerPromotionItem(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.daInfo = str3;
    }
}
