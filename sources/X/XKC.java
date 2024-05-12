package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class XKC<E> extends XK4<E> {
    @Override // X.XK3
    public final boolean LJI() {
        return false;
    }

    @Override // X.XK3
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.XK4
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.XK4
    public final boolean LJIJJ() {
        return true;
    }

    public XKC(InterfaceC88472Yns<? super E, C76800UCe> interfaceC88472Yns) {
        super(interfaceC88472Yns);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return X.XKK.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
    
        if (r1 != null) goto L16;
     */
    @Override // X.XK3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(E r5) {
        /*
            r4 = this;
        L0:
            java.lang.Object r1 = super.LJIIL(r5)
            X.3BS r0 = X.XKK.LIZIZ
            if (r1 != r0) goto L9
            return r0
        L9:
            X.3BS r0 = X.XKK.LIZJ
            if (r1 != r0) goto L2d
            X.XJT r3 = r4.LJLILLLLZI
            X.XJz r2 = new X.XJz
            r2.<init>(r5)
        L14:
            X.XJh r1 = r3.LJIJ()
            boolean r0 = r1 instanceof X.XKL
            if (r0 == 0) goto L21
            if (r1 != 0) goto L28
        L1e:
            X.3BS r0 = X.XKK.LIZIZ
            return r0
        L21:
            boolean r0 = r1.LJIIL(r2, r3)
            if (r0 == 0) goto L14
            goto L1e
        L28:
            boolean r0 = r1 instanceof X.XK0
            if (r0 == 0) goto L0
            return r1
        L2d:
            boolean r0 = r1 instanceof X.XK0
            if (r0 == 0) goto L32
            return r1
        L32:
            java.lang.String r0 = "Invalid offerInternal result "
            java.lang.String r1 = kotlin.jvm.internal.o.LJIILLIIL(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XKC.LJIIL(java.lang.Object):java.lang.Object");
    }

    @Override // X.XK4
    public final void LJJII(Object obj, XK0<?> xk0) {
        C46108I7s c46108I7s;
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            XK1 xk1 = (XK1) obj;
            if (xk1 instanceof C84647XJz) {
                InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns = this.LJLIL;
                if (interfaceC88472Yns == null) {
                    return;
                } else {
                    c46108I7s = C46104I7o.LIZLLL(interfaceC88472Yns, ((C84647XJz) xk1).LJLJJI, null);
                }
            } else {
                xk1.LJJIIJ(xk0);
                return;
            }
        } else {
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            c46108I7s = null;
            while (true) {
                int i = size - 1;
                XK1 xk12 = (XK1) ListProtector.get(arrayList, size);
                if (xk12 instanceof C84647XJz) {
                    InterfaceC88472Yns<E, C76800UCe> interfaceC88472Yns2 = this.LJLIL;
                    if (interfaceC88472Yns2 == null) {
                        c46108I7s = null;
                    } else {
                        c46108I7s = C46104I7o.LIZLLL(interfaceC88472Yns2, ((C84647XJz) xk12).LJLJJI, c46108I7s);
                    }
                } else {
                    xk12.LJJIIJ(xk0);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (c46108I7s == null) {
        } else {
            throw c46108I7s;
        }
    }
}
