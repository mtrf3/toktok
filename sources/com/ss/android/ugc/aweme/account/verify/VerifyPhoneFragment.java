package com.ss.android.ugc.aweme.account.verify;

import X.C221108m2;
import X.C35338Dtu;
import X.C62822Ol8;
import X.C63144OqK;
import X.C69093R9t;
import X.C85621Xiz;
import X.C85712XkS;
import X.RBV;
import X.RCH;
import Y.AfS63S0100000_11;
import Y.IDaS220S0100000_11;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class VerifyPhoneFragment extends InputCodeFragmentV2 {
    public static final /* synthetic */ int LLIIJLIL = 0;
    public final Map<Integer, View> LLIIJI = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 48));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJI;
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
        c85621Xiz.LIZIZ = true;
        c85621Xiz.LIZIZ((String) this.LLIIIZ.getValue());
        c85621Xiz.LJ = RBV.LIZ(this);
        return c85621Xiz;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        RCH.LIZ(this, (String) this.LLIIIZ.getValue(), "resend").LJFF(new IDaS220S0100000_11(this, 3)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        if (C35338Dtu.LIZ()) {
            i = R.string.dqn;
        } else {
            i = R.string.drl;
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LJIIIIZZ = getString(i);
        Locale locale = Locale.US;
        String string = getString(R.string.dql);
        o.LJIIIIZZ(string, "getString(R.string.commo…istration_phone_sms_text)");
        c85712XkS.LJIIIZ = C63144OqK.LIZIZ(new Object[]{this.LLIIIZ.getValue()}, 1, locale, string, "format(locale, format, *args)");
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        C69093R9t.LJJIIJZLJL(this, this, str, 22, null).LJIIIZ(new AfS63S0100000_11(this, 43)).LJIILL();
    }
}
