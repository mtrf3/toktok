package X;

import kotlin.jvm.internal.o;
import kotlinx.coroutines.CompletedExceptionally;

/* renamed from: X.0xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24610xt {
    public static final C24590xr LIZ = new Object() { // from class: X.0xr
    };

    public static final void LJI(InterfaceC65784Pro effect, InterfaceC24520xk interfaceC24520xk) {
        o.LJIIIZ(effect, "effect");
        interfaceC24520xk.LJJIIJ(-1288466761);
        interfaceC24520xk.LJIIJJI(effect);
        interfaceC24520xk.LJJIJIIJIL();
    }

    public static final C64962gm LJII(MBB coroutineContext, InterfaceC24520xk composer) {
        o.LJIIIZ(coroutineContext, "coroutineContext");
        o.LJIIIZ(composer, "composer");
        C3T3 c3t3 = InterfaceC79150V4o.LJJJJJ;
        if (coroutineContext.get(c3t3) != null) {
            C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
            LJIILIIL.LJJLI(new CompletedExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false, 2, null));
            return C48841JEv.LIZ(LJIILIIL);
        }
        MBA LJJIFFI = composer.LJJIFFI();
        return C48841JEv.LIZ(LJJIFFI.plus(new C84673XKz((InterfaceC79150V4o) LJJIFFI.get(c3t3))).plus(coroutineContext));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.lang.Object r1, X.InterfaceC88472Yns r2, X.InterfaceC24520xk r3) {
        /*
            java.lang.String r0 = "effect"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            r0 = -1371986847(0xffffffffae392461, float:-4.209644E-11)
            r3.LJJIIJ(r0)
            java.lang.String r0 = "effect:dispose"
            android.os.Trace.beginSection(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r3.LJJIIJ(r0)     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r3.LJIJJ(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r3.LJIILL()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L29
            X.0xi r0 = X.InterfaceC24520xk.LIZ     // Catch: java.lang.Throwable -> L3d
            r0.getClass()     // Catch: java.lang.Throwable -> L3d
            X.0xh r0 = X.C24500xi.LIZIZ     // Catch: java.lang.Throwable -> L3d
            if (r1 != r0) goto L31
        L29:
            X.1b4 r1 = new X.1b4     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            r3.LJJIII(r1)     // Catch: java.lang.Throwable -> L3d
        L31:
            r3.LJJIJIIJIL()     // Catch: java.lang.Throwable -> L3d
            X.1b4 r1 = (X.C35941b4) r1     // Catch: java.lang.Throwable -> L3d
            android.os.Trace.endSection()
            r3.LJJIJIIJIL()
            return
        L3d:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24610xt.LIZIZ(java.lang.Object, X.Yns, X.0xk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(java.lang.Object r3, X.InterfaceC88471Ynr r4, X.InterfaceC24520xk r5) {
        /*
            java.lang.String r0 = "block"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r0 = 1179185413(0x4648f105, float:12860.255)
            r5.LJJIIJ(r0)
            X.MBA r2 = r5.LJJIFFI()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r5.LJJIIJ(r0)
            boolean r0 = r5.LJIJJ(r3)
            java.lang.Object r1 = r5.LJIILL()
            if (r0 != 0) goto L28
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L30
        L28:
            X.1bD r0 = new X.1bD
            r0.<init>(r2, r4)
            r5.LJJIII(r0)
        L30:
            r5.LJJIJIIJIL()
            r5.LJJIJIIJIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24610xt.LJ(java.lang.Object, X.Ynr, X.0xk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.Object[] r6, X.InterfaceC88471Ynr r7, X.InterfaceC24520xk r8) {
        /*
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r0 = -139560008(0xfffffffff7ae7bb8, float:-7.0778826E33)
            r8.LJJIIJ(r0)
            X.MBA r5 = r8.LJJIFFI()
            int r0 = r6.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r6, r0)
            r0 = -568225417(0xffffffffde219177, float:-2.9105543E18)
            r8.LJJIIJ(r0)
            int r3 = r4.length
            r1 = 0
            r2 = 0
        L1d:
            if (r1 >= r3) goto L29
            r0 = r4[r1]
            boolean r0 = r8.LJIJJ(r0)
            r2 = r2 | r0
            int r1 = r1 + 1
            goto L1d
        L29:
            java.lang.Object r1 = r8.LJIILL()
            if (r2 != 0) goto L38
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L40
        L38:
            X.1bD r0 = new X.1bD
            r0.<init>(r5, r7)
            r8.LJJIII(r0)
        L40:
            r8.LJJIJIIJIL()
            r8.LJJIJIIJIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24610xt.LJFF(java.lang.Object[], X.Ynr, X.0xk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.lang.Object r2, java.lang.Object r3, X.InterfaceC88472Yns r4, X.InterfaceC24520xk r5) {
        /*
            r0 = 1429097729(0x552e4d01, float:1.197786E13)
            r5.LJJIIJ(r0)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.LJJIIJ(r0)
            boolean r2 = r5.LJIJJ(r2)
            boolean r0 = r5.LJIJJ(r3)
            r2 = r2 | r0
            java.lang.Object r1 = r5.LJIILL()
            if (r2 != 0) goto L24
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L2c
        L24:
            X.1b4 r0 = new X.1b4
            r0.<init>(r4)
            r5.LJJIII(r0)
        L2c:
            r5.LJJIJIIJIL()
            r5.LJJIJIIJIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24610xt.LIZ(java.lang.Object, java.lang.Object, X.Yns, X.0xk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(java.lang.Object r4, java.lang.Object r5, X.InterfaceC88471Ynr r6, X.InterfaceC24520xk r7) {
        /*
            java.lang.String r0 = "block"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r0 = 590241125(0x232e5d65, float:9.452336E-18)
            r7.LJJIIJ(r0)
            X.MBA r3 = r7.LJJIFFI()
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.LJJIIJ(r0)
            boolean r2 = r7.LJIJJ(r4)
            boolean r0 = r7.LJIJJ(r5)
            r2 = r2 | r0
            java.lang.Object r1 = r7.LJIILL()
            if (r2 != 0) goto L2d
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L35
        L2d:
            X.1bD r0 = new X.1bD
            r0.<init>(r3, r6)
            r7.LJJIII(r0)
        L35:
            r7.LJJIJIIJIL()
            r7.LJJIJIIJIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24610xt.LIZLLL(java.lang.Object, java.lang.Object, X.Ynr, X.0xk):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, X.InterfaceC88471Ynr r7, X.InterfaceC24520xk r8) {
        /*
            r0 = -54093371(0xfffffffffcc699c5, float:-8.249549E36)
            r8.LJJIIJ(r0)
            X.MBA r3 = r8.LJJIFFI()
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            r8.LJJIIJ(r0)
            boolean r2 = r8.LJIJJ(r4)
            boolean r0 = r8.LJIJJ(r5)
            r2 = r2 | r0
            boolean r0 = r8.LJIJJ(r6)
            r2 = r2 | r0
            java.lang.Object r1 = r8.LJIILL()
            if (r2 != 0) goto L2d
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L35
        L2d:
            X.1bD r0 = new X.1bD
            r0.<init>(r3, r7)
            r8.LJJIII(r0)
        L35:
            r8.LJJIJIIJIL()
            r8.LJJIJIIJIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24610xt.LIZJ(java.lang.Object, java.lang.Object, java.lang.Object, X.Ynr, X.0xk):void");
    }
}
