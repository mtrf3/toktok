package X;

import kotlin.jvm.internal.o;

/* renamed from: X.86d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2058786d<T> {
    public final int LIZ;
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2058786d)) {
            return false;
        }
        C2058786d c2058786d = (C2058786d) obj;
        return this.LIZ == c2058786d.LIZ && o.LJ(this.LIZIZ, c2058786d.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        T t = this.LIZIZ;
        return i + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IndexedValue(index=");
        LIZ.append(this.LIZ);
        LIZ.append(", value=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C2058786d(int i, T t) {
        this.LIZ = i;
        this.LIZIZ = t;
    }
}
