package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MFZ {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final Long LJFF;
    public final long LJI;
    public final long LJII;
    public final long LJIIIIZZ;

    public MFZ() {
        this(0L, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFZ)) {
            return false;
        }
        MFZ mfz = (MFZ) obj;
        return this.LIZ == mfz.LIZ && this.LIZIZ == mfz.LIZIZ && this.LIZJ == mfz.LIZJ && this.LIZLLL == mfz.LIZLLL && this.LJ == mfz.LJ && o.LJ(this.LJFF, mfz.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31);
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LIZJ + i) * 31;
        Long l = this.LJFF;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TimePoint(clickTab=");
        LIZ.append(this.LIZ);
        LIZ.append(", startRequest=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", endRequest=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showVideo=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isSuccess=");
        LIZ.append(this.LJ);
        LIZ.append(", listCount=");
        return JBR.LJ(LIZ, this.LJFF, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ MFZ(long r12, int r14) {
        /*
            r11 = this;
            r1 = r12
            r0 = r14 & 1
            if (r0 == 0) goto L7
            r1 = 0
        L7:
            r3 = 0
            r0 = r14 & 16
            if (r0 == 0) goto L16
            r9 = 1
        Le:
            r10 = 0
            r0 = r11
            r5 = r3
            r7 = r3
            r0.<init>(r1, r3, r5, r7, r9, r10)
            return
        L16:
            r9 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MFZ.<init>(long, int):void");
    }

    public MFZ(long j, long j2, long j3, long j4, boolean z, Long l) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = z;
        this.LJFF = l;
        this.LJI = j2 - j;
        this.LJII = j3 - j2;
        this.LJIIIIZZ = j4 - j3;
    }

    public static MFZ LIZ(MFZ mfz, long j, long j2, long j3, boolean z, Long l, int i) {
        long j4;
        Long l2 = l;
        boolean z2 = z;
        long j5 = j3;
        long j6 = j;
        long j7 = j2;
        if ((i & 1) != 0) {
            j4 = mfz.LIZ;
        } else {
            j4 = 0;
        }
        if ((i & 2) != 0) {
            j6 = mfz.LIZIZ;
        }
        if ((i & 4) != 0) {
            j7 = mfz.LIZJ;
        }
        if ((i & 8) != 0) {
            j5 = mfz.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = mfz.LJ;
        }
        if ((i & 32) != 0) {
            l2 = mfz.LJFF;
        }
        return new MFZ(j4, j6, j7, j5, z2, l2);
    }
}
