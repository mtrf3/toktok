package com.bytedance.android.live.rank.impl.setting;

import X.B9K;
import X.BCW;
import X.C01R;
import X.C16880lQ;
import X.C1B3;
import X.C28507BGt;
import X.C29306Beo;
import X.CCJ;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AnchorRankingSettingDialog extends LiveDialogFragment {
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
        Boolean bool;
        int i;
        int i2;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        boolean LJJ = C29306Beo.LJJ(bool);
        C28507BGt c28507BGt = new C28507BGt(R.layout.czp);
        if (LJJ) {
            i = R.style.aai;
        } else if (CCJ.LIZ(getContext())) {
            i = R.style.aam;
        } else {
            i = R.style.aan;
        }
        c28507BGt.LIZJ = i;
        if (LJJ) {
            i2 = 80;
        } else if (CCJ.LIZ(getContext())) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        c28507BGt.LJII = i2;
        c28507BGt.LJI = 0.0f;
        int LIZJ = B9K.LIZJ(getContext());
        c28507BGt.LJIIIZ = -1;
        if (LJJ) {
            LIZJ = -1;
        }
        c28507BGt.LJIIJ = LIZJ;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 40), _$_findCachedViewById(R.id.liz));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        Bundle LIZ = C01R.LIZ("no_back", true);
        AnchorRankingSettingFragment anchorRankingSettingFragment = new AnchorRankingSettingFragment();
        anchorRankingSettingFragment.setArguments(LIZ);
        c1b3.LJIIIIZZ(R.id.dm7, 1, anchorRankingSettingFragment, null);
        c1b3.LJIILJJIL();
    }
}
