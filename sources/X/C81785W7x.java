package X;

import java.util.concurrent.Executor;

/* renamed from: X.W7x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81785W7x implements InterfaceC81759W6x<C81392Vwy<W5A>> {
    public final WB4 LIZ;
    public final Executor LIZIZ;
    public final InterfaceC81842WAc LIZJ;
    public final W8B LIZLLL;
    public final InterfaceC81759W6x<W8X> LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final boolean LJIIIZ;

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        W7F<W8X> c81784W7w;
        try {
            C81939WDv.LIZIZ();
            if (!C78964Uyu.LJFF(interfaceC81770W7i.LJ().LIZIZ)) {
                c81784W7w = new C81786W7y(this, w7f, interfaceC81770W7i, this.LJII, this.LJIIIIZZ);
            } else {
                c81784W7w = new C81784W7w(this, w7f, interfaceC81770W7i, new C81782W7u(this.LIZ), this.LIZLLL, new C81783W7v(this.LIZ), this.LJII, this.LJIIIIZZ);
            }
            this.LJ.LIZIZ(c81784W7w, interfaceC81770W7i);
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public C81785W7x(WB4 wb4, Executor executor, InterfaceC81842WAc interfaceC81842WAc, W8B w8b, boolean z, boolean z2, boolean z3, InterfaceC81759W6x<W8X> interfaceC81759W6x, int i, boolean z4) {
        wb4.getClass();
        this.LIZ = wb4;
        executor.getClass();
        this.LIZIZ = executor;
        interfaceC81842WAc.getClass();
        this.LIZJ = interfaceC81842WAc;
        w8b.getClass();
        this.LIZLLL = w8b;
        this.LJFF = z;
        this.LJI = z2;
        interfaceC81759W6x.getClass();
        this.LJ = interfaceC81759W6x;
        this.LJII = z3;
        this.LJIIIIZZ = i;
        this.LJIIIZ = z4;
    }
}
