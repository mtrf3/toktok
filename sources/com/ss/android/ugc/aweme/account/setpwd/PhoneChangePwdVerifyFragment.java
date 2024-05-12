package com.ss.android.ugc.aweme.account.setpwd;

import X.C221108m2;
import X.C35338Dtu;
import X.C62822Ol8;
import X.C69093R9t;
import X.C73525StN;
import X.C85621Xiz;
import X.C85712XkS;
import Y.AfS63S0100000_11;
import Y.IDaS220S0100000_11;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;

/* loaded from: classes12.dex */
public final class PhoneChangePwdVerifyFragment extends InputCodeFragmentV2 {
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 45));
    public final C62822Ol8 LLIIJI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 44));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJLIL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        c85621Xiz.LIZIZ((String) this.LLIIIZ.getValue());
        c85621Xiz.LIZIZ = true;
        c85621Xiz.LIZLLL = Boolean.FALSE;
        c85621Xiz.LJ = false;
        return c85621Xiz;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        lm("resend").LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        int i2;
        String str;
        if (C35338Dtu.LIZ()) {
            i = R.string.dqn;
        } else {
            i = R.string.drl;
        }
        if (C35338Dtu.LIZ()) {
            i2 = R.string.qvd;
        } else {
            i2 = R.string.qvf;
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LJIIIIZZ = getString(i);
        boolean z = true;
        c85712XkS.LJIIIZ = getString(i2, this.LLIIIZ.getValue());
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        if (this.LLIIJI.getValue() != null) {
            str = getString(R.string.cm7);
        } else {
            str = "";
        }
        c85712XkS.LJII = str;
        if (!t1.LJI() && this.LLIIJI.getValue() != null) {
            z = false;
        }
        c85712XkS.LJFF = z;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object value = this.LLIIJI.getValue();
        if (value != null) {
            linkedHashMap.put("conditional_login_ticket", value);
        }
        C69093R9t.LJJIIJZLJL(this, this, str, 13, linkedHashMap).LJIIIZ(new AfS63S0100000_11(this, 37)).LJIILL();
    }

    public final C73525StN lm(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object value = this.LLIIJI.getValue();
        if (value != null) {
            linkedHashMap.put("conditional_login_ticket", value);
        }
        return C69093R9t.LJIL(this, this, (String) this.LLIIIZ.getValue(), xl(), Al(), "", str, null, linkedHashMap).LJFF(new IDaS220S0100000_11(this, 6));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lm("user_click").LJIILL();
    }
}
