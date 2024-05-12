package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.C207668Da;
import X.C5S1;
import X.XX6;
import X.XYC;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DiscoverMusicFragment extends BaseDiscoverMusicFragment {
    public static final /* synthetic */ int LJLZ = 0;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void showLoadMoreEmpty() {
        this.LJLJJL.setShowFooter(false);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void xl() {
        Boolean fromOriginVideo = (Boolean) this.LJLJI.get("data_sticker_music_from_video", Boolean.TRUE);
        List list = (List) this.LJLJI.get("data_sticker", null);
        o.LJIIIIZZ(fromOriginVideo, "fromOriginVideo");
        if (fromOriginVideo.booleanValue()) {
            if (this.LJLJI.get("data_challenge") != null) {
                XX6 xx6 = this.LJLJJL;
                xx6.LJLLI = true;
                xx6.LJLLL = 5;
                return;
            } else {
                if (list == null || list.size() <= 0) {
                    return;
                }
                XX6 xx62 = this.LJLJJL;
                xx62.LJLLI = true;
                xx62.LJLLL = 4;
                return;
            }
        }
        if (list != null && list.size() > 0) {
            XX6 xx63 = this.LJLJJL;
            xx63.LJLLI = true;
            xx63.LJLLL = 4;
        } else {
            if (this.LJLJI.get("data_challenge") == null) {
                return;
            }
            XX6 xx64 = this.LJLJJL;
            xx64.LJLLI = true;
            xx64.LJLLL = 5;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void vl(C207668Da kvData) {
        int i;
        o.LJIIIZ(kvData, "kvData");
        Object obj = kvData.LIZIZ;
        if (obj == null) {
            obj = null;
        }
        o.LJIIIIZZ(obj, "kvData.getData()");
        XYC xyc = (XYC) obj;
        if (!getUserVisibleHint() || xyc.LIZJ == -1) {
            return;
        }
        if ((xyc.LIZLLL == 1 && xyc.LIZ == 0) || xyc.LIZ != 1) {
            return;
        }
        C5S1 c5s1 = new C5S1(mo49getActivity());
        if (xyc.LIZLLL == 1) {
            i = R.string.dgl;
        } else {
            i = R.string.cgd;
        }
        c5s1.LIZJ(i);
        c5s1.LJ();
    }
}
