package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26860AgS;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CommonColor implements Parcelable {
    public static final Parcelable.Creator<CommonColor> CREATOR = new C26860AgS();

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("color_dark")
    public final String colorDark;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonColor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonColor)) {
            return false;
        }
        CommonColor commonColor = (CommonColor) obj;
        return o.LJ(this.color, commonColor.color) && o.LJ(this.colorDark, commonColor.colorDark);
    }

    public final int hashCode() {
        String str = this.color;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.colorDark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.color);
        out.writeString(this.colorDark);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonColor(color=");
        LIZ.append(this.color);
        LIZ.append(", colorDark=");
        return q.LIZIZ(LIZ, this.colorDark, ')', LIZ);
    }

    public CommonColor(String str, String str2) {
        this.color = str;
        this.colorDark = str2;
    }

    public /* synthetic */ CommonColor(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
