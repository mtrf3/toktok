package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C27348AoK;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CommonColor implements Parcelable {
    public static final Parcelable.Creator<CommonColor> CREATOR = new C27348AoK();

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("dark_color")
    public final String darkColor;

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
        return o.LJ(this.darkColor, commonColor.darkColor) && o.LJ(this.color, commonColor.color);
    }

    public final int hashCode() {
        String str = this.darkColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.darkColor);
        out.writeString(this.color);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonColor(darkColor=");
        LIZ.append(this.darkColor);
        LIZ.append(", color=");
        return q.LIZIZ(LIZ, this.color, ')', LIZ);
    }

    public CommonColor(String str, String str2) {
        this.darkColor = str;
        this.color = str2;
    }
}
