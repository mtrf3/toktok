package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195897mT implements C33Q {
    public final C43I<Boolean> LJLIL;

    public C195897mT() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C195897mT) && o.LJ(this.LJLIL, ((C195897mT) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<Boolean> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowPageState(pageSelectState=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C195897mT(C43I<Boolean> c43i) {
        this.LJLIL = c43i;
    }
}
