package com.ss.android.ugc.aweme.account.agegate.ftc;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C252949wI;
import X.C35936E8m;
import X.C40535FvX;
import X.C62822Ol8;
import X.C74088T5w;
import X.C74090T5y;
import X.C85712XkS;
import X.C9WD;
import X.EOO;
import X.EnumC69113RAn;
import X.FMX;
import X.InterfaceC69035R7n;
import X.InterfaceC74091T5z;
import X.RC4;
import X.RC5;
import X.RC6;
import X.RC7;
import X.RC8;
import X.SAU;
import X.SAX;
import Y.ACListenerS31S0100000_11;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FtcCreatePasswordFragment extends BaseI18nLoginFragment implements RC8, InterfaceC74091T5z {
    public RC4 LJZL;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();
    public final C62822Ol8 LL = C221108m2.LIZIZ(new RC7(this));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS161S0100000_11(this, 6));
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS161S0100000_11(this, 5));
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new RC6(this));

    @Override // X.RC8
    public final void LLJJJJ() {
        C40535FvX.LIZLLL(false);
        if (((Number) this.LLF.getValue()).intValue() == 0) {
            SmartRouter.buildRoute(this, "aweme://hyd_action/video_export_complete?is_kids_mode=1").open();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.DELETE_VIDEO_ALERT.getValue());
        arguments.putString("enter_from", "from_kids_account_page");
        arguments.putInt("is_kids", 1);
        arguments.putBoolean("finish_before_jump", true);
        rh(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
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
        return R.layout.mo;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final boolean Ql() {
        return ((Boolean) this.LL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("exit_create_password_page", c35936E8m.LIZ);
        return Ql();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.dp1)).LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String str;
        boolean z = !Ql();
        if (((Boolean) this.LLFF.getValue()).booleanValue()) {
            str = getString(R.string.dr1);
        } else {
            str = " ";
        }
        return new C85712XkS(str, null, z, getString(R.string.cqr), null, false, null, false, false, 122590);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        ((C74088T5w) _$_findCachedViewById(R.id.dp1)).LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C9WD.LIZIZ(((C74090T5y) _$_findCachedViewById(R.id.dp2)).getEditText());
    }

    @Override // X.RC8
    public final void sj() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putString("platform", "account");
            ((ActionResultModel) ViewModelProviders.of(mo49getActivity).get(ActionResultModel.class)).LJLILLLLZI.postValue(arguments);
        }
    }

    public static SAX Rl(Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            return SAX.Success;
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            return SAX.Error;
        }
        return SAX.None;
    }

    @Override // X.RC8
    public final void D1(Boolean bool) {
        SAU sau = (SAU) _$_findCachedViewById(R.id.dow);
        if (sau != null) {
            sau.setVariant(Rl(bool));
        }
    }

    @Override // X.RC8
    public final void LJIILL(String str) {
        Hl();
        if (str != null) {
            Sg(0, str);
        }
    }

    @Override // X.RC8
    public final void Qk(boolean z) {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.dp1);
        if (c74088T5w == null) {
            return;
        }
        c74088T5w.setEnabled(z);
    }

    @Override // X.RC8
    public final void ik(Boolean bool) {
        SAU sau = (SAU) _$_findCachedViewById(R.id.dou);
        if (sau != null) {
            sau.setVariant(Rl(bool));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean Ql = Ql();
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-passportApi>(...)");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        this.LJZL = new RC4(this, Ql, (InterfaceC69035R7n) value, enterMethod);
    }

    @Override // X.InterfaceC74091T5z
    public final void p3(int i) {
        if (i != 4) {
            if (i != 5) {
                return;
            }
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZ(0, "is_show");
            c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
            FMX.LJIIL("tap_show_password", c35936E8m.LIZ);
            return;
        }
        C35936E8m c35936E8m2 = new C35936E8m();
        c35936E8m2.LIZ(1, "is_show");
        c35936E8m2.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("tap_show_password", c35936E8m2.LIZ);
    }

    @Override // X.RC8
    public final void y9(Boolean bool) {
        SAU sau = (SAU) _$_findCachedViewById(R.id.dov);
        if (sau != null) {
            sau.setVariant(Rl(bool));
        }
    }

    @Override // X.RC8
    public final void LJLJL(Integer num, Integer num2) {
        Hl();
        if (num2 != null) {
            String string = getString(num2.intValue());
            o.LJIIIIZZ(string, "getString(it)");
            Sg(0, string);
        }
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.dp3);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (Ql()) {
            C40535FvX.LIZLLL(true);
        }
        C74090T5y c74090T5y = (C74090T5y) _$_findCachedViewById(R.id.dp2);
        if (c74090T5y != null) {
            c74090T5y.LIZLLL(4, 1);
        }
        SAU sau = (SAU) _$_findCachedViewById(R.id.dou);
        if (sau != null) {
            String string = getString(R.string.cqn);
            o.LJIIIIZZ(string, "getString(R.string.choosepassword_desc2)");
            sau.setDesc(string);
        }
        SAU sau2 = (SAU) _$_findCachedViewById(R.id.dow);
        if (sau2 != null) {
            String string2 = getString(R.string.cqo);
            o.LJIIIIZZ(string2, "getString(R.string.choosepassword_desc3)");
            sau2.setDesc(string2);
        }
        SAU sau3 = (SAU) _$_findCachedViewById(R.id.dov);
        if (sau3 != null) {
            String string3 = getString(R.string.cqp);
            o.LJIIIIZZ(string3, "getString(R.string.choosepassword_desc4)");
            sau3.setDesc(string3);
        }
        C74090T5y c74090T5y2 = (C74090T5y) _$_findCachedViewById(R.id.dp2);
        if (c74090T5y2 != null) {
            c74090T5y2.setListener(this);
        }
        C74090T5y c74090T5y3 = (C74090T5y) _$_findCachedViewById(R.id.dp2);
        if (c74090T5y3 != null && (editText = c74090T5y3.getEditText()) != null) {
            editText.addTextChangedListener(new RC5(this));
        }
        Ol(new ACListenerS31S0100000_11(this, 0), _$_findCachedViewById(R.id.dp1));
        String enterFrom = getEnterFrom();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("show_create_password_page", c35936E8m.LIZ);
    }
}
