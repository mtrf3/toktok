package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6cM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164146cM extends AbstractC164156cN {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C164146cM) && o.LJ(this.LIZ, ((C164146cM) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error(throwable=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C164146cM(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        this.LIZ = throwable;
    }
}
