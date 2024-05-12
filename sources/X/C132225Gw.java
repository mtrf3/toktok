package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132225Gw {
    public final C08630Vn<Boolean> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public C132225Gw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C132225Gw)) {
            return false;
        }
        C132225Gw c132225Gw = (C132225Gw) obj;
        return o.LJ(this.LIZ, c132225Gw.LIZ) && this.LIZIZ == c132225Gw.LIZIZ && this.LIZJ == c132225Gw.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C08630Vn<Boolean> c08630Vn = this.LIZ;
        int hashCode = (((c08630Vn == null ? 0 : c08630Vn.hashCode()) * 31) + this.LIZIZ) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditorProSceneStates(enterOrExitAnimEvent=");
        LIZ.append(this.LIZ);
        LIZ.append(", viewFullBgVisibility=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isAnimatingInOrOut=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C132225Gw(int i) {
        this(null, 4, false);
    }

    public C132225Gw(C08630Vn<Boolean> c08630Vn, int i, boolean z) {
        this.LIZ = c08630Vn;
        this.LIZIZ = i;
        this.LIZJ = z;
    }

    public static C132225Gw LIZ(C132225Gw c132225Gw, C08630Vn c08630Vn, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            c08630Vn = c132225Gw.LIZ;
        }
        if ((i2 & 2) != 0) {
            i = c132225Gw.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z = c132225Gw.LIZJ;
        }
        c132225Gw.getClass();
        return new C132225Gw(c08630Vn, i, z);
    }
}
