package X;

import Y.ARunnableS10S0110000_4;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import defpackage.e1;

/* loaded from: classes8.dex */
public final class G5S implements InterfaceC187177Wf {
    public final ExpandTextViewModel LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ VideoPublishContainerScene LJLJJI;

    @Override // X.InterfaceC187177Wf
    public final void LLLLLILLIL() {
        VideoPublishContainerScene videoPublishContainerScene = this.LJLJJI;
        videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIL = true;
        KeyboardStateViewModel keyboardStateViewModel = videoPublishContainerScene.LLILLL;
        if (keyboardStateViewModel != null) {
            keyboardStateViewModel.runOnUiThread(new ARunnableS10S0110000_4((Object) keyboardStateViewModel, true, 7));
        }
        if (e1.LIZ(31744, "studio_add_a_post_button_when_editing_status", true, false) && !H7R.LJJJJL(this.LJLJJI.LLILZLL)) {
            this.LJLIL.LJLJI.setValue(Boolean.TRUE);
        }
        ViewGroup viewGroup = this.LJLJJI.LLILZIL;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            this.LJLILLLLZI.setVisibility(8);
        } else {
            ExpandedTitleModule expandedTitleModule = this.LJLJJI.LLJJIJIL.LJIIIZ;
            if (expandedTitleModule == null || !expandedTitleModule.LLILLJJLI) {
                this.LJLILLLLZI.setVisibility(0);
            }
        }
        this.LJLJJI.LLIIIJ.getClass();
    }

    @Override // X.InterfaceC187177Wf
    public final void S2() {
        VideoPublishContainerScene videoPublishContainerScene = this.LJLJJI;
        videoPublishContainerScene.LLILZLL.creativeModel.transientPostPageModel.LJJIJIL = false;
        KeyboardStateViewModel keyboardStateViewModel = videoPublishContainerScene.LLILLL;
        if (keyboardStateViewModel != null) {
            keyboardStateViewModel.runOnUiThread(new ARunnableS10S0110000_4((Object) keyboardStateViewModel, false, 7));
        }
        if (e1.LIZ(31744, "studio_add_a_post_button_when_editing_status", true, false) && !H7R.LJJJJL(this.LJLJJI.LLILZLL)) {
            this.LJLIL.LJLJI.setValue(Boolean.FALSE);
        }
        this.LJLILLLLZI.setVisibility(8);
    }

    public G5S(VideoPublishContainerScene videoPublishContainerScene, View view, View view2) {
        this.LJLJJI = videoPublishContainerScene;
        this.LJLILLLLZI = view;
        this.LJLJI = view2;
        this.LJLIL = (ExpandTextViewModel) C165706es.LJIIIIZZ(videoPublishContainerScene, null, null, 6).get(ExpandTextViewModel.class);
    }
}
