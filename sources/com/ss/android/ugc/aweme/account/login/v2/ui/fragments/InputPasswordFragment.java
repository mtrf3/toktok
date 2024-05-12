package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C252949wI;
import X.C35936E8m;
import X.C68988R5s;
import X.C74088T5w;
import X.C74090T5y;
import X.C85568Xi8;
import X.C85641XjJ;
import X.C85712XkS;
import X.C9WD;
import X.EnumC69116RAq;
import X.FMX;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InputPasswordFragment extends BaseI18nLoginFragment {
    public EditText LJZL;
    public C68988R5s LL;
    public boolean LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();

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
        return R.layout.ok;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        boolean z;
        if (!this.LLD && xl() != EnumC69116RAq.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        return new C85712XkS(" ", null, false, getString(R.string.doq), " ", false, "phone_login_enter_password_page", z, false, 118014);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo4)).LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo4)).LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        EditText editText = this.LJZL;
        if (editText != null) {
            C9WD.LIZIZ(editText);
        } else {
            o.LJIJI("passwordInput");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("enter_type", this.LJLJL);
        FMX.LJIIL("phone_login_enter_password", c35936E8m.LIZ);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("recover_mobile_code", false);
        }
        this.LLD = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("recover_account_data");
        } else {
            serializable = null;
        }
        this.LL = (C68988R5s) serializable;
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.eoi);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = ((C74090T5y) _$_findCachedViewById(R.id.eoh)).getEditText();
        this.LJZL = editText;
        if (editText != null) {
            editText.setHint(getString(R.string.ie5));
            editText.addTextChangedListener(new C85641XjJ(this));
            if (xl() == EnumC69116RAq.RECOVER_ACCOUNT) {
                z = true;
            } else {
                z = false;
            }
            View inputPasswordForgot = _$_findCachedViewById(R.id.eo2);
            o.LJIIIIZZ(inputPasswordForgot, "inputPasswordForgot");
            C85712XkS c85712XkS = this.LJLZ;
            o.LJI(c85712XkS);
            String str = c85712XkS.LJIIL;
            o.LJI(str);
            C85568Xi8.LIZ(inputPasswordForgot, this, str, z);
            Ol(new ACListenerS35S0100000_15(this, 68), _$_findCachedViewById(R.id.eo4));
            return;
        }
        o.LJIJI("passwordInput");
        throw null;
    }
}
