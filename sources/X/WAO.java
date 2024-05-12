package X;

/* loaded from: classes15.dex */
public final class WAO implements WAR {
    public final WAA LIZ;
    public int LIZJ;
    public boolean LJI;
    public final int LJII;
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
        if (war instanceof WAO) {
            WAO wao = (WAO) war;
            WAO wao2 = new WAO(wao.LIZ, wao.LJII);
            wao2.LIZLLL = this.LIZLLL;
            wao2.LJFF = this.LJFF;
            wao2.LIZJ = this.LIZJ;
            wao2.LJ = this.LJ;
            return wao2;
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

    public WAO(WAA waa, int i) {
        this.LIZ = waa;
        this.LJII = i;
    }

    @Override // X.WAR
    public final int LIZJ(long j, long j2) {
        if (LJ() == 0) {
            return -1;
        }
        int i = 0;
        if (this.LIZ.getLoopCount() != 0 && this.LIZJ >= this.LIZ.getLoopCount()) {
            return -1;
        }
        int i2 = this.LIZLLL;
        if (i2 == -1 || j2 != this.LJFF) {
            this.LJ = j;
            this.LJFF = j;
            if (i2 == -1 || this.LJI) {
                this.LIZLLL = 0;
                this.LJI = false;
            }
            this.LIZJ = 0;
            return this.LIZLLL;
        }
        this.LJFF = j;
        if (this.LJ + this.LIZ.LIZIZ(i2) > j) {
            return this.LIZLLL;
        }
        this.LJ = j;
        int i3 = this.LIZLLL + 1;
        if (i3 >= this.LIZ.getFrameCount()) {
            int i4 = this.LJII;
            if (i4 == 0 || i4 == 3) {
                this.LIZJ++;
            } else {
                i = i3 - 1;
            }
        } else {
            i = i3;
        }
        this.LIZLLL = i;
        return i;
    }
}
