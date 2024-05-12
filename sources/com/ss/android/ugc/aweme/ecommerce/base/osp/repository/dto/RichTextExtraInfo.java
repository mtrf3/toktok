package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C27156AlE;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RichTextExtraInfo implements Parcelable {
    public static final Parcelable.Creator<RichTextExtraInfo> CREATOR = new C27156AlE();

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RichTextExtraInfo) && o.LJ(this.daInfo, ((RichTextExtraInfo) obj).daInfo);
    }

    public final int hashCode() {
        String str = this.daInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.daInfo);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RichTextExtraInfo(daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public RichTextExtraInfo(String str) {
        this.daInfo = str;
    }
}
