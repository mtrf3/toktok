package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C05040Hs;
import X.C28004Ayu;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ChunkDebugInfo implements Parcelable {
    public static final Parcelable.Creator<ChunkDebugInfo> CREATOR = new C28004Ayu();

    @InterfaceC65349Pkn("chunk_time_cost")
    public final Long costTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChunkDebugInfo) && o.LJ(this.costTime, ((ChunkDebugInfo) obj).costTime);
    }

    public final int hashCode() {
        Long l = this.costTime;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChunkDebugInfo(costTime=");
        return JBR.LJ(LIZ, this.costTime, ')', LIZ);
    }

    public ChunkDebugInfo(Long l) {
        this.costTime = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.costTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
    }
}
