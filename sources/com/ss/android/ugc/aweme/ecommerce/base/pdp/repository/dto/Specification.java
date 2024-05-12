package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27188Alk;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Specification implements Parcelable {
    public static final Parcelable.Creator<Specification> CREATOR = new C27188Alk();

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
        if (!(obj instanceof Specification)) {
            return false;
        }
        Specification specification = (Specification) obj;
        return o.LJ(this.name, specification.name) && o.LJ(this.value, specification.value);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.value);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Specification(name=");
        LIZ.append(this.name);
        LIZ.append(", value=");
        return q.LIZIZ(LIZ, this.value, ')', LIZ);
    }

    public Specification(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
