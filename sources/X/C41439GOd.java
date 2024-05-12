package X;

import com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import kotlin.jvm.internal.o;

/* renamed from: X.GOd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41439GOd implements IStoryPublishService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(GML.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(GOZ.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final IStoryGroupScheduleService getGroupScheduleService() {
        return (GOY) this.LIZIZ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r0.length() != 0) goto L34;
     */
    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getCover(com.ss.android.ugc.aweme.services.story.SimplePublishModel r8, com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig r9, X.InterfaceC88472Yns<? super android.graphics.Bitmap, X.C76800UCe> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "publishModel"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "extractConfigure"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "onCoverReady"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.util.List r0 = r8.getCoverPathList()
            java.lang.Object r4 = X.ORZ.LJLLLL(r0)
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = X.C78685UuP.LJJJZ(r4)
            r3 = 0
            if (r0 == 0) goto L38
            boolean r0 = X.C44687HgJ.LIZIZ(r4)
            if (r0 == 0) goto L38
            X.Ol8 r0 = r7.LIZ
            java.lang.Object r2 = r0.getValue()
            X.2pa r2 = (X.InterfaceC70422pa) r2
            X.2iF r1 = new X.2iF
            r1.<init>(r4, r3, r10)
            r0 = 3
            X.XKX.LIZLLL(r2, r3, r3, r1, r0)
            return
        L38:
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r8.getPublishModel()
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r3 = r0.editModel
        L40:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            if (r0 == 0) goto Ld0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r3
            r2 = 1
            r5 = 0
            if (r3 == 0) goto Ld0
            com.ss.android.ugc.aweme.edit.TTStoryUploadModel r0 = r3.ttStoryUploadModel
            if (r0 == 0) goto L72
            int r1 = r0.getContentType()
            r0 = 2
            if (r1 != r0) goto L72
            r1 = 1
        L56:
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r3.getPreviewInfo()
            if (r0 == 0) goto Ld0
            if (r1 == 0) goto Lad
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r3.<init>()
            java.util.List r0 = r0.getVideoList()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r0
            java.lang.String r2 = r0.getVideoPath()
            goto L76
        L72:
            r1 = 0
            if (r3 == 0) goto Ld0
            goto L56
        L76:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)     // Catch: java.lang.Exception -> L88
            if (r1 == 0) goto L88
            java.lang.String r0 = r1.getScheme()
            if (r0 == 0) goto L88
            int r0 = r0.length()
            if (r0 != 0) goto L91
        L88:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
        L91:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)
            r3.setUrlList(r0)
            int r2 = r9.getWidth()
            int r1 = r9.getHeight()
            X.GOe r0 = new X.GOe
            r0.<init>(r10)
            X.C78765Uvh.LJIILJJIL(r3, r2, r1, r0)
            goto Ld0
        Lad:
            java.util.List r0 = r0.getVideoList()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r5)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r0
            java.lang.String r1 = r0.getVideoPath()
            int[] r2 = new int[r2]
            int r0 = r9.getTimestamp()
            r2[r5] = r0
            r3 = -1
            int r4 = r9.getHeight()
            X.GYr r6 = new X.GYr
            r6.<init>(r10)
            com.ss.android.vesdk.VEUtils.getVideoFrames(r1, r2, r3, r4, r5, r6)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41439GOd.getCover(com.ss.android.ugc.aweme.services.story.SimplePublishModel, com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig, X.Yns):void");
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryPublishService
    public final void retryPublish(ActivityC45651qj activityC45651qj, SimplePublishModel publishModel, PublishFailureReason publishFailureReason, InterfaceC88472Yns<? super Boolean, C76800UCe> onStart) {
        o.LJIIIZ(publishModel, "publishModel");
        o.LJIIIZ(onStart, "onStart");
        XKX.LIZLLL((InterfaceC70422pa) this.LIZ.getValue(), null, null, new C41364GLg(publishModel, activityC45651qj, publishFailureReason, onStart, null), 3);
    }
}
