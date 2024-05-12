package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PJ8 extends PJ9 {
    @Override // X.PJ9
    public final long LIZ() {
        return Long.decode(PJC.LJFF(this.LIZ, "general", "slardar_api_settings", "fetch_setting", "fetch_setting_interval")).longValue() * 1000;
    }

    public PJ8(JSONObject jSONObject, String str) {
        super(jSONObject, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r9 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.lang.String r10, java.util.Map r11) {
        /*
            r9 = 0
            r8 = 1
            if (r10 != 0) goto Le
            X.PJt r0 = X.PK0.LIZIZ()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r10 = r0.LIZ()     // Catch: java.lang.Throwable -> L8a
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r11 != 0) goto L23
            X.C78685UuP.LJJJLL()     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L22
            X.PKu r1 = X.C64214PIc.LIZ()     // Catch: java.lang.Throwable -> L8a
            Y.ARunnableS18S0000000_11 r0 = X.PJ7.LIZLLL     // Catch: java.lang.Throwable -> L8a
            r1.LIZJ(r0, r2)     // Catch: java.lang.Throwable -> L8a
        L22:
            return r8
        L23:
            java.lang.Object r0 = r11.get(r10)     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L38
            X.C78685UuP.LJJJLL()     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L37
            X.PKu r1 = X.C64214PIc.LIZ()     // Catch: java.lang.Throwable -> L8a
            Y.ARunnableS18S0000000_11 r0 = X.PJ7.LIZLLL     // Catch: java.lang.Throwable -> L8a
            r1.LIZJ(r0, r2)     // Catch: java.lang.Throwable -> L8a
        L37:
            return r8
        L38:
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8a
            if (r10 != 0) goto L3f
            return r9
        L3f:
            java.lang.Object r0 = r11.get(r10)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7d
            java.lang.Long r0 = java.lang.Long.decode(r0)     // Catch: java.lang.Throwable -> L7d
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L7d
            java.util.HashMap<java.lang.String, X.PJ9> r0 = X.PJ9.LJFF     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.get(r10)     // Catch: java.lang.Throwable -> L7d
            X.PJ9 r0 = (X.PJ9) r0     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L5b
            long r2 = r0.LIZ()     // Catch: java.lang.Throwable -> L5b
        L5b:
            long r6 = r6 - r4
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L70
            if (r1 == 0) goto L6e
            X.PKu r1 = X.C64214PIc.LIZ()     // Catch: java.lang.Throwable -> L6c
            Y.ARunnableS18S0000000_11 r0 = X.PJ7.LIZLLL     // Catch: java.lang.Throwable -> L6c
            r1.LIZJ(r0, r2)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r9 = 1
            goto L7d
        L6e:
            r9 = 1
            goto L82
        L70:
            if (r1 == 0) goto L86
            long r2 = r2 - r6
            X.PKu r1 = X.C64214PIc.LIZ()     // Catch: java.lang.Throwable -> L7d
            Y.ARunnableS18S0000000_11 r0 = X.PJ7.LIZLLL     // Catch: java.lang.Throwable -> L7d
            r1.LIZJ(r0, r2)     // Catch: java.lang.Throwable -> L7d
            goto L86
        L7d:
            X.C78685UuP.LJJ()     // Catch: java.lang.Throwable -> L8a
            if (r9 == 0) goto L86
        L82:
            X.C78685UuP.LJJJLL()     // Catch: java.lang.Throwable -> L8a
            goto L89
        L86:
            X.C78685UuP.LJJJLL()     // Catch: java.lang.Throwable -> L8a
        L89:
            return r9
        L8a:
            com.bytedance.crash.runtime.ConfigManager r0 = X.PK0.LJIIIIZZ
            r0.isDebugMode()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PJ8.LIZLLL(java.lang.String, java.util.Map):boolean");
    }
}
