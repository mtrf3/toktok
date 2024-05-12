package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RqX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70801RqX extends AbstractC70730RpO {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C70801RqX) && o.LJ(this.LIZ, ((C70801RqX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error(e=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C70801RqX(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LIZ = e;
    }
}
