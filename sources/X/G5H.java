package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import defpackage.e1;

/* loaded from: classes8.dex */
public final class G5H extends AbstractViewOnClickListenerC55470Lpq {
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ VideoPublishContainerScene LJLJJL;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        boolean z = true;
        if (e1.LIZ(31744, "studio_add_a_post_button_when_editing_status", true, false)) {
            VideoPublishContainerScene videoPublishContainerScene = this.LJLJJL;
            if (videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIL) {
                C162696a1.LIZ(videoPublishContainerScene.mActivity);
                return;
            }
        }
        this.LJLJJL.LLLLJI().LJJJJIZL = System.currentTimeMillis();
        VideoPublishViewModel n2 = this.LJLJJL.n();
        boolean z2 = this.LJLJJI;
        VideoPublishEditModel videoPublishEditModel = this.LJLJJL.LLILZLL;
        if (videoPublishEditModel == null || !videoPublishEditModel.mIsFromDraft) {
            z = false;
        }
        n2.getClass();
        n2.setStateImmediate(new C41037G8r(z2, z, false, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G5H(VideoPublishContainerScene videoPublishContainerScene, boolean z) {
        super(1000L);
        this.LJLJJL = videoPublishContainerScene;
        this.LJLJJI = z;
    }
}
