package X;

import kotlin.jvm.internal.AqS119S0300000_15;

/* loaded from: classes16.dex */
public final class XK6<E> implements InterfaceC169716lL<E> {
    public final XK4<E> LIZ;
    public Object LIZIZ = XKK.LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC169716lL
    public final E next() {
        E e = (E) this.LIZIZ;
        if (!(e instanceof XK0)) {
            C3BS c3bs = XKK.LIZLLL;
            if (e != c3bs) {
                this.LIZIZ = c3bs;
                return e;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        throw ((XK0) e).LJJIJ();
    }

    public XK6(XK4<E> xk4) {
        this.LIZ = xk4;
    }

    @Override // X.InterfaceC169716lL
    public final Object LIZ(C3CS c3cs) {
        AqS119S0300000_15 aqS119S0300000_15;
        Object obj = this.LIZIZ;
        C3BS c3bs = XKK.LIZLLL;
        boolean z = false;
        if (obj != c3bs) {
            if (obj instanceof XK0) {
                XK0 xk0 = (XK0) obj;
                if (xk0.LJLJJI != null) {
                    throw xk0.LJJIJ();
                }
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        Object LJJIII = this.LIZ.LJJIII();
        this.LIZIZ = LJJIII;
        if (LJJIII != c3bs) {
            if (LJJIII instanceof XK0) {
                XK0 xk02 = (XK0) LJJIII;
                if (xk02.LJLJJI != null) {
                    throw xk02.LJJIJ();
                }
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        XKS LJIILIIL = C78929UyL.LJIILIIL(C78555UsJ.LJJII(c3cs));
        XK9 xk9 = new XK9(this, LJIILIIL);
        while (true) {
            if (this.LIZ.LJIJ(xk9)) {
                XK4<E> xk4 = this.LIZ;
                xk4.getClass();
                LJIILIIL.LJIILIIL(new X9M(xk4, xk9));
                break;
            }
            Object LJJIII2 = this.LIZ.LJJIII();
            this.LIZIZ = LJJIII2;
            if (LJJIII2 instanceof XK0) {
                XK0 xk03 = (XK0) LJJIII2;
                if (xk03.LJLJJI == null) {
                    Boolean bool = Boolean.FALSE;
                    C3C5.m7constructorimpl(bool);
                    LJIILIIL.resumeWith(bool);
                } else {
                    C3C4 LIZ = C141335gf.LIZ(xk03.LJJIJ());
                    C3C5.m7constructorimpl(LIZ);
                    LJIILIIL.resumeWith(LIZ);
                }
            } else if (LJJIII2 != XKK.LIZLLL) {
                Boolean bool2 = Boolean.TRUE;
                InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LIZ.LJLIL;
                if (interfaceC88472Yns == null) {
                    aqS119S0300000_15 = null;
                } else {
                    aqS119S0300000_15 = new AqS119S0300000_15((InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<Object, C76800UCe>) LJJIII2, (Object) LJIILIIL.LJLJJL, (MBA) 4);
                }
                LJIILIIL.LJJIIZ(bool2, aqS119S0300000_15);
            }
        }
        return LJIILIIL.LJIIJJI();
    }
}
