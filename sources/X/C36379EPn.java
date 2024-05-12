package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EPn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36379EPn extends AbstractC36384EPs {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36379EPn) && o.LJ(this.LIZ, ((C36379EPn) obj).LIZ);
    }

    public final int hashCode() {
        Throwable th = this.LIZ;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FailUpdateEffectNetworkError(e=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C36379EPn(Throwable th) {
        this.LIZ = th;
    }
}
