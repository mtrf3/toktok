package X;

import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS3S0201000_31;

/* renamed from: X.a5C, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92094a5C {
    public static final java.util.Map<String, InterfaceC88472Yns<C1IC<NavBackStackEntry>, AbstractC06580Nq>> LIZ = new LinkedHashMap();
    public static final java.util.Map<String, InterfaceC88472Yns<C1IC<NavBackStackEntry>, AbstractC06620Nu>> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, InterfaceC88472Yns<C1IC<NavBackStackEntry>, AbstractC06580Nq>> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, InterfaceC88472Yns<C1IC<NavBackStackEntry>, AbstractC06620Nu>> LIZLLL = new LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r5 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C48211ur LIZLLL(java.util.Collection r6, X.InterfaceC24520xk r7) {
        /*
            r0 = -1977113276(0xffffffff8a27a544, float:-8.0718405E-33)
            r7.LJJIIJ(r0)
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r7.LJJIIJ(r0)
            boolean r0 = r7.LJIJJ(r6)
            java.lang.Object r5 = r7.LJIILL()
            if (r0 != 0) goto L1f
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r5 != r0) goto L52
        L1f:
            X.1ur r5 = new X.1ur
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r3.next()
            r0 = r2
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.lifecycle.LifecycleRegistry r0 = r0.LJLJLJ
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r1.isAtLeast(r0)
            if (r0 == 0) goto L2d
            r4.add(r2)
            goto L2d
        L4c:
            r5.addAll(r4)
            r7.LJJIII(r5)
        L52:
            r7.LJJIJIIJIL()
            X.1ur r5 = (X.C48211ur) r5
            r7.LJJIJIIJIL()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92094a5C.LIZLLL(java.util.Collection, X.0xk):X.1ur");
    }

    public static final void LIZJ(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(193901581);
        for (NavBackStackEntry navBackStackEntry : collection) {
            C24610xt.LIZIZ(navBackStackEntry.LJLJLJ, new IDqS174S0200000_31(navBackStackEntry, (NavBackStackEntry) list, (List<NavBackStackEntry>) 29), LJIL);
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS3S0201000_31((List) list, (List<NavBackStackEntry>) collection, (Collection<NavBackStackEntry>) i, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x03d6, code lost:
    
        if (X.C91718Zz8.LIZIZ(r1, r25.LIZ) == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x058a, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x05c2, code lost:
    
        if (r9 == X.C24500xi.LIZIZ) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x05fc, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L258;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C92145a61 r25, X.C92143a5z r26, X.InterfaceC07790Sh r27, X.InterfaceC07760Se r28, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06580Nq> r29, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06620Nu> r30, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06580Nq> r31, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06620Nu> r32, X.InterfaceC24520xk r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92094a5C.LIZ(X.a61, X.a5z, X.0Sh, X.0Se, X.Yns, X.Yns, X.Yns, X.Yns, X.0xk, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C92145a61 r22, java.lang.String r23, X.InterfaceC07790Sh r24, X.InterfaceC07760Se r25, java.lang.String r26, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06580Nq> r27, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06620Nu> r28, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06580Nq> r29, X.InterfaceC88472Yns<? super X.C1IC<androidx.navigation.NavBackStackEntry>, ? extends X.AbstractC06620Nu> r30, X.InterfaceC88472Yns<? super X.C91722ZzC, X.C76800UCe> r31, X.InterfaceC24520xk r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92094a5C.LIZIZ(X.a61, java.lang.String, X.0Sh, X.0Se, java.lang.String, X.Yns, X.Yns, X.Yns, X.Yns, X.Yns, X.0xk, int, int):void");
    }
}
