package com.bytedance.android.live.liveinteract.match.business.contract;

import X.AbstractC75836TpY;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class InteractPkBeInvitedContract$View extends InteractDialogFragmentBaseContract$AbsView<AbstractC75836TpY> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void wl(Throwable th);

    public abstract void xl(Throwable th);
}
