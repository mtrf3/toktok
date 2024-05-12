package X;

import java.io.Serializable;

/* renamed from: X.PnE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65500PnE<T> implements InterfaceC65503PnH<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final T LJLIL;

    public C65500PnE() {
        throw null;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Predicates.equalTo(");
        LIZ.append(this.LJLIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C65500PnE(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC65503PnH
    public final boolean apply(T t) {
        return this.LJLIL.equals(t);
    }

    @Override // X.InterfaceC65503PnH
    public final boolean equals(Object obj) {
        if (obj instanceof C65500PnE) {
            return this.LJLIL.equals(((C65500PnE) obj).LJLIL);
        }
        return false;
    }
}
