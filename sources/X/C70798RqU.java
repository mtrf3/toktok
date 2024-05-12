package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RqU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70798RqU<T> extends AbstractC70730RpO {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C70798RqU) && o.LJ(this.LIZ, ((C70798RqU) obj).LIZ);
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

    public C70798RqU(T t) {
        this.LIZ = t;
    }
}
