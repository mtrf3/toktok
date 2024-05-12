package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92743kU<T> extends AbstractC92763kW<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C92743kU) && o.LJ(this.LIZ, ((C92743kU) obj).LIZ);
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
        LIZ.append("Loading(data=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C92743kU(T t) {
        this.LIZ = t;
    }
}
