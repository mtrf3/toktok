package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164136cL<T> extends AbstractC164156cN<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C164136cL) && o.LJ(this.LIZ, ((C164136cL) obj).LIZ);
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

    public C164136cL(T t) {
        this.LIZ = t;
    }
}
