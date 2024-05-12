package com.ss.android.ugc.aweme.account.verify;

import X.C221108m2;
import X.C52927Kpv;
import X.C62822Ol8;
import X.C69093R9t;
import X.C69138RBm;
import X.C69143RBr;
import X.C69146RBu;
import X.C69147RBv;
import X.C85621Xiz;
import X.C85712XkS;
import X.EnumC69116RAq;
import X.FMX;
import X.RBV;
import Y.AfS63S0100000_11;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class VerifyEmailCodeFragment extends InputCodeFragmentV2 {
    public final C62822Ol8 LLIIJLIL;
    public final Map<Integer, View> LLIIL = new LinkedHashMap();
    public final String LLIIIZ = "email_verify_success";
    public final C62822Ol8 LLIIJI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 47));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public VerifyEmailCodeFragment() {
        C221108m2.LIZIZ(new C69146RBu(this));
        this.LLIIJLIL = C221108m2.LIZIZ(new C69147RBv(this));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String string;
        String string2;
        String str = null;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        String str2 = null;
        if (lm()) {
            string = getString(R.string.qw9);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("page");
            }
            if (o.LJ("twosv_setup", str) && C52927Kpv.LIZ()) {
                string = getString(R.string.t6z);
            } else {
                string = getString(R.string.dre);
            }
        }
        c85712XkS.LJIIIIZZ = string;
        if (lm()) {
            string2 = getString(R.string.qw8, getEmail());
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str2 = arguments2.getString("page");
            }
            if (o.LJ("twosv_setup", str2) && C52927Kpv.LIZ()) {
                string2 = getString(R.string.t7m, getEmail());
            } else {
                string2 = getString(R.string.drf, getEmail());
            }
        }
        c85712XkS.LJIIIZ = string2;
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        c85621Xiz.LIZ = getEmail();
        c85621Xiz.LIZIZ = false;
        c85621Xiz.LJ = RBV.LIZ(this);
        return c85621Xiz;
    }

    public final String getEmail() {
        Object value = this.LLIIJI.getValue();
        o.LJIIIIZZ(value, "<get-email>(...)");
        return (String) value;
    }

    public final boolean lm() {
        return ((Boolean) this.LLIIJLIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        if (lm()) {
            FMX.onEventV3("resend_code_email");
        }
        ConfirmEmailFragment.LLFZ.invoke(this, this, getEmail(), "resend").LJIIIZ(new AfS63S0100000_11(this, 42)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        C69093R9t.LJJIIZ(this, this, str, C69143RBr.LIZ(this), null).LJIIIZ(new C69138RBm(this)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (xl() == EnumC69116RAq.MODIFY_PHONE) {
            ConfirmEmailFragment.LLFZ.invoke(this, this, getEmail(), "auto_system").LJIIIZ(new AfS63S0100000_11(this, 41)).LJIILL();
        }
    }
}
