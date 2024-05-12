package X;

import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public final class G7P implements IAVPublishExtension.Callback {
    public final /* synthetic */ VideoPublishContainerScene LIZ;

    public G7P(VideoPublishContainerScene videoPublishContainerScene) {
        this.LIZ = videoPublishContainerScene;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onECUpdateBC(boolean z) {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
        G5X g5x = videoPublishContainerScene.LJLJLJ;
        if (videoPublishEditModel != null && g5x != null) {
            ((InterfaceC41201GEz) C59367NRr.LIZIZ(InterfaceC41201GEz.class)).Sn0(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onECUpdateBO(boolean z) {
        VideoPublishContainerScene videoPublishContainerScene = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
        G5X g5x = videoPublishContainerScene.LJLJLJ;
        if (videoPublishEditModel != null && g5x != null) {
            ((InterfaceC41201GEz) C59367NRr.LIZIZ(InterfaceC41201GEz.class)).N10(z);
        }
    }
}
