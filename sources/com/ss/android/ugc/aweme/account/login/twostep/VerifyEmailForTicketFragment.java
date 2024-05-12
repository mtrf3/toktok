package com.ss.android.ugc.aweme.account.login.twostep;

import X.C2068389v;
import X.C221108m2;
import X.C26338AVi;
import X.C35338Dtu;
import X.C52927Kpv;
import X.C62822Ol8;
import X.C69093R9t;
import X.C73525StN;
import X.C85144XbI;
import X.C85621Xiz;
import X.C85629Xj7;
import X.C85712XkS;
import Y.AfS63S0100000_11;
import Y.AfS67S0100000_15;
import Y.IDaS224S0100000_15;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VerifyEmailForTicketFragment extends InputCodeFragmentV2 {
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new C85629Xj7(this));
    public final C62822Ol8 LLIIJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 175));

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
        c85621Xiz.LIZIZ(getEmail());
        c85621Xiz.LIZIZ = false;
        c85621Xiz.LJ = false;
        return c85621Xiz;
    }

    public final String getEmail() {
        return (String) this.LLIIJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        lm("resend").LJIIIZ(new AfS67S0100000_15(this, 23)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        int i2;
        String str;
        C2068389v c2068389v;
        boolean LIZ = C52927Kpv.LIZ();
        C35338Dtu.LIZ();
        if (LIZ) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.ah9);
            tuxTextView.setTuxFont(13);
            tuxTextView.setGravity(17);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.ah8);
            tuxTextView2.setTuxFont(41);
            tuxTextView2.setGravity(17);
            int dimensionPixelSize = tuxTextView2.getResources().getDimensionPixelSize(R.dimen.g0);
            C26338AVi.LJI(tuxTextView2, Integer.valueOf(dimensionPixelSize), Integer.valueOf(tuxTextView2.getResources().getDimensionPixelSize(R.dimen.fq)), Integer.valueOf(dimensionPixelSize), 0, false, 16);
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        if (LIZ) {
            i = R.string.t9n;
        } else {
            i = R.string.dre;
        }
        c85712XkS.LJIIIIZZ = getString(i);
        Object[] objArr = new Object[1];
        String email = getEmail();
        if (LIZ) {
            objArr[0] = email;
            i2 = R.string.t7m;
        } else {
            objArr[0] = email;
            i2 = R.string.drf;
        }
        c85712XkS.LJIIIZ = getString(i2, objArr);
        if (LIZ) {
            str = getString(R.string.t9i);
        } else {
            str = " ";
        }
        c85712XkS.LIZ = str;
        c85712XkS.LJIILLIIL = LIZ;
        c85712XkS.LJIILIIL = false;
        if (LIZ) {
            c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_exclamation_mark_triangle_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.e7);
        } else {
            c2068389v = null;
        }
        c85712XkS.LJIILL = c2068389v;
        c85712XkS.LJI = true;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC80500Via
    public final void LLFZ() {
        super.LLFZ();
        if (((Boolean) this.LLIIIZ.getValue()).booleanValue()) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIJJI(enterFrom, enterMethod, "email");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        C69093R9t.LJJIIZ(this, this, str, 6, null).LJIIIZ(new AfS63S0100000_11(this, 9)).LJIILL();
    }

    public final C73525StN lm(String str) {
        return C69093R9t.LJIJI(this, this, getEmail(), 6, str, null, null, 224).LJFF(new IDaS224S0100000_15(this, 13));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lm("user_click").LJIILL();
        if (((Boolean) this.LLIIIZ.getValue()).booleanValue()) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIJ(enterFrom, enterMethod, "email");
        }
    }
}