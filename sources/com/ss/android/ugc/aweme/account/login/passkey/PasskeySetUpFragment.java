package com.ss.android.ugc.aweme.account.login.passkey;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C79045V0n;
import X.C85144XbI;
import X.C85712XkS;
import X.SY4;
import Y.ACListenerS35S0100000_15;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.RespondSetPasskeyInfoEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowSetPasskeyInfoEvent;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PasskeySetUpFragment extends BaseI18nLoginFragment {
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final String LJZL = "skip";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.ms;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        RespondSetPasskeyInfoEvent respondSetPasskeyInfoEvent = new RespondSetPasskeyInfoEvent();
        respondSetPasskeyInfoEvent.LJI();
        respondSetPasskeyInfoEvent.LJII();
        respondSetPasskeyInfoEvent.LIZLLL(0, "result");
        respondSetPasskeyInfoEvent.LJFF();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        int i2;
        Integer LJI;
        Integer LJI2;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            SY4 sy4 = (SY4) mo49getActivity.findViewById(R.id.jqn);
            sy4.getClass();
            C16880lQ.LJJIZ(sy4, new ACListenerS35S0100000_15(this, 25));
            TuxTextView tuxTextView = (TuxTextView) mo49getActivity.findViewById(R.id.fo_);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            int[][] iArr = {new int[]{android.R.attr.state_focused, android.R.attr.state_pressed}, new int[0]};
            int[] iArr2 = new int[2];
            if (mo49getActivity2 != null && (LJI2 = C79045V0n.LJI(R.attr.gw, mo49getActivity2)) != null) {
                i = LJI2.intValue();
            } else {
                i = 0;
            }
            iArr2[0] = i;
            if (mo49getActivity2 != null && (LJI = C79045V0n.LJI(R.attr.gx, mo49getActivity2)) != null) {
                i2 = LJI.intValue();
            } else {
                i2 = 0;
            }
            iArr2[1] = i2;
            tuxTextView.setTextColor(new ColorStateList(iArr, iArr2));
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 26));
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LJIILIIL = false;
        c85712XkS.LIZ = " ";
        c85712XkS.LJI = true;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!o.LJ(this.LJZL, "add")) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            C85144XbI.LJJIFFI(enterFrom, this.LJZL, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ShowSetPasskeyInfoEvent showSetPasskeyInfoEvent = new ShowSetPasskeyInfoEvent();
        showSetPasskeyInfoEvent.LIZLLL("account_page", "enter_from");
        showSetPasskeyInfoEvent.LIZLLL("click", "enter_method");
        showSetPasskeyInfoEvent.LJFF();
    }
}
