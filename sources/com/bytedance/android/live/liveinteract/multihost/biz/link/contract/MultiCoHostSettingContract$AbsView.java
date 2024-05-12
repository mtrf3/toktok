package com.bytedance.android.live.liveinteract.multihost.biz.link.contract;

import X.AbstractC76169Tuv;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class MultiCoHostSettingContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC76169Tuv> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public abstract void Al(boolean z, Throwable th, boolean z2);

    public abstract void Dl(boolean z, Throwable th, boolean z2);

    public abstract void Gl(boolean z, Throwable th, boolean z2);

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void wl(boolean z, Throwable th, boolean z2);

    public abstract void xl(boolean z, Throwable th, boolean z2);
}
