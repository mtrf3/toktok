package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9kE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245469kE implements C33Q {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final C26070ALa LJLJI;
    public final C26070ALa LJLJJI;

    public C245469kE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C245469kE)) {
            return false;
        }
        C245469kE c245469kE = (C245469kE) obj;
        return this.LJLIL == c245469kE.LJLIL && this.LJLILLLLZI == c245469kE.LJLILLLLZI && o.LJ(this.LJLJI, c245469kE.LJLJI) && o.LJ(this.LJLJJI, c245469kE.LJLJJI);
    }

    public final int hashCode() {
        int i = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
        C26070ALa c26070ALa = this.LJLJI;
        int hashCode = (i + (c26070ALa == null ? 0 : c26070ALa.hashCode())) * 31;
        C26070ALa c26070ALa2 = this.LJLJJI;
        return hashCode + (c26070ALa2 != null ? c26070ALa2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseVMState(pushState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", statusCode=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", cacheEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", networkEvent=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C245469kE(int i) {
        this(-1, -1, null, null);
    }

    public C245469kE(int i, int i2, C26070ALa c26070ALa, C26070ALa c26070ALa2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = c26070ALa;
        this.LJLJJI = c26070ALa2;
    }
}
