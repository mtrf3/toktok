package X;

import kotlin.jvm.internal.o;

/* renamed from: X.92P, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C92P implements C33Q {
    public final C43I<C76800UCe> LJLIL;

    public C92P() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C92P) && o.LJ(this.LJLIL, ((C92P) obj).LJLIL);
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
        LIZ.append("VideoPlaySearchState(onPausePlay=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C92P(C43I<C76800UCe> c43i) {
        this.LJLIL = c43i;
    }
}
