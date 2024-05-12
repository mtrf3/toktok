package X;

import kotlin.jvm.internal.o;

/* renamed from: X.93H, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C93H implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;

    public C93H() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93H)) {
            return false;
        }
        C93H c93h = (C93H) obj;
        return o.LJ(this.LJLIL, c93h.LJLIL) && o.LJ(this.LJLILLLLZI, c93h.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<Boolean> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecUserAfterAuthPopupState(showPopup=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isAuthSyncSuccess=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C93H(C43I<Boolean> c43i, C43I<Boolean> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }
}
