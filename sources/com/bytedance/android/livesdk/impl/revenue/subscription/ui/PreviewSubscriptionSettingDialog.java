package com.bytedance.android.livesdk.impl.revenue.subscription.ui;

import X.C16880lQ;
import X.C1B3;
import X.C1B6;
import X.C28507BGt;
import Y.ACListenerS25S0100000_5;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewSubscriptionSettingDialog extends LiveDialogFragment {
    public int LJLIL;
    public String LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public String LJLILLLLZI = "";

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1h);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 169), _$_findCachedViewById(R.id.hej));
        if (this.LJLIL == 1) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            String enterFrom = this.LJLILLLLZI;
            String str = this.LJLJI;
            o.LJIIIZ(enterFrom, "enterFrom");
            SubscribeInviteLetterFragment subscribeInviteLetterFragment = new SubscribeInviteLetterFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("letter_enter_from", enterFrom);
            bundle2.putString("letter_activity_id", str);
            subscribeInviteLetterFragment.setArguments(bundle2);
            LIZ.LJIIIIZZ(R.id.dm7, 1, subscribeInviteLetterFragment, null);
            LIZ.LJIILJJIL();
            return;
        }
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        C1B3 LIZ2 = C1B6.LIZ(childFragmentManager2, childFragmentManager2);
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = new SubscriptionSettingFragmentNew();
        Bundle bundle3 = new Bundle();
        bundle3.putString("arg_enter_from", "live_take_page");
        subscriptionSettingFragmentNew.setArguments(bundle3);
        subscriptionSettingFragmentNew.LJLIL = "live_take_page";
        LIZ2.LJIIIIZZ(R.id.dm7, 1, subscriptionSettingFragmentNew, null);
        LIZ2.LJIILJJIL();
    }
}
