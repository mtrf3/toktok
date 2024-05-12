package X;

/* loaded from: classes14.dex */
public final class V9F implements WAR {
    public final V9G LIZ;
    public long LIZIZ = -1;

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
        int frameCount = this.LIZ.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.LIZIZ += this.LIZ.LIZIZ(i);
        }
        return this.LIZIZ;
    }

    public V9F(V9G v9g) {
        this.LIZ = v9g;
    }

    @Override // X.WAR
    public final long LIZIZ(long j) {
        long LJ = LJ();
        long j2 = 0;
        if (LJ == 0) {
            return -1L;
        }
        if (this.LIZ.getLoopCount() != 0 && j / LJ() >= this.LIZ.getLoopCount()) {
            return -1L;
        }
        long j3 = j % LJ;
        int frameCount = this.LIZ.getFrameCount();
        for (int i = 0; i < frameCount && j2 <= j3; i++) {
            j2 += this.LIZ.LIZIZ(i);
        }
        return (j2 - j3) + j;
    }

    @Override // X.WAR
    public final long LJFF(int i) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += this.LIZ.LIZIZ(i);
        }
        return j;
    }

    @Override // X.WAR
    public final int LIZJ(long j, long j2) {
        int i = 0;
        if (this.LIZ.getLoopCount() == 0 || 0 != 0 || j / LJ() < this.LIZ.getLoopCount()) {
            long j3 = 0;
            do {
                j3 += this.LIZ.LIZIZ(i);
                i++;
            } while (j % LJ() >= j3);
            return i - 1;
        }
        return -1;
    }
}
