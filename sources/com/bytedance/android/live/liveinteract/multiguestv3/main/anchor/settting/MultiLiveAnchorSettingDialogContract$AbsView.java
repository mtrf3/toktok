package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import X.AbstractC75306Th0;
import X.EnumC75310Th4;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class MultiLiveAnchorSettingDialogContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC75306Th0> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public abstract void U2(Throwable th);

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void wl(int i, EnumC75310Th4 enumC75310Th4);
}
