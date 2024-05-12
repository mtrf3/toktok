package com.ss.android.ugc.feed.platform.fragment.detail;

import android.view.View;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class DetailComponentFragment extends CommonPageFragment {
    public Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLILLLLZI.clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract Object wl();
}
