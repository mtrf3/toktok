package X;

/* renamed from: X.V7y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79238V7y {
    public final int LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final String toString() {
        return C16880lQ.LLLZI(null, "%dx%d", new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ)});
    }

    public final int hashCode() {
        return C0EH.LIZ(this.LIZ, 31, 31, this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C79238V7y)) {
            return false;
        }
        C79238V7y c79238V7y = (C79238V7y) obj;
        if (this.LIZ == c79238V7y.LIZ && this.LIZIZ == c79238V7y.LIZIZ) {
            return true;
        }
        return false;
    }

    public C79238V7y(int i, int i2) {
        this(2048.0f, i, i2);
    }

    public C79238V7y(float f, int i, int i2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        C32151Nz.LJI(i2 > 0);
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = f;
        this.LIZLLL = 0.6666667f;
    }
}
