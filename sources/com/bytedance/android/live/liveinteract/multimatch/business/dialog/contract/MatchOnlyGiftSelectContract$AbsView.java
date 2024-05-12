package com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract;

import X.AbstractC76146TuY;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class MatchOnlyGiftSelectContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC76146TuY> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
