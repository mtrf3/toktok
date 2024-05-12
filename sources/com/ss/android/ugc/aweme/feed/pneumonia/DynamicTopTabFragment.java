package com.ss.android.ugc.aweme.feed.pneumonia;

import android.view.View;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DynamicTopTabFragment extends FeedFragment {
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }
}
