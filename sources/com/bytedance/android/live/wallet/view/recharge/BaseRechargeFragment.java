package com.bytedance.android.live.wallet.view.recharge;

import android.view.View;
import com.bytedance.android.livesdk.ui.BaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class BaseRechargeFragment extends BaseFragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
