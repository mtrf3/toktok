package X;

/* renamed from: X.F1e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38294F1e {
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.F1L LIZ(X.C38048EwW r7, org.json.JSONObject r8, X.C38049EwX r9, X.F1M r10, X.F1G r11) {
        /*
            if (r7 == 0) goto Lc4
            org.json.JSONObject r0 = r7.LIZLLL
        L4:
            java.lang.String r6 = ""
            if (r0 != 0) goto L2b
        L8:
            java.lang.String r0 = r7.LIZIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "v2"
            if (r0 == 0) goto L22
            r6 = r2
        L13:
            r6.getClass()
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto Lc7
            X.F1h r6 = new X.F1h
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L22:
            org.json.JSONObject r1 = r7.LIZLLL     // Catch: java.lang.Exception -> L13
            java.lang.String r0 = "proto"
            java.lang.String r6 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Exception -> L13
            goto L13
        L2b:
            org.json.JSONObject r1 = r7.LIZLLL
            java.lang.String r0 = "url"
            java.lang.String r5 = r1.optString(r0, r6)
            if (r5 == 0) goto L8
            int r0 = r5.length()
            if (r0 != 0) goto L3c
            goto L8
        L3c:
            org.json.JSONObject r0 = r7.LIZLLL
            java.lang.String r1 = "method"
            java.lang.String r3 = "get"
            java.lang.String r2 = r0.optString(r1, r3)
            if (r2 == 0) goto L8
            int r0 = r2.length()
            if (r0 != 0) goto L4f
            goto L8
        L4f:
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = "getDefault()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = android.text.TextUtils.equals(r1, r3)
            if (r0 != 0) goto L6b
            goto L8
        L6b:
            org.json.JSONObject r1 = r7.LIZLLL
            java.lang.String r0 = "params"
            org.json.JSONObject r4 = r1.optJSONObject(r0)
            android.net.Uri r3 = com.bytedance.mt.protector.impl.UriProtector.parse(r5)     // Catch: java.lang.Exception -> Laa
            java.util.Set r1 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameterNames(r3)     // Catch: java.lang.Exception -> Laa
            if (r1 == 0) goto Lae
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto L84
            goto Lae
        L84:
            if (r4 != 0) goto L8c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Laa
            r0.<init>()     // Catch: java.lang.Exception -> Laa
            r4 = r0
        L8c:
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Laa
        L90:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto Lb0
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Laa
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Laa
            if (r1 != 0) goto L9f
            goto L90
        L9f:
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r3, r1)     // Catch: java.lang.Exception -> Laa
            if (r0 != 0) goto La6
            goto L90
        La6:
            r4.put(r1, r0)     // Catch: java.lang.Exception -> Laa
            goto L90
        Laa:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lae:
            if (r4 == 0) goto L8
        Lb0:
            int r0 = r4.length()
            if (r0 > 0) goto Lb8
            goto L8
        Lb8:
            X.FvD r0 = X.C40515FvD.LIZJ()
            r0.getClass()
            X.C40515FvD.LJI(r5, r4)
            goto L8
        Lc4:
            r0 = 0
            goto L4
        Lc7:
            X.F1i r6 = new X.F1i
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38294F1e.LIZ(X.EwW, org.json.JSONObject, X.EwX, X.F1M, X.F1G):X.F1L");
    }
}
