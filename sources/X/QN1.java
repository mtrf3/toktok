package X;

/* loaded from: classes12.dex */
public class QN1 implements InterfaceC66884QMu {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x001f, code lost:
    
        if (r6 == 200) goto L6;
     */
    @Override // X.InterfaceC66884QMu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r6, long r7, java.lang.String r9) {
        /*
            r5 = this;
            r4 = 1
            r3 = 0
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 != r2) goto L1f
            X.QNE r0 = X.OIP.LIZ     // Catch: java.lang.Exception -> L1f
            X.QN4 r0 = r0.LIZ     // Catch: java.lang.Exception -> L1f
            android.content.Context r1 = r0.LJIIJJI     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = "bd_turning_settings_init"
            android.content.SharedPreferences r0 = X.F9J.LIZIZ(r1, r3, r0)     // Catch: java.lang.Exception -> L1f
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch: java.lang.Exception -> L1f
            java.lang.String r0 = "inited"
            r1.putBoolean(r0, r4)     // Catch: java.lang.Exception -> L1f
            r1.commit()     // Catch: java.lang.Exception -> L1f
            goto L21
        L1f:
            if (r6 != r2) goto L22
        L21:
            r4 = 0
        L22:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r0 = "duration"
            r2.put(r0, r7)     // Catch: org.json.JSONException -> L39
            java.lang.String r0 = "result"
            r2.put(r0, r4)     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = "key"
            java.lang.String r0 = "setting"
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L39
            goto L3e
        L39:
            r0 = move-exception
            X.C61349O5x.LIZIZ(r0)
            goto L43
        L3e:
            java.lang.String r0 = "turing_verify_sdk"
            X.QN2.LIZJ(r0, r2)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QN1.LIZ(int, long, java.lang.String):void");
    }
}
