package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C03880Dg;
import X.C252949wI;
import X.C35936E8m;
import X.C40450FuA;
import X.C47261Igj;
import X.C65300Pk0;
import X.C68988R5s;
import X.C69093R9t;
import X.C74088T5w;
import X.C85659Xjb;
import X.C85712XkS;
import X.C9W6;
import X.C9WD;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.InterfaceC34471Wx;
import X.InterfaceC69092R9s;
import X.RAS;
import X.RBV;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EmailPasswordLoginFragment extends BaseI18nLoginFragment implements View.OnClickListener, RAS, InterfaceC69092R9s, InterfaceC34471Wx {
    public EditText LJZL;
    public EditText LL;
    public boolean LLF;
    public boolean LLFII;
    public C68988R5s LLFZ;
    public boolean LLI;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public final long LLD = System.currentTimeMillis();
    public String LLFF = "";
    public boolean LLFFF = true;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIFFJFJJ;
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
        return R.layout.og;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        if (this.LLF) {
            return new C85712XkS(getString(R.string.do2), null, false, getString(R.string.dpp), getString(R.string.dpo), false, "email_sign_up_to_login_enter_password_page", false, true, 109822);
        }
        return new C85712XkS(null, null, false, null, null, false, "email_login_homepage", false, true, 110591);
    }

    public final void Ql() {
        EditText editText;
        EditText editText2 = this.LJZL;
        if (editText2 != null) {
            if (TextUtils.isEmpty(editText2.getText())) {
                editText = this.LJZL;
                if (editText == null) {
                    o.LJIJI("emailInput");
                    throw null;
                }
            } else {
                editText = this.LL;
                if (editText == null) {
                    o.LJIJI("passwordInput");
                    throw null;
                }
            }
            if (C9W6.LIZ()) {
                C9WD.LIZIZ(editText);
                return;
            } else {
                editText.requestFocus();
                return;
            }
        }
        o.LJIJI("emailInput");
        throw null;
    }

    @Override // X.InterfaceC69092R9s
    public final String getEmail() {
        EditText editText = this.LJZL;
        if (editText != null) {
            return editText.getText().toString();
        }
        o.LJIJI("emailInput");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.ct9);
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.ct9);
        if (c74088T5w != null) {
            c74088T5w.LIZIZ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.LJZL;
        if (editText != null) {
            KeyboardUtils.LIZIZ(editText);
            EditText editText2 = this.LL;
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
        if (this.LLF) {
            Ql();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLI = false;
    }

    @Override // X.RAS
    public final boolean o0() {
        return this.LLFFF;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Boolean bool;
        boolean safe;
        this.LLFFF = false;
        C40450FuA.LIZ(getContext());
        EditText editText = this.LJZL;
        String str = null;
        if (editText != null) {
            String obj = editText.getText().toString();
            EditText editText2 = this.LL;
            if (editText2 != null) {
                String obj2 = editText2.getText().toString();
                boolean LJIILLIIL = C47261Igj.LJIILLIIL(obj);
                if (getArguments() != null) {
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        bool = Boolean.valueOf(arguments.getBoolean("email_should_add_email", false));
                    } else {
                        bool = null;
                    }
                } else {
                    bool = Boolean.FALSE;
                }
                C68988R5s c68988R5s = this.LLFZ;
                if (c68988R5s == null) {
                    safe = false;
                } else {
                    safe = c68988R5s.getSafe();
                }
                if (xl() == EnumC69116RAq.HISTORY_LOGIN && !o.LJ(obj, this.LLFF)) {
                    this.LJLJL = "click_login";
                }
                String str2 = "handle";
                if (xl() == EnumC69116RAq.RECOVER_ACCOUNT) {
                    o.LJI(bool);
                    if (bool.booleanValue() && safe) {
                        if (LJIILLIIL) {
                            str2 = "email";
                        }
                        C68988R5s c68988R5s2 = this.LLFZ;
                        if (c68988R5s2 != null) {
                            str = c68988R5s2.getTicket();
                        }
                        C69093R9t.LJIIL(this, this, obj, obj2, str2, str).LJIIIZ(C85659Xjb.LJLIL).LJIILL();
                        C35936E8m c35936E8m = new C35936E8m();
                        c35936E8m.LIZLLL("platform", "email");
                        c35936E8m.LIZLLL("enter_method", getEnterMethod());
                        c35936E8m.LIZLLL("enter_from", getEnterFrom());
                        c35936E8m.LIZLLL("login_panel_type", wl());
                        c35936E8m.LIZIZ(System.currentTimeMillis() - this.LLD, "stay_time");
                        FMX.LJIIL("phone_email_click_next", c35936E8m.LIZ);
                        return;
                    }
                }
                if (LJIILLIIL) {
                    str2 = "email";
                }
                C69093R9t.LJIIJJI(this, this, obj, obj2, str2).LJIILL();
                C35936E8m c35936E8m2 = new C35936E8m();
                c35936E8m2.LIZLLL("platform", "email");
                c35936E8m2.LIZLLL("enter_method", getEnterMethod());
                c35936E8m2.LIZLLL("enter_from", getEnterFrom());
                c35936E8m2.LIZLLL("login_panel_type", wl());
                c35936E8m2.LIZIZ(System.currentTimeMillis() - this.LLD, "stay_time");
                FMX.LJIIL("phone_email_click_next", c35936E8m2.LIZ);
                return;
            }
            o.LJIJI("passwordInput");
            throw null;
        }
        o.LJIJI("emailInput");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String string;
        C68988R5s c68988R5s;
        Serializable serializable;
        super.onCreate(bundle);
        EnumC69116RAq xl = xl();
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.RECOVER_ACCOUNT;
        Boolean bool = null;
        if (xl == enumC69116RAq) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("recover_account_data");
            } else {
                serializable = null;
            }
            this.LLFZ = (C68988R5s) serializable;
        }
        boolean z2 = false;
        if (Al() == EnumC69113RAn.EMAIL_PASSWORD_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        this.LLF = z;
        if (z) {
            this.LLFF = RBV.LIZIZ(this);
            return;
        }
        if (getArguments() != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                bool = Boolean.valueOf(arguments2.getBoolean("email_should_add_email", false));
            }
        } else {
            bool = Boolean.FALSE;
        }
        C68988R5s c68988R5s2 = this.LLFZ;
        if (c68988R5s2 != null) {
            z2 = c68988R5s2.getSafe();
        }
        if (xl() == enumC69116RAq) {
            o.LJI(bool);
            if (bool.booleanValue()) {
                if (!z2 || (c68988R5s = this.LLFZ) == null || c68988R5s.getEmail() == null) {
                    return;
                }
                C68988R5s c68988R5s3 = this.LLFZ;
                o.LJI(c68988R5s3);
                this.LLFF = String.valueOf(c68988R5s3.getEmail());
                return;
            }
        }
        Bundle arguments3 = getArguments();
        String str = "";
        if (arguments3 != null && (string = arguments3.getString("auto_fill_account_name", "")) != null) {
            str = string;
        }
        this.LLFF = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "4228838584855324165");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/EmailPasswordLoginFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/EmailPasswordLoginFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                Ql();
            } else {
                this.LLFII = true;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/EmailPasswordLoginFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        C252949wI c252949wI;
        o.LJIIIZ(message, "message");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ct8);
        if (_$_findCachedViewById != null && (c252949wI = (C252949wI) _$_findCachedViewById.findViewById(R.id.eoi)) != null) {
            c252949wI.LJLIL.setVisibility(0);
            c252949wI.LJLIL.setBackgroundColor(c252949wI.LJLJJLL);
            c252949wI.LJLILLLLZI.setVisibility(8);
        }
        C252949wI c252949wI2 = (C252949wI) _$_findCachedViewById(R.id.cta);
        if (c252949wI2 != null) {
            c252949wI2.LIZIZ(message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        if (r7 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailPasswordLoginFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
