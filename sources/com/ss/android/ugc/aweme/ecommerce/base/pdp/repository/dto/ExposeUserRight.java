package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26690Adi;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExposeUserRight implements Parcelable {
    public static final Parcelable.Creator<ExposeUserRight> CREATOR = new C26690Adi();

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("name_en")
    public final String nameEn;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposeUserRight)) {
            return false;
        }
        ExposeUserRight exposeUserRight = (ExposeUserRight) obj;
        return o.LJ(this.name, exposeUserRight.name) && o.LJ(this.nameEn, exposeUserRight.nameEn) && o.LJ(this.icon, exposeUserRight.icon);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameEn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.icon;
        return hashCode2 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExposeUserRight(name=");
        LIZ.append(this.name);
        LIZ.append(", nameEn=");
        LIZ.append(this.nameEn);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.nameEn);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
    }

    public ExposeUserRight(String str, String str2, Icon icon) {
        this.name = str;
        this.nameEn = str2;
        this.icon = icon;
    }
}
