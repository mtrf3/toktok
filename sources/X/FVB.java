package X;

import android.view.View;

/* loaded from: classes7.dex */
public final class FVB extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final FVB LJLIL = new FVB();

    public FVB() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r0.intValue() != 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View invoke(X.FVC r12) {
        /*
            r11 = this;
            X.FVC r12 = (X.FVC) r12
            java.lang.String r0 = "inflateParams"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            android.view.LayoutInflater r5 = r12.LIZJ
            android.view.ViewGroup r4 = r12.LIZ
            android.content.Context r1 = r12.LIZIZ
            java.lang.String r8 = r12.LIZLLL
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "eventType"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            long r9 = java.lang.System.currentTimeMillis()
            X.Kso r0 = X.C53106Kso.LIZ
            r0.getClass()
            int r0 = X.C53106Kso.LIZ()
            r7 = 1
            r3 = 0
            if (r0 <= 0) goto Ld1
            r0 = 1
        L35:
            r6 = 0
            if (r0 == 0) goto Lcf
            boolean r0 = X.C53106Kso.LIZIZ()
            if (r0 != 0) goto L44
            int r0 = X.C53106Kso.LIZ()
            if (r0 != r7) goto L9d
        L44:
            int r0 = X.C38958FQs.LIZ()
            android.view.View r6 = X.C38619FDr.LIZIZ(r0, r1, r4, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = X.C38958FQs.LIZ
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L96
        L56:
            r7 = 0
        L57:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r1 = X.C38958FQs.LIZ
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r8, r0)
            if (r6 != 0) goto L6b
        L63:
            int r0 = X.C38958FQs.LIZ()
            android.view.View r6 = X.C16880lQ.LLLLIILL(r5, r0, r4, r3)
        L6b:
            X.7au r8 = new X.7au
            r8.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            java.lang.String r2 = "duration"
            r8.LJ(r0, r2)
            java.lang.String r0 = "has_cache"
            r8.LIZLLL(r7, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.LIZ
            java.lang.String r0 = "livesdk_live_card_inflatle_time"
            X.FMX.LJIIL(r0, r1)
            if (r6 != 0) goto L95
            int r0 = X.C38958FQs.LIZ()
            android.view.View r6 = X.C16880lQ.LLLLIILL(r5, r0, r4, r3)
            java.lang.String r0 = "inflater.inflate(getLive…dViewId(), parent, false)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
        L95:
            return r6
        L96:
            int r0 = r0.intValue()
            if (r0 != r7) goto L56
            goto L57
        L9d:
            android.app.Activity r2 = X.C45804HyK.LJIJJ(r1)
            if (r2 == 0) goto L56
            android.app.Activity r1 = X.C45804HyK.LJIJJ(r2)
            int r0 = X.C38958FQs.LIZ()
            boolean r0 = X.C16970lZ.LIZ(r0, r1)
            if (r0 == 0) goto Lcd
            android.app.Activity r1 = X.C45804HyK.LJIJJ(r2)
            int r0 = X.C38958FQs.LIZ()
            android.view.View r6 = X.C16970lZ.LIZJ(r0, r1, r4, r3)
        Lbd:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getFeedLiveItem cached view = "
            r1.append(r0)
            r1.append(r6)
            X.X1D.LIZIZ(r1)
            goto L57
        Lcd:
            r7 = 0
            goto Lbd
        Lcf:
            r7 = 0
            goto L63
        Ld1:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FVB.invoke(java.lang.Object):java.lang.Object");
    }
}
