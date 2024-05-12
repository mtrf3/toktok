package X;

/* loaded from: classes12.dex */
public final class PI9<F, S> {
    public final F LIZ;
    public final S LIZIZ;

    public final int hashCode() {
        int hashCode;
        F f = this.LIZ;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.LIZIZ;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Pair{");
        LIZ.append(String.valueOf(this.LIZ));
        LIZ.append(" ");
        LIZ.append(this.LIZIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PI9)) {
            return false;
        }
        PI9 pi9 = (PI9) obj;
        F f = pi9.LIZ;
        F f2 = this.LIZ;
        if (f != f2 && (f == null || !f.equals(f2))) {
            return false;
        }
        S s = pi9.LIZIZ;
        S s2 = this.LIZIZ;
        if (s != s2 && (s == null || !s.equals(s2))) {
            return false;
        }
        return true;
    }

    public PI9(F f, S s) {
        this.LIZ = f;
        this.LIZIZ = s;
    }
}
