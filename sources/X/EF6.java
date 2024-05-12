package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EF6 {
    public volatile long LIZ;
    public volatile String LIZIZ;
    public volatile long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EF6)) {
            return false;
        }
        EF6 ef6 = (EF6) obj;
        return this.LIZ == ef6.LIZ && o.LJ(this.LIZIZ, ef6.LIZIZ) && this.LIZJ == ef6.LIZJ;
    }

    public EF6() {
        this(-1L, "", -1L);
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + C79062V1e.LJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BussinessVersionInfo(versionCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", versionName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", updateVersionCode=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public EF6(long j, String versionName, long j2) {
        o.LJIIIZ(versionName, "versionName");
        this.LIZ = j;
        this.LIZIZ = versionName;
        this.LIZJ = j2;
    }
}
