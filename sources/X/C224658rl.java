package X;

/* renamed from: X.8rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224658rl {
    public float LIZ;
    public float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public boolean LJ = false;
    public boolean LJFF = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C224658rl)) {
            return false;
        }
        C224658rl c224658rl = (C224658rl) obj;
        return Float.compare(this.LIZ, c224658rl.LIZ) == 0 && Float.compare(this.LIZIZ, c224658rl.LIZIZ) == 0 && this.LIZJ == c224658rl.LIZJ && this.LIZLLL == c224658rl.LIZLLL && this.LJ == c224658rl.LJ && this.LJFF == c224658rl.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = (((C47959Irz.LIZIZ(this.LIZIZ, Float.floatToIntBits(this.LIZ) * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.LJFF) {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DragState(x=");
        LIZ.append(this.LIZ);
        LIZ.append(", y=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", sx=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sy=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", farEnough=");
        LIZ.append(this.LJ);
        LIZ.append(", used=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C224658rl(float f, float f2, int i, int i2) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
