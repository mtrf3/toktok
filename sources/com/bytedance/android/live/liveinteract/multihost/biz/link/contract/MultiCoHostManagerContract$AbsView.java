package com.bytedance.android.live.liveinteract.multihost.biz.link.contract;

import X.AbstractC75839Tpb;
import X.CJ2;
import X.EnumC75763ToN;
import android.view.View;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.livesdk.model.message.CohostTopicMessage;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class MultiCoHostManagerContract$AbsView extends InteractDialogFragmentBaseContract$AbsView<AbstractC75839Tpb> {
    public static final /* synthetic */ int LJLJJL = 0;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    public abstract void Al(EnumC75763ToN enumC75763ToN, String str);

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void r8(CohostTopicMessage cohostTopicMessage);

    public abstract void u2(CohostTopicMessage cohostTopicMessage);

    public abstract void wl(CJ2 cj2);

    public abstract void xl(int i);
}
