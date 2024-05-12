package X;

/* renamed from: X.Dtv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35339Dtv {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(DJS.LJLIL);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZ() {
        /*
            X.Ol8 r9 = X.C35339Dtv.LIZ
            java.lang.Object r3 = r9.getValue()
            com.bytedance.keva.Keva r3 = (com.bytedance.keva.Keva) r3
            java.lang.String r0 = "search_intermediate_recom_reponse_time"
            r1 = -1
            long r7 = r3.getLong(r0, r1)
            r5 = 1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            r6 = 31744(0x7c00, float:4.4483E-41)
            r2 = 24
            java.lang.String r1 = "search_middle_recommend_expired_time"
            int r0 = X.C00F.LIZ(r6, r2, r1, r5)
            if (r0 != r2) goto L2a
        L21:
            r0 = 1
        L22:
            if (r0 == 0) goto L28
        L24:
            r3 = 0
            if (r5 == 0) goto L48
            return r3
        L28:
            r5 = 0
            goto L24
        L2a:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r7
            X.FFL r0 = X.FFL.LJIIIZ()
            r0.getClass()
            int r0 = X.FFL.LJIIJ(r6, r2, r1, r5)
            int r0 = r0 * 60
            int r0 = r0 * 60
            int r0 = r0 * 1000
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L46
            goto L21
        L46:
            r0 = 0
            goto L22
        L48:
            java.lang.Object r2 = r9.getValue()
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            java.lang.String r1 = "search_intermediate_recom_reponse"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L6c
            com.google.gson.Gson r1 = com.ss.android.ugc.aweme.search.utils.MapDeserializerDoubleAsIntFix.LIZ     // Catch: java.lang.Exception -> L6c
            java.lang.reflect.Type r0 = com.ss.android.ugc.aweme.search.utils.MapDeserializerDoubleAsIntFix.LIZIZ     // Catch: java.lang.Exception -> L6c
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r2, r0)     // Catch: java.lang.Exception -> L6c
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Exception -> L6c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            r0.<init>(r1)     // Catch: java.lang.Exception -> L6c
            return r0
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35339Dtv.LIZ():org.json.JSONObject");
    }
}
