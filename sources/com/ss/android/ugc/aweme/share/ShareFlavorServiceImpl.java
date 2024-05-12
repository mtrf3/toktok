package com.ss.android.ugc.aweme.share;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ShareFlavorServiceImpl implements ShareFlavorService {
    public static int LIZIZ = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    public final String LJ(SharePackage sharePackage, String it) {
        o.LJIIIZ(it, "it");
        return it;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r2 != null) goto L10;
     */
    @Override // com.ss.android.ugc.aweme.share.ShareFlavorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r5, long r6, X.C198517qh r8) {
        /*
            r4 = this;
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r1 = 1500(0x5dc, double:7.41E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L74
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3e
            r1.<init>(r5)     // Catch: java.io.IOException -> L3e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L3e
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L3e
            r0.<init>(r1)     // Catch: java.io.IOException -> L3e
            r2.<init>(r0)     // Catch: java.io.IOException -> L3e
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L39
            r1.append(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = "    "
            r1.append(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L39
            r3.append(r0)     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            if (r2 == 0) goto L3e
        L3b:
            r2.close()
        L3e:
            int r1 = com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZIZ
            java.lang.String r0 = r3.toString()
            int r0 = r0.length()
            if (r1 <= r0) goto L54
            java.lang.String r0 = r3.toString()
            int r0 = r0.length()
            com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZIZ = r0
        L54:
            java.lang.String r2 = r3.toString()
            java.lang.String r0 = "sb.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 0
            int r0 = com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZIZ
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = "errorFileContent"
            if (r0 != 0) goto L75
            r8.LIZLLL(r1, r2)
        L74:
            return
        L75:
            java.lang.String r0 = "file is null"
            r8.LIZLLL(r1, r0)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl.LIZJ(java.lang.String, long, X.7qh):void");
    }
}
