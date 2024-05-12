package X;

/* renamed from: X.5Yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136885Yu {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(androidx.recyclerview.widget.RecyclerView r5, android.widget.EditText r6) {
        /*
            X.2YJ r0 = X.C2YJ.LIZIZ     // Catch: java.lang.Exception -> L1f
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.LIZ     // Catch: java.lang.Exception -> L1f
            com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings r2 = r0.getEmailLoginSettings()     // Catch: java.lang.Exception -> L1f
            java.util.List r1 = r2.getDomainRecommendation()     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = "setting.domainRecommendation"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L1f
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L1f
            r0 = r0 ^ 1
            if (r0 == 0) goto L37
            java.util.List r0 = r2.getDomainRecommendation()     // Catch: java.lang.Exception -> L1f
            goto L39
        L1f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getDomainRecommendation error: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C78983UzD.LJIILL(r0)
        L37:
            java.util.List<java.lang.String> r0 = X.Q3J.LIZ
        L39:
            if (r0 == 0) goto L75
            java.util.List r1 = X.ORZ.LJLL(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r4.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r3 = r1.iterator()
        L50:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            r1 = 0
            java.lang.String r0 = "@"
            boolean r0 = ujb.s.LJJJLZIJ(r2, r0, r1)
            if (r0 == 0) goto L69
        L65:
            r4.add(r2)
            goto L50
        L69:
            r0 = 64
            java.lang.String r2 = X.QZZ.LIZIZ(r0, r2)
            goto L65
        L70:
            java.util.List r2 = X.ORZ.LLJILJILJ(r4)
            goto L76
        L75:
            r2 = 0
        L76:
            kotlin.jvm.internal.AqS168S0100000_2 r1 = new kotlin.jvm.internal.AqS168S0100000_2
            r0 = 613(0x265, float:8.59E-43)
            r1.<init>(r6, r0)
            X.5YR r0 = new X.5YR
            r0.<init>(r5, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136885Yu.LIZ(androidx.recyclerview.widget.RecyclerView, android.widget.EditText):void");
    }
}
