package X;

import defpackage.b0;

/* loaded from: classes16.dex */
public class XK8<E> extends XKE<E> {
    public final XJL<Object> LJLJJI;
    public final int LJLJJL;

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReceiveElement@");
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append("[receiveMode=");
        return b0.LIZJ(LIZ, this.LJLJJL, ']', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XKL
    public final C3BS LJI(Object obj) {
        C79973Bx c79973Bx;
        XJL<Object> xjl = this.LJLJJI;
        if (this.LJLJJL == 1) {
            c79973Bx = new C79973Bx(obj);
        } else {
            c79973Bx = obj;
        }
        if (xjl.LIZLLL(c79973Bx, null, LJJII(obj)) == null) {
            return null;
        }
        return C84646XJy.LIZ;
    }

    @Override // X.XKL
    public final void LJIIIIZZ(E e) {
        this.LJLJJI.LJJIJIIJIL();
    }

    @Override // X.XKE
    public final void LJJIII(XK0<?> xk0) {
        if (this.LJLJJL == 1) {
            XJL<Object> xjl = this.LJLJJI;
            C79973Bx c79973Bx = new C79973Bx(new C79993Bz(xk0.LJLJJI));
            C3C5.m7constructorimpl(c79973Bx);
            xjl.resumeWith(c79973Bx);
            return;
        }
        XJL<Object> xjl2 = this.LJLJJI;
        C3C4 LIZ = C141335gf.LIZ(xk0.LJJIJ());
        C3C5.m7constructorimpl(LIZ);
        xjl2.resumeWith(LIZ);
    }

    public XK8(XKS xks, int i) {
        this.LJLJJI = xks;
        this.LJLJJL = i;
    }
}
