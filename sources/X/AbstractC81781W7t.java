package X;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: X.W7t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81781W7t implements InterfaceC81759W6x<W8X> {
    public final Executor LIZ;
    public final W84 LIZIZ;

    public abstract W8X LIZLLL(W5O w5o);

    public abstract String LJ();

    public AbstractC81781W7t(Executor executor, W84 w84) {
        this.LIZ = executor;
        this.LIZIZ = w84;
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        InterfaceC81754W6s LIZ = interfaceC81770W7i.LIZ();
        String id = interfaceC81770W7i.getId();
        C81780W7s c81780W7s = new C81780W7s(this, w7f, LIZ, LJ(), id, interfaceC81770W7i.LJ(), LIZ, id);
        interfaceC81770W7i.LIZLLL(new W83(c81780W7s));
        this.LIZ.execute(c81780W7s);
    }

    public final W8X LIZJ(InputStream inputStream, int i) {
        C81392Vwy c81392Vwy = null;
        try {
            if (i <= 0) {
                c81392Vwy = C81392Vwy.LJIIL(this.LIZIZ.LIZ(inputStream));
            } else {
                c81392Vwy = C81392Vwy.LJIIL(this.LIZIZ.LIZIZ(inputStream, i));
            }
            return new W8X(c81392Vwy);
        } finally {
            WFR.LIZIZ(inputStream);
            C81392Vwy.LJ(c81392Vwy);
        }
    }
}
