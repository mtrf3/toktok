package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8PE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PE implements C33Q {
    public final C43I<C8PF> LJLIL;

    public C8PE() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8PE) && o.LJ(this.LJLIL, ((C8PE) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<C8PF> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoAntiAddictionState(data=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C8PE(C43I<C8PF> c43i) {
        this.LJLIL = c43i;
    }
}
