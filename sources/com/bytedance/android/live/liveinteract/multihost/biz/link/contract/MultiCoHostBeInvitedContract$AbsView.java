package com.bytedance.android.live.liveinteract.multihost.biz.link.contract;

import X.AbstractC75942TrG;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class MultiCoHostBeInvitedContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC75942TrG> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    public abstract void dismiss();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract long wl();

    public abstract void xl(long j);
}
