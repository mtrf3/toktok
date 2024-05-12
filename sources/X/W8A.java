package X;

/* loaded from: classes15.dex */
public final class W8A implements InterfaceC45733HxB {
    public static final W8A LIZLLL = new W8A(Integer.MAX_VALUE, true, true);
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final int hashCode() {
        int i;
        int i2 = this.LIZ;
        int i3 = 0;
        if (this.LIZIZ) {
            i = 4194304;
        } else {
            i = 0;
        }
        int i4 = i2 ^ i;
        if (this.LIZJ) {
            i3 = 8388608;
        }
        return i4 ^ i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W8A)) {
            return false;
        }
        W8A w8a = (W8A) obj;
        if (this.LIZ == w8a.LIZ && this.LIZIZ == w8a.LIZIZ && this.LIZJ == w8a.LIZJ) {
            return true;
        }
        return false;
    }

    public W8A(int i, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
