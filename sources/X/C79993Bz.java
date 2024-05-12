package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Bz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79993Bz extends C3C0 {
    public final Throwable LIZ;

    public final int hashCode() {
        Throwable th = this.LIZ;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // X.C3C0
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Closed(");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C79993Bz(Throwable th) {
        this.LIZ = th;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C79993Bz) && o.LJ(this.LIZ, ((C79993Bz) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
