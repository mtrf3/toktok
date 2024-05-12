package com.ss.android.ugc.aweme.account.unbind;

import X.AbstractC66965QPx;
import X.C01R;
import X.C10K;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C62822Ol8;
import X.C69093R9t;
import X.C77266UUc;
import X.C82544WaS;
import X.C85621Xiz;
import X.C85631Xj9;
import X.C85642XjK;
import X.C85712XkS;
import X.EFJ;
import X.EnumC85633XjB;
import X.R41;
import X.RBV;
import X.T5U;
import X.X1D;
import X.XJ4;
import Y.ACListenerS35S0100000_15;
import Y.AfS67S0100000_15;
import Y.AgS131S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.unbind.UnbindResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class UnbindInputCodeFragment extends InputCodeFragmentV2 {
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 210));
    public final IAccountBindingsService LLIIJI = AccountBindingsService.LIZJ();

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String Gl() {
        return "UnbindInputCodeFragment";
    }

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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        Map LJI = C85631Xj9.LJI(this);
        if (C85642XjK.LIZJ(this)) {
            C85642XjK.LJI(this, "resend", null, LJI, new AqS165S0100000_15(this, 211), 4);
        } else {
            C85642XjK.LJ(this, "resend", null, LJI, new AqS165S0100000_15(this, 212), 4);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LJIIIIZZ = getString(R.string.tfu);
        if (C85642XjK.LIZIZ(this)) {
            i = R.string.tft;
        } else {
            i = R.string.tf_;
        }
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-phoneOrEmail>(...)");
        c85712XkS.LJIIIZ = getString(i, value);
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        Object value = this.LLIIIZ.getValue();
        o.LJIIIIZZ(value, "<get-phoneOrEmail>(...)");
        c85621Xiz.LIZ = (String) value;
        c85621Xiz.LIZIZ = C85642XjK.LIZJ(this);
        c85621Xiz.LJ = RBV.LIZ(this);
        return c85621Xiz;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, X.InterfaceC80500Via
    public final void LLFZ() {
        EnumC85633XjB enumC85633XjB;
        super.LLFZ();
        if (C85642XjK.LIZJ(this)) {
            enumC85633XjB = EnumC85633XjB.SMS;
        } else {
            enumC85633XjB = EnumC85633XjB.EMAIL;
        }
        Vl(enumC85633XjB);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        if (C85642XjK.LIZJ(this)) {
            C69093R9t.LJJIIJZLJL(this, this, str, 22, C85631Xj9.LJI(this)).LJIIIZ(new AfS67S0100000_15(this, 53)).LJIIIIZZ(new AfS67S0100000_15(this, 54)).LJIILL();
        } else {
            C69093R9t.LJJIIZ(this, this, str, 6, C85631Xj9.LJI(this)).LJIIIZ(new AfS67S0100000_15(this, 51)).LJIIIIZZ(new AfS67S0100000_15(this, 52)).LJIILL();
        }
    }

    public final void lm(String str) {
        IUnbindApi.LIZ.getClass();
        IUnbindApi iUnbindApi = XJ4.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EFJ.LIZJ);
        LIZ.append("/passport/email/unbind/");
        String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(LIZLLL, "getCsrfToken(CommonConst…X_SI + PATH_UNBIND_EMAIL)");
        iUnbindApi.unbindEmail(str, LIZLLL).LJ(new AgS131S0100000_15(this, 4), C10K.LJIIIIZZ, null);
    }

    public final void mm(C10K<UnbindResponse> c10k) {
        if (!C82544WaS.LJ(c10k) || c10k.LJIIJJI().data == null) {
            new C26045AKb(this).LJIIIIZZ(R.string.gqr);
            return;
        }
        UnbindResponse.Data data = c10k.LJIIJJI().data;
        o.LJI(data);
        if (data.errorCode == 0) {
            User LIZJ = R41.LIZJ();
            if (C85642XjK.LIZIZ(this)) {
                LIZJ.setPhoneBinded(false);
                LIZJ.setBindPhone("");
            } else {
                LIZJ.setHasEmail(false);
                LIZJ.setEmail("");
                LIZJ.setEmailVerified(false);
            }
            C77266UUc c77266UUc = C77266UUc.LIZIZ;
            c77266UUc.LJIJ().LIZJ();
            c77266UUc.LJIJ().LIZIZ(System.currentTimeMillis());
            Bundle bundle = new Bundle();
            bundle.putBoolean("unbind_success", true);
            bundle.putInt("unbind_type", xl().getValue());
            Dl(bundle);
            boolean LIZIZ = C85642XjK.LIZIZ(this);
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85631Xj9.LJIIJ(this, LIZIZ, enterFrom, enterMethod, String.valueOf(data.errorCode), 1, true);
            return;
        }
        Bundle LIZ = C01R.LIZ("unbind_success", false);
        LIZ.putInt("unbind_type", xl().getValue());
        Dl(LIZ);
        boolean LIZIZ2 = C85642XjK.LIZIZ(this);
        String enterFrom2 = getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod2 = getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C85631Xj9.LJIIJ(this, LIZIZ2, enterFrom2, enterMethod2, String.valueOf(data.errorCode), 0, true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String string;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if ((!C85642XjK.LIZJ(this) && !C85642XjK.LIZ(this)) || this.LLIIJI.LIZIZ()) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.b9_);
            if (!this.LLIIJI.LIZIZ() || (!((ArrayList) C85631Xj9.LIZLLL(this)).isEmpty())) {
                i = 0;
            } else {
                i = 8;
            }
            tuxTextView.setVisibility(i);
            tuxTextView.setTuxFont(41);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 86));
            String string2 = getString(R.string.tic);
            o.LJIIIIZZ(string2, "getString(R.string.use_phone)");
            if (this.LLIIJI.LIZIZ()) {
                string = getString(R.string.hy5);
            } else {
                string = getString(R.string.cgu, string2);
            }
            o.LJIIIIZZ(string, "if (accountBindingsServi…usePhoneString)\n        }");
            SpannableString spannableString = new SpannableString(string);
            if (this.LLIIJI.LIZIZ()) {
                spannableString.setSpan(new T5U(43, true), 0, string.length(), 33);
            } else {
                int LJJLIIIJL = s.LJJLIIIJL(string, string2, 0, false, 6);
                spannableString.setSpan(new T5U(43, true), LJJLIIIJL, string2.length() + LJJLIIIJL, 33);
            }
            tuxTextView.setText(spannableString);
        }
        Tl();
    }
}
