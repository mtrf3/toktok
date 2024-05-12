package X;

/* loaded from: classes7.dex */
public final class FLB {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(android.content.Intent r11) {
        /*
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            boolean r0 = X.DUE.LIZ()
            if (r0 != 0) goto L92
            X.EEn r0 = X.C36093EEn.LIZ
            r0.getClass()
            boolean r0 = X.EEZ.LIZJ()
            if (r0 == 0) goto L1c
            boolean r0 = X.C35401Duv.LIZ()
            if (r0 != 0) goto L92
        L1c:
            java.lang.String r1 = "data_preload_type"
            java.lang.String r0 = "preload_mainact"
            X.FFX.LIZ(r0, r1)
            r3 = 0
            r1 = 1
            java.lang.String r0 = "is_from_push"
            int r0 = r11.getIntExtra(r0, r3)     // Catch: java.lang.Throwable -> L2e
            if (r0 != r1) goto L2e
            goto L30
        L2e:
            r4 = 0
            goto L31
        L30:
            r4 = 1
        L31:
            java.lang.String r0 = "extra_push_flag"
            int r0 = r11.getIntExtra(r0, r3)
            r10 = 0
            if (r0 != 0) goto L69
            java.lang.String r0 = "id"
            java.lang.String r5 = X.C16880lQ.LLJJIJIIJIL(r11, r0)     // Catch: java.lang.Throwable -> L41
            goto L42
        L41:
            r5 = r10
        L42:
            java.lang.String r0 = "ids"
            java.lang.String r6 = X.C16880lQ.LLJJIJIIJIL(r11, r0)     // Catch: java.lang.Throwable -> L49
            goto L4a
        L49:
            r6 = r10
        L4a:
            java.lang.String r0 = "push_params"
            java.lang.String r7 = X.C16880lQ.LLJJIJIIJIL(r11, r0)     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
            r7 = r10
        L52:
            java.lang.String r0 = "push_id"
            java.lang.String r8 = X.C16880lQ.LLJJIJIIJIL(r11, r0)     // Catch: java.lang.Throwable -> L59
            goto L5a
        L59:
            r8 = r10
        L5a:
            java.lang.String r0 = "gd_label"
            java.lang.String r9 = X.C16880lQ.LLJJIJIIJIL(r11, r0)     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
            r9 = r10
        L62:
            com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager r0 = com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager.INSTANCE     // Catch: java.lang.Throwable -> L6e
            java.lang.String r10 = r0.consume(r3)     // Catch: java.lang.Throwable -> L6e
            goto L6e
        L69:
            r5 = r10
            r6 = r10
            r7 = r10
            r8 = r10
            r9 = r10
        L6e:
            boolean r2 = X.C33710DKw.LIZ(r5, r6, r7, r4)
            boolean r0 = X.DVO.LIZ(r5, r6, r7, r4)
            if (r2 != 0) goto L7a
            if (r0 == 0) goto L93
        L7a:
            X.EEn r0 = X.C36093EEn.LIZ
            r0.getClass()
            X.EHL r0 = new X.EHL
            r0.<init>()
            com.ss.android.ugc.aweme.requesttask.p0.FeedPreloadRequest r3 = new com.ss.android.ugc.aweme.requesttask.p0.FeedPreloadRequest
            r4 = 0
            r11 = 32
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.LIZIZ(r3, r1)
            r0.LIZJ()
        L92:
            return
        L93:
            boolean r0 = X.C48236IwS.LJIJJ()
            if (r0 == 0) goto Laa
            int r0 = X.C34613DiD.LJIIJJI
            if (r0 <= 0) goto L9e
            r3 = 1
        L9e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.FLC r1 = X.FLC.LJLIL
            java.lang.String r0 = "FeedPreloadRequestDelay"
            X.E3F.LIZ(r0, r3, r2, r1)
            goto L92
        Laa:
            X.EEn r0 = X.C36093EEn.LIZ
            r0.getClass()
            X.EHL r0 = new X.EHL
            r0.<init>()
            com.ss.android.ugc.aweme.requesttask.p0.FeedPreloadRequest r2 = new com.ss.android.ugc.aweme.requesttask.p0.FeedPreloadRequest
            r4 = 0
            r3 = 0
            r10 = 127(0x7f, float:1.78E-43)
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.LIZIZ(r2, r1)
            r0.LIZJ()
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FLB.LIZ(android.content.Intent):void");
    }
}
