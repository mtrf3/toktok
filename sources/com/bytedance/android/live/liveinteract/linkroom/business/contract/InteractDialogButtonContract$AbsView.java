package com.bytedance.android.live.liveinteract.linkroom.business.contract;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class InteractDialogButtonContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<Object> {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }
}
