package X;

import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragment;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragmentPanel;

/* loaded from: classes10.dex */
public final class M7E implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ MixVideoPlayDetailPageFragment LJLIL;

    public M7E(MixVideoPlayDetailPageFragment mixVideoPlayDetailPageFragment) {
        this.LJLIL = mixVideoPlayDetailPageFragment;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        MixVideoPlayDetailPageFragmentPanel mixVideoPlayDetailPageFragmentPanel;
        MixVideoPlayDetailPageFragmentPanel mixVideoPlayDetailPageFragmentPanel2;
        MixVideoPlayDetailPageFragment mixVideoPlayDetailPageFragment = this.LJLIL;
        mixVideoPlayDetailPageFragment.LJLZ = z;
        if (!z) {
            if (mixVideoPlayDetailPageFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                DetailFragmentPanel detailFragmentPanel = this.LJLIL.LJLJI;
                if ((detailFragmentPanel instanceof MixVideoPlayDetailPageFragmentPanel) && (mixVideoPlayDetailPageFragmentPanel2 = (MixVideoPlayDetailPageFragmentPanel) detailFragmentPanel) != null) {
                    mixVideoPlayDetailPageFragmentPanel2.LJIIIIZZ("panel_open");
                    return;
                }
                return;
            }
            DetailFragmentPanel detailFragmentPanel2 = this.LJLIL.LJLJI;
            if (!(detailFragmentPanel2 instanceof MixVideoPlayDetailPageFragmentPanel) || (mixVideoPlayDetailPageFragmentPanel = (MixVideoPlayDetailPageFragmentPanel) detailFragmentPanel2) == null) {
                return;
            }
            mixVideoPlayDetailPageFragmentPanel.LJIIIIZZ("leave_playlist");
        }
    }
}
