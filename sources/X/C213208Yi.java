package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8Yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213208Yi<A, B> {
    public final A LIZ;
    public final B LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C213208Yi)) {
            return false;
        }
        C213208Yi c213208Yi = (C213208Yi) obj;
        return o.LJ(this.LIZ, c213208Yi.LIZ) && o.LJ(this.LIZIZ, c213208Yi.LIZIZ);
    }

    public final int hashCode() {
        A a = this.LIZ;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.LIZIZ;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tuple2(a=");
        LIZ.append(this.LIZ);
        LIZ.append(", b=");
        return U26.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C213208Yi(A a, B b) {
        this.LIZ = a;
        this.LIZIZ = b;
    }
}
