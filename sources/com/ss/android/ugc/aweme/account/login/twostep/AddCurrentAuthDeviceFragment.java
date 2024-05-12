package com.ss.android.ugc.aweme.account.login.twostep;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C85144XbI;
import X.C85712XkS;
import X.FMX;
import X.InterfaceC26157AOj;
import X.R41;
import X.SY4;
import Y.ACListenerS49S0200000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AddCurrentAuthDeviceFragment extends BaseI18nLoginFragment {
    public final Map<Integer, View> LL = new LinkedHashMap();
    public String LJZL = "skip";

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
        return R.layout.mg;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String str;
        String string;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ((TuxTextView) mo49getActivity.findViewById(R.id.ah9)).setTuxFont(23);
            ((TuxTextView) mo49getActivity.findViewById(R.id.ah8)).setTuxFont(41);
            SY4 sy4 = (SY4) mo49getActivity.findViewById(R.id.vd);
            sy4.getClass();
            C16880lQ.LJJIZ(sy4, new ACListenerS49S0200000_15(sy4, this, 6));
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LIZ = getString(R.string.t7i);
        c85712XkS.LJIILIIL = false;
        Context context = getContext();
        String str2 = "";
        if (context == null || (str = context.getString(R.string.t7h)) == null) {
            str = "";
        }
        c85712XkS.LJIIIIZZ = str;
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.t7e)) != null) {
            str2 = string;
        }
        c85712XkS.LJIIIZ = str2;
        c85712XkS.LIZLLL = getString(R.string.t7f);
        c85712XkS.LIZIZ = null;
        c85712XkS.LJFF = false;
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
        TextView textView;
        super.onActivityCreated(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (textView = (TextView) mo49getActivity.findViewById(R.id.c9q)) != null) {
            InterfaceC26157AOj LJIIL = R41.LIZIZ.LJIIL();
            o.LJII(LJIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
            textView.setText(((TwoStepVerificationService) LJIIL).getDeviceName());
        }
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C188727au LJFF = C85144XbI.LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("adding_trusted_device_show", LJFF.LIZ);
    }
}
