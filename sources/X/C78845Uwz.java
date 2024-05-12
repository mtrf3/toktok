package X;

import android.os.Build;
import android.text.TextUtils;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78845Uwz implements InterfaceC48038ItG {
    public static final C78845Uwz LJLIL = new C78845Uwz();
    public static int LJLILLLLZI = 3;
    public static int LJLJI = 3;
    public static int LJLJJI = 3;

    public static boolean LIZJ() {
        int i;
        int i2 = LJLILLLLZI;
        if (i2 != 3) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("oppo")) {
            i = 1;
        } else {
            i = 2;
        }
        LJLILLLLZI = i;
        if (i != 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL() {
        int i;
        int i2 = LJLJJI;
        if (i2 != 3) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("samsung")) {
            i = 1;
        } else {
            i = 2;
        }
        LJLJJI = i;
        if (i != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJ() {
        int i;
        int i2 = LJLJI;
        if (i2 != 3) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        String str = Build.HARDWARE;
        if (!TextUtils.isEmpty(str) && (str.toLowerCase().contains("hi") || str.toLowerCase().contains("kirin"))) {
            i = 1;
        } else {
            i = 2;
        }
        LJLJI = i;
        if (i != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return C35970E9u.LIZ();
    }

    public static final C07160Pw LJFF(Object obj, String str, InterfaceC24520xk interfaceC24520xk, int i) {
        interfaceC24520xk.LJJIIJ(1641299376);
        interfaceC24520xk.LJJIIJ(-3687241);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = new C07160Pw(new C0Q5(obj), str);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C07160Pw c07160Pw = (C07160Pw) LJIILL;
        c07160Pw.LIZ(obj, interfaceC24520xk, (i & 8) | 48 | (i & 14));
        C24610xt.LIZIZ(c07160Pw, new IDqS416S0100000(c07160Pw, 138), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return c07160Pw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C07160Pw.a LIZ(X.C07160Pw r5, X.C1JR r6, java.lang.String r7, X.InterfaceC24520xk r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "typeConverter"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r0 = -44505534(0xfffffffffd58e642, float:-1.8019301E37)
            r8.LJJIIJ(r0)
            r0 = r9 & 2
            if (r0 == 0) goto L16
            java.lang.String r7 = "DeferredAnimation"
        L16:
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r8.LJJIIJ(r0)
            boolean r0 = r8.LJIJJ(r5)
            java.lang.Object r4 = r8.LJIILL()
            if (r0 != 0) goto L2f
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r4 != r0) goto L37
        L2f:
            X.0Pw$a r4 = new X.0Pw$a
            r4.<init>(r5, r6, r7)
            r8.LJJIII(r4)
        L37:
            r8.LJJIJIIJIL()
            X.0Pw$a r4 = (X.C07160Pw.a) r4
            kotlin.jvm.internal.IDqS172S0200000 r1 = new kotlin.jvm.internal.IDqS172S0200000
            r0 = 29
            r1.<init>(r5, r4, r0)
            X.C24610xt.LIZIZ(r4, r1, r8)
            boolean r0 = r5.LJ()
            if (r0 == 0) goto L50
            X.0Pw<S>$a<T, V>$a<T, V extends X.0Q9> r7 = r4.LIZJ
            if (r7 != 0) goto L54
        L50:
            r8.LJJIJIIJIL()
            return r4
        L54:
            X.0Pw<S> r6 = r4.LIZLLL
            X.0Pw<S>$d<T, V extends X.0Q9> r5 = r7.LJLIL
            X.Yns<? super S, ? extends T> r1 = r7.LJLJI
            X.0Pv r0 = r6.LIZJ()
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Object r3 = r1.invoke(r0)
            X.Yns<? super S, ? extends T> r1 = r7.LJLJI
            X.0Pv r0 = r6.LIZJ()
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Object r2 = r1.invoke(r0)
            X.Yns<? super X.0Pv<S>, ? extends X.1J4<T>> r1 = r7.LJLILLLLZI
            X.0Pv r0 = r6.LIZJ()
            java.lang.Object r0 = r1.invoke(r0)
            X.1J4 r0 = (X.C1J4) r0
            r5.LJI(r3, r2, r0)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78845Uwz.LIZ(X.0Pw, X.1JR, java.lang.String, X.0xk, int):X.0Pw$a");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C07160Pw.d LIZIZ(X.C07160Pw r8, java.lang.Object r9, java.lang.Object r10, X.C1J4 r11, X.C0QC r12, java.lang.String r13, X.InterfaceC24520xk r14) {
        /*
            java.lang.String r0 = "animationSpec"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "typeConverter"
            r6 = r12
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "label"
            r7 = r13
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r0 = 460682138(0x1b75739a, float:2.0303278E-22)
            r14.LJJIIJ(r0)
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r14.LJJIIJ(r0)
            r3 = r8
            boolean r0 = r14.LJIJJ(r3)
            java.lang.Object r2 = r14.LJIILL()
            r4 = r9
            if (r0 != 0) goto L32
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r2 != r0) goto L3e
        L32:
            X.0Pw$d r2 = new X.0Pw$d
            X.0Q9 r5 = X.C78598Ut0.LJFF(r6, r10)
            r2.<init>(r3, r4, r5, r6, r7)
            r14.LJJIII(r2)
        L3e:
            r14.LJJIJIIJIL()
            X.0Pw$d r2 = (X.C07160Pw.d) r2
            boolean r0 = r3.LJ()
            if (r0 == 0) goto L5a
            r2.LJI(r4, r10, r11)
        L4c:
            kotlin.jvm.internal.IDqS172S0200000 r1 = new kotlin.jvm.internal.IDqS172S0200000
            r0 = 31
            r1.<init>(r3, r2, r0)
            X.C24610xt.LIZIZ(r2, r1, r14)
            r14.LJJIJIIJIL()
            return r2
        L5a:
            r2.LJII(r10, r11)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78845Uwz.LIZIZ(X.0Pw, java.lang.Object, java.lang.Object, X.1J4, X.0QC, java.lang.String, X.0xk):X.0Pw$d");
    }
}
