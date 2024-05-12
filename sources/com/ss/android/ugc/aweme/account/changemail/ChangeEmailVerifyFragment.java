package com.ss.android.ugc.aweme.account.changemail;

import X.AbstractC73635Sv9;
import X.C221108m2;
import X.C62822Ol8;
import X.C69137RBl;
import X.C69141RBp;
import X.C73636SvA;
import X.C85621Xiz;
import X.C85631Xj9;
import X.C85712XkS;
import X.FMX;
import X.R9Q;
import X.RBV;
import Y.AfS63S0100000_11;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ChangeEmailVerifyFragment extends InputCodeFragmentV2 {
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 8));
    public final C62822Ol8 LLIIJI = C221108m2.LIZIZ(new C69141RBp(this));

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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        String string;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        if (lm()) {
            i = R.string.qw9;
        } else {
            i = R.string.dre;
        }
        c85712XkS.LJIIIIZZ = getString(i);
        if (lm()) {
            string = getString(R.string.qw8, getEmail());
        } else {
            string = getString(R.string.drf, getEmail());
        }
        c85712XkS.LJIIIZ = string;
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        c85621Xiz.LIZIZ(getEmail());
        c85621Xiz.LIZIZ = false;
        c85621Xiz.LJ = RBV.LIZ(this);
        return c85621Xiz;
    }

    public final String getEmail() {
        return (String) this.LLIIIZ.getValue();
    }

    public final boolean lm() {
        return ((Boolean) this.LLIIJI.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        if (lm()) {
            FMX.onEventV3("resend_code_email");
        }
        ChangeEmailFragment.LLI.invoke(this, getEmail(), "resend").LJIIIZ(new AfS63S0100000_11(this, 5)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        String email = getEmail();
        String LJI = RBV.LJI(this);
        boolean z = requireArguments().getBoolean("from_changePwd", false);
        Map LJI2 = C85631Xj9.LJI(this);
        o.LJIIIZ(email, "email");
        C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new R9Q(this, this, str, email, LJI, LJI2, z))).LJIIIZ(new C69137RBl(this)).LJIIIIZZ(new AfS63S0100000_11(this, 4)).LJIILL();
    }
}
