package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18430nv {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18430nv)) {
            return false;
        }
        C18430nv c18430nv = (C18430nv) obj;
        return this.LIZ == c18430nv.LIZ && this.LIZIZ == c18430nv.LIZIZ && this.LIZJ == c18430nv.LIZJ && o.LJ(this.LIZLLL, c18430nv.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, this.LIZ * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QueuedEffect(messageType=");
        LIZ.append(this.LIZ);
        LIZ.append(", arg1=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", arg2=");
        LIZ.append(this.LIZJ);
        LIZ.append(", arg3=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C18430nv(long j, String arg3) {
        o.LJIIIZ(arg3, "arg3");
        this.LIZ = 66667;
        this.LIZIZ = j;
        this.LIZJ = 0L;
        this.LIZLLL = arg3;
    }
}
