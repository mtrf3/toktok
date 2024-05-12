package X;

import android.view.View;

/* loaded from: classes14.dex */
public final class U1P<V extends View, T> implements InterfaceC76501U0r {
    public static final U1P<V, T> LIZ = new U1P<>();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r4.LJLIL == true) goto L8;
     */
    @Override // X.InterfaceC76501U0r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r6, java.lang.Object r7) {
        /*
            r5 = this;
            X.U1X r6 = (X.U1X) r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r1 = r7.booleanValue()
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.LJLJJL = r0
            if (r1 == 0) goto L48
            X.U1Y r4 = r6.LJLJLLL
        L17:
            if (r4 == 0) goto L46
            boolean r1 = r4.LJLIL
            r0 = 1
            if (r1 != r0) goto L46
        L1e:
            r2 = 4000(0xfa0, double:1.9763E-320)
            if (r0 == 0) goto L34
            Y.ARunnableS49S0100000_13 r0 = r6.LLII
            r6.removeCallbacks(r0)
            Y.ARunnableS49S0100000_13 r1 = new Y.ARunnableS49S0100000_13
            r0 = 114(0x72, float:1.6E-43)
            r1.<init>(r6, r0)
            r6.LLII = r1
            r6.postDelayed(r1, r2)
        L33:
            return
        L34:
            Y.ARunnableS32S0200000_13 r0 = r6.LLIFFJFJJ
            r6.removeCallbacks(r0)
            Y.ARunnableS32S0200000_13 r1 = new Y.ARunnableS32S0200000_13
            r0 = 57
            r1.<init>(r4, r6, r0)
            r6.LLIFFJFJJ = r1
            r6.postDelayed(r1, r2)
            goto L33
        L46:
            r0 = 0
            goto L1e
        L48:
            X.U1Y r4 = r6.LJLLL
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U1P.LIZ(android.view.View, java.lang.Object):void");
    }
}
