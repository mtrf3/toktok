package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214078ah implements C33Q {
    public final C43I<C76800UCe> LJLIL;

    public C214078ah() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C214078ah) && o.LJ(this.LJLIL, ((C214078ah) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<C76800UCe> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdInteractiveState(showEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C214078ah(C43I<C76800UCe> c43i) {
        this.LJLIL = c43i;
    }
}