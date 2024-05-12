package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EF5 {
    public volatile long LIZ;
    public volatile String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EF5)) {
            return false;
        }
        EF5 ef5 = (EF5) obj;
        return this.LIZ == ef5.LIZ && o.LJ(this.LIZIZ, ef5.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public EF5() {
        this(-1L, "");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VersionInfo(versionCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", versionName=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public EF5(long j, String versionName) {
        o.LJIIIZ(versionName, "versionName");
        this.LIZ = j;
        this.LIZIZ = versionName;
    }
}
