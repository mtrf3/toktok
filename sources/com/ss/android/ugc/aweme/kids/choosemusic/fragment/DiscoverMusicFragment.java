package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import X.C207668Da;
import X.C5S1;
import X.XXC;
import X.XYD;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DiscoverMusicFragment extends BaseDiscoverMusicFragment {
    public static final /* synthetic */ int LJLLJ = 0;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void showLoadMoreEmpty() {
        this.LJLJJI.setShowFooter(false);
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void wl() {
        Boolean fromOriginVideo = (Boolean) this.LJLILLLLZI.get("data_sticker_music_from_video", Boolean.TRUE);
        List list = (List) this.LJLILLLLZI.get("data_sticker", null);
        o.LJIIIIZZ(fromOriginVideo, "fromOriginVideo");
        if (fromOriginVideo.booleanValue()) {
            if (this.LJLILLLLZI.get("data_challenge") != null) {
                XXC xxc = this.LJLJJI;
                xxc.LJLLI = true;
                xxc.LJLLILLLL = 5;
                return;
            } else {
                if (list == null || list.size() <= 0) {
                    return;
                }
                XXC xxc2 = this.LJLJJI;
                xxc2.LJLLI = true;
                xxc2.LJLLILLLL = 4;
                return;
            }
        }
        if (list != null && list.size() > 0) {
            XXC xxc3 = this.LJLJJI;
            xxc3.LJLLI = true;
            xxc3.LJLLILLLL = 4;
        } else {
            if (this.LJLILLLLZI.get("data_challenge") == null) {
                return;
            }
            XXC xxc4 = this.LJLJJI;
            xxc4.LJLLI = true;
            xxc4.LJLLILLLL = 5;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseDiscoverMusicFragment
    public final void vl(C207668Da kvData) {
        int i;
        o.LJIIIZ(kvData, "kvData");
        Object obj = kvData.LIZIZ;
        if (obj == null) {
            obj = null;
        }
        o.LJIIIIZZ(obj, "kvData.getData()");
        XYD xyd = (XYD) obj;
        if (!getUserVisibleHint() || xyd.LIZJ == -1) {
            return;
        }
        if ((xyd.LIZLLL == 1 && xyd.LIZ == 0) || xyd.LIZ != 1) {
            return;
        }
        C5S1 c5s1 = new C5S1(mo49getActivity());
        if (xyd.LIZLLL == 1) {
            i = R.string.dgl;
        } else {
            i = R.string.cgd;
        }
        c5s1.LIZJ(i);
        c5s1.LJ();
    }
}
