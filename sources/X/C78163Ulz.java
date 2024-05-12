package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ulz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78163Ulz {
    public final int LIZ;
    public final String LIZIZ;
    public final Throwable LIZJ;
    public C78165Um1 LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78163Ulz)) {
            return false;
        }
        C78163Ulz c78163Ulz = (C78163Ulz) obj;
        return this.LIZ == c78163Ulz.LIZ && o.LJ(this.LIZIZ, c78163Ulz.LIZIZ) && o.LJ(this.LIZJ, c78163Ulz.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31);
        Throwable th = this.LIZJ;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error(errorCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", throwable=");
        return C169696lJ.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public C78163Ulz(int i, String errorMsg, Throwable th) {
        String str;
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LIZ = i;
        this.LIZIZ = errorMsg;
        this.LIZJ = th;
        switch (i) {
            case -31:
            case -29:
            case -27:
            case -26:
            case -25:
            case -23:
                str = "effect_finish";
                break;
            case -30:
            case -22:
            case -21:
            case -20:
            case -18:
            case -16:
            case -14:
            case -13:
            case -11:
            case -10:
                str = "render_start";
                break;
            case -28:
            case -24:
            case -19:
            case -17:
            case -15:
            case -12:
            default:
                str = "unknown";
                break;
        }
        this.LJ = str;
    }

    public /* synthetic */ C78163Ulz(int i, String str, int i2) {
        this(i, (i2 & 2) != 0 ? "" : str, (Throwable) null);
    }
}
