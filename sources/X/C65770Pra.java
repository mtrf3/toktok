package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.Pra, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65770Pra<T> implements InterfaceC139745e6<T>, Serializable {
    public static final long serialVersionUID = 0;
    public final T LJLIL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LJLIL});
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Suppliers.ofInstance(");
        LIZ.append(this.LJLIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC139745e6
    public final T get() {
        return this.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C65770Pra(XQQ xqq) {
        this.LJLIL = xqq;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C65770Pra) {
            return C78886Uxe.LJIIIIZZ(this.LJLIL, ((C65770Pra) obj).LJLIL);
        }
        return false;
    }
}
