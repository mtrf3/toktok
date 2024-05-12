package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C27337Ao9;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeeTag implements Parcelable {
    public static final Parcelable.Creator<FeeTag> CREATOR = new C27337Ao9();

    @InterfaceC65349Pkn("tag_name")
    public final String tagName;

    /* JADX WARN: Multi-variable type inference failed */
    public FeeTag() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeeTag) && o.LJ(this.tagName, ((FeeTag) obj).tagName);
    }

    public final int hashCode() {
        String str = this.tagName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.tagName);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeeTag(tagName=");
        return q.LIZIZ(LIZ, this.tagName, ')', LIZ);
    }

    public FeeTag(String str) {
        this.tagName = str;
    }

    public /* synthetic */ FeeTag(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
