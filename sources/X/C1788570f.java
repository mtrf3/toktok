package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.70f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1788570f {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public String LJ;

    public C1788570f() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1788570f)) {
            return false;
        }
        C1788570f c1788570f = (C1788570f) obj;
        return this.LIZ == c1788570f.LIZ && this.LIZIZ == c1788570f.LIZIZ && this.LIZJ == c1788570f.LIZJ && this.LIZLLL == c1788570f.LIZLLL && o.LJ(this.LJ, c1788570f.LJ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31), 31), 31);
        String str = this.LJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowInteractionKeyboardShowData(clickTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", showTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showFragmentTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", animationEndTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C1788570f(int i) {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = null;
    }
}
