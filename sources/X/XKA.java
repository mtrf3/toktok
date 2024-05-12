package X;

import defpackage.b0;
import kotlin.jvm.internal.AqS119S0300000_15;

/* loaded from: classes16.dex */
public final class XKA<R, E> extends XKE<E> implements T2N {
    public final XK4<E> LJLJJI;
    public final XKG<R> LJLJJL;
    public final InterfaceC88471Ynr<Object, InterfaceC67352kd<? super R>, Object> LJLJJLL;
    public final int LJLJL = 1;

    @Override // X.T2N
    public final void dispose() {
        if (LJIL()) {
            this.LJLJJI.getClass();
        }
    }

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReceiveSelect@");
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append('[');
        LIZ.append(this.LJLJJL);
        LIZ.append(",receiveMode=");
        return b0.LIZJ(LIZ, this.LJLJL, ']', LIZ);
    }

    @Override // X.XKL
    public final C3BS LJI(Object obj) {
        return (C3BS) this.LJLJJL.LIZJ();
    }

    @Override // X.XKL
    public final void LJIIIIZZ(E e) {
        Object obj;
        InterfaceC88471Ynr<Object, InterfaceC67352kd<? super R>, Object> interfaceC88471Ynr = this.LJLJJLL;
        if (this.LJLJL == 1) {
            obj = new C79973Bx(e);
        } else {
            obj = e;
        }
        InterfaceC67352kd<R> LJIIJJI = this.LJLJJL.LJIIJJI();
        InterfaceC88472Yns<Throwable, C76800UCe> LJJII = LJJII(e);
        try {
            InterfaceC67352kd LJJII2 = C78555UsJ.LJJII(C78555UsJ.LJIILIIL(interfaceC88471Ynr, obj, LJIIJJI));
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            XKV.LIZ(c76800UCe, LJJII2, LJJII);
        } catch (Throwable th) {
            C79000UzU.LIZJ(th, LJIIJJI);
            throw null;
        }
    }

    @Override // X.XKE
    public final InterfaceC88472Yns<Throwable, C76800UCe> LJJII(E e) {
        InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LJLJJI.LJLIL;
        if (interfaceC88472Yns == null) {
            return null;
        }
        return new AqS119S0300000_15((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<Object, C76800UCe>) e, (Object) this.LJLJJL.LJIIJJI().getContext(), (MBA) 4);
    }

    @Override // X.XKE
    public final void LJJIII(XK0<?> xk0) {
        if (!this.LJLJJL.LJ()) {
            return;
        }
        int i = this.LJLJL;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            InterfaceC88471Ynr<Object, InterfaceC67352kd<? super R>, Object> interfaceC88471Ynr = this.LJLJJLL;
            C79973Bx c79973Bx = new C79973Bx(new C79993Bz(xk0.LJLJJI));
            InterfaceC67352kd<R> LJIIJJI = this.LJLJJL.LJIIJJI();
            try {
                InterfaceC67352kd LJJII = C78555UsJ.LJJII(C78555UsJ.LJIILIIL(interfaceC88471Ynr, c79973Bx, LJIIJJI));
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                XKV.LIZ(c76800UCe, LJJII, null);
                return;
            } catch (Throwable th) {
                C79000UzU.LIZJ(th, LJIIJJI);
                throw null;
            }
        }
        this.LJLJJL.LJFF(xk0.LJJIJ());
    }

    public XKA(XK4 xk4, XKG xkg, C3C9 c3c9) {
        this.LJLJJI = xk4;
        this.LJLJJL = xkg;
        this.LJLJJLL = c3c9;
    }
}
