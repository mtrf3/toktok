package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTS {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RTS)) {
            return false;
        }
        RTS rts = (RTS) obj;
        return this.LIZ == rts.LIZ && this.LIZIZ == rts.LIZIZ && this.LIZJ == rts.LIZJ && o.LJ(this.LIZLLL, rts.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MonthDayDisplayName(year=");
        LIZ.append(this.LIZ);
        LIZ.append(", month=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", day=");
        LIZ.append(this.LIZJ);
        LIZ.append(", displayName=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public RTS(int i, int i2, int i3, String displayName) {
        o.LJIIIZ(displayName, "displayName");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = displayName;
    }
}
