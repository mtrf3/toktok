package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC73635Sv9;
import X.C35936E8m;
import X.C40450FuA;
import X.C41565GSz;
import X.C69045R7x;
import X.C69046R7y;
import X.C69093R9t;
import X.C69122RAw;
import X.C69124RAy;
import X.C73636SvA;
import X.C74088T5w;
import X.C74090T5y;
import X.EnumC69113RAn;
import X.FMX;
import X.R41;
import X.RAJ;
import X.RBG;
import X.RBV;
import Y.AfS20S1200000_11;
import Y.AfS23S1300000_11;
import Y.AfS24S1100000_11;
import Y.AfS60S0100000_8;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CreatePasswordFragment extends BaseUpdatePasswordFragment {
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final long LLIIJI = System.currentTimeMillis();

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Nl() {
        this.LLIIIZ = false;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("platform", "sms_verification");
        FMX.LJIIL("click_password_skip", c35936E8m.LIZ);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        if (arguments.getBoolean("phone_signup")) {
            Bundle arguments2 = getArguments();
            o.LJI(arguments2);
            arguments2.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            Bundle arguments3 = getArguments();
            o.LJI(arguments3);
            arguments3.putInt("previous_page", EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE.getValue());
            Bundle arguments4 = getArguments();
            o.LJI(arguments4);
            rh(arguments4);
            return;
        }
        super.Nl();
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
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

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (kotlin.jvm.internal.o.LJ("twosv_setup", r1) == false) goto L25;
     */
    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            r18 = this;
            X.XkS r7 = new X.XkS
            r8 = 0
            r10 = 0
            r17 = 131071(0x1ffff, float:1.8367E-40)
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r10
            r14 = r8
            r15 = r10
            r16 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = r18
            android.os.Bundle r2 = r3.getArguments()
            r1 = -1
            if (r2 == 0) goto L21
            java.lang.String r0 = "progress"
            int r1 = r2.getInt(r0, r1)
        L21:
            r2 = 1
            if (r1 < 0) goto Ldb
            r0 = 1
        L25:
            java.lang.String r6 = "set_password"
            java.lang.String r5 = "getString(R.string.commo…istration_password_title)"
            r1 = 2131826648(0x7f1117d8, float:1.9286186E38)
            if (r0 == 0) goto L9d
            r7.LJI = r2
            r0 = 2131847985(0x7f116b31, float:1.9329463E38)
            java.lang.String r4 = r3.getString(r0)
            java.lang.String r0 = "getString(R.string.twoStep_2svSetup_title)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            java.lang.String r1 = r3.getString(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r5)
        L43:
            r7.LIZ = r4
            r7.LJIIIIZZ = r1
            r7.LJIIL = r6
            X.RAn r1 = r3.Al()
            X.RAn r0 = X.EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE
            if (r1 != r0) goto L78
            android.os.Bundle r0 = r3.getArguments()
            kotlin.jvm.internal.o.LJI(r0)
            java.lang.String r1 = "show_skip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L78
            android.os.Bundle r0 = r3.getArguments()
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L78
            r0 = 2131844696(0x7f115e58, float:1.9322792E38)
            java.lang.String r0 = r3.getString(r0)
            r7.LIZIZ = r0
            r3.LLIIIZ = r2
        L78:
            r7.LJIILJJIL = r2
            X.RAq r1 = r3.xl()
            X.RAq r0 = X.EnumC69116RAq.RECOVER_ACCOUNT
            if (r1 == r0) goto L9b
            android.os.Bundle r1 = r3.getArguments()
            if (r1 == 0) goto L99
            java.lang.String r0 = "page"
            java.lang.String r1 = r1.getString(r0)
        L8e:
            java.lang.String r0 = "twosv_setup"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            if (r0 != 0) goto L9b
        L96:
            r7.LJIILIIL = r2
            return r7
        L99:
            r1 = 0
            goto L8e
        L9b:
            r2 = 0
            goto L96
        L9d:
            X.Ol8 r0 = r3.LLD
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lbf
            r0 = 2131826581(0x7f111795, float:1.928605E38)
            java.lang.String r4 = r3.getString(r0)
            java.lang.String r0 = "getString(R.string.common_login_panel_entry_2)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            java.lang.String r1 = r3.getString(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r5)
            goto L43
        Lbf:
            r0 = 2131826608(0x7f1117b0, float:1.9286105E38)
            java.lang.String r4 = r3.getString(r0)
            java.lang.String r0 = "getString(R.string.common_login_reset_title)"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r0 = 2131826602(0x7f1117aa, float:1.9286093E38)
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r0 = "getString(R.string.commo…gin_reset_password_title)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r6 = "reset_password"
            goto L43
        Ldb:
            r0 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment.Jl():X.XkS");
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment
    public final void Xl() {
        ((C74088T5w) _$_findCachedViewById(R.id.byh)).LIZIZ(true);
        String text = ((C74090T5y) _$_findCachedViewById(R.id.byi)).getText();
        if (Vl(text)) {
            return;
        }
        int i = C69122RAw.LIZ[Al().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    String ticket = Tl();
                    String Sl = Sl();
                    o.LJIIIZ(ticket, "ticket");
                    SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(this);
                    C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new C69046R7y(this, Sl, text, ticket)).LJIIIZ(new AfS23S1300000_11((BaseUpdatePasswordFragment) this, setPasswordMobHelper, (BaseUpdatePasswordFragment) this, text, 0)).LJIIIIZZ(new AfS20S1200000_11(setPasswordMobHelper, (BaseUpdatePasswordFragment) this, text, 0))).LJIIIZ(new AfS60S0100000_8(this, 2)).LJIILL();
                    return;
                }
                C40450FuA.LIZ(getContext());
                if (RAJ.LIZIZ()) {
                    EnumC69113RAn enumC69113RAn = EnumC69113RAn.AGE_GATE_SIGN_UP;
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("email_signup", true);
                    }
                    ((C74088T5w) _$_findCachedViewById(R.id.byh)).LIZ(true);
                    Bundle arguments2 = getArguments();
                    o.LJI(arguments2);
                    arguments2.putString("args_password", text);
                    Bundle arguments3 = getArguments();
                    if (arguments3 == null) {
                        return;
                    }
                    arguments3.putInt("next_page", enumC69113RAn.getValue());
                    rh(arguments3);
                    return;
                }
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    arguments4.putBoolean("email_signup", true);
                }
                String LIZIZ = RBV.LIZIZ(this);
                Bundle arguments5 = getArguments();
                o.LJI(arguments5);
                C69093R9t.LJI(this, this, LIZIZ, text, arguments5.getBoolean("is_multi_account_same_user", false), true, Sl()).LJIIIZ(new AfS24S1100000_11((Object) this, text, 8)).LJIILL();
                return;
            }
            C69093R9t.LJJIII(this, this, text, Sl()).LJIIIZ(new C69124RAy(this)).LJIILL();
            return;
        }
        String ticket2 = Tl();
        String Sl2 = Sl();
        o.LJIIIZ(ticket2, "ticket");
        SetPasswordMobHelper setPasswordMobHelper2 = new SetPasswordMobHelper(this);
        C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new C69045R7x(this, Sl2, text, ticket2)).LJIIIZ(new AfS23S1300000_11((BaseUpdatePasswordFragment) this, setPasswordMobHelper2, (BaseUpdatePasswordFragment) this, text, 2)).LJIIIIZZ(new AfS20S1200000_11(setPasswordMobHelper2, (BaseUpdatePasswordFragment) this, text, 12))).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        Wl();
        Bundle arguments = getArguments();
        int i = -1;
        if (arguments != null) {
            i = arguments.getInt("progress", -1);
        }
        if (i >= 0) {
            if (C41565GSz.LIZJ(mo49getActivity())) {
                return true;
            }
            Wl();
            return false;
        }
        if (this.LLIIIZ) {
            return true;
        }
        if (!this.LLIIIL) {
            R41.LJIIL(13, 2, null);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (((Boolean) this.LLD.getValue()).booleanValue()) {
            C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.byh);
            String string = getString(R.string.do2);
            o.LJIIIIZZ(string, "getString(R.string.common_login_input_button)");
            c74088T5w.setText(string);
        }
        ((C74090T5y) _$_findCachedViewById(R.id.byi)).getEditText().addTextChangedListener(new RBG(this));
    }
}
