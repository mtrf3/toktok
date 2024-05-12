package com.bytedance.android.live.rank.impl.list.fragment.list;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public final class RookieListFragment extends GiftListFragment {
    public final Map<Integer, View> LLIIIL = new LinkedHashMap();

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIL).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
