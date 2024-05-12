package X;

/* loaded from: classes15.dex */
public final class WAE implements WAR {
    public final WAA LIZ;
    public int LIZJ;
    public final int[] LJI;
    public long LIZIZ = -1;
    public int LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;

    @Override // X.WAR
    public final void LIZ() {
    }

    @Override // X.WAR
    public final WAR LIZLLL(WAR war) {
        return null;
    }

    @Override // X.WAR
    public final long LJ() {
        long j = this.LIZIZ;
        if (j != -1) {
            return j;
        }
        this.LIZIZ = 0L;
        int length = this.LJI.length;
        for (int i = 0; i < length; i++) {
            this.LIZIZ += LJI(this.LJI[i]);
        }
        return this.LIZIZ;
    }

    @Override // X.WAR
    public final long LIZIZ(long j) {
        if (LJ() == 0) {
            return -1L;
        }
        if (this.LIZ.getLoopCount() != 0 && this.LIZJ >= this.LIZ.getLoopCount()) {
            return -1L;
        }
        long LJI = LJI(this.LJI[this.LIZLLL]);
        long j2 = this.LJ + LJI;
        if (j2 >= j) {
            return j2;
        }
        return j + LJI;
    }

    @Override // X.WAR
    public final long LJFF(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += LJI(i);
        }
        return j;
    }

    public final int LJI(int i) {
        if (i >= this.LIZ.getFrameCount()) {
            return this.LIZ.LIZIZ(0);
        }
        return this.LIZ.LIZIZ(i);
    }

    public WAE(WAA waa, int[] iArr) {
        this.LIZ = waa;
        this.LJI = iArr;
    }

    @Override // X.WAR
    public final int LIZJ(long j, long j2) {
        boolean z;
        int i = 0;
        if (this.LIZ.getLoopCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && j / LJ() >= this.LIZ.getLoopCount()) {
            return -1;
        }
        long j3 = 0;
        int i2 = 0;
        do {
            j3 += LJI(this.LJI[i2]);
            i2++;
        } while (j % LJ() >= j3);
        int i3 = i2 - 1;
        if (this.LIZLLL == -1 || j2 != this.LJFF) {
            this.LJ = j;
            this.LJFF = j;
            this.LIZLLL = i3;
            return this.LJI[i3];
        }
        this.LJFF = j;
        if (this.LJ + LJI(this.LJI[r4]) > j) {
            return this.LJI[this.LIZLLL];
        }
        this.LJ = j;
        int i4 = this.LIZLLL + 1;
        int[] iArr = this.LJI;
        if (i4 >= iArr.length) {
            this.LIZJ++;
        } else {
            i = i4;
        }
        if (this.LIZ.LJIIIIZZ(iArr[i])) {
            this.LIZLLL = i;
            return this.LJI[i];
        }
        return this.LJI[this.LIZLLL];
    }
}
