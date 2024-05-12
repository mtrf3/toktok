package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.C16880lQ;
import X.C28676BNg;
import X.C29306Beo;
import X.C2A7;
import X.C51029K0z;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ECListFragment extends RankListFragment {
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void xl(User user) {
        Boolean bool;
        C2A7 c2a7 = this.LLFZ;
        if (c2a7 != null) {
            c2a7.setVisibility(0);
            c2a7.setText(R.string.o3j);
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null) {
                bool = (Boolean) LJIILIIL.kv0(ECLiveStatusChangeChannel.class);
            } else {
                bool = null;
            }
            c2a7.setEnabled(C29306Beo.LJJ(bool));
            C16880lQ.LJJIII(c2a7, new C28676BNg(this, c2a7));
        }
    }
}
