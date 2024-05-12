package com.ss.android.ugc.aweme.account.changemail;

import X.AnonymousClass636;
import X.C1JD;
import X.C221108m2;
import X.C35936E8m;
import X.C47261Igj;
import X.C62822Ol8;
import X.C69134RBi;
import X.C69135RBj;
import X.C69140RBo;
import X.C7GR;
import X.C85712XkS;
import X.C85724Xke;
import X.EP5;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.RBV;
import Y.ACListenerS35S0100000_15;
import Y.AfS67S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ChangeEmailFragment extends CommonInputEmailFragment {
    public static final C69140RBo LLI = C69140RBo.LJLIL;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final IAccountBindingsService LLFFF = AccountBindingsService.LIZJ();
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new C85724Xke(this));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        String string;
        String str = null;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        if (em()) {
            i = R.string.qwg;
        } else {
            i = R.string.qvi;
        }
        c85712XkS.LJIIIIZZ = getString(i);
        if (em()) {
            string = getString(R.string.qwf);
        } else {
            Bundle arguments = getArguments();
            String str2 = null;
            if (arguments != null) {
                str = arguments.getString("purpose");
            }
            if (!o.LJ(str, "security")) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str2 = arguments2.getString("page");
                }
                if (!o.LJ("twosv_setup", str2)) {
                    if (!EP5.LIZ()) {
                        string = getString(R.string.qvg);
                        o.LJIIIIZZ(string, "{\n            getString(…email_new_text)\n        }");
                    } else {
                        string = getString(R.string.g1t);
                        o.LJIIIIZZ(string, "{\n            getString(…_description_1)\n        }");
                    }
                }
            }
            string = getString(R.string.t74);
        }
        c85712XkS.LJIIIZ = string;
        c85712XkS.LIZ = " ";
        c85712XkS.LJIILIIL = false;
        c85712XkS.LJIIJJI = true;
        return c85712XkS;
    }

    public final boolean em() {
        return ((Boolean) this.LLFII.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void Zl() {
        if (em()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("page", "Input Email Captcha");
            c35936E8m.LIZLLL("error_code", "1");
            FMX.LJIIL("input_wrong_email", c35936E8m.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void dm(String data) {
        CountDownTimer countDownTimer;
        o.LJIIIZ(data, "data");
        RBV.LJIIJJI(this, data);
        C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity(), data, xl());
        if (LIZ != null && (countDownTimer = LIZ.LIZ) != null && countDownTimer.isRunning()) {
            fm(false);
        } else {
            LLI.invoke(this, data, "user_click").LJIIIZ(new AfS67S0100000_15(this, 16)).LJIILL();
        }
    }

    public final void fm(boolean z) {
        RBV.LJIIIZ(this, z);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        arguments.putInt("next_page", EnumC69113RAn.EMAIL_SMS_CHANGE.getValue());
        if (this.LLFFF.LIZ()) {
            arguments.putBoolean("show_modify_email_success_toast", true);
        }
        rh(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        if (arguments.getBoolean("use_phone") || em()) {
            _$_findCachedViewById(R.id.b9_).setVisibility(0);
            TextView textView = (TextView) _$_findCachedViewById(R.id.b9_);
            Context context = _$_findCachedViewById(R.id.b9_).getContext();
            o.LJIIIIZZ(context, "change_step1.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
            TuxTextView change_step1 = (TuxTextView) _$_findCachedViewById(R.id.b9_);
            o.LJIIIIZZ(change_step1, "change_step1");
            C7GR.LIZ(change_step1, new ACListenerS35S0100000_15(this, 236), R.string.qvj, R.string.qvk);
        }
        if (C47261Igj.LJJIJIIJI(EnumC69116RAq.CHANGE_EMAIL, EnumC69116RAq.BIND_EMAIL).contains(xl())) {
            C1JD.LJJII(getEnterFrom(), RBV.LIZLLL(this), getEnterMethod());
        }
    }
}
