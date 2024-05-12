package com.ss.android.ugc.aweme.net.interceptor;

import X.InterfaceC37216Ej6;

/* loaded from: classes12.dex */
public class TTNetworkContextInterceptor implements InterfaceC37216Ej6 {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    @Override // X.InterfaceC37216Ej6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C64797Pbt intercept(X.FBZ r20) {
        /*
            r19 = this;
            r3 = r20
            r5 = r3
            X.F7S r5 = (X.F7S) r5
            com.bytedance.retrofit2.client.Request r2 = r5.LIZJ
            java.lang.String r4 = r2.getPath()
            X.POw r1 = X.C64390POw.LIZIZ
            boolean r0 = r1.LJII(r4)
            if (r0 != 0) goto L1d
            X.POv r0 = X.C64389POv.LIZIZ
            r0.removeNetworkContext(r4)
            X.Pbt r0 = r5.LIZ(r2)
            return r0
        L1d:
            long r10 = java.lang.System.currentTimeMillis()
            X.POv r0 = X.C64389POv.LIZIZ
            X.POu r9 = r0.removeNetworkContext(r4)
            r4 = 0
            if (r9 == 0) goto L7a
            X.POo r0 = r1.LJ()
            long r5 = r0.LJLIL
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJLILLLLZI
            long r7 = r7 - r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L78
            java.lang.String r14 = r9.LJLIL
        L3d:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L74
            X.PP2 r12 = X.PP2.LIZIZ
            java.lang.String r15 = r2.getUrl()
            r13 = -1
            r16 = -1
            java.lang.String r18 = ""
            r12.LIZJ(r13, r14, r15, r16, r18)
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r0 = r2.getHeaders()
            r6.<init>(r0)
            X.EJ6 r5 = new X.EJ6
            java.lang.String r1 = r12.LIZLLL()
            java.lang.String r0 = r12.LJFF(r14)
            r5.<init>(r1, r0)
            r6.add(r5)
            X.Pdg r0 = r2.newBuilder()
            r0.LIZJ = r6
            com.bytedance.retrofit2.client.Request r2 = r0.LIZ()
        L74:
            java.lang.String r18 = ""
            r13 = -1
            goto L81
        L78:
            r14 = r4
            goto L3d
        L7a:
            X.POs r0 = X.C64386POs.LIZIZ
            java.lang.String r14 = r0.LIZIZ(r4)
            goto L3d
        L81:
            X.F7S r3 = (X.F7S) r3     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lbd
            X.Pbt r3 = r3.LIZ(r2)     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lbd
            X.EeA r1 = r3.LIZ     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lbd
            int r13 = r1.LIZIZ     // Catch: java.lang.Exception -> Lb5 java.lang.Throwable -> Lbd
            java.lang.String r0 = "x-tt-logid"
            X.EJ6 r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3
            if (r0 != 0) goto L97
            java.lang.String r1 = ""
            goto L99
        L97:
            java.lang.String r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> Lb1 java.lang.Exception -> Lb3
        L99:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto Lb0
            X.PP2 r12 = X.PP2.LIZIZ
            java.lang.String r15 = r2.getUrl()
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r10
            r18 = r1
            r12.LIZJ(r13, r14, r15, r16, r18)
        Lb0:
            return r3
        Lb1:
            r1 = move-exception
            goto Lbf
        Lb3:
            r0 = move-exception
            goto Lb6
        Lb5:
            r0 = move-exception
        Lb6:
            int r13 = X.C64920Pds.LIZIZ(r0, r4)     // Catch: java.lang.Throwable -> Lbb
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r1 = move-exception
            goto Lbf
        Lbd:
            r1 = move-exception
            r13 = -1
        Lbf:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto Ld4
            X.PP2 r12 = X.PP2.LIZIZ
            java.lang.String r15 = r2.getUrl()
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r10
            r12.LIZJ(r13, r14, r15, r16, r18)
        Ld4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.interceptor.TTNetworkContextInterceptor.intercept(X.FBZ):X.Pbt");
    }
}
