package X;

/* renamed from: X.Jde, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49618Jde {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0020, code lost:
    
        if (r2 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.view.View r3, java.lang.Runnable r4) {
        /*
            r2 = 0
            if (r3 != 0) goto L13
        L3:
            boolean r0 = X.C16330kX.LIZIZ(r3)
            if (r0 != 0) goto L28
            Y.IDCListenerS115S0200000_8 r1 = new Y.IDCListenerS115S0200000_8
            r0 = 0
            r1.<init>(r3, r4, r0)
            r3.addOnAttachStateChangeListener(r1)
        L12:
            return
        L13:
            android.view.ViewParent r1 = r3.getParent()
        L17:
            if (r1 == 0) goto L3
            boolean r0 = r1 instanceof X.C49710Jf8
            if (r0 == 0) goto L23
            r2 = r1
            X.Jf8 r2 = (X.C49710Jf8) r2
            if (r2 != 0) goto L28
            goto L3
        L23:
            android.view.ViewParent r1 = r1.getParent()
            goto L17
        L28:
            LIZIZ(r2, r4)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49618Jde.LIZ(android.view.View, java.lang.Runnable):void");
    }

    public static void LIZIZ(C49710Jf8 c49710Jf8, Runnable runnable) {
        if (c49710Jf8 != null && c49710Jf8.getVisibility() != 0) {
            C49619Jdf c49619Jdf = new C49619Jdf(runnable, c49710Jf8);
            if (c49710Jf8.LLLII && !c49710Jf8.LLLI) {
                return;
            }
            c49710Jf8.LLLIIL.LIZIZ().add(c49619Jdf);
            return;
        }
        runnable.run();
    }
}
