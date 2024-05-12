package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72912tb<T> extends AbstractC72932td<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72912tb) && o.LJ(this.LIZ, ((C72912tb) obj).LIZ);
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
        LIZ.append("Success(value=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    @Override // X.AbstractC72932td
    public final T LIZ() {
        return this.LIZ;
    }

    public C72912tb(T t) {
        this.LIZ = t;
    }
}
