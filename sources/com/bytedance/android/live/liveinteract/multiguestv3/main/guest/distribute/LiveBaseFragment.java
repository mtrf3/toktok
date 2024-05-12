package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import android.view.View;
import com.bytedance.android.livesdk.ui.BaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public abstract class LiveBaseFragment extends BaseFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
