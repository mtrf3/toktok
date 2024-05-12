package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class G6H extends G6F {
    public G6H(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, boolean z) {
        super(tikTokPublishGroupSceneFragment, view, z);
    }

    @Override // X.G6F
    public final void LIZ(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, boolean z) {
        C40990G6w LIZIZ = C78934UyQ.LJLIL.getSyncShareService().LIZIZ(tikTokPublishGroupSceneFragment.mo49getActivity());
        this.LIZ = LIZIZ;
        if (LIZIZ == null) {
            return;
        }
        LIZIZ.LIZ.LJLILLLLZI = tikTokPublishGroupSceneFragment;
        ((ViewGroup) view.findViewById(R.id.fli)).addView(((C40990G6w) this.LIZ).LIZ);
    }
}
