package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public final class GMD extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, DraftSaveResult, C76800UCe> {
    public final /* synthetic */ QuickForwardConfig LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ InterfaceC67352kd<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMD(Context context, QuickForwardConfig quickForwardConfig, VideoPublishEditModel videoPublishEditModel, String str, C84654XKg c84654XKg) {
        super(2);
        this.LJLIL = quickForwardConfig;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = str;
        this.LJLJJI = context;
        this.LJLJJL = c84654XKg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
    
        if (r1 == null) goto L16;
     */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(java.lang.Boolean r22, com.ss.android.ugc.aweme.draft.model.DraftSaveResult r23) {
        /*
            r21 = this;
            r0 = r22
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            r2 = r21
            com.ss.android.ugc.aweme.services.story.forward.QuickForwardConfig r0 = r2.LJLIL
            com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock r4 = r0.getPublishLock()
            if (r4 == 0) goto L21
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LJLILLLLZI
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock> r3 = X.C169656lF.LIZJ
            java.lang.String r1 = r0.getCreationId()
            java.lang.String r0 = "editModel.creationId"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.put(r1, r4)
        L21:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LJLILLLLZI
            r9 = 0
            android.os.Bundle r4 = X.C41045G8z.LIZ(r0, r9)
            java.lang.String r1 = "extra_expect_publish_task_id"
            java.lang.String r0 = r2.LJLJI
            r4.putString(r1, r0)
            com.ss.android.ugc.aweme.services.story.forward.QuickForwardConfig r0 = r2.LJLIL
            boolean r0 = r0.getWithoutLanding()
            r8 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "extra_disable_progress_view"
            r4.putBoolean(r0, r1)
            com.ss.android.ugc.aweme.services.story.forward.QuickForwardConfig r0 = r2.LJLIL
            boolean r1 = r0.getWithoutLanding()
            java.lang.String r0 = "directly_publish_only"
            r4.putBoolean(r0, r1)
            android.content.Context r0 = r2.LJLJJI
            X.1qj r5 = X.C45804HyK.LJJIFFI(r0)
            if (r5 == 0) goto Lae
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6 = r2.LJLILLLLZI
            com.ss.android.ugc.aweme.services.story.forward.QuickForwardConfig r3 = r2.LJLIL
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
            java.lang.String r1 = r0.startPublish(r5, r4)
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.video.IAVPublishService r13 = r0.publishService()
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            X.GSL r4 = r0.LJIJI()
            r7 = -1
            r15 = 0
            r10 = 0
            r12 = 112(0x70, float:1.57E-43)
            r11 = r10
            X.GJR.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r3.getWithoutLanding()
            if (r0 == 0) goto Lac
            boolean r0 = r13.enableFloatingProgress()
            if (r0 == 0) goto Lac
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(r9)
            r0.getApplicationService()
            X.1qj r0 = X.C45039Hlz.LIZIZ(r5, r8)
            if (r0 != 0) goto Lb9
        L96:
            r0 = 16
            int r16 = X.C7MY.LIZIZ(r0)
            r0 = 58
            int r17 = X.C7MY.LIZIZ(r0)
            X.1XY r19 = X.C1XY.LJLILLLLZI
            r14 = r5
            r18 = r15
            r20 = r8
            r13.addPublishProgressToActivity(r14, r15, r16, r17, r18, r19, r20)
        Lac:
            if (r1 != 0) goto Lb1
        Lae:
        Laf:
            java.lang.String r1 = r2.LJLJI
        Lb1:
            X.2kd<java.lang.String> r0 = r2.LJLJJL
            X.C78966Uyw.LJJL(r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lb9:
            r5 = r0
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GMD.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
