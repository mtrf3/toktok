package X;

/* loaded from: classes9.dex */
public final class JCP {
    public int LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJ;
    public final boolean LJFF;

    public JCP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JCP)) {
            return false;
        }
        JCP jcp = (JCP) obj;
        return this.LIZ == jcp.LIZ && Float.compare(this.LIZIZ, jcp.LIZIZ) == 0 && this.LIZJ == jcp.LIZJ && Float.compare(this.LIZLLL, jcp.LIZLLL) == 0 && Float.compare(this.LJ, jcp.LJ) == 0 && this.LJFF == jcp.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = C47959Irz.LIZIZ(this.LIZIZ, this.LIZ * 31, 31);
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int LIZIZ2 = C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, (LIZIZ + i2) * 31, 31), 31);
        if (!this.LJFF) {
            i = 0;
        }
        return LIZIZ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipRestorableState(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", progress=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", paused=");
        LIZ.append(this.LIZJ);
        LIZ.append(", playbackSpeed=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", playbackSpeedOption=");
        LIZ.append(this.LJ);
        LIZ.append(", isLoop=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public JCP(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0.0f;
        this.LIZJ = false;
        this.LIZLLL = 1.0f;
        this.LJ = 1.0f;
        this.LJFF = true;
    }
}
