package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AGJ;
import X.C252949wI;
import X.C35936E8m;
import X.C53203KuN;
import X.C63063Op1;
import X.C6X6;
import X.C71897SJp;
import X.C74088T5w;
import X.C74090T5y;
import X.C85663Xjf;
import X.C85673Xjp;
import X.C85712XkS;
import X.C85729Xkj;
import X.C85837XmT;
import X.DialogC81625W1t;
import X.FMX;
import X.InterfaceC34471Wx;
import X.O0X;
import X.V1B;
import Y.ACListenerS31S0100000_11;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import o3.h0;
import yq4.a;

/* loaded from: classes16.dex */
public final class EmailSignUpFragment extends BaseI18nLoginFragment implements InterfaceC34471Wx {
    public boolean LL;
    public boolean LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public final long LJZL = System.currentTimeMillis();

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLF;
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
        return R.layout.oh;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "PhoneEmailSignUpStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        return new C85712XkS(null, null, false, null, null, true, null, false, true, 112639);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.ctc)).LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void LLFII() {
        _$_findCachedViewById(R.id.cte).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        ((C74088T5w) _$_findCachedViewById(R.id.ctc)).LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void Rg() {
        _$_findCachedViewById(R.id.cte).setVisibility(0);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LL = false;
    }

    public final void Ql(String str) {
        if (C53203KuN.LIZ()) {
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.ACCOUNT_EMAIL_SIGNUP.getValue(), str, true, true, 4), new C85673Xjp());
                return;
            }
            return;
        }
        if (o.LJ(str, "privacy-policy")) {
            V1B.LJLJJL(DialogC81625W1t.LIZIZ(mo49getActivity()));
        } else {
            if (!o.LJ(str, "terms-of-use")) {
                return;
            }
            V1B.LJLJJL(DialogC81625W1t.LIZJ(mo49getActivity()));
        }
    }

    public final void Rl(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZ(new O0X(AGJ.ACCOUNT_EMAIL_SIGNUP.getValue(), str, false, false, 28));
        }
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        ((C252949wI) _$_findCachedViewById(R.id.ctg)).LIZIZ(message);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        boolean LIZ = C63063Op1.LIZ();
        this.LLD = LIZ;
        if (LIZ) {
            _$_findCachedViewById(R.id.b_q).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.cts)).setText(getString(R.string.mq));
            ((C71897SJp) _$_findCachedViewById(R.id.cti)).setChecked(C85729Xkj.LIZ());
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("page_name", "email_signup_page");
            c35936E8m.LIZLLL("exp_name", "onboarding_collect_email_consent");
            c35936E8m.LIZLLL("text_type", "long_version");
            FMX.LJIIL("show_button_consent_check_box", c35936E8m.LIZ);
        } else {
            _$_findCachedViewById(R.id.b_q).setVisibility(8);
        }
        Ol(new ACListenerS31S0100000_11(this, 7), _$_findCachedViewById(R.id.ctc));
        Ol(new ACListenerS35S0100000_15(this, 62), _$_findCachedViewById(R.id.cti));
        ((C74090T5y) _$_findCachedViewById(R.id.ctf)).setTextWatcher(new C85663Xjf(this));
        C85837XmT.LIZ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.ctd), new ACListenerS35S0100000_15(this, 63), new ACListenerS35S0100000_15(this, 64), new ACListenerS35S0100000_15(this, 65));
        h0.LIZLLL(_$_findCachedViewById(R.id.ctd));
        RecyclerView emailSignUpDomainList = (RecyclerView) _$_findCachedViewById(R.id.cte);
        o.LJIIIIZZ(emailSignUpDomainList, "emailSignUpDomainList");
        EditText editText = ((C74090T5y) _$_findCachedViewById(R.id.ctf)).getEditText();
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        C6X6.LIZ(emailSignUpDomainList, editText, enterFrom, enterMethod, "");
        ((C74090T5y) _$_findCachedViewById(R.id.ctf)).getEditText().setNextFocusDownId(((C74090T5y) _$_findCachedViewById(R.id.ctf)).getEditText().getId());
        if (!C53203KuN.LIZ()) {
            return;
        }
        Rl("privacy-policy");
        Rl("terms-of-use");
    }
}
