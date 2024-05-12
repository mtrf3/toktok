package X;

/* loaded from: classes12.dex */
public final class P67 {
    public final int LIZ;
    public final int LIZIZ;

    public P67() {
        this.LIZ = 720;
        this.LIZIZ = 1280;
    }

    public final int hashCode() {
        return (this.LIZ * 65537) + 1 + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("x");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P67)) {
            return false;
        }
        P67 p67 = (P67) obj;
        if (this.LIZ != p67.LIZ || this.LIZIZ != p67.LIZIZ) {
            return false;
        }
        return true;
    }

    public P67(int i, int i2) {
        this.LIZ = 720;
        this.LIZIZ = 1280;
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
