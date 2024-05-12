package X;

import java.io.Serializable;

/* renamed from: X.PnF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65501PnF<T> implements InterfaceC65503PnH<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final InterfaceC65503PnH<T> LJLIL;

    public final int hashCode() {
        return ~this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Predicates.not(");
        LIZ.append(this.LJLIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C65501PnF(C65500PnE c65500PnE) {
        this.LJLIL = c65500PnE;
    }

    @Override // X.InterfaceC65503PnH
    public final boolean apply(T t) {
        return !this.LJLIL.apply(t);
    }

    @Override // X.InterfaceC65503PnH
    public final boolean equals(Object obj) {
        if (obj instanceof C65501PnF) {
            return this.LJLIL.equals(((C65501PnF) obj).LJLIL);
        }
        return false;
    }
}
