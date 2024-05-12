package com.ss.android.ugc.aweme.kids.choosemusic.fragment;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public final class ChooseMusicFragment extends BaseChooseMusicFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseChooseMusicFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }
}
