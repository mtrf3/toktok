package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7J8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7J8 implements C33Q {
    public final C43I<C7J4> LJLIL;

    public C7J8() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7J8) && o.LJ(this.LJLIL, ((C7J8) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<C7J4> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StatePassingState(anyAssemShow=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C7J8(C43I<C7J4> c43i) {
        this.LJLIL = c43i;
    }
}
