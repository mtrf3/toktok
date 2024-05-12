package X;

import defpackage.b0;

/* renamed from: X.Gzc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43336Gzc {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;

    public C43336Gzc() {
        this(0L, 0L, 0L, 0L, 0L, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43336Gzc)) {
            return false;
        }
        C43336Gzc c43336Gzc = (C43336Gzc) obj;
        return this.LIZ == c43336Gzc.LIZ && this.LIZIZ == c43336Gzc.LIZIZ && this.LIZJ == c43336Gzc.LIZJ && this.LIZLLL == c43336Gzc.LIZLLL && this.LJ == c43336Gzc.LJ && this.LJFF == c43336Gzc.LJFF;
    }

    public final int hashCode() {
        return JBR.LIZJ(this.LJ, JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31), 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProcessData(uploadWaitClickPublishTimeMs=");
        LIZ.append(this.LIZ);
        LIZ.append(", uploadWaitSyntheticTimeMs=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", uploadOffsetSizeWhenSyntheticEnd=");
        LIZ.append(this.LIZJ);
        LIZ.append(", toUploadSizeWhenSyntheticEnd=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", uploadFileSizeB=");
        LIZ.append(this.LJ);
        LIZ.append(", smartSliceSize=");
        return b0.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C43336Gzc(long j, long j2, long j3, long j4, long j5, int i) {
        j = (i & 1) != 0 ? -1L : j;
        j2 = (i & 2) != 0 ? -1L : j2;
        j3 = (i & 4) != 0 ? -1L : j3;
        j4 = (i & 8) != 0 ? -1L : j4;
        j5 = (i & 16) != 0 ? -1L : j5;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = 0;
    }
}
