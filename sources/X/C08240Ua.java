package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08240Ua {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1I7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C31861Mw LIZ(X.InterfaceC24520xk r4) {
        /*
            r0 = 1107739818(0x4206c4aa, float:33.692055)
            r4.LJJIIJ(r0)
            r0 = -903108490(0xffffffffca2ba876, float:-2812445.5)
            r4.LJJIIJ(r0)
            X.1o7 r0 = X.AnonymousClass057.LJ
            java.lang.Object r3 = r4.LJIILLIIL(r0)
            X.0vt r3 = (X.InterfaceC23370vt) r3
            float r0 = r3.getDensity()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r4.LJJIIJ(r0)
            boolean r0 = r4.LJIJJ(r1)
            java.lang.Object r2 = r4.LJIILL()
            if (r0 != 0) goto L36
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r2 != r0) goto L43
        L36:
            X.1I7 r0 = new X.1I7
            r0.<init>(r3)
            X.1JV r2 = new X.1JV
            r2.<init>(r0)
            r4.LJJIII(r2)
        L43:
            r4.LJJIJIIJIL()
            X.0QG r2 = (X.C0QG) r2
            r4.LJJIJIIJIL()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.LJJIIJ(r0)
            boolean r0 = r4.LJIJJ(r2)
            java.lang.Object r1 = r4.LJIILL()
            if (r0 != 0) goto L64
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L6c
        L64:
            X.1Mw r1 = new X.1Mw
            r1.<init>(r2)
            r4.LJJIII(r1)
        L6c:
            r4.LJJIJIIJIL()
            X.1Mw r1 = (X.C31861Mw) r1
            r4.LJJIJIIJIL()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08240Ua.LIZ(X.0xk):X.1Mw");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r0 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0SP LIZIZ(X.InterfaceC24520xk r4) {
        /*
            r0 = 1809802212(0x6bdf63e4, float:5.4012436E26)
            r4.LJJIIJ(r0)
            r0 = -81138291(0xfffffffffb29ed8d, float:-8.823163E35)
            r4.LJJIIJ(r0)
            X.1o7 r0 = X.C04Q.LIZJ
            java.lang.Object r3 = r4.LJIILLIIL(r0)
            android.content.Context r3 = (android.content.Context) r3
            X.1o6 r0 = X.C0SO.LIZ
            java.lang.Object r2 = r4.LJIILLIIL(r0)
            X.0SM r2 = (X.C0SM) r2
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.LJJIIJ(r0)
            boolean r1 = r4.LJIJJ(r3)
            boolean r0 = r4.LJIJJ(r2)
            r1 = r1 | r0
            java.lang.Object r0 = r4.LJIILL()
            if (r1 != 0) goto L3b
            X.0xi r1 = X.InterfaceC24520xk.LIZ
            r1.getClass()
            X.0xh r1 = X.C24500xi.LIZIZ
            if (r0 != r1) goto L45
        L3b:
            if (r2 == 0) goto L51
            X.1Lg r0 = new X.1Lg
            r0.<init>(r3, r2)
        L42:
            r4.LJJIII(r0)
        L45:
            r4.LJJIJIIJIL()
            X.0SP r0 = (X.C0SP) r0
            r4.LJJIJIIJIL()
            r4.LJJIJIIJIL()
            return r0
        L51:
            X.1Lh r0 = X.C0S9.LIZ
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08240Ua.LIZIZ(X.0xk):X.0SP");
    }

    public static boolean LIZJ(EnumC23500w6 layoutDirection, C0UT orientation, boolean z) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        o.LJIIIZ(orientation, "orientation");
        boolean z2 = !z;
        if (layoutDirection == EnumC23500w6.Rtl && orientation != C0UT.Vertical) {
            return !z2;
        }
        return z2;
    }
}
