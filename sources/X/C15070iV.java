package X;

import java.util.Objects;

/* renamed from: X.0iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15070iV<F, S> {
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
        LIZ.append(this.LIZ);
        LIZ.append(" ");
        LIZ.append(this.LIZIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15070iV)) {
            return false;
        }
        C15070iV c15070iV = (C15070iV) obj;
        if (!Objects.equals(c15070iV.LIZ, this.LIZ) || !Objects.equals(c15070iV.LIZIZ, this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C15070iV(F f, S s) {
        this.LIZ = f;
        this.LIZIZ = s;
    }
}
