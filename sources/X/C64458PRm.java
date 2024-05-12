package X;

import android.view.FrameMetrics;

/* renamed from: X.PRm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64458PRm extends AbstractC64456PRk implements InterfaceC64455PRj {
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C48866JFu.LJLIL);

    @Override // X.InterfaceC64455PRj
    public final void LIZ(FrameMetrics frameMetrics) {
    }

    @Override // X.InterfaceC64455PRj
    public final void LIZJ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    @Override // X.InterfaceC64455PRj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(long r14, long r16, boolean r18) {
        /*
            r13 = this;
            r9 = r16
            r8 = r13
            boolean r0 = r8.LIZ
            if (r0 != 0) goto L8
            return
        L8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto Lf
            return
        Lf:
            java.util.concurrent.LinkedBlockingDeque<X.PRs> r0 = r8.LIZIZ
            java.lang.Object r12 = r0.peekFirst()
            X.PRs r12 = (X.C64464PRs) r12
            if (r12 != 0) goto L1a
            return
        L1a:
            r7 = r18
            if (r7 == 0) goto L56
            X.Ol8 r0 = r8.LIZLLL
            java.lang.Object r2 = r0.getValue()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r1 = 0
            if (r2 == 0) goto L2f
            X.1bm r0 = X.C36381bm.LJIL
            java.lang.Object r1 = r2.get(r0)
        L2f:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L56
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L56
            long r5 = r1.longValue()
        L3b:
            long r3 = r9 - r14
            r1 = 5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L53
            X.PRu r1 = new X.PRu
            r1.<init>()
            r1.LIZ = r14
            r1.LIZIZ = r9
            r1.LIZJ = r7
            java.util.concurrent.CopyOnWriteArrayList<X.PRu> r0 = r12.LIZIZ
            r0.add(r1)
        L53:
            if (r7 != 0) goto L59
            return
        L56:
            r5 = 0
            goto L3b
        L59:
            long r9 = r9 - r5
            float r0 = X.PH9.LIZ
            float r1 = (float) r9
            float r1 = r1 / r0
            r0 = 1077936128(0x40400000, float:3.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L65
            return
        L65:
            r0 = 1
            long r5 = r5 - r0
            java.util.concurrent.CopyOnWriteArrayList<X.PRu> r0 = r12.LIZIZ
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r4 = r0.iterator()
        L73:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.PRu r0 = (X.C64466PRu) r0
            long r1 = r0.LIZIZ
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L73
            r11.add(r3)
            goto L73
        L8a:
            java.util.concurrent.CopyOnWriteArrayList<X.PRu> r0 = r12.LIZIZ
            r0.clear()
            X.PRr r7 = new X.PRr
            r7.<init>(r8, r9, r11, r12)
            java.util.concurrent.ExecutorService r0 = X.VB5.LIZ
            r0.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64458PRm.LIZIZ(long, long, boolean):void");
    }
}
