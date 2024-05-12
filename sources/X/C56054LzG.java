package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LzG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56054LzG {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56054LzG)) {
            return false;
        }
        C56054LzG c56054LzG = (C56054LzG) obj;
        return o.LJ(this.LIZ, c56054LzG.LIZ) && this.LIZIZ == c56054LzG.LIZIZ && o.LJ(this.LIZJ, c56054LzG.LIZJ) && this.LIZLLL == c56054LzG.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LJ = C79062V1e.LJ(this.LIZJ, (i + i3) * 31, 31);
        if (!this.LIZLLL) {
            i2 = 0;
        }
        return LJ + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxInfo(dataString=");
        LIZ.append(this.LIZ);
        LIZ.append(", fromOnline=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", logId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isPullRefresh=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C56054LzG(String str, String logId, boolean z, boolean z2) {
        o.LJIIIZ(logId, "logId");
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = logId;
        this.LIZLLL = z2;
    }
}
