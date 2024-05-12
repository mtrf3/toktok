package X;

/* renamed from: X.11w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C264011w<T> {
    public T LIZ;
    public T LIZIZ;

    public final int hashCode() {
        int hashCode;
        T t = this.LIZ;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.LIZIZ;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
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
        if (!(obj instanceof C15070iV)) {
            return false;
        }
        C15070iV c15070iV = (C15070iV) obj;
        F f = c15070iV.LIZ;
        Object obj2 = this.LIZ;
        if (f != obj2 && (f == 0 || !f.equals(obj2))) {
            return false;
        }
        S s = c15070iV.LIZIZ;
        Object obj3 = this.LIZIZ;
        if (s != obj3 && (s == 0 || !s.equals(obj3))) {
            return false;
        }
        return true;
    }
}
