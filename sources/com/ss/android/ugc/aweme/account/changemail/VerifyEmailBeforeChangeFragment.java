package com.ss.android.ugc.aweme.account.changemail;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C69093R9t;
import X.C73525StN;
import X.C85621Xiz;
import X.C85631Xj9;
import X.C85712XkS;
import X.EnumC69113RAn;
import X.EnumC85633XjB;
import X.R41;
import X.RBV;
import Y.ACListenerS31S0100000_11;
import Y.AfS63S0100000_11;
import Y.IDaS220S0100000_11;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class VerifyEmailBeforeChangeFragment extends InputCodeFragmentV2 {
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 9));
    public final IAccountBindingsService LLIIJI = AccountBindingsService.LIZJ();

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
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LJIIIIZZ = getString(R.string.dre);
        c85712XkS.LJIIIZ = getString(R.string.drf, this.LLIIIZ.getValue());
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        c85621Xiz.LIZIZ((String) this.LLIIIZ.getValue());
        c85621Xiz.LIZIZ = false;
        c85621Xiz.LJ = false;
        return c85621Xiz;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        mm("resend").LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC80500Via
    public final void LLFZ() {
        super.LLFZ();
        Vl(EnumC85633XjB.EMAIL);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        C69093R9t.LJJIIZ(this, this, str, 6, C85631Xj9.LJI(this)).LJIIIZ(new AfS63S0100000_11(this, 6)).LJIIIIZZ(new AfS63S0100000_11(this, 7)).LJIILL();
    }

    public final void lm(boolean z) {
        RBV.LJIIIZ(this, z);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        Bundle bundle = new Bundle(arguments);
        RBV.LJIIJ(bundle, "");
        bundle.putInt("next_page", EnumC69113RAn.VERIFY_PHONE.getValue());
        bundle.putInt("next_next_page", EnumC69113RAn.INPUT_EMAIL_CHANGE.getValue());
        String bindPhone = R41.LIZJ().getBindPhone();
        o.LJIIIIZZ(bindPhone, "getCurUser().bindPhone");
        RBV.LJIILIIL(bundle, bindPhone);
        rh(bundle);
    }

    public final C73525StN mm(String str) {
        return C69093R9t.LJIJI(this, this, (String) this.LLIIIZ.getValue(), 6, str, C85631Xj9.LJI(this), null, 192).LJFF(new IDaS220S0100000_11(this, 4));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (RBV.LIZ(this)) {
            RBV.LJIIIZ(this, false);
        } else {
            mm("auto_system").LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.b9_);
        if (!this.LLIIJI.LIZ() || (!((ArrayList) C85631Xj9.LIZLLL(this)).isEmpty())) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
        TextView textView = (TextView) _$_findCachedViewById(R.id.b9_);
        if (this.LLIIJI.LIZ()) {
            i2 = R.string.hy5;
        } else {
            i2 = R.string.qvh;
        }
        textView.setText(getString(i2));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.b9_), new ACListenerS31S0100000_11(this, 1));
        Tl();
    }
}
