package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KUG<T> {
    public final String LIZ;
    public final T LIZIZ;
    public KUG<T> LIZJ;
    public KUG<T> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KUG)) {
            return false;
        }
        KUG kug = (KUG) obj;
        return o.LJ(this.LIZ, kug.LIZ) && o.LJ(this.LIZIZ, kug.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        T t = this.LIZIZ;
        return hashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Node(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", value=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public KUG(String str, T t) {
        this.LIZ = str;
        this.LIZIZ = t;
    }
}
