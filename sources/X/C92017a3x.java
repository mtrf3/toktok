package X;

/* renamed from: X.a3x, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92017a3x {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r5 == X.C24500xi.LIZIZ) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C92270a82 r12, X.InterfaceC24520xk r13, int r14) {
        /*
            java.lang.String r0 = "dialogNavigator"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r0 = 875187441(0x342a4cf1, float:1.5860475E-7)
            X.1b3 r9 = r13.LJIL(r0)
            r0 = r14 & 14
            if (r0 != 0) goto L8b
            boolean r0 = r9.LJIJJ(r12)
            if (r0 == 0) goto L89
            r0 = 4
        L17:
            r0 = r0 | r14
        L18:
            r0 = r0 & 11
            r0 = r0 ^ 2
            if (r0 != 0) goto L24
            boolean r0 = r9.LIZ()
            if (r0 != 0) goto Lda
        L24:
            X.1HU r4 = X.C1DF.LJJIJ(r9)
            X.Zys r0 = r12.LIZIZ()
            X.3Bm r0 = r0.LJ
            X.1ar r7 = X.C78966Uyw.LJIILIIL(r0, r9)
            java.lang.Object r1 = r7.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "transitionsInProgress"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r0 = -151235577(0xfffffffff6fc5407, float:-2.5589123E33)
            r9.LJJIIJ(r0)
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r9.LJJIIJ(r0)
            boolean r0 = r9.LJIJJ(r1)
            java.lang.Object r5 = r9.LJJJZ()
            if (r0 != 0) goto L5c
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r5 != r0) goto L93
        L5c:
            X.1ur r5 = new X.1ur
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r1.iterator()
        L6a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r2 = r3.next()
            r0 = r2
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            androidx.lifecycle.LifecycleRegistry r0 = r0.LJLJLJ
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r1.isAtLeast(r0)
            if (r0 == 0) goto L6a
            r6.add(r2)
            goto L6a
        L89:
            r0 = 2
            goto L17
        L8b:
            r0 = r14
            goto L18
        L8d:
            r5.addAll(r6)
            r9.LJLJLLL(r5)
        L93:
            r0 = 0
            r9.LJJJJJ(r0)
            X.1ur r5 = (X.C48211ur) r5
            r9.LJJJJJ(r0)
            java.lang.Object r1 = r7.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 64
            X.C92020a40.LIZ(r5, r1, r9, r0)
            java.util.ListIterator r5 = r5.listIterator()
        Lab:
            r1 = r5
            X.1IF r1 = (X.C1IF) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ldd
            java.lang.Object r3 = r1.next()
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            X.ZzA r2 = r3.LJLILLLLZI
            X.a81 r2 = (X.C92269a81) r2
            kotlin.jvm.internal.IDqS178S0200000_31 r6 = new kotlin.jvm.internal.IDqS178S0200000_31
            r0 = 32
            r6.<init>(r12, r3, r0)
            X.0zu r7 = r2.LJLJLLL
            X.aIk r1 = new X.aIk
            r1.<init>(r3, r4, r2, r12)
            r0 = -819896195(0xffffffffcf21607d, float:-2.7074552E9)
            X.1iJ r8 = X.C1DJ.LJ(r9, r0, r1)
            r10 = 384(0x180, float:5.38E-43)
            r11 = 0
            X.C25820zq.LIZ(r6, r7, r8, r9, r10, r11)
            goto Lab
        Lda:
            r9.LIZLLL()
        Ldd:
            X.1b9 r2 = r9.LJJJJLI()
            if (r2 != 0) goto Le4
        Le3:
            return
        Le4:
            kotlin.jvm.internal.IDqS12S0101000_31 r1 = new kotlin.jvm.internal.IDqS12S0101000_31
            r0 = 4
            r1.<init>(r12, r14, r0)
            r2.LIZLLL = r1
            goto Le3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92017a3x.LIZ(X.a82, X.0xk, int):void");
    }
}
