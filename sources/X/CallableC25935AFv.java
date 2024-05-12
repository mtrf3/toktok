package X;

import java.util.concurrent.Callable;

/* renamed from: X.AFv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC25935AFv<V> implements Callable {
    public static final CallableC25935AFv<V> LJLIL = new CallableC25935AFv<>();

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r9 == null) goto L14;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r11 = this;
            long r0 = X.EF7.LJFF()
            int r7 = (int) r0
            java.lang.String r6 = X.EF7.LJIILIIL
            java.lang.String r5 = X.EF7.LIZLLL()
            X.LSn r9 = X.C235779Nd.LIZ
            X.Ecj<java.lang.Integer> r0 = r9.LIZ
            r10 = 0
            if (r0 != 0) goto L1f
            X.Ecj r2 = new X.Ecj
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.String r0 = "last_app_version_code"
            r2.<init>(r0, r1)
            r9.LIZ = r2
        L1f:
            X.Ecj<java.lang.Integer> r4 = r9.LIZ
            X.Ecj<java.lang.String> r0 = r9.LIZIZ
            java.lang.String r2 = ""
            if (r0 != 0) goto L30
            X.Ecj r1 = new X.Ecj
            java.lang.String r0 = "last_app_version_name"
            r1.<init>(r0, r2)
            r9.LIZIZ = r1
        L30:
            X.Ecj<java.lang.String> r3 = r9.LIZIZ
            X.Ecj<java.lang.String> r0 = r9.LIZJ
            java.lang.String r8 = "last_channel_name"
            if (r0 != 0) goto L3f
            X.Ecj r0 = new X.Ecj
            r0.<init>(r8, r2)
            r9.LIZJ = r0
        L3f:
            X.Ecj<java.lang.String> r2 = r9.LIZJ
            java.lang.Object r9 = r4.LIZ()
            java.lang.Integer r9 = (java.lang.Integer) r9
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            X.Ecj r0 = r0.getIsNewInstall()
            java.lang.Object r0 = r0.LIZ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L6a
        L57:
            if (r9 != 0) goto L99
        L59:
            java.lang.String r0 = "lastVersion"
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r0)
            int r0 = r9.intValue()
            if (r7 <= r0) goto Le4
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            goto Lad
        L6a:
            int r1 = r0.intValue()
            r0 = -1
            if (r1 != r0) goto L57
            if (r9 != 0) goto L83
        L73:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            X.Ecj r1 = r0.getIsNewInstall()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1.LIZLLL(r0)
            goto L57
        L83:
            int r0 = r9.intValue()
            if (r0 != 0) goto L73
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            X.Ecj r1 = r0.getIsNewInstall()
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LIZLLL(r0)
        L99:
            int r0 = r9.intValue()
            if (r0 != 0) goto L59
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.LIZLLL(r0)
            r3.LIZLLL(r5)
            r2.LIZLLL(r6)
            goto Le4
        Lad:
            java.lang.String r1 = "last_app_version"
            java.lang.Object r0 = r3.LIZ()     // Catch: org.json.JSONException -> Lbe
            r9.put(r1, r0)     // Catch: org.json.JSONException -> Lbe
            java.lang.Object r0 = r2.LIZ()     // Catch: org.json.JSONException -> Lbe
            r9.put(r8, r0)     // Catch: org.json.JSONException -> Lbe
            goto Lc2
        Lbe:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lc2:
            com.ss.android.ugc.aweme.common.MobClick r1 = new com.ss.android.ugc.aweme.common.MobClick
            r1.<init>()
            java.lang.String r0 = "update_from"
            r1.setEventName(r0)
            java.lang.String r0 = "lite_update"
            r1.setLabelName(r0)
            r1.setJsonObject(r9)
            X.FMX.onEvent(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.LIZLLL(r0)
            r3.LIZLLL(r5)
            r2.LIZLLL(r6)
        Le4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC25935AFv.call():java.lang.Object");
    }
}
