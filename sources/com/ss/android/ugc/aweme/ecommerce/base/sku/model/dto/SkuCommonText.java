package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.InterfaceC65349Pkn;
import X.RVW;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuCommonText implements Parcelable {
    public static final Parcelable.Creator<SkuCommonText> CREATOR = new RVW();

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("sku_common_text_type")
    public final Integer skuCommonTextType;

    @InterfaceC65349Pkn("toast")
    public final String toast;

    /* JADX WARN: Multi-variable type inference failed */
    public SkuCommonText() {
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
        if (!(obj instanceof SkuCommonText)) {
            return false;
        }
        SkuCommonText skuCommonText = (SkuCommonText) obj;
        return o.LJ(this.skuCommonTextType, skuCommonText.skuCommonTextType) && o.LJ(this.desc, skuCommonText.desc) && o.LJ(this.toast, skuCommonText.toast);
    }

    public final int hashCode() {
        Integer num = this.skuCommonTextType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.desc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toast;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.skuCommonTextType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.desc);
        out.writeString(this.toast);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuCommonText(skuCommonTextType=");
        LIZ.append(this.skuCommonTextType);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", toast=");
        return q.LIZIZ(LIZ, this.toast, ')', LIZ);
    }

    public SkuCommonText(Integer num, String str, String str2) {
        this.skuCommonTextType = num;
        this.desc = str;
        this.toast = str2;
    }

    public /* synthetic */ SkuCommonText(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
