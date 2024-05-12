package com.ss.android.ugc.aweme.account.bind;

import X.AnonymousClass636;
import X.C1JD;
import X.C221108m2;
import X.C35936E8m;
import X.C41565GSz;
import X.C62822Ol8;
import X.C69134RBi;
import X.C69135RBj;
import X.C69149RBx;
import X.C7GR;
import X.C85144XbI;
import X.C85723Xkd;
import X.EnumC69113RAn;
import X.FMX;
import X.RBV;
import Y.ACListenerS35S0100000_15;
import Y.AfS28S1100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BindEmailFragment extends CommonInputEmailFragment {
    public static final C69149RBx LLFZ = C69149RBx.LJLIL;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new C85723Xkd(this));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.bind.BindEmailFragment.Jl():X.XkS");
    }

    public final boolean em() {
        return ((Boolean) this.LLFFF.getValue()).booleanValue();
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

    public final boolean fm() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("progress", -1) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        boolean z;
        String str;
        KeyboardUtils.LIZIZ(cm());
        C1JD.LJJIFFI(getEnterFrom(), null, getEnterMethod(), "email");
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("show_skip", false);
            if (z) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (str = arguments2.getString("page")) == null) {
                    str = "";
                }
                if (o.LJ(str, "twosv_setup")) {
                    String enterFrom = getEnterFrom();
                    o.LJIIIIZZ(enterFrom, "enterFrom");
                    String enterMethod = getEnterMethod();
                    o.LJIIIIZZ(enterMethod, "enterMethod");
                    C85144XbI.LJJIII(enterFrom, enterMethod, "email");
                }
            }
        } else {
            z = false;
        }
        if (!fm() || z || !C41565GSz.LIZJ(mo49getActivity())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void dm(String data) {
        CountDownTimer countDownTimer;
        o.LJIIIZ(data, "data");
        RBV.LJIIJJI(this, data);
        C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity(), data, xl());
        if (LIZ != null && (countDownTimer = LIZ.LIZ) != null && countDownTimer.isRunning()) {
            hm(data, false);
        } else {
            LLFZ.invoke(this, data, "user_click").LJIIIZ(new AfS28S1100000_15(this, data, 1)).LJIILL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        String enterFrom = getEnterFrom();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("page")) == null) {
            str = "";
        }
        C1JD.LJJII(enterFrom, str, getEnterMethod());
        C1JD.LJJIIJ(getEnterFrom(), "email", null, getEnterMethod());
    }

    public final void hm(String data, boolean z) {
        o.LJIIIZ(data, "data");
        RBV.LJIIIZ(this, z);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        arguments.putInt("next_page", EnumC69113RAn.EMAIL_SMS_BIND.getValue());
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
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
            TuxTextView change_step1 = (TuxTextView) _$_findCachedViewById(R.id.b9_);
            o.LJIIIIZZ(change_step1, "change_step1");
            C7GR.LIZ(change_step1, new ACListenerS35S0100000_15(this, 199), R.string.qvj, R.string.qvk);
        }
    }
}
