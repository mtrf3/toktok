package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.net.INet;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;

/* renamed from: X.adX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94223adX implements IEffectNetWorker {
    public final INet LIZ = (INet) C93971aZT.LIZ().LIZ(INet.class);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056 A[Catch: Exception -> 0x008d, IOException -> 0x0096, TRY_ENTER, TryCatch #2 {IOException -> 0x0096, Exception -> 0x008d, blocks: (B:3:0x000b, B:5:0x0017, B:7:0x0029, B:8:0x0042, B:11:0x0056, B:13:0x005a, B:15:0x0080, B:17:0x0085, B:23:0x006a, B:25:0x006e, B:26:0x004d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: Exception -> 0x008d, IOException -> 0x0096, TryCatch #2 {IOException -> 0x0096, Exception -> 0x008d, blocks: (B:3:0x000b, B:5:0x0017, B:7:0x0029, B:8:0x0042, B:11:0x0056, B:13:0x005a, B:15:0x0080, B:17:0x0085, B:23:0x006a, B:25:0x006e, B:26:0x004d), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: Exception -> 0x008d, IOException -> 0x0096, TryCatch #2 {IOException -> 0x0096, Exception -> 0x008d, blocks: (B:3:0x000b, B:5:0x0017, B:7:0x0029, B:8:0x0042, B:11:0x0056, B:13:0x005a, B:15:0x0080, B:17:0x0085, B:23:0x006a, B:25:0x006e, B:26:0x004d), top: B:2:0x000b }] */
    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream execute(com.ss.android.ugc.effectmanager.common.EffectRequest r9) {
        /*
            r8 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r7 = 0
            java.lang.String r1 = "GET"
            java.lang.String r0 = r9.getHttpMethod()     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            if (r0 == 0) goto L4d
            java.lang.String r2 = r9.getUrl()     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            java.lang.String r0 = "request.url"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            java.lang.String r1 = "&app_version="
            r0 = 0
            boolean r0 = ujb.s.LJJJLZIJ(r2, r1, r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            java.lang.String r0 = r9.getUrl()     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            r1.append(r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            java.lang.String r0 = "&os_version="
            r1.append(r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            r1.append(r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            java.lang.String r2 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
        L42:
            java.lang.String r1 = "POST"
            java.lang.String r0 = r9.getHttpMethod()     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            goto L52
        L4d:
            java.lang.String r2 = r9.getUrl()     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            goto L42
        L52:
            java.lang.String r0 = "url"
            if (r1 == 0) goto L6a
            com.bytedance.effectcreatormobile.ckeapi.api.foundation.net.INet r1 = r8.LIZ     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            if (r1 == 0) goto L7d
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            java.util.Map r6 = r9.getParams()     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            X.aQg r2 = r1.doPost(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            goto L7e
        L6a:
            com.bytedance.effectcreatormobile.ckeapi.api.foundation.net.INet r1 = r8.LIZ     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            if (r1 == 0) goto L7d
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2
            r5 = r5
            r6 = r7
            X.aQg r2 = r1.doGet(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            goto L7e
        L7d:
            r2 = r7
        L7e:
            if (r2 == 0) goto L9e
            boolean r1 = r2.LIZ     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            r0 = 1
            if (r1 != r0) goto L9e
            long r0 = r2.LIZJ     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            r9.setContentLength(r0)     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            java.io.InputStream r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L8d java.io.IOException -> L96
            return r0
        L8d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r9.setErrorMsg(r0)
            goto L9e
        L96:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r9.setErrorMsg(r0)
        L9e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94223adX.execute(com.ss.android.ugc.effectmanager.common.EffectRequest):java.io.InputStream");
    }
}
