package X;

/* loaded from: classes15.dex */
public final class WAN implements WAR {
    public final WAA LIZ;
    public int LIZJ;
    public final int LJI;
    public long LIZIZ = -1;
    public int LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;

    @Override // X.WAR
    public final void LIZ() {
    }

    @Override // X.WAR
    public final long LJ() {
        long j = this.LIZIZ;
        if (j != -1) {
            return j;
        }
        this.LIZIZ = 0L;
        int frameCount = this.LIZ.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.LIZIZ += this.LIZ.LIZIZ(i);
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
        long LIZIZ = this.LIZ.LIZIZ(this.LIZLLL);
        long j2 = this.LJ + LIZIZ;
        if (j2 >= j) {
            return j2;
        }
        return j + LIZIZ;
    }

    @Override // X.WAR
    public final WAR LIZLLL(WAR war) {
        if (war instanceof WAN) {
            WAN wan = (WAN) war;
            WAN wan2 = new WAN(wan.LIZ, wan.LJI);
            wan2.LIZLLL = this.LIZLLL;
            wan2.LJFF = this.LJFF;
            wan2.LIZJ = this.LIZJ;
            wan2.LJ = this.LJ;
            return wan2;
        }
        return null;
    }

    @Override // X.WAR
    public final long LJFF(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += this.LIZ.LIZIZ(i);
        }
        return j;
    }

    public WAN(WAA waa, int i) {
        this.LIZ = waa;
        this.LJI = i;
    }

    @Override // X.WAR
    public final int LIZJ(long j, long j2) {
        long LJ = LJ();
        long j3 = 0;
        if (LJ == 0) {
            return -1;
        }
        int i = 0;
        if (this.LIZ.getLoopCount() != 0 && j / LJ >= this.LIZ.getLoopCount()) {
            return -1;
        }
        int i2 = 0;
        do {
            j3 += this.LIZ.LIZIZ(i2);
            i2++;
        } while (j % LJ >= j3);
        int i3 = i2 - 1;
        if (this.LIZLLL == -1 || j2 != this.LJFF) {
            this.LJ = j;
            this.LJFF = j;
            this.LIZLLL = i3;
            this.LIZJ = 0;
            return i3;
        }
        this.LJFF = j;
        if (this.LJ + this.LIZ.LIZIZ(r4) > j) {
            return this.LIZLLL;
        }
        this.LJ = j;
        int i4 = this.LIZLLL + 1;
        if (i4 >= this.LIZ.getFrameCount()) {
            int i5 = this.LJI;
            if (i5 == 0 || i5 == 3) {
                this.LIZJ++;
            } else {
                i = i4 - 1;
            }
        } else {
            i = i4;
        }
        if (this.LIZ.LJIIIIZZ(i)) {
            this.LIZLLL = i;
            return i;
        }
        return this.LIZLLL;
    }
}
