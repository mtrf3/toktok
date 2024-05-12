package X;

import kotlin.jvm.internal.o;

/* renamed from: X.94y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2310494y implements C33Q {
    public final C43I<Object> LJLIL;
    public final C43I<Object> LJLILLLLZI;

    public C2310494y() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2310494y)) {
            return false;
        }
        C2310494y c2310494y = (C2310494y) obj;
        return o.LJ(this.LJLIL, c2310494y.LJLIL) && o.LJ(this.LJLILLLLZI, c2310494y.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<Object> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Object> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LegacyCommunicateState(lazyLoadEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", clearDataEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C2310494y(C43I<? extends Object> c43i, C43I<? extends Object> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }
}
