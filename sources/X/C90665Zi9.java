package X;

import android.os.RemoteException;

/* renamed from: X.Zi9, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90665Zi9 extends AbstractC90102ZXu {
    public static final C90469Zez LIZIZ = new C90469Zez("MediaRouterCallback");
    public final InterfaceC90240ZbI LIZ;

    public C90665Zi9(InterfaceC90240ZbI interfaceC90240ZbI) {
        QH7.LJIIIIZZ(interfaceC90240ZbI);
        this.LIZ = interfaceC90240ZbI;
    }

    @Override // X.AbstractC90102ZXu
    public final void LIZLLL(ZY5 zy5, ZY4 zy4) {
        try {
            this.LIZ.LJLLJ(zy4.LJIIZILJ, zy4.LIZJ);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZIZ;
            C16880lQ.LJLLJ(InterfaceC90240ZbI.class);
            c90469Zez.getClass();
        }
    }

    @Override // X.AbstractC90102ZXu
    public final void LJ(ZY5 zy5, ZY4 zy4) {
        try {
            this.LIZ.LJZI(zy4.LJIIZILJ, zy4.LIZJ);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZIZ;
            C16880lQ.LJLLJ(InterfaceC90240ZbI.class);
            c90469Zez.getClass();
        }
    }

    @Override // X.AbstractC90102ZXu
    public final void LJI(ZY5 zy5, ZY4 zy4) {
        try {
            this.LIZ.LLD(zy4.LJIIZILJ, zy4.LIZJ);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZIZ;
            C16880lQ.LJLLJ(InterfaceC90240ZbI.class);
            c90469Zez.getClass();
        }
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIIIZZ(ZY5 zy5, ZY4 zy4) {
        if (zy4.LJIIJ != 1) {
            return;
        }
        try {
            this.LIZ.LLII(zy4.LJIIZILJ, zy4.LIZJ);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZIZ;
            C16880lQ.LJLLJ(InterfaceC90240ZbI.class);
            c90469Zez.getClass();
        }
    }

    @Override // X.AbstractC90102ZXu
    public final void LJIIJJI(ZY5 zy5, ZY4 zy4, int i) {
        if (zy4.LJIIJ != 1) {
            return;
        }
        try {
            this.LIZ.LJZL(i, zy4.LIZJ, zy4.LJIIZILJ);
        } catch (RemoteException unused) {
            C90469Zez c90469Zez = LIZIZ;
            C16880lQ.LJLLJ(InterfaceC90240ZbI.class);
            c90469Zez.getClass();
        }
    }
}
