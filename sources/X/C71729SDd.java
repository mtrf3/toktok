package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SDd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71729SDd<S> {
    public final S LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C71729SDd) && o.LJ(this.LIZ, ((C71729SDd) obj).LIZ);
    }

    public final int hashCode() {
        S s = this.LIZ;
        if (s == null) {
            return 0;
        }
        return s.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("State(state=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C71729SDd(S s) {
        this.LIZ = s;
    }
}
