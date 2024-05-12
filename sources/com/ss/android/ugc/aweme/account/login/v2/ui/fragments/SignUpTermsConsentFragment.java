package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.ActivityC45651qj;
import X.C234529Ii;
import X.C252709vu;
import X.C35936E8m;
import X.C63093OpV;
import X.C69125RAz;
import X.C85712XkS;
import X.C8VV;
import X.EnumC69113RAn;
import X.FMX;
import X.InterfaceC65350Pko;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lobby.auth.AuthResult;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public final class SignUpTermsConsentFragment extends BaseI18nLoginFragment {
    public String LL;
    public boolean LLD;
    public boolean LLF;
    public int LLFF;
    public C63093OpV LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public int LJZL = EnumC69113RAn.TERMS_CONSENT_SIGN_UP.getValue();
    public String LLFFF = "";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        return null;
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
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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
        return R.layout.mv;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!this.LLD || this.LLF) {
            return false;
        }
        this.LLFF = 0;
        Ql();
        return true;
    }

    public final void Ql() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.FINISH.getValue());
        arguments.putInt("result_code", this.LLFF);
        arguments.putInt("current_page", EnumC69113RAn.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
        rh(arguments);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String string;
        int value;
        AuthResult authResult;
        String str2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (Al() == EnumC69113RAn.TERMS_CONSENT_SIGN_UP_THIRD_PARTY) {
            z = true;
        } else {
            z = false;
        }
        this.LLD = z;
        String str3 = "";
        if (z) {
            if (arguments != null && (authResult = (AuthResult) arguments.getParcelable("key_auth_result")) != null && (str2 = authResult.mProviderId) != null) {
                str3 = str2;
            }
            this.LL = str3;
            int value2 = EnumC69113RAn.THIRD_PARTY_AGE_GATE.getValue();
            if (arguments != null) {
                value = arguments.getInt("previous_page", EnumC69113RAn.NONE.getValue());
            } else {
                value = EnumC69113RAn.NONE.getValue();
            }
            if (value2 == value) {
                z2 = true;
            }
            this.LLF = z2;
        } else {
            this.LJZL = Al().getValue();
            if (arguments != null && (string = arguments.getString("sms_code_key", "")) != null) {
                str3 = string;
            }
            this.LLFFF = str3;
            if (this.LJZL == EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER.getValue()) {
                str = "sms_verification";
            } else {
                str = "phone";
            }
            this.LL = str;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", getEnterFrom());
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("platform", this.LL);
        FMX.LJIIL("register_terms_show", c35936E8m.LIZ);
        this.LLFII = new C63093OpV(a.LJIJI().LIZJ(), new AqS177S0100000_11(this, 14), new AqS177S0100000_11(this, 15), new AqS177S0100000_11(this, 16), new AqS177S0100000_11(this, 17), new C69125RAz(this));
    }

    public final void Rl(String str, boolean z) {
        int i;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", getEnterFrom());
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("platform", this.LL);
        c35936E8m.LIZLLL("content", str);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c35936E8m.LIZ(i, "click_type");
        FMX.LJIIL("register_terms_click", c35936E8m.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (mo49getActivity() instanceof SignUpOrLoginActivity) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
            ((SignUpOrLoginActivity) mo49getActivity).LJLJI = 1;
        }
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.l_2);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ(new AqS161S0100000_11(this, 33));
        c252709vu.LIZJ(LIZJ);
        c252709vu.LJIILJJIL(false);
        a.LIZ.getClass();
        InterfaceC65350Pko<? extends UISlotAssem> LIZIZ = a.LJIIIIZZ().LIZIZ();
        if (LIZIZ != null) {
            C8VV.LIZ(this, false, new AqS134S0200000_3(this, (SignUpTermsConsentFragment) LIZIZ, (InterfaceC65350Pko<? extends UISlotAssem>) 33));
        }
    }
}
