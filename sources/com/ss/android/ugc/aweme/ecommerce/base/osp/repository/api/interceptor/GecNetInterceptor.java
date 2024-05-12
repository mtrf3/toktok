package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor;

import X.InterfaceC37216Ej6;

/* loaded from: classes7.dex */
public final class GecNetInterceptor implements InterfaceC37216Ej6 {
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[Catch: all -> 0x0078, TryCatch #5 {all -> 0x0078, blocks: (B:26:0x0055, B:28:0x005b, B:29:0x005f, B:31:0x0063), top: B:25:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[Catch: all -> 0x0078, TryCatch #5 {all -> 0x0078, blocks: (B:26:0x0055, B:28:0x005b, B:29:0x005f, B:31:0x0063), top: B:25:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    @Override // X.InterfaceC37216Ej6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C64797Pbt<?> intercept(X.FBZ r11) {
        /*
            r10 = this;
            r0 = r11
            X.F7S r0 = (X.F7S) r0
            com.bytedance.retrofit2.client.Request r1 = r0.LIZJ
            java.lang.String r0 = r1.getUrl()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.String r5 = r0.getEncodedPath()
            java.lang.String r3 = ""
            if (r5 != 0) goto L16
            r5 = r3
        L16:
            r2 = 0
            X.F7S r11 = (X.F7S) r11     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L49
            X.Pbt r1 = r11.LIZ(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L49
            boolean r8 = r1.LIZIZ()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L43
            java.lang.String r7 = X.C36671EaJ.LIZ(r1)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L7d
            X.EeA r0 = r1.LIZ     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            int r4 = r0.LIZIZ     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r6 = r0.LIZJ     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L7a
            if (r6 != 0) goto L2e
            r6 = r3
        L2e:
            X.OSZ[] r9 = new X.OSZ[r2]
            X.C36671EaJ.LIZJ(r4, r5, r6, r7, r8, r9)
            return r1
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r0 = move-exception
            goto L7f
        L38:
            r1 = move-exception
            goto L3c
        L3a:
            r1 = move-exception
            r7 = r3
        L3c:
            r4 = 0
            goto L4d
        L3e:
            r1 = move-exception
            r7 = r3
            r4 = 0
            r8 = 0
            goto L4d
        L43:
            r0 = move-exception
            r6 = r3
            r7 = r3
            r4 = 0
            r8 = 0
            goto L81
        L49:
            r1 = move-exception
            r7 = r3
            r4 = 0
            r8 = 0
        L4d:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r0.getName()     // Catch: java.lang.Throwable -> L7a
            java.lang.Integer r0 = X.BPF.LIZ(r1)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L69
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L78
        L5f:
            boolean r0 = r1 instanceof X.C64799Pbv     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L70
            r0 = r1
            X.Pbv r0 = (X.C64799Pbv) r0     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = r0.traceCode     // Catch: java.lang.Throwable -> L78
            goto L6d
        L69:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L5f
        L6d:
            if (r0 != 0) goto L76
        L6f:
            r7 = r3
        L70:
            X.OSZ[] r9 = new X.OSZ[r2]
            X.C36671EaJ.LIZJ(r4, r5, r6, r7, r8, r9)
            throw r1
        L76:
            r3 = r0
            goto L6f
        L78:
            r0 = move-exception
            goto L81
        L7a:
            r0 = move-exception
            r6 = r3
            goto L81
        L7d:
            r0 = move-exception
            r7 = r3
        L7f:
            r6 = r3
            r4 = 0
        L81:
            X.OSZ[] r9 = new X.OSZ[r2]
            X.C36671EaJ.LIZJ(r4, r5, r6, r7, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor.intercept(X.FBZ):X.Pbt");
    }
}
