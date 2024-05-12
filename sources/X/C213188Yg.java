package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213188Yg<A> {
    public final A LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C213188Yg) && o.LJ(this.LIZ, ((C213188Yg) obj).LIZ);
    }

    public final int hashCode() {
        A a = this.LIZ;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tuple1(a=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C213188Yg(A a) {
        this.LIZ = a;
    }
}
