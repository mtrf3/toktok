package X;

import com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod;

/* loaded from: classes7.dex */
public final class F1D implements F1G {
    public final /* synthetic */ RequestMethod LIZ;

    public F1D(RequestMethod requestMethod) {
        this.LIZ = requestMethod;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r0 != 0) goto L21;
     */
    @Override // X.F1G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.F1F r6, X.F1E r7) {
        /*
            r5 = this;
            X.EA4 r4 = new X.EA4
            java.lang.String r3 = r6.LIZIZ
            java.lang.String r2 = ""
            if (r3 != 0) goto L9
            r3 = r2
        L9:
            java.lang.String r1 = r6.LIZ
            if (r1 != 0) goto Le
            r1 = r2
        Le:
            org.json.JSONObject r0 = r6.LIZJ
            if (r0 != 0) goto L8f
        L12:
            r4.<init>(r3, r1, r2)
            java.lang.Exception r0 = r7.LIZIZ
            if (r0 == 0) goto L2d
            X.ENC r2 = new X.ENC
            java.lang.Exception r1 = r7.LIZIZ
            java.lang.String r0 = "response.e"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "network_error"
            r2.<init>(r0, r1)
        L27:
            com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod r0 = r5.LIZ
            r0.getClass()
            return
        L2d:
            org.json.JSONObject r0 = r7.LIZ
            if (r0 == 0) goto L27
            java.lang.String r1 = "message"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L5a
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r0 = "success"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L5a
        L47:
            X.ENC r2 = new X.ENC
            java.lang.Exception r1 = new java.lang.Exception
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.String r0 = "api_error"
            r2.<init>(r0, r1)
            goto L27
        L5a:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "code"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L6d
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
        L6a:
            if (r0 == 0) goto L27
            goto L47
        L6d:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "status_code"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L7e
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
            goto L6a
        L7e:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "statusCode"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
            goto L6a
        L8f:
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "request.body.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F1D.LIZ(X.F1F, X.F1E):void");
    }
}
