package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C28005Ayv;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SkuCardStyleInfo implements Parcelable {
    public static final Parcelable.Creator<SkuCardStyleInfo> CREATOR = new C28005Ayv();

    @InterfaceC65349Pkn("edit_bundle_quantity_toast")
    public final String editBundleQuantityToast;

    @InterfaceC65349Pkn("sku_card_style_type")
    public final Integer skuCardStyleType;

    @InterfaceC65349Pkn("title_light_text")
    public final String titleLightText;

    /* JADX WARN: Multi-variable type inference failed */
    public SkuCardStyleInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuCardStyleInfo)) {
            return false;
        }
        SkuCardStyleInfo skuCardStyleInfo = (SkuCardStyleInfo) obj;
        return o.LJ(this.skuCardStyleType, skuCardStyleInfo.skuCardStyleType) && o.LJ(this.titleLightText, skuCardStyleInfo.titleLightText) && o.LJ(this.editBundleQuantityToast, skuCardStyleInfo.editBundleQuantityToast);
    }

    public final int hashCode() {
        Integer num = this.skuCardStyleType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.titleLightText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.editBundleQuantityToast;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.skuCardStyleType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.titleLightText);
        out.writeString(this.editBundleQuantityToast);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuCardStyleInfo(skuCardStyleType=");
        LIZ.append(this.skuCardStyleType);
        LIZ.append(", titleLightText=");
        LIZ.append(this.titleLightText);
        LIZ.append(", editBundleQuantityToast=");
        return q.LIZIZ(LIZ, this.editBundleQuantityToast, ')', LIZ);
    }

    public SkuCardStyleInfo(Integer num, String str, String str2) {
        this.skuCardStyleType = num;
        this.titleLightText = str;
        this.editBundleQuantityToast = str2;
    }

    public /* synthetic */ SkuCardStyleInfo(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
