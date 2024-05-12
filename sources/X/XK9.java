package X;

import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class XK9<E> extends XKE<E> {
    public final XK6<E> LJLJJI;
    public final XJL<Boolean> LJLJJL;

    @Override // X.C84629XJh
    public final String toString() {
        return o.LJIILLIIL(C65314PkE.LJI(this), "ReceiveHasNext@");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XKL
    public final C3BS LJI(Object obj) {
        if (this.LJLJJL.LIZLLL(Boolean.TRUE, null, LJJII(obj)) == null) {
            return null;
        }
        return C84646XJy.LIZ;
    }

    @Override // X.XKL
    public final void LJIIIIZZ(E e) {
        this.LJLJJI.LIZIZ = e;
        this.LJLJJL.LJJIJIIJIL();
    }

    @Override // X.XKE
    public final InterfaceC88472Yns<Throwable, C76800UCe> LJJII(E e) {
        InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LJLJJI.LIZ.LJLIL;
        if (interfaceC88472Yns == null) {
            return null;
        }
        return new AqS119S0300000_15((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<Object, C76800UCe>) e, (Object) this.LJLJJL.getContext(), (MBA) 4);
    }

    @Override // X.XKE
    public final void LJJIII(XK0<?> xk0) {
        C3BS LJJJI;
        if (xk0.LJLJJI == null) {
            LJJJI = this.LJLJJL.LJJIZ(Boolean.FALSE, null);
        } else {
            LJJJI = this.LJLJJL.LJJJI(xk0.LJJIJ());
        }
        if (LJJJI != null) {
            this.LJLJJI.LIZIZ = xk0;
            this.LJLJJL.LJJIJIIJIL();
        }
    }

    public XK9(XK6 xk6, XKS xks) {
        this.LJLJJI = xk6;
        this.LJLJJL = xks;
    }
}
