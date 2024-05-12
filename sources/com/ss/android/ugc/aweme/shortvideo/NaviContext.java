package com.ss.android.ugc.aweme.shortvideo;

import X.C05040Hs;
import X.C1FL;
import X.C78920UyC;
import X.HYD;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class NaviContext implements Parcelable {
    public static final Parcelable.Creator<NaviContext> CREATOR = new HYD();
    public Long avatarId;
    public Boolean avatarIsNew;

    public NaviContext() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NaviContext)) {
            return false;
        }
        NaviContext naviContext = (NaviContext) obj;
        return o.LJ(this.avatarId, naviContext.avatarId) && o.LJ(this.avatarIsNew, naviContext.avatarIsNew);
    }

    public final int hashCode() {
        Long l = this.avatarId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.avatarIsNew;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NaviContext(avatarId=");
        LIZ.append(this.avatarId);
        LIZ.append(", avatarIsNew=");
        return C78920UyC.LIZIZ(LIZ, this.avatarIsNew, ')', LIZ);
    }

    public /* synthetic */ NaviContext(int i) {
        this(null, Boolean.FALSE);
    }

    public NaviContext(Long l, Boolean bool) {
        this.avatarId = l;
        this.avatarIsNew = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.avatarId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Boolean bool = this.avatarIsNew;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
    }
}
