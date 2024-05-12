package X;

import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1L implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ H1K LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.LJIIL(new H1P("authkey_request_failed"), 10102);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L8;
     */
    @Override // X.InterfaceC65753PrJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(com.ss.android.ugc.aweme.publish.model.VideoCreation r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.publish.model.VideoCreation r9 = (com.ss.android.ugc.aweme.publish.model.VideoCreation) r9
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig
            if (r0 == 0) goto La3
            X.H1K r4 = r8.LIZ
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r9 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r9
            java.lang.String r6 = r8.LIZIZ
            r4.getClass()
            java.lang.String r0 = "uploadConfig"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            long r1 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.publish.model.UploadImageConfig r5 = r9.imgConfig
            r7 = 0
            if (r5 == 0) goto L4a
            X.HJf r3 = new X.HJf
            r3.<init>(r5)
            X.H75 r0 = new X.H75
            r0.<init>()
            r0.LIZJ(r5)
            java.lang.String r0 = r0.LIZLLL()
            r3.LJIIJJI(r0)
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            r0.getApplicationService()
            boolean r0 = X.C45039Hlz.LIZLLL()
            r3.LJIIJ(r0)
            r4.LJIIIZ = r3
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L56
        L4a:
            X.H1P r3 = new X.H1P
            java.lang.String r0 = "upload_image_config_is_null"
            r3.<init>(r0)
            r0 = 10107(0x277b, float:1.4163E-41)
            r4.LJIIL(r3, r0)
        L56:
            X.HJf r3 = r4.LJIIIZ
            java.lang.String r5 = "actualUploader"
            if (r3 == 0) goto L9f
            X.H1M r0 = new X.H1M
            r0.<init>(r4, r1)
            r3.LJIIIZ(r0)
            X.HJf r3 = r4.LJIIIZ
            if (r3 == 0) goto L9b
            r2 = 1
            java.lang.String[] r1 = new java.lang.String[r2]
            r0 = 0
            r1[r0] = r6
            r3.LJIIIIZZ(r2, r1)
            X.HJf r0 = r4.LJIIIZ     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L99
            if (r0 == 0) goto L79
            r0.LJIIL()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L99
            goto Lb1
        L79:
            kotlin.jvm.internal.o.LJIJI(r5)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L99
            throw r7     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L99
        L7d:
            r2 = move-exception
            X.HJf r0 = r4.LJIIIZ     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L95
            r0.LIZJ()     // Catch: java.lang.Throwable -> L99
            X.H1P r1 = new X.H1P     // Catch: java.lang.Throwable -> L99
            java.lang.String r0 = "template_upload_fail"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L99
            r0 = 10104(0x2778, float:1.4159E-41)
            r4.LJIIL(r1, r0)     // Catch: java.lang.Throwable -> L99
            X.C16880lQ.LLLLIIL(r2)     // Catch: java.lang.Throwable -> L99
            goto Lb1
        L95:
            kotlin.jvm.internal.o.LJIJI(r5)     // Catch: java.lang.Throwable -> L99
            throw r7     // Catch: java.lang.Throwable -> L99
        L99:
            r0 = move-exception
            throw r0
        L9b:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r7
        L9f:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r7
        La3:
            X.H1K r2 = r8.LIZ
            X.H1P r1 = new X.H1P
            java.lang.String r0 = "authkey_convert_failed"
            r1.<init>(r0)
            r0 = 10101(0x2775, float:1.4155E-41)
            r2.LJIIL(r1, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1L.onSuccess(java.lang.Object):void");
    }

    public H1L(H1K h1k, String str) {
        this.LIZ = h1k;
        this.LIZIZ = str;
    }
}
