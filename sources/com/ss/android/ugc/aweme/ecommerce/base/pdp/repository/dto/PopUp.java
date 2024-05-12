package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C69617RTx;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PopUp implements Parcelable {
    public static final Parcelable.Creator<PopUp> CREATOR = new C69617RTx();

    @InterfaceC65349Pkn("fc_second")
    public final Long fcSecond;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopUp)) {
            return false;
        }
        PopUp popUp = (PopUp) obj;
        return o.LJ(this.schema, popUp.schema) && o.LJ(this.fcSecond, popUp.fcSecond);
    }

    public final int hashCode() {
        String str = this.schema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.fcSecond;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopUp(schema=");
        LIZ.append(this.schema);
        LIZ.append(", fcSecond=");
        return JBR.LJ(LIZ, this.fcSecond, ')', LIZ);
    }

    public PopUp(String str, Long l) {
        this.schema = str;
        this.fcSecond = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.schema);
        Long l = this.fcSecond;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
    }
}
