package com.bytedance.android.live.rank.impl.setting;

import X.BCW;
import X.C16880lQ;
import X.C28284B8e;
import X.C28286B8g;
import X.C28507BGt;
import X.C29306Beo;
import X.C2A7;
import X.C47121t6;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RankOptOutTipsDialog extends LiveDialogFragment {
    public static final String LJLILLLLZI = C16880lQ.LJLLJ(RankOptOutTipsDialog.class);
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d0_);
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -2;
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        if (C29306Beo.LJIILLIIL(bool)) {
            dismiss();
        } else {
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.h_t), new C28284B8e(this));
            C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.jr8), new C28286B8g(this));
        }
    }
}
