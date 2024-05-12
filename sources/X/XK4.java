package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XK4<E> extends XK3<E> implements InterfaceC78936UyS<E> {
    public abstract boolean LJIJI();

    public abstract boolean LJIJJ();

    @Override // X.XKM
    public final C3CD<C79973Bx<E>> LJIIZILJ() {
        return new XKB(this);
    }

    public boolean LJJ() {
        XK0 xk0;
        C84629XJh LJIIZILJ = this.LJLILLLLZI.LJIIZILJ();
        if ((LJIIZILJ instanceof XK0) && (xk0 = (XK0) LJIIZILJ) != null) {
            XK3.LJ(xk0);
            if (LJIJJ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.XKM
    public final InterfaceC169716lL<E> iterator() {
        return new XK6(this);
    }

    @Override // X.XK3
    public final XKL<E> LJIILIIL() {
        return super.LJIILIIL();
    }

    @Override // X.XKM
    public final Object LJIJJLI() {
        Object LJJIII = LJJIII();
        if (LJJIII == XKK.LIZLLL) {
            return C79973Bx.LIZIZ;
        }
        if (LJJIII instanceof XK0) {
            return new C79993Bz(((XK0) LJJIII).LJLJJI);
        }
        return LJJIII;
    }

    public Object LJJIII() {
        while (true) {
            XK1 LJIILL = LJIILL();
            if (LJIILL == null) {
                return XKK.LIZLLL;
            }
            if (LJIILL.LJJIIJZLJL(null) != null) {
                LJIILL.LJJII();
                return LJIILL.LJJIII();
            }
            LJIILL.LJJIIZI();
        }
    }

    public XK4(InterfaceC88472Yns<? super E, C76800UCe> interfaceC88472Yns) {
        super(interfaceC88472Yns);
    }

    @Override // X.XKM
    public final void LIZIZ(CancellationException cancellationException) {
        if (LJJ()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(o.LJIILLIIL(" was cancelled", C16880lQ.LJLLJ(getClass())));
        }
        LJJI(LJJIFFI(cancellationException));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XKM
    public final Object LJIIIIZZ(InterfaceC67352kd<? super E> interfaceC67352kd) {
        Object LJJIII = LJJIII();
        if (LJJIII != XKK.LIZLLL && !(LJJIII instanceof XK0)) {
            return LJJIII;
        }
        return LJJIIJZLJL(0, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.XKM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.InterfaceC67352kd<? super X.C79973Bx<? extends E>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.XJ2
            if (r0 == 0) goto L47
            r4 = r6
            X.XJ2 r4 = (X.XJ2) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4d
            X.C141335gf.LIZJ(r1)
        L20:
            X.3Bx r1 = (X.C79973Bx) r1
            java.lang.Object r0 = r1.LIZ
            return r0
        L25:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r1 = r5.LJJIII()
            X.3BS r0 = X.XKK.LIZLLL
            if (r1 == r0) goto L3e
            boolean r0 = r1 instanceof X.XK0
            if (r0 == 0) goto L3d
            X.XK0 r1 = (X.XK0) r1
            java.lang.Throwable r0 = r1.LJLJJI
            X.3Bz r1 = new X.3Bz
            r1.<init>(r0)
        L3d:
            return r1
        L3e:
            r4.LJLJI = r2
            java.lang.Object r1 = r5.LJJIIJZLJL(r2, r4)
            if (r1 != r3) goto L20
            return r3
        L47:
            X.XJ2 r4 = new X.XJ2
            r4.<init>(r5, r6)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XK4.LJIILJJIL(X.2kd):java.lang.Object");
    }

    public boolean LJIJ(XKE<? super E> xke) {
        int LJJIFFI;
        C84629XJh LJIJ;
        if (LJIJI()) {
            XJT xjt = this.LJLILLLLZI;
            do {
                LJIJ = xjt.LJIJ();
                if (!(!(LJIJ instanceof XK1))) {
                }
            } while (!LJIJ.LJIIL(xke, xjt));
            return true;
        }
        C84629XJh c84629XJh = this.LJLILLLLZI;
        C84641XJt c84641XJt = new C84641XJt(xke, this);
        do {
            C84629XJh LJIJ2 = c84629XJh.LJIJ();
            if (!(!(LJIJ2 instanceof XK1))) {
                break;
            }
            LJJIFFI = LJIJ2.LJJIFFI(xke, c84629XJh, c84641XJt);
            if (LJJIFFI == 1) {
                return true;
            }
        } while (LJJIFFI != 2);
        return false;
    }

    public void LJJI(boolean z) {
        XK0<?> LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            Object obj = null;
            while (true) {
                C84629XJh LJIJ = LIZLLL.LJIJ();
                if (LJIJ instanceof XJT) {
                    LJJII(obj, LIZLLL);
                    return;
                } else if (!LJIJ.LJIL()) {
                    ((X9N) LJIJ.LJIILLIIL()).LIZ.LJIJI();
                } else {
                    obj = C79234V7u.LJJIIJZLJL(obj, LJIJ);
                }
            }
        } else {
            "Cannot happen".toString();
            throw new IllegalStateException("Cannot happen");
        }
    }

    public Object LJJIIJ(XKG<?> xkg) {
        C84643XJv c84643XJv = new C84643XJv(this.LJLILLLLZI);
        Object LJIIIZ = xkg.LJIIIZ(c84643XJv);
        if (LJIIIZ != null) {
            return LJIIIZ;
        }
        ((XK1) c84643XJv.LJIIL()).LJJII();
        return ((XK1) c84643XJv.LJIIL()).LJJIII();
    }

    public void LJJII(Object obj, XK0<?> xk0) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((XK1) obj).LJJIIJ(xk0);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((XK1) ListProtector.get(arrayList, size)).LJJIIJ(xk0);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Object LJJIIJZLJL(int i, InterfaceC67352kd<? super R> interfaceC67352kd) {
        XK8 xk8;
        Object obj;
        XKS LJIILIIL = C78929UyL.LJIILIIL(C78555UsJ.LJJII(interfaceC67352kd));
        if (this.LJLIL == null) {
            xk8 = new XK8(LJIILIIL, i);
        } else {
            xk8 = new XKF(LJIILIIL, i, this.LJLIL);
        }
        while (true) {
            if (LJIJ(xk8)) {
                LJIILIIL.LJIILIIL(new X9M(this, xk8));
                break;
            }
            Object LJJIII = LJJIII();
            if (LJJIII instanceof XK0) {
                xk8.LJJIII((XK0) LJJIII);
                break;
            }
            if (LJJIII != XKK.LIZLLL) {
                if (xk8.LJLJJL == 1) {
                    obj = new C79973Bx(LJJIII);
                } else {
                    obj = LJJIII;
                }
                LJIILIIL.LJJIIZ(obj, xk8.LJJII(LJJIII));
            }
        }
        return LJIILIIL.LJIIJJI();
    }
}
