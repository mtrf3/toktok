package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C27477AqP;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentPopupButton implements Parcelable {
    public static final Parcelable.Creator<ContentPopupButton> CREATOR = new C27477AqP();

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentPopupButton() {
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
        return (obj instanceof ContentPopupButton) && o.LJ(this.name, ((ContentPopupButton) obj).name);
    }

    public final int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentPopupButton(name=");
        return q.LIZIZ(LIZ, this.name, ')', LIZ);
    }

    public ContentPopupButton(String str) {
        this.name = str;
    }

    public /* synthetic */ ContentPopupButton(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
