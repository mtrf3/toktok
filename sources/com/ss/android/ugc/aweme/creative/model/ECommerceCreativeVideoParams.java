package com.ss.android.ugc.aweme.creative.model;

import X.HCO;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ECommerceCreativeVideoParams implements Parcelable {
    public static final Parcelable.Creator<ECommerceCreativeVideoParams> CREATOR = new HCO();

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    /* JADX WARN: Multi-variable type inference failed */
    public ECommerceCreativeVideoParams() {
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
        return (obj instanceof ECommerceCreativeVideoParams) && o.LJ(this.musicId, ((ECommerceCreativeVideoParams) obj).musicId);
    }

    public final int hashCode() {
        String str = this.musicId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.musicId);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECommerceCreativeVideoParams(musicId=");
        return q.LIZIZ(LIZ, this.musicId, ')', LIZ);
    }

    public ECommerceCreativeVideoParams(String str) {
        this.musicId = str;
    }

    public /* synthetic */ ECommerceCreativeVideoParams(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
