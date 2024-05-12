package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class AbsDetailAwemeListFragment extends AmeBaseFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
