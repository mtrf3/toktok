package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C71607S8l;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateDecorationTitleColor implements Parcelable {
    public static final Parcelable.Creator<TemplateDecorationTitleColor> CREATOR = new C71607S8l();

    @InterfaceC65349Pkn("dark_value")
    public final String darkValue;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("value")
    public final String value;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDecorationTitleColor)) {
            return false;
        }
        TemplateDecorationTitleColor templateDecorationTitleColor = (TemplateDecorationTitleColor) obj;
        return o.LJ(this.name, templateDecorationTitleColor.name) && o.LJ(this.value, templateDecorationTitleColor.value) && o.LJ(this.darkValue, templateDecorationTitleColor.darkValue);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkValue;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.value);
        out.writeString(this.darkValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateDecorationTitleColor(name=");
        LIZ.append(this.name);
        LIZ.append(", value=");
        LIZ.append(this.value);
        LIZ.append(", darkValue=");
        return q.LIZIZ(LIZ, this.darkValue, ')', LIZ);
    }

    public TemplateDecorationTitleColor(String str, String str2, String str3) {
        this.name = str;
        this.value = str2;
        this.darkValue = str3;
    }
}
