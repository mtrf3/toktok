package X;

/* loaded from: classes12.dex */
public final class QDL {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:32:0x0072
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public static org.json.JSONObject LIZ(org.json.JSONObject r9) {
        /*
            java.lang.String r4 = "phoneCode"
            java.lang.String r5 = "countryCode"
            java.lang.String r3 = ""
            r7 = 0
            if (r9 == 0) goto L15
            boolean r0 = r9.isNull(r5)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L10
            goto L15
        L10:
            java.lang.String r8 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r9, r5)     // Catch: java.lang.Exception -> Lac
            goto L16
        L15:
            r8 = r7
        L16:
            if (r9 == 0) goto L24
            boolean r0 = r9.isNull(r4)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L1f
            goto L24
        L1f:
            java.lang.String r9 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r9, r4)     // Catch: java.lang.Exception -> Lac
            goto L25
        L24:
            r9 = r7
        L25:
            java.lang.String r2 = "<get-countries>(...)"
            if (r9 == 0) goto L42
        L2a:
            java.lang.String r0 = "+"
            r6 = 0
            java.lang.String r1 = ujb.o.LJJJJZ(r9, r0, r3, r6)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = " "
            java.lang.String r0 = ujb.o.LJJJJZ(r1, r0, r3, r6)     // Catch: java.lang.Exception -> Lac
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> Lac
            X.QDM r6 = X.QDK.LIZ(r0)     // Catch: java.lang.Exception -> Lac
            if (r6 == 0) goto L42
            goto L6e
        L42:
            if (r8 == 0) goto L6d
            X.Ol8 r0 = X.QDM.LJLJJL     // Catch: java.lang.Exception -> Lac
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Lac
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)     // Catch: java.lang.Exception -> Lac
            X.Pog r0 = (X.AbstractC65590Pog) r0     // Catch: java.lang.Exception -> Lac
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> Lac
        L53:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L6b
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> Lac
            r0 = r6
            X.QDM r0 = (X.QDM) r0     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = r0.LJLJI     // Catch: java.lang.Exception -> Lac
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L53
        L68:
            X.QDM r6 = (X.QDM) r6     // Catch: java.lang.Exception -> Lac
            goto L6e
        L6b:
            r6 = r7
            goto L68
        L6d:
            r6 = r7
        L6e:
            if (r8 != 0) goto Lb1
            if (r9 != 0) goto Lb1
        L73:
            X.Y4y r0 = X.QDN.LIZ()     // Catch: java.lang.Exception -> La9
            java.lang.String r8 = r0.LJLJI     // Catch: java.lang.Exception -> La9
            X.Ol8 r0 = X.QDM.LJLJJL     // Catch: java.lang.Exception -> La9
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La9
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)     // Catch: java.lang.Exception -> La9
            X.Pog r0 = (X.AbstractC65590Pog) r0     // Catch: java.lang.Exception -> La9
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> La9
        L88:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L9e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La9
            r0 = r1
            X.QDM r0 = (X.QDM) r0     // Catch: java.lang.Exception -> La9
            java.lang.String r0 = r0.LJLJI     // Catch: java.lang.Exception -> La9
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r8)     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L88
            r7 = r1
        L9e:
            X.QDM r7 = (X.QDM) r7     // Catch: java.lang.Exception -> La9
            if (r7 != 0) goto Lb0
            X.QDM r7 = new X.QDM     // Catch: java.lang.Exception -> La9
            r0 = -1
            r7.<init>(r0, r3, r8, r3)     // Catch: java.lang.Exception -> La9
            goto Lb0
        La9:
            r0 = move-exception
            r7 = r6
            goto Lad
        Lac:
            r0 = move-exception
        Lad:
            X.C16880lQ.LLLLIIL(r0)
        Lb0:
            r6 = r7
        Lb1:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            if (r6 == 0) goto Lbc
            java.lang.String r0 = r6.LJLJI
            if (r0 != 0) goto Lbd
        Lbc:
            r0 = r3
        Lbd:
            r1.put(r5, r0)
            if (r6 == 0) goto Lc6
            java.lang.String r0 = r6.LJLJJI
            if (r0 != 0) goto Lca
        Lc6:
            r1.put(r4, r3)
            return r1
        Lca:
            r3 = r0
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDL.LIZ(org.json.JSONObject):org.json.JSONObject");
    }
}
