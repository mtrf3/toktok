package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3kT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92733kT<T> extends AbstractC92763kW<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C92733kT) && o.LJ(this.LIZ, ((C92733kT) obj).LIZ);
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
        LIZ.append("Error(data=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C92733kT(T t) {
        this.LIZ = t;
    }
}
