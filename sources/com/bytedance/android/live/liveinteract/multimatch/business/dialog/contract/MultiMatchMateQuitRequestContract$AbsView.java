package com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract;

import X.AbstractC76249TwD;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class MultiMatchMateQuitRequestContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC76249TwD> {
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

    public abstract boolean wl();

    public abstract void xl(long j);
}
