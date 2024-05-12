package X;

import X.T2L;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T2M extends X9H {
    public final T2L<T>.a[] LJLIL;

    public final void LIZIZ() {
        for (T2L<T>.a aVar : this.LJLIL) {
            T2N t2n = aVar.LJLJJLL;
            if (t2n != null) {
                t2n.dispose();
            } else {
                o.LJIJI("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisposeHandlersOnCancel[");
        LIZ.append(this.LJLIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public T2M(T2L.a[] aVarArr) {
        this.LJLIL = aVarArr;
    }

    @Override // X.X9G
    public final void LIZ(Throwable th) {
        LIZIZ();
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable th) {
        LIZIZ();
        return C76800UCe.LIZ;
    }
}
