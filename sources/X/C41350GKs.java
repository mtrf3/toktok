package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.GKs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41350GKs extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, DraftSaveResult, C76800UCe> {
    public final /* synthetic */ C41356GKy LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41350GKs(C41356GKy c41356GKy, VideoPublishEditModel videoPublishEditModel) {
        super(2);
        this.LJLIL = c41356GKy;
        this.LJLILLLLZI = videoPublishEditModel;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, DraftSaveResult draftSaveResult) {
        Bundle LIZ;
        bool.booleanValue();
        this.LJLIL.LIZJ.invoke();
        C41356GKy c41356GKy = this.LJLIL;
        ActivityC45651qj activityC45651qj = c41356GKy.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
        if (c41356GKy.LIZIZ) {
            LIZ = C41045G8z.LIZIZ(videoPublishEditModel);
        } else {
            LIZ = C41045G8z.LIZ(videoPublishEditModel, false);
        }
        LIZ.putBoolean("directly_publish_only", !C41349GKr.LIZ());
        AVExternalServiceImpl.LIZ().publishService().startPublish(activityC45651qj, LIZ);
        GJR.LIZ(C60903NvH.LJIIJJI().getPublishService().LJIJI(), activityC45651qj, videoPublishEditModel, -1, H7R.LJJLIIIJILLIZJL(videoPublishEditModel), false, null, null, 112);
        return C76800UCe.LIZ;
    }
}
