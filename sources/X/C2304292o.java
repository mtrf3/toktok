package X;

import kotlin.jvm.internal.o;

/* renamed from: X.92o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2304292o implements C33Q {
    public final C43I<String> LJLIL;

    public C2304292o() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2304292o) && o.LJ(this.LJLIL, ((C2304292o) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<String> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileAdvancedFeatureState(mobShowFeatureId=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C2304292o(C43I<String> c43i) {
        this.LJLIL = c43i;
    }
}
