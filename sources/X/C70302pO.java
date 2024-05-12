package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70302pO<T> implements InterfaceC70182pC {
    public final T LIZ;

    public C70302pO() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C70302pO) && o.LJ(this.LIZ, ((C70302pO) obj).LIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Success(data=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C70302pO(T t) {
        this.LIZ = t;
    }
}
