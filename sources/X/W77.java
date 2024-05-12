package X;

import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class W77 implements InterfaceC81759W6x<C81392Vwy<W5A>> {
    public final InterfaceC81759W6x<C81392Vwy<W5A>> LIZ;
    public final AbstractC78853Ux7 LIZIZ;
    public final Executor LIZJ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        W7F<C81392Vwy<W5A>> w79;
        InterfaceC81754W6s LIZ = interfaceC81770W7i.LIZ();
        VA3 va3 = interfaceC81770W7i.LJ().LJIILLIIL;
        W76 w76 = new W76(this, w7f, LIZ, interfaceC81770W7i.getId(), va3, interfaceC81770W7i);
        if (va3 instanceof W7H) {
            w79 = new W78(w76, (W7H) va3, interfaceC81770W7i);
        } else {
            w79 = new W79(w76);
        }
        this.LIZ.LIZIZ(w79, interfaceC81770W7i);
    }

    public W77(InterfaceC81759W6x<C81392Vwy<W5A>> interfaceC81759W6x, AbstractC78853Ux7 abstractC78853Ux7, Executor executor) {
        interfaceC81759W6x.getClass();
        this.LIZ = interfaceC81759W6x;
        this.LIZIZ = abstractC78853Ux7;
        executor.getClass();
        this.LIZJ = executor;
    }
}
