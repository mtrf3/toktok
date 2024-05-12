package X;

import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.IPermissionAction;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public final class G5F implements IPermissionAction {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ ExtensionDataRepo LIZIZ;
    public final /* synthetic */ G6D LIZJ;
    public final /* synthetic */ VideoPublishContainerScene LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.publish.IPermissionAction
    public final void cancel() {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZLLL;
        G5K g5k = videoPublishContainerScene.LLIIIILZ;
        if (g5k != null) {
            videoPublishContainerScene.LLIIII.setValue(new G6D(g5k.LIZ(), this.LIZJ.getExcludeUserList(), this.LIZLLL.LLIIIILZ.LIZIZ.getAllowRecommend()));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IPermissionAction
    public final void confirm() {
        if (this.LIZ != 1) {
            this.LIZIZ.getI18nPrivacy().setValue(Boolean.TRUE);
        } else {
            this.LIZIZ.getI18nPrivacy().setValue(Boolean.FALSE);
            this.LIZIZ.getUpdateAnchor().setValue(null);
        }
        G5K g5k = this.LIZLLL.LLIIIILZ;
        if (g5k != null) {
            g5k.LIZIZ(this.LIZJ.getExcludeUserList(), this.LIZ, 0, this.LIZLLL.LLILZLL.creativeModel.transientPostPageModel.LJJIJIIJI);
        }
    }

    public G5F(VideoPublishContainerScene videoPublishContainerScene, int i, ExtensionDataRepo extensionDataRepo, G6D g6d) {
        this.LIZLLL = videoPublishContainerScene;
        this.LIZ = i;
        this.LIZIZ = extensionDataRepo;
        this.LIZJ = g6d;
    }
}
