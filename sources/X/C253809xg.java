package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253809xg implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final boolean LJLILLLLZI;
    public final C43I<Boolean> LJLJI;

    public C253809xg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C253809xg)) {
            return false;
        }
        C253809xg c253809xg = (C253809xg) obj;
        return o.LJ(this.LJLIL, c253809xg.LJLIL) && this.LJLILLLLZI == c253809xg.LJLILLLLZI && o.LJ(this.LJLJI, c253809xg.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C43I<Boolean> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C43I<Boolean> c43i2 = this.LJLJI;
        return i2 + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecUserPopupState(scrollToTop=");
        LIZ.append(this.LJLIL);
        LIZ.append(", privacyVisible=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", triggerLoad=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C253809xg(int i) {
        this(null, null, false);
    }

    public C253809xg(C43I c43i, C43I c43i2, boolean z) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = z;
        this.LJLJI = c43i2;
    }

    public static C253809xg LIZ(C253809xg c253809xg, C43I c43i, boolean z, C43I c43i2, int i) {
        if ((i & 1) != 0) {
            c43i = c253809xg.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c253809xg.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = c253809xg.LJLJI;
        }
        c253809xg.getClass();
        return new C253809xg(c43i, c43i2, z);
    }
}
