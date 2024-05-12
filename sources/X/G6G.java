package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class G6G extends G6F {
    public G6G(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, boolean z) {
        super(tikTokPublishGroupSceneFragment, view, z);
    }

    @Override // X.G6F
    public final void LIZ(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, View view, boolean z) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ky2);
        C40990G6w LIZ = C78934UyQ.LJLIL.getSyncShareService().LIZ(tikTokPublishGroupSceneFragment.mo49getActivity());
        this.LIZ = LIZ;
        G5I g5i = LIZ.LIZ;
        g5i.LJLILLLLZI = tikTokPublishGroupSceneFragment;
        viewGroup.addView(g5i);
    }
}
