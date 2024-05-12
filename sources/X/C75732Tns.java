package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tns, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75732Tns<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C75732Tns) && o.LJ(this.LIZ, ((C75732Tns) obj).LIZ);
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
        LIZ.append("InternalMessage(source=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C75732Tns(T t) {
        this.LIZ = t;
    }
}
