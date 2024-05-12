package com.bytedance.android.live.rank.impl.list.fragment.list.layoutmanager;

import X.C0AC;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;

/* loaded from: classes14.dex */
public final class RankListLinearLayoutManager extends LinearLayoutManager {
    public RankListFragment LLIIIJ;

    public RankListLinearLayoutManager() {
        super(1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJL(C0AC c0ac) {
        super.LJLJJL(c0ac);
        LJJIJIL(LLILLJJLI());
        RankListFragment rankListFragment = this.LLIIIJ;
        if (rankListFragment != null) {
            rankListFragment.Dl();
        }
    }
}
