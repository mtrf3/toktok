package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AGJ;
import X.C252709vu;
import X.C252949wI;
import X.C47261Igj;
import X.C53203KuN;
import X.C6X6;
import X.C74088T5w;
import X.C74090T5y;
import X.C85568Xi8;
import X.C85655XjX;
import X.C85656XjY;
import X.C85660Xjc;
import X.C85712XkS;
import X.C85837XmT;
import X.C9KF;
import X.C9W6;
import X.C9WD;
import X.DialogC81625W1t;
import X.InterfaceC34471Wx;
import X.InterfaceC69092R9s;
import X.O0X;
import X.RAS;
import X.V1B;
import Y.ACListenerS31S0100000_11;
import Y.ACListenerS35S0100000_15;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import o3.h0;
import yq4.a;

/* loaded from: classes16.dex */
public final class CombinedEmailSignupLoginFragment extends BaseI18nLoginFragment implements RAS, InterfaceC69092R9s, InterfaceC34471Wx {
    public long LL;
    public boolean LLD;
    public boolean LLF;
    public EditText LLFII;
    public EditText LLFZ;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public final long LJZL = System.currentTimeMillis();
    public boolean LLFF = true;
    public boolean LLFFF = true;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
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
        return R.layout.mi;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "CombineEmailLoginSignupStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        return new C85712XkS(null, null, false, null, null, true, "email_login_homepage", false, true, 108543);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void Rg() {
        if (this.LLFFF) {
            _$_findCachedViewById(R.id.cte).setVisibility(0);
        }
    }

    public final boolean Rl() {
        EditText editText = this.LLFII;
        if (editText != null) {
            String obj = editText.getText().toString();
            if (!TextUtils.isEmpty(obj) && Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
                return true;
            }
            return false;
        }
        o.LJIJI("emailInput");
        throw null;
    }

    public final void Vl() {
        boolean z = true;
        if (this.LLFFF) {
            C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.ctc);
            String string = getString(R.string.dpr);
            o.LJIIIIZZ(string, "getString(R.string.commo…ation_email_input_button)");
            c74088T5w.setText(string);
            C74088T5w c74088T5w2 = (C74088T5w) _$_findCachedViewById(R.id.ctc);
            EditText editText = this.LLFII;
            if (editText != null) {
                Editable text = editText.getText();
                o.LJIIIIZZ(text, "emailInput.text");
                if (text.length() <= 0) {
                    z = false;
                }
                c74088T5w2.setEnabled(z);
                return;
            }
            o.LJIJI("emailInput");
            throw null;
        }
        C74088T5w c74088T5w3 = (C74088T5w) _$_findCachedViewById(R.id.ctc);
        String string2 = getString(R.string.do2);
        o.LJIIIIZZ(string2, "getString(R.string.common_login_input_button)");
        c74088T5w3.setText(string2);
        C74088T5w c74088T5w4 = (C74088T5w) _$_findCachedViewById(R.id.ctc);
        EditText editText2 = this.LLFZ;
        if (editText2 != null) {
            Editable text2 = editText2.getText();
            o.LJIIIIZZ(text2, "passwordInput.text");
            if (text2.length() <= 0) {
                z = false;
            }
            c74088T5w4.setEnabled(z);
            return;
        }
        o.LJIJI("passwordInput");
        throw null;
    }

    public final void Xl() {
        if (!this.LLFFF) {
            return;
        }
        this.LLFFF = false;
        Ql();
        _$_findCachedViewById(R.id.ctb).setVisibility(0);
        _$_findCachedViewById(R.id.ct7).setVisibility(0);
        _$_findCachedViewById(R.id.ctd).setVisibility(8);
        _$_findCachedViewById(R.id.cte).setVisibility(8);
        Vl();
        if (C9W6.LIZ()) {
            EditText editText = this.LLFZ;
            if (editText != null) {
                C9WD.LIZIZ(editText);
            } else {
                o.LJIJI("passwordInput");
                throw null;
            }
        } else {
            EditText editText2 = this.LLFZ;
            if (editText2 != null) {
                editText2.requestFocus();
            } else {
                o.LJIJI("passwordInput");
                throw null;
            }
        }
        String string = getString(R.string.dq8);
        o.LJIIIIZZ(string, "getString(R.string.commo…gistration_panel_entry_2)");
        Sl(string);
    }

    @Override // X.InterfaceC69092R9s
    public final String getEmail() {
        EditText editText = this.LLFII;
        if (editText != null) {
            String obj = editText.getText().toString();
            if (C47261Igj.LJIILLIIL(obj)) {
                return obj;
            }
            return "";
        }
        o.LJIJI("emailInput");
        throw null;
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

    public final void Ql() {
        ((C252949wI) _$_findCachedViewById(R.id.cta)).LIZ();
        ((C252949wI) _$_findCachedViewById(R.id.ctg)).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.LLFII;
        if (editText != null) {
            KeyboardUtils.LIZIZ(editText);
            EditText editText2 = this.LLFZ;
            if (editText2 != null) {
                KeyboardUtils.LIZIZ(editText2);
                _$_clearFindViewByIdCache();
                return;
            } else {
                o.LJIJI("passwordInput");
                throw null;
            }
        }
        o.LJIJI("emailInput");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Vl();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLD = false;
        this.LLF = false;
    }

    @Override // X.RAS
    public final boolean o0() {
        return this.LLFF;
    }

    public final void Sl(String str) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof PhoneEmailSignUpFragment)) {
            return;
        }
        C252709vu c252709vu = (C252709vu) ((BaseI18nLoginFragment) parentFragment)._$_findCachedViewById(R.id.aha);
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = str;
        c252709vu.LJIILLIIL(c9kf);
    }

    public final void Tl(String str) {
        if (C53203KuN.LIZ()) {
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.ACCOUNT_EMAIL_SIGNUP.getValue(), str, true, true, 4), new C85660Xjc());
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

    public final void Wl(boolean z) {
        if (this.LLFFF && !z) {
            return;
        }
        this.LLFFF = true;
        Ql();
        _$_findCachedViewById(R.id.ctb).setVisibility(8);
        _$_findCachedViewById(R.id.ct7).setVisibility(8);
        _$_findCachedViewById(R.id.ctd).setVisibility(0);
        Vl();
        EditText editText = this.LLFII;
        if (editText != null) {
            editText.requestFocus();
            String string = getString(R.string.di4);
            o.LJIIIIZZ(string, "getString(R.string.combine_login_signup_panel_1)");
            Sl(string);
            return;
        }
        o.LJIJI("emailInput");
        throw null;
    }

    public final void Yl(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZ(new O0X(AGJ.ACCOUNT_EMAIL_SIGNUP.getValue(), str, false, false, 28));
        }
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        if (this.LLFFF) {
            ((C252949wI) _$_findCachedViewById(R.id.ctg)).LIZIZ(message);
        } else {
            ((C252949wI) _$_findCachedViewById(R.id.cta)).LIZIZ(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLFZ = ((C74090T5y) _$_findCachedViewById(R.id.ct_)).getEditText();
        this.LLFII = ((C74090T5y) _$_findCachedViewById(R.id.ctf)).getEditText();
        Wl(true);
        Ol(new ACListenerS31S0100000_11(this, 6), _$_findCachedViewById(R.id.ctc));
        EditText editText = this.LLFII;
        if (editText != null) {
            editText.addTextChangedListener(new C85656XjY(this));
            EditText editText2 = this.LLFZ;
            if (editText2 != null) {
                editText2.setInputType(129);
                editText2.setTypeface(Typeface.DEFAULT);
                editText2.setTransformationMethod(new PasswordTransformationMethod());
                editText2.addTextChangedListener(new C85655XjX(this));
                View emailLoginForgotPassword = _$_findCachedViewById(R.id.ct7);
                o.LJIIIIZZ(emailLoginForgotPassword, "emailLoginForgotPassword");
                C85568Xi8.LIZ(emailLoginForgotPassword, this, "email_login_homepage", false);
                C85837XmT.LIZ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.ctd), new ACListenerS35S0100000_15(this, 56), new ACListenerS35S0100000_15(this, 57), new ACListenerS35S0100000_15(this, 58));
                h0.LIZLLL(_$_findCachedViewById(R.id.ctd));
                RecyclerView emailSignUpDomainList = (RecyclerView) _$_findCachedViewById(R.id.cte);
                o.LJIIIIZZ(emailSignUpDomainList, "emailSignUpDomainList");
                EditText editText3 = this.LLFII;
                if (editText3 != null) {
                    String enterFrom = getEnterFrom();
                    o.LJIIIIZZ(enterFrom, "enterFrom");
                    String enterMethod = getEnterMethod();
                    o.LJIIIIZZ(enterMethod, "enterMethod");
                    C6X6.LIZ(emailSignUpDomainList, editText3, enterFrom, enterMethod, "");
                    if (!C53203KuN.LIZ()) {
                        return;
                    }
                    Yl("privacy-policy");
                    Yl("terms-of-use");
                    return;
                }
                o.LJIJI("emailInput");
                throw null;
            }
            o.LJIJI("passwordInput");
            throw null;
        }
        o.LJIJI("emailInput");
        throw null;
    }
}
