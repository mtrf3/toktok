package X;

import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0OJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OJ {
    public final InterfaceC88472Yns<InterfaceC65784Pro<C76800UCe>, C76800UCe> LIZ;
    public final IDqS443S0100000 LIZIZ = new IDqS443S0100000(this, 12);
    public final IDqS416S0100000 LIZJ = new IDqS416S0100000(this, 125);
    public final C25710zf<C0OI> LIZLLL = new C25710zf<>(new C0OI[16]);
    public C1IK LJ;
    public boolean LJFF;
    public C0OI LJI;

    public final void LIZ() {
        synchronized (this.LIZLLL) {
            C25710zf<C0OI> c25710zf = this.LIZLLL;
            int i = c25710zf.LJLJI;
            if (i > 0) {
                C0OI[] c0oiArr = c25710zf.LJLIL;
                o.LJII(c0oiArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i2 = 0;
                do {
                    C0OI c0oi = c0oiArr[i2];
                    c0oi.LJ.LIZIZ();
                    C25690zd<Object, C25680zc> c25690zd = c0oi.LJFF;
                    c25690zd.LIZJ = 0;
                    C61898ORa.LJJIFFI(c25690zd.LIZ, null);
                    C61898ORa.LJJIFFI(c25690zd.LIZIZ, null);
                    c0oi.LJIIJ.LIZIZ();
                    c0oi.LJIIJJI.clear();
                    i2++;
                } while (i2 < i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0OJ(InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    public final <T> C0OI LIZIZ(InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns) {
        C0OI c0oi;
        C25710zf<C0OI> c25710zf = this.LIZLLL;
        int i = c25710zf.LJLJI;
        if (i > 0) {
            C0OI[] c0oiArr = c25710zf.LJLIL;
            o.LJII(c0oiArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                c0oi = c0oiArr[i2];
                if (c0oi.LIZ == interfaceC88472Yns) {
                    break;
                }
                i2++;
            } while (i2 < i);
        }
        c0oi = null;
        C0OI c0oi2 = c0oi;
        if (c0oi2 == null) {
            o.LJII(interfaceC88472Yns, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            C65777Prh.LJ(1, interfaceC88472Yns);
            C0OI c0oi3 = new C0OI(interfaceC88472Yns);
            this.LIZLLL.LIZLLL(c0oi3);
            return c0oi3;
        }
        return c0oi2;
    }

    public final void LIZJ(Object scope, InterfaceC65784Pro block, InterfaceC88472Yns onValueChangedForScope) {
        C0OI LIZIZ;
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(onValueChangedForScope, "onValueChangedForScope");
        o.LJIIIZ(block, "block");
        synchronized (this.LIZLLL) {
            LIZIZ = LIZIZ(onValueChangedForScope);
        }
        boolean z = this.LJFF;
        C0OI c0oi = this.LJI;
        try {
            this.LJFF = false;
            this.LJI = LIZIZ;
            Object obj = LIZIZ.LIZIZ;
            C25680zc c25680zc = LIZIZ.LIZJ;
            int i = LIZIZ.LIZLLL;
            LIZIZ.LIZIZ = scope;
            LIZIZ.LIZJ = LIZIZ.LJFF.LIZIZ(scope);
            if (LIZIZ.LIZLLL == -1) {
                LIZIZ.LIZLLL = C0OF.LJIIIIZZ().LIZLLL();
            }
            C78966Uyw.LJJJJ(new IDqS176S0200000(this, (C0OJ) block, (InterfaceC65784Pro<C76800UCe>) 30), LIZIZ.LJII, LIZIZ.LJIIIIZZ);
            Object obj2 = LIZIZ.LIZIZ;
            o.LJI(obj2);
            C0OI.LIZ(LIZIZ, obj2);
            LIZIZ.LIZIZ = obj;
            LIZIZ.LIZJ = c25680zc;
            LIZIZ.LIZLLL = i;
        } finally {
            this.LJI = c0oi;
            this.LJFF = z;
        }
    }
}
