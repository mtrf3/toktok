package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class XK3<E> implements C3T4<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLJI = AtomicReferenceFieldUpdater.newUpdater(XK3.class, Object.class, "onCloseHandler");
    public final InterfaceC88472Yns<E, C76800UCe> LJLIL;
    public final XJT LJLILLLLZI = new XJT();
    public volatile /* synthetic */ Object onCloseHandler = null;

    public String LIZJ() {
        return "";
    }

    public abstract boolean LJI();

    public abstract boolean LJIIJ();

    public final XK0<?> LIZLLL() {
        XK0<?> xk0;
        C84629XJh LJIJ = this.LJLILLLLZI.LJIJ();
        if (!(LJIJ instanceof XK0) || (xk0 = (XK0) LJIJ) == null) {
            return null;
        }
        LJ(xk0);
        return xk0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x000b, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.XJh] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.XKL<E> LJIILIIL() {
        /*
            r4 = this;
            X.XJT r3 = r4.LJLILLLLZI
        L2:
            java.lang.Object r2 = r3.LJIILLIIL()
            X.XJh r2 = (X.C84629XJh) r2
            r1 = 0
            if (r2 != r3) goto Lf
        Lb:
            r2 = r1
        Lc:
            X.XKL r2 = (X.XKL) r2
            return r2
        Lf:
            boolean r0 = r2 instanceof X.XKL
            if (r0 != 0) goto L14
            goto Lb
        L14:
            boolean r0 = r2 instanceof X.XK0
            if (r0 == 0) goto L1f
            boolean r0 = r2.LJIJJLI()
            if (r0 != 0) goto L1f
            goto Lc
        L1f:
            X.XJh r0 = r2.LJJ()
            if (r0 != 0) goto L26
            goto Lc
        L26:
            r0.LJIJI()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XK3.LJIILIIL():X.XKL");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x000b, code lost:
    
        r2 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.XK1 LJIILL() {
        /*
            r4 = this;
            X.XJT r3 = r4.LJLILLLLZI
        L2:
            java.lang.Object r2 = r3.LJIILLIIL()
            X.XJh r2 = (X.C84629XJh) r2
            r1 = 0
            if (r2 != r3) goto Lf
        Lb:
            r2 = r1
        Lc:
            X.XK1 r2 = (X.XK1) r2
            return r2
        Lf:
            boolean r0 = r2 instanceof X.XK1
            if (r0 != 0) goto L14
            goto Lb
        L14:
            boolean r0 = r2 instanceof X.XK0
            if (r0 == 0) goto L1f
            boolean r0 = r2.LJIJJLI()
            if (r0 != 0) goto L1f
            goto Lc
        L1f:
            X.XJh r0 = r2.LJJ()
            if (r0 != 0) goto L26
            goto Lc
        L26:
            r0.LJIJI()
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XK3.LJIILL():X.XK1");
    }

    @Override // X.C3T4
    public final boolean LJII() {
        if (LIZLLL() != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String LJIILLIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append('{');
        C84629XJh LJIIZILJ = this.LJLILLLLZI.LJIIZILJ();
        if (LJIIZILJ == this.LJLILLLLZI) {
            LJIILLIIL = "EmptyQueue";
        } else {
            if (LJIIZILJ instanceof XK0) {
                LJIILLIIL = LJIIZILJ.toString();
            } else if (LJIIZILJ instanceof XKE) {
                LJIILLIIL = "ReceiveQueued";
            } else if (LJIIZILJ instanceof XK1) {
                LJIILLIIL = "SendQueued";
            } else {
                LJIILLIIL = o.LJIILLIIL(LJIIZILJ, "UNEXPECTED:");
            }
            C84629XJh LJIJ = this.LJLILLLLZI.LJIJ();
            if (LJIJ != LJIIZILJ) {
                StringBuilder LIZJ = b1.LIZJ(LJIILLIIL, ",queueSize=");
                XJT xjt = this.LJLILLLLZI;
                int i = 0;
                for (C84629XJh c84629XJh = (C84629XJh) xjt.LJIILLIIL(); !o.LJ(c84629XJh, xjt); c84629XJh = c84629XJh.LJIIZILJ()) {
                    if (c84629XJh instanceof C84629XJh) {
                        i++;
                    }
                }
                LIZJ.append(i);
                LJIILLIIL = X1D.LIZIZ(LIZJ);
                if (LJIJ instanceof XK0) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJIILLIIL);
                    LIZ2.append(",closedForSend=");
                    LIZ2.append(LJIJ);
                    LJIILLIIL = X1D.LIZIZ(LIZ2);
                }
            }
        }
        LIZ.append(LJIILLIIL);
        LIZ.append('}');
        LIZ.append(LIZJ());
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XK3(InterfaceC88472Yns<? super E, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    public static void LJ(XK0 xk0) {
        Object obj = null;
        while (true) {
            C84629XJh LJIJ = xk0.LJIJ();
            if (!(LJIJ instanceof XKE) || LJIJ == null) {
                break;
            } else if (!LJIJ.LJIL()) {
                ((X9N) LJIJ.LJIILLIIL()).LIZ.LJIJI();
            } else {
                obj = C79234V7u.LJJIIJZLJL(obj, LJIJ);
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((XKE) obj).LJJIII(xk0);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((XKE) ListProtector.get(arrayList, size)).LJJIII(xk0);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public Object LIZ(C84644XJw c84644XJw) {
        int LJJIFFI;
        C84629XJh LJIJ;
        if (LJI()) {
            XJT xjt = this.LJLILLLLZI;
            do {
                LJIJ = xjt.LJIJ();
                if (LJIJ instanceof XKL) {
                    return LJIJ;
                }
            } while (!LJIJ.LJIIL(c84644XJw, xjt));
            return null;
        }
        C84629XJh c84629XJh = this.LJLILLLLZI;
        C84642XJu c84642XJu = new C84642XJu(c84644XJw, this);
        do {
            C84629XJh LJIJ2 = c84629XJh.LJIJ();
            if (LJIJ2 instanceof XKL) {
                return LJIJ2;
            }
            LJJIFFI = LJIJ2.LJJIFFI(c84644XJw, c84629XJh, c84642XJu);
            if (LJJIFFI == 1) {
                return null;
            }
        } while (LJJIFFI != 2);
        return XKK.LJ;
    }

    public final boolean LJIIJJI(E e) {
        C46108I7s LIZLLL;
        try {
            Object LJIILLIIL = LJIILLIIL(e);
            if (!(LJIILLIIL instanceof C3C0)) {
                return true;
            }
            Throwable LIZ = C79973Bx.LIZ(LJIILLIIL);
            if (LIZ == null) {
                return false;
            }
            throw LIZ;
        } catch (Throwable th) {
            InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LJLIL;
            if (interfaceC88472Yns == null || (LIZLLL = C46104I7o.LIZLLL(interfaceC88472Yns, e, null)) == null) {
                throw th;
            }
            V0N.LJFF(LIZLLL, th);
            throw LIZLLL;
        }
    }

    public Object LJIIL(E e) {
        XKL<E> LJIILIIL;
        do {
            LJIILIIL = LJIILIIL();
            if (LJIILIIL == null) {
                return XKK.LIZJ;
            }
        } while (LJIILIIL.LJI(e) == null);
        LJIILIIL.LJIIIIZZ(e);
        return LJIILIIL.LIZIZ();
    }

    @Override // X.C3T4
    public final Object LJIILLIIL(E e) {
        Object LJIIL = LJIIL(e);
        if (LJIIL == XKK.LIZIZ) {
            return C76800UCe.LIZ;
        }
        if (LJIIL == XKK.LIZJ) {
            XK0<?> LIZLLL = LIZLLL();
            if (LIZLLL == null) {
                return C79973Bx.LIZIZ;
            }
            LJ(LIZLLL);
            Throwable th = LIZLLL.LJLJJI;
            if (th == null) {
                th = new C84645XJx("Channel was closed");
            }
            return new C79993Bz(th);
        }
        if (LJIIL instanceof XK0) {
            XK0 xk0 = (XK0) LJIIL;
            LJ(xk0);
            Throwable th2 = xk0.LJLJJI;
            if (th2 == null) {
                th2 = new C84645XJx("Channel was closed");
            }
            return new C79993Bz(th2);
        }
        String LJIILLIIL = o.LJIILLIIL(LJIIL, "trySend returned ");
        LJIILLIIL.toString();
        throw new IllegalStateException(LJIILLIIL);
    }

    @Override // X.C3T4
    public final void LJIL(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJI;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC88472Yns)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                Object obj = this.onCloseHandler;
                if (obj == XKK.LJFF) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(o.LJIILLIIL(obj, "Another handler was already registered: "));
            }
        }
        XK0<?> LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLJI;
            C3BS c3bs = XKK.LJFF;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC88472Yns, c3bs)) {
                if (atomicReferenceFieldUpdater2.get(this) != interfaceC88472Yns) {
                    return;
                }
            }
            interfaceC88472Yns.invoke(LIZLLL.LJLJJI);
        }
    }

    @Override // X.C3T4
    public final boolean LJJIFFI(Throwable th) {
        boolean z;
        Object obj;
        C3BS c3bs;
        XK0 xk0 = new XK0(th);
        XJT xjt = this.LJLILLLLZI;
        while (true) {
            C84629XJh LJIJ = xjt.LJIJ();
            if (!(!(LJIJ instanceof XK0))) {
                z = false;
                xk0 = (XK0) this.LJLILLLLZI.LJIJ();
                break;
            }
            if (LJIJ.LJIIL(xk0, xjt)) {
                z = true;
                break;
            }
        }
        LJ(xk0);
        if (z && (obj = this.onCloseHandler) != null && obj != (c3bs = XKK.LJFF)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLJI;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c3bs)) {
                    C65777Prh.LJ(1, obj);
                    ((InterfaceC88472Yns) obj).invoke(th);
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        return z;
    }

    @Override // X.C3T4
    public final Object LJIIIZ(E e, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C84644XJw xkd;
        if (LJIIL(e) == XKK.LIZIZ) {
            return C76800UCe.LIZ;
        }
        XKS LJIILIIL = C78929UyL.LJIILIIL(C78555UsJ.LJJII(interfaceC67352kd));
        while (true) {
            if (!(this.LJLILLLLZI.LJIIZILJ() instanceof XKL) && LJIIJ()) {
                if (this.LJLIL == null) {
                    xkd = new C84644XJw(e, LJIILIIL);
                } else {
                    xkd = new XKD(e, LJIILIIL, this.LJLIL);
                }
                Object LIZ = LIZ(xkd);
                if (LIZ == null) {
                    LJIILIIL.LJIILIIL(new X9L(xkd));
                    break;
                }
                if (LIZ instanceof XK0) {
                    LJFF(LJIILIIL, e, (XK0) LIZ);
                    break;
                }
                if (LIZ != XKK.LJ && !(LIZ instanceof XKE)) {
                    String LJIILLIIL = o.LJIILLIIL(LIZ, "enqueueSend returned ");
                    LJIILLIIL.toString();
                    throw new IllegalStateException(LJIILLIIL);
                }
            }
            Object LJIIL = LJIIL(e);
            if (LJIIL == XKK.LIZIZ) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                LJIILIIL.resumeWith(c76800UCe);
                break;
            }
            if (LJIIL != XKK.LIZJ) {
                if (LJIIL instanceof XK0) {
                    LJFF(LJIILIIL, e, (XK0) LJIIL);
                } else {
                    String LJIILLIIL2 = o.LJIILLIIL(LJIIL, "offerInternal returned ");
                    LJIILLIIL2.toString();
                    throw new IllegalStateException(LJIILLIIL2);
                }
            }
        }
        Object LJIIJJI = LJIILIIL.LJIIJJI();
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        if (LJIIJJI != enumC58928NAu) {
            LJIIJJI = C76800UCe.LIZ;
        }
        if (LJIIJJI == enumC58928NAu) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    public final void LJFF(XKS xks, Object obj, XK0 xk0) {
        C46108I7s LIZLLL;
        LJ(xk0);
        Throwable th = xk0.LJLJJI;
        if (th == null) {
            th = new C84645XJx("Channel was closed");
        }
        InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns == null || (LIZLLL = C46104I7o.LIZLLL(interfaceC88472Yns, obj, null)) == null) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            xks.resumeWith(LIZ);
        } else {
            V0N.LJFF(LIZLLL, th);
            C3C4 LIZ2 = C141335gf.LIZ(LIZLLL);
            C3C5.m7constructorimpl(LIZ2);
            xks.resumeWith(LIZ2);
        }
    }
}
