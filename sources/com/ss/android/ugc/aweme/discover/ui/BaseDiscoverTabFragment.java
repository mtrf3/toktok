package com.ss.android.ugc.aweme.discover.ui;

import X.C188727au;
import X.FMX;
import X.KNV;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class BaseDiscoverTabFragment extends JediBaseFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public long LJLIL = -1;

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract String vl();

    public abstract int wl();

    public void xl(boolean z, boolean z2) {
        if (!z) {
            if (this.LJLIL > 0) {
                return;
            }
            this.LJLIL = SystemClock.elapsedRealtime();
        } else {
            if (this.LJLIL <= 0) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLIL;
            String vl = vl();
            C188727au LIZLLL = KNV.LIZLLL(vl, "enterFrom");
            LIZLLL.LJIIIZ("enter_from", vl);
            LIZLLL.LJ(elapsedRealtime, "duration");
            FMX.LJIIL("stay_time", LIZLLL.LIZ);
            this.LJLIL = -1L;
        }
    }
}
