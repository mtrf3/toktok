package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EPm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36378EPm extends AbstractC36384EPs {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36378EPm) && o.LJ(this.LIZ, ((C36378EPm) obj).LIZ);
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
        LIZ.append("FailToGetAuthKey(e=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C36378EPm(Throwable th) {
        this.LIZ = th;
    }
}
