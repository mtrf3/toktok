package X;

/* loaded from: classes7.dex */
public final class F1A implements F1G {
    public C59866NeY LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r0 != 0) goto L27;
     */
    @Override // X.F1G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.F1F r6, X.F1E r7) {
        /*
            r5 = this;
            X.EA4 r2 = new X.EA4
            java.lang.String r4 = r6.LIZIZ
            java.lang.String r3 = ""
            if (r4 != 0) goto L9
            r4 = r3
        L9:
            java.lang.String r1 = r6.LIZ
            if (r1 != 0) goto Le
            r1 = r3
        Le:
            org.json.JSONObject r0 = r6.LIZJ
            if (r0 != 0) goto L9a
        L12:
            r2.<init>(r4, r1, r3)
            java.lang.Exception r0 = r7.LIZIZ
            if (r0 == 0) goto L36
            X.ENC r3 = new X.ENC
            java.lang.String r1 = "network_error"
            java.lang.Exception r0 = r7.LIZIZ
            r3.<init>(r1, r0)
        L22:
            X.NeY r1 = r5.LIZ
            if (r1 == 0) goto L35
            boolean r0 = r1.LIZJ
            if (r0 == 0) goto L35
            java.lang.Class<X.Na1> r0 = X.InterfaceC59585Na1.class
            X.F1B r0 = r1.LJJIJIIJI(r0)
            if (r0 == 0) goto L35
            r0.LJJIIJ(r2, r3)
        L35:
            return
        L36:
            org.json.JSONObject r0 = r7.LIZ
            if (r0 == 0) goto L98
            java.lang.String r1 = "message"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L63
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r0 = "success"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
        L50:
            X.ENC r3 = new X.ENC
            java.lang.Exception r1 = new java.lang.Exception
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.String r0 = "api_error"
            r3.<init>(r0, r1)
            goto L22
        L63:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "code"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L76
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
        L73:
            if (r0 == 0) goto L98
            goto L50
        L76:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "status_code"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L87
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
            goto L73
        L87:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "statusCode"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L98
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
            goto L73
        L98:
            r3 = 0
            goto L22
        L9a:
            java.lang.String r3 = r0.toString()
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F1A.LIZ(X.F1F, X.F1E):void");
    }
}
