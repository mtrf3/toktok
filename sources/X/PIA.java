package X;

/* loaded from: classes12.dex */
public final class PIA<F, S> {
    public final F LIZ;
    public final S LIZIZ;

    public final int hashCode() {
        return this.LIZ.hashCode() ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Pair{");
        LIZ.append(String.valueOf(this.LIZ));
        LIZ.append(" ");
        LIZ.append(String.valueOf(this.LIZIZ));
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PIA)) {
            return false;
        }
        PIA pia = (PIA) obj;
        F f = pia.LIZ;
        F f2 = this.LIZ;
        if (f != f2 && (f == null || !f.equals(f2))) {
            return false;
        }
        S s = pia.LIZIZ;
        S s2 = this.LIZIZ;
        if (s != s2 && (s == null || !s.equals(s2))) {
            return false;
        }
        return true;
    }

    public PIA(F f, S s) {
        this.LIZ = f;
        this.LIZIZ = s;
    }
}
