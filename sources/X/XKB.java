package X;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes16.dex */
public final class XKB<E> implements C3CD<C79973Bx<? extends E>> {
    public final /* synthetic */ XK4<E> LJLIL;

    public XKB(XK4<E> xk4) {
        this.LJLIL = xk4;
    }

    @Override // X.C3CD
    public final void LJJI(XKG xkg, C3C9 c3c9) {
        XK4<E> xk4 = this.LJLIL;
        xk4.getClass();
        while (!xkg.LIZ()) {
            if (!(xk4.LJLILLLLZI.LJIIZILJ() instanceof XK1) && xk4.LJIJJ()) {
                XKA xka = new XKA(xk4, xkg, c3c9);
                if (xk4.LJIJ(xka)) {
                    xkg.LJIIJ(xka);
                    return;
                }
            } else {
                Object LJJIIJ = xk4.LJJIIJ(xkg);
                if (LJJIIJ == C84636XJo.LIZIZ) {
                    return;
                }
                if (LJJIIJ != XKK.LIZLLL && LJJIIJ != XJW.LIZIZ) {
                    if (LJJIIJ instanceof XK0) {
                        if (xkg.LJ()) {
                            C78555UsJ.LJJJI(c3c9, new C79973Bx(new C79993Bz(((XK0) LJJIIJ).LJLJJI)), xkg.LJIIJJI());
                        }
                    } else {
                        C78555UsJ.LJJJI(c3c9, new C79973Bx(LJJIIJ), xkg.LJIIJJI());
                    }
                }
            }
        }
    }
}
