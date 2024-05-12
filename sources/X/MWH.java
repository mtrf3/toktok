package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MWH {
    public final String LIZ;
    public final String LIZIZ;

    public MWH() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MWH)) {
            return false;
        }
        MWH mwh = (MWH) obj;
        return o.LJ(this.LIZ, mwh.LIZ) && o.LJ(this.LIZIZ, mwh.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorInboxTrackingParam(sortOptionName=");
        LIZ.append(this.LIZ);
        LIZ.append(", notificationTabName=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public MWH(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
