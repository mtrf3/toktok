package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C78685UuP;
import X.InterfaceC65349Pkn;
import X.RT1;
import X.RT2;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PurchaseLimit implements Parcelable {

    @InterfaceC65349Pkn("default_show")
    public final Boolean defaultShow;

    @InterfaceC65349Pkn("limited_sku_ids")
    public final List<String> limitedSkuIds;

    @InterfaceC65349Pkn("text")
    public final String text;
    public static final RT2 Companion = new RT2();
    public static final Parcelable.Creator<PurchaseLimit> CREATOR = new RT1();

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseLimit() {
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
        if (!(obj instanceof PurchaseLimit)) {
            return false;
        }
        PurchaseLimit purchaseLimit = (PurchaseLimit) obj;
        return o.LJ(this.text, purchaseLimit.text) && o.LJ(this.defaultShow, purchaseLimit.defaultShow) && o.LJ(this.limitedSkuIds, purchaseLimit.limitedSkuIds);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.defaultShow;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.limitedSkuIds;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeString(this.text);
        Boolean bool = this.defaultShow;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeStringList(this.limitedSkuIds);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PurchaseLimit(text=");
        LIZ.append(this.text);
        LIZ.append(", defaultShow=");
        LIZ.append(this.defaultShow);
        LIZ.append(", limitedSkuIds=");
        return C1NE.LIZIZ(LIZ, this.limitedSkuIds, ')', LIZ);
    }

    public final String LIZ(String str) {
        if (C78685UuP.LJJJZ(str)) {
            List<String> list = this.limitedSkuIds;
            if (list == null || !list.contains(str)) {
                return null;
            }
            return this.text;
        }
        if (!o.LJ(this.defaultShow, Boolean.TRUE)) {
            return null;
        }
        return this.text;
    }

    public PurchaseLimit(String str, Boolean bool, List<String> list) {
        this.text = str;
        this.defaultShow = bool;
        this.limitedSkuIds = list;
    }

    public /* synthetic */ PurchaseLimit(String str, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
