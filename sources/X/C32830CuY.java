package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.CuY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32830CuY {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32830CuY)) {
            return false;
        }
        C32830CuY c32830CuY = (C32830CuY) obj;
        return this.LIZ == c32830CuY.LIZ && this.LIZIZ == c32830CuY.LIZIZ && o.LJ(this.LIZJ, c32830CuY.LIZJ) && this.LIZLLL == c32830CuY.LIZLLL && this.LJ == c32830CuY.LJ && o.LJ(this.LJFF, c32830CuY.LJFF);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (((C79062V1e.LJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForceInsertGiftMetrics(giftId=");
        LIZ.append(this.LIZ);
        LIZ.append(", priority=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", from=");
        LIZ.append(this.LIZJ);
        LIZ.append(", absolutePosition=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", configPosition=");
        LIZ.append(this.LJ);
        LIZ.append(", region=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C32830CuY(int i, String str, String str2, long j, long j2, int i2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = str2;
    }
}
