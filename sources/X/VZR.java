package X;

/* loaded from: classes15.dex */
public final class VZR {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return this.LIZ << (this.LIZIZ + 16);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VZR)) {
            return false;
        }
        VZR vzr = (VZR) obj;
        if (vzr.LIZ != this.LIZ || vzr.LIZIZ != this.LIZIZ) {
            return false;
        }
        return true;
    }

    public VZR(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
