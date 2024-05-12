package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC73635Sv9;
import X.ActivityC45651qj;
import X.AnonymousClass894;
import X.C10A;
import X.C113684dA;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252949wI;
import X.C26227ARb;
import X.C29S;
import X.C33884DRo;
import X.C35936E8m;
import X.C3C5;
import X.C46451IKx;
import X.C48479J0x;
import X.C58434MwY;
import X.C62822Ol8;
import X.C67738QiE;
import X.C67939QlT;
import X.C68988R5s;
import X.C69036R7o;
import X.C69038R7q;
import X.C69093R9t;
import X.C69118RAs;
import X.C69134RBi;
import X.C69135RBj;
import X.C69136RBk;
import X.C72972SkS;
import X.C73626Sv0;
import X.C73636SvA;
import X.C74086T5u;
import X.C76800UCe;
import X.C78555UsJ;
import X.C7FC;
import X.C80498ViY;
import X.C85631Xj9;
import X.C85664Xjg;
import X.C85690Xk6;
import X.C85701XkH;
import X.C85713XkT;
import X.C85714XkU;
import X.C85721Xkb;
import X.C85725Xkf;
import X.C85731Xkl;
import X.C85734Xko;
import X.C85735Xkp;
import X.C90903hW;
import X.C9WD;
import X.EnumC69096R9w;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC78973Uz3;
import X.EnumC85633XjB;
import X.EnumC85644XjM;
import X.FMX;
import X.InterfaceC219588ja;
import X.InterfaceC65784Pro;
import X.InterfaceC80500Via;
import X.InterfaceC82683Wch;
import X.R8Y;
import X.R9C;
import X.R9D;
import X.RBV;
import X.RC0;
import X.UC0;
import X.X1D;
import X.Y4T;
import X.Y4U;
import X.Y4V;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS83S0100000_15;
import Y.ARunnableS51S0100000_15;
import Y.AfS34S0201000_15;
import Y.AfS40S0101000_15;
import Y.AfS4S2200000_15;
import Y.AfS63S0100000_11;
import Y.AfS64S0200000_15;
import Y.AfS67S0100000_15;
import Y.IDCListenerS301S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.eventtracking.ClientSubmitSmsCodeEvent;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InputCodeFragment extends BaseAccountBindingsFlowFragment implements InterfaceC80500Via, View.OnClickListener, InterfaceC219588ja {
    public static final C62822Ol8 LLILZIL = C221108m2.LIZIZ(C58434MwY.LJLIL);
    public boolean LLD;
    public boolean LLF;
    public int LLFII;
    public CountDownTimer LLFZ;
    public boolean LLIFFJFJJ;
    public C67939QlT LLII;
    public boolean LLIIII;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public C68988R5s LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public InterfaceC82683Wch LLILL;
    public boolean LLILLIZIL;
    public final Map<Integer, View> LLILZ = new LinkedHashMap();
    public String LLFF = "";
    public String LLFFF = "";
    public final long LLI = System.currentTimeMillis();
    public String LLIIIILZ = "";
    public String LLIIIZ = "";
    public String LLIIJI = "";
    public final IAccountBindingsService LLIILZL = AccountBindingsService.LIZJ();
    public final C62822Ol8 LLIIZ = C221108m2.LIZIZ(new C85725Xkf(this));
    public final C62822Ol8 LLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 183));
    public final C62822Ol8 LLILII = C221108m2.LIZIZ(C85664Xjg.LJLIL);
    public final C62822Ol8 LLILIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 184));
    public final C62822Ol8 LLILLJJLI = C221108m2.LIZIZ(C85701XkH.LJLIL);
    public final C85731Xkl LLILLL = new C85731Xkl(this);

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILZ;
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
        return R.layout.oi;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01cc  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.Jl():X.XkS");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC68974R5e
    public final String LJJLIIIJJI() {
        if (this.LJLL.getValue() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            String str = this.LLIIIILZ;
            if (o.LJ(str, "login")) {
                return "bind_pii_login";
            }
            if (o.LJ(str, "signup")) {
                return "bind_pii_signup";
            }
            return super.LJJLIIIJJI();
        }
        return super.LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC68974R5e
    public final String LJJLIIIJLLLLLLLZ() {
        if (C69118RAs.LIZ[((EnumC69113RAn) this.LJLL.getValue()).ordinal()] == 9) {
            if (xl() == EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_SIGN_UP || xl() == EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_LOGIN) {
                return "third_platform";
            }
            return "use_email";
        }
        return super.LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC80500Via
    public final void LLFZ() {
        EnumC85633XjB enumC85633XjB;
        String str;
        if (this.LLIFFJFJJ) {
            ((C85690Xk6) this.LLILLJJLI.getValue()).LIZJ();
        }
        boolean z = true;
        if (TextUtils.isEmpty(this.LLFF) && (xl() != EnumC69116RAq.RECOVER_ACCOUNT || this.LLFFF.length() != 0)) {
            z = false;
        }
        this.LLIILII = z;
        if (z) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("login_panel_type", wl());
            c35936E8m.LIZLLL("enter_from", LJJLIIIJJI());
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString("page");
            } else {
                str = null;
            }
            c35936E8m.LIZLLL("page", str);
            c35936E8m.LIZLLL("enter_method", getEnterMethod());
            FMX.LJIIL("start_sms_typing", c35936E8m.LIZ);
        }
        if (Al() == EnumC69113RAn.PHONE_SMS_VERIFY) {
            if (this.LLIILII) {
                enumC85633XjB = EnumC85633XjB.SMS;
            } else {
                enumC85633XjB = EnumC85633XjB.EMAIL;
            }
            Vl(enumC85633XjB);
        }
    }

    public final EnumC85644XjM cm() {
        if (this.LLIILII) {
            return EnumC85644XjM.PHONE;
        }
        return EnumC85644XjM.EMAIL;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZIZ(new AqS165S0100000_15(this, 181));
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZIZ(new AqS165S0100000_15(this, 182));
        c235119Kp.LIZIZ(LIZJ2);
        return c235119Kp;
    }

    public final String dm() {
        if (TextUtils.isEmpty(this.LLFFF)) {
            return this.LLFF;
        }
        return this.LLFFF;
    }

    public final boolean em() {
        return ((Boolean) this.LLILII.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (((Boolean) this.LLIIZ.getValue()).booleanValue()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", "Input Phone Captcha");
            c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLIL, "duration");
            FMX.LJIIL("back", c35936E8m.LIZ);
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C67738QiE c67738QiE;
        C67939QlT c67939QlT = this.LLII;
        if (c67939QlT != null) {
            c67939QlT.LJFF = C78555UsJ.LJIJI(c67939QlT.LIZ);
            boolean LIZ = C48479J0x.LIZ(c67939QlT.LIZ);
            c67939QlT.LJ = LIZ;
            if (LIZ && c67939QlT.LJFF == 0 && (c67738QiE = c67939QlT.LIZIZ) != null) {
                try {
                    C16880lQ.LJJLIIIJL(c67738QiE.LIZ, c67738QiE);
                } catch (Exception unused) {
                }
            }
        }
        super.onDestroyView();
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.enw));
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        if (C33884DRo.LIZJ()) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.enw);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.postDelayed(new ARunnableS51S0100000_15(this, 5), 16L);
                return;
            }
            return;
        }
        ((TextView) _$_findCachedViewById(R.id.enw)).setEnabled(true);
        _$_findCachedViewById(R.id.enr).setVisibility(8);
        ((C74086T5u) _$_findCachedViewById(R.id.enr)).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        _$_findCachedViewById(R.id.enr).setVisibility(0);
        ((C74086T5u) _$_findCachedViewById(R.id.enr)).LIZIZ();
    }

    public final void hm() {
        ((TextView) _$_findCachedViewById(R.id.ens)).setEnabled(false);
        ((C85714XkU) _$_findCachedViewById(R.id.env)).setCallback(this.LLILLL);
        C69134RBi.LIZIZ(mo49getActivity(), dm(), new C69135RBj(((C85714XkU) _$_findCachedViewById(R.id.env)).LJJJIL()), xl());
        EditText inputCodeView = (EditText) _$_findCachedViewById(R.id.enw);
        o.LJIIIIZZ(inputCodeView, "inputCodeView");
        C9WD.LIZIZ(inputCodeView);
    }

    public final void km() {
        if (_$_findCachedViewById(R.id.env).getVisibility() != 8) {
            _$_findCachedViewById(R.id.env).setVisibility(8);
        }
        ((TextView) _$_findCachedViewById(R.id.ens)).setEnabled(true);
    }

    public final void lm() {
        if (_$_findCachedViewById(R.id.env).getVisibility() != 0) {
            _$_findCachedViewById(R.id.env).setVisibility(0);
        }
        ((TextView) _$_findCachedViewById(R.id.ens)).setEnabled(false);
    }

    public final void mm() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZIZ(context.getString(R.string.dqp));
        UC0.LIZJ(c26227ARb, C85734Xko.LJLIL);
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        EditText inputCodeView = (EditText) _$_findCachedViewById(R.id.enw);
        o.LJIIIIZZ(inputCodeView, "inputCodeView");
        C9WD.LIZIZ(inputCodeView);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    public static /* synthetic */ void Yl(InputCodeFragment inputCodeFragment) {
        inputCodeFragment.Xl(1, 0);
    }

    @Override // X.InterfaceC80500Via
    public final void LJJLIL(String str) {
        if (!isViewValid()) {
            return;
        }
        if (this.LLIIIL) {
            ((TextView) _$_findCachedViewById(R.id.enw)).setText("");
            this.LLIIIL = false;
        }
        ((C252949wI) _$_findCachedViewById(R.id.enp)).LIZ();
        ((C80498ViY) _$_findCachedViewById(R.id.enw)).LJII();
    }

    @Override // X.InterfaceC80500Via
    public final void LJLL(String str) {
        boolean z;
        boolean z2;
        ((TextView) _$_findCachedViewById(R.id.enw)).setEnabled(false);
        this.LLIIIL = false;
        _$_findCachedViewById(R.id.enr).setVisibility(0);
        ((C74086T5u) _$_findCachedViewById(R.id.enr)).LIZIZ();
        String str2 = null;
        switch (C69118RAs.LIZ[Al().ordinal()]) {
            case 1:
            case 5:
                String enterFrom = getEnterFrom();
                o.LJIIIIZZ(enterFrom, "enterFrom");
                String enterMethod = getEnterMethod();
                o.LJIIIIZZ(enterMethod, "enterMethod");
                RC0.LIZLLL("login_signup_phone_submit", enterFrom, enterMethod, "phone");
                if (xl() == EnumC69116RAq.RECOVER_ACCOUNT) {
                    C68988R5s c68988R5s = this.LLIIJLIL;
                    if (c68988R5s != null) {
                        str2 = c68988R5s.getTicket();
                    }
                    EnumC69116RAq scene = xl();
                    EnumC69113RAn step = Al();
                    o.LJIIIZ(scene, "scene");
                    o.LJIIIZ(step, "step");
                    int scene2 = EnumC69096R9w.ACTIVATION_QUICK_LOGIN.getScene();
                    ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent = new ClientSubmitSmsCodeEvent();
                    clientSubmitSmsCodeEvent.LJI(LJJLIIIJJI());
                    clientSubmitSmsCodeEvent.LJII(LJJLIIIJLLLLLLLZ());
                    clientSubmitSmsCodeEvent.LJIIIZ(scene2);
                    clientSubmitSmsCodeEvent.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
                    clientSubmitSmsCodeEvent.LJFF();
                    C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new R9C(this, scene, step, this, str2, str)).LJIIIZ(new AfS34S0201000_15(scene2, (Object) this, (Object) this, 4)).LJIIIIZZ(new AfS40S0101000_15(this, scene2, 1))).LJIIIZ(new AfS63S0100000_11(this, 27)).LJIILL();
                    return;
                }
                String phoneNumber = this.LLFF;
                EnumC69116RAq scene3 = xl();
                EnumC69113RAn step2 = Al();
                boolean z3 = this.LLD;
                AqS161S0100000_11 aqS161S0100000_11 = new AqS161S0100000_11(this, 25);
                o.LJIIIZ(phoneNumber, "phoneNumber");
                o.LJIIIZ(scene3, "scene");
                o.LJIIIZ(step2, "step");
                if (scene3 == EnumC69116RAq.SIGN_UP) {
                    z = true;
                } else {
                    z = false;
                }
                int scene4 = EnumC69096R9w.ACTIVATION_QUICK_LOGIN.getScene();
                ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent2 = new ClientSubmitSmsCodeEvent();
                clientSubmitSmsCodeEvent2.LJI(LJJLIIIJJI());
                clientSubmitSmsCodeEvent2.LJII(LJJLIIIJLLLLLLLZ());
                clientSubmitSmsCodeEvent2.LJIIIZ(scene4);
                clientSubmitSmsCodeEvent2.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
                clientSubmitSmsCodeEvent2.LJFF();
                C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new C69038R7q(scene3, this, z, phoneNumber, str, step2)).LJIIIZ(new Y4V(z3, this, scene4)).LJIIIIZZ(new Y4T(aqS161S0100000_11, z, z3, this, scene4))).LJIIIZ(new AfS63S0100000_11(this, 28)).LJIILL();
                return;
            case 2:
                String email = this.LLFFF;
                EnumC69116RAq scene5 = xl();
                EnumC69113RAn step3 = Al();
                o.LJIIIZ(email, "email");
                o.LJIIIZ(scene5, "scene");
                o.LJIIIZ(step3, "step");
                C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new C69036R7o(this, email, str, scene5, step3)).LJIIIZ(new AfS63S0100000_11(this, 18)).LJIIIIZZ(new AfS63S0100000_11(this, 19))).LJIIIZ(new AfS63S0100000_11(this, 29)).LJIILL();
                return;
            case 3:
                C69093R9t.LIZLLL(this, this, this.LLFF, str, 4, null, new AqS177S0100000_11(this, 12)).LJIIIZ(new AfS63S0100000_11(this, 30)).LJIILL();
                return;
            case 4:
                C69093R9t.LJFF("forget_password", this, this, this.LLFFF, str, 4, null, new AqS177S0100000_11(this, 13)).LJIIIZ(new AfS63S0100000_11(this, 31)).LJIILL();
                return;
            case 6:
                if (C85631Xj9.LJFF(this) != null) {
                    C69093R9t.LIZJ(this, this, this.LLFF, xl(), Al(), str, this.LLIIIZ, this.LLIIJI, C85631Xj9.LJI(this)).LJIIIZ(new AfS63S0100000_11(this, 32)).LJIIIIZZ(new AfS67S0100000_15(this, 31)).LJIILL();
                    return;
                }
                String phoneNumber2 = this.LLFF;
                EnumC69116RAq scene6 = xl();
                EnumC69113RAn step4 = Al();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    z2 = arguments.getBoolean("from_changePwd");
                } else {
                    z2 = false;
                }
                if (xl() != EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_LOGIN && xl() != EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_SIGN_UP) {
                    str2 = "email";
                } else {
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        str2 = arguments2.getString("platform");
                    }
                }
                o.LJIIIZ(phoneNumber2, "phoneNumber");
                o.LJIIIZ(scene6, "scene");
                o.LJIIIZ(step4, "step");
                ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent3 = new ClientSubmitSmsCodeEvent();
                clientSubmitSmsCodeEvent3.LJI(LJJLIIIJJI());
                clientSubmitSmsCodeEvent3.LJII(LJJLIIIJLLLLLLLZ());
                clientSubmitSmsCodeEvent3.LJIIIZ(C69093R9t.LJIJ(step4));
                clientSubmitSmsCodeEvent3.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
                clientSubmitSmsCodeEvent3.LJFF();
                C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new R9D(this, scene6, step4, this, str2, phoneNumber2, str, null, z2)).LJIIIZ(new AfS4S2200000_15(step4, this, phoneNumber2, str2, 0)).LJIIIIZZ(new AfS4S2200000_15(step4, this, phoneNumber2, str2, 1))).LJIIIZ(new C69136RBk(this)).LJIIIIZZ(new AfS67S0100000_15(this, 28)).LJIILL();
                return;
            case 7:
                EnumC69116RAq scene7 = xl();
                EnumC69113RAn step5 = Al();
                Map LJI = C85631Xj9.LJI(this);
                o.LJIIIZ(scene7, "scene");
                o.LJIIIZ(step5, "step");
                int LJIIZILJ = C69093R9t.LJIIZILJ(step5, false);
                ClientSubmitSmsCodeEvent clientSubmitSmsCodeEvent4 = new ClientSubmitSmsCodeEvent();
                clientSubmitSmsCodeEvent4.LJI(LJJLIIIJJI());
                clientSubmitSmsCodeEvent4.LJII(LJJLIIIJLLLLLLLZ());
                clientSubmitSmsCodeEvent4.LJIIIZ(C69093R9t.LJIJ(step5));
                clientSubmitSmsCodeEvent4.LJIIIIZZ(ClientSubmitSmsCodeEvent.LJIIIIZZ);
                clientSubmitSmsCodeEvent4.LJFF();
                C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new R8Y(this, str, LJIIZILJ, LJI, scene7, step5)).LJIIIZ(new Y4U(this, this, step5)).LJIIIIZZ(new AfS64S0200000_15(this, step5, 0))).LJIIIZ(new AfS63S0100000_11(this, 25)).LJIIIIZZ(new AfS67S0100000_15(this, 29)).LJIILL();
                return;
            case 8:
                C69093R9t.LIZJ(this, this, this.LLFF, xl(), Al(), str, this.LLIIIZ, this.LLIIJI, C85631Xj9.LJI(this)).LJIIIZ(new AfS63S0100000_11(this, 26)).LJIIIIZZ(new AfS67S0100000_15(this, 30)).LJIILL();
                return;
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unknown step [");
                LIZ.append(Al());
                LIZ.append("] when trying to validate codes");
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public final void Zl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("should_bind_email")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putInt("next_page", EnumC69113RAn.BIND_EMAIL_WITHOUT_VERIFY_ON_SIGN_UP_OR_LOGIN.getValue());
                rh(arguments2);
                return;
            }
            return;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.getBoolean("is_from_switch_account", false)) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null) {
                return;
            }
            arguments4.putInt("next_page", EnumC69113RAn.FINISH.getValue());
            rh(arguments4);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        CountDownTimer countDownTimer;
        String str;
        String str2;
        C73626Sv0 LJIJJ;
        String str3 = null;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return;
        }
        if (valueOf.intValue() == R.id.ens) {
            if (((Boolean) this.LLIIZ.getValue()).booleanValue()) {
                FMX.onEventV3("resend_code_phone");
            }
            switch (C69118RAs.LIZ[Al().ordinal()]) {
                case 1:
                case 5:
                    EnumC69116RAq xl = xl();
                    EnumC69116RAq enumC69116RAq = EnumC69116RAq.RECOVER_ACCOUNT;
                    String str4 = "choose_dialog";
                    if (xl == enumC69116RAq) {
                        C68988R5s c68988R5s = this.LLIIJLIL;
                        if (c68988R5s != null) {
                            str = c68988R5s.getTicket();
                        } else {
                            str = null;
                        }
                        EnumC69113RAn enumC69113RAn = EnumC69113RAn.PHONE_SMS_LOGIN;
                        boolean z = this.LLF;
                        if (z) {
                            str2 = "user_click";
                        } else {
                            str2 = "auto_system";
                        }
                        if (!z) {
                            str4 = null;
                        }
                        C69093R9t.LJJI(this, this, str, enumC69116RAq, enumC69113RAn, str2, str4).LJIIIZ(new AfS67S0100000_15(this, 6)).LJIILL();
                        return;
                    }
                    if (this.LLD) {
                        C69093R9t.LJJII(this, this, this.LLFF, xl(), Al(), "resend", "").LJIIIZ(new AfS67S0100000_15(this, 7)).LJIILL();
                        return;
                    }
                    String str5 = this.LLFF;
                    EnumC69116RAq xl2 = xl();
                    EnumC69113RAn Al = Al();
                    if (!this.LLF) {
                        str4 = null;
                    }
                    C69093R9t.LJJ(this, this, str5, xl2, Al, "resend", str4, 256).LJIIIZ(new AfS67S0100000_15(this, 8)).LJIILL();
                    return;
                case 2:
                    String str6 = this.LLFFF;
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        str3 = arguments.getString("password");
                    }
                    C69093R9t.LJIJI(this, this, str6, 1, "resend", null, str3, 128).LJIIIZ(new AfS67S0100000_15(this, 9)).LJIILL();
                    return;
                case 3:
                    LJIJJ = C69093R9t.LJIJJ(this, this, this.LLFF, Al(), "resend", null);
                    LJIJJ.LJIIIZ(new AfS67S0100000_15(this, 10)).LJIILL();
                    return;
                case 4:
                    C69093R9t.LJIJI(this, this, this.LLFFF, 4, "resend", null, null, 192).LJIIIZ(new AfS67S0100000_15(this, 11)).LJIILL();
                    return;
                case 6:
                case 7:
                case 8:
                    String str7 = this.LLFF;
                    EnumC69116RAq xl3 = xl();
                    EnumC69113RAn Al2 = Al();
                    String str8 = this.LLIIIZ;
                    String str9 = this.LLIIJI;
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        str3 = arguments2.getString("page");
                    }
                    C69093R9t.LJIILL(this, this, str7, xl3, Al2, str8, str9, "resend", null, null, str3, C85631Xj9.LJI(this), 768).LJIIIZ(new AfS67S0100000_15(this, 12)).LJIILL();
                    return;
                default:
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unknown step [");
                    LIZ.append(Al());
                    LIZ.append("] when trying to send codes");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
        if (valueOf.intValue() == R.id.enx) {
            FMX.onEventV3("request_phone_call");
            if (!this.LLIIII || TextUtils.isEmpty(this.LLFF)) {
                return;
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(dm());
            LIZ2.append("_voice");
            C69135RBj LIZ3 = C69134RBi.LIZ(mo49getActivity, X1D.LIZIZ(LIZ2), xl());
            if (LIZ3 != null && (countDownTimer = LIZ3.LIZ) != null && countDownTimer.isRunning()) {
                mm();
                return;
            } else {
                this.LLIIIJ = true;
                C69093R9t.LJJIFFI(this, xl(), Al(), this, this.LLFF, "user_click").LJIIIZ(new AfS67S0100000_15(this, 13)).LJIILL();
                return;
            }
        }
        if (valueOf.intValue() != R.id.enu) {
            return;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        FMX.LJIIL("switch_to_password", c35936E8m.LIZ);
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            arguments3 = new Bundle();
        }
        arguments3.putInt("next_page", EnumC69113RAn.PHONE_PASSWORD_LOGIN.getValue());
        arguments3.putInt("current_scene", xl().getValue());
        arguments3.putBoolean("recover_mobile_code", this.LLIIL);
        arguments3.putSerializable("recover_account_data", this.LLIIJLIL);
        rh(arguments3);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        if (this.LLIIIJ && i == 1206) {
            this.LLIIIJ = false;
            mm();
        } else {
            this.LLIIIL = true;
            ((TextView) _$_findCachedViewById(R.id.enw)).setEnabled(true);
            ((C80498ViY) _$_findCachedViewById(R.id.enw)).LJIIIZ();
            ((C252949wI) _$_findCachedViewById(R.id.enp)).LIZIZ(message);
        }
    }

    public final void Xl(int i, int i2) {
        String str;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(i2, "error_code");
        c35936E8m.LIZLLL("enter_from", LJJLIIIJJI());
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("page");
        } else {
            str = null;
        }
        c35936E8m.LIZLLL("page", str);
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZ(i, "is_success");
        FMX.LJIIL("sms_code_verification_result", c35936E8m.LIZ);
    }

    public final void nm(long j, boolean z) {
        if (this.LLIIII && j <= 50000 && _$_findCachedViewById(R.id.enx).getVisibility() != 0) {
            if (z) {
                _$_findCachedViewById(R.id.enx).setVisibility(0);
            } else {
                _$_findCachedViewById(R.id.enx).setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CountDownTimer countDownTimer;
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        Bundle arguments;
        String str;
        String str2;
        String str3;
        CountDownTimer countDownTimer2;
        String str4;
        String string;
        int i3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity(), dm(), xl());
        if (LIZ != null) {
            countDownTimer = LIZ.LIZ;
        } else {
            countDownTimer = null;
        }
        this.LLFZ = countDownTimer;
        if ((this.LLIILZL.LIZ() && Al() == EnumC69113RAn.PHONE_SMS_VERIFY && xl() == EnumC69116RAq.MODIFY_PHONE) || xl() == EnumC69116RAq.CHANGE_EMAIL) {
            _$_findCachedViewById(R.id.enu).setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.b9_);
            tuxTextView.setText(getString(R.string.hy5));
            if (!((ArrayList) C85631Xj9.LIZLLL(this)).isEmpty()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            tuxTextView.setVisibility(i3);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 66));
        } else if (Al() == EnumC69113RAn.PHONE_SMS_LOGIN && !this.LLIFFJFJJ) {
            _$_findCachedViewById(R.id.enu).setVisibility(0);
        }
        if (o.LJ(this.LJLLL.getValue(), Boolean.TRUE)) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.bt3);
            if (em()) {
                string = getString(R.string.dqn);
            } else {
                string = getString(R.string.drl);
            }
            textView.setText(string);
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.bt0);
            Locale locale = Locale.US;
            String string2 = getString(R.string.dql);
            o.LJIIIIZZ(string2, "getString(R.string.commo…istration_phone_sms_text)");
            String LLLZI = C16880lQ.LLLZI(locale, string2, Arrays.copyOf(new Object[]{this.LLFF}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            textView2.setText(LLLZI);
        }
        int i4 = R.id.env;
        C85714XkU c85714XkU = (C85714XkU) _$_findCachedViewById(R.id.env);
        CountDownTimer countDownTimer3 = this.LLFZ;
        if (countDownTimer3 != null) {
            j = countDownTimer3.getRemainingMillis();
        } else {
            j = 60000;
        }
        c85714XkU.LJZI = "s";
        c85714XkU.LJLZ = 60000L;
        c85714XkU.LJZ = 1000L;
        c85714XkU.setText(String.valueOf(j / 1000) + "s");
        ((TextView) _$_findCachedViewById(R.id.enw)).setEnabled(true);
        ((C80498ViY) _$_findCachedViewById(R.id.enw)).LJIIIIZZ();
        ((C80498ViY) _$_findCachedViewById(R.id.enw)).LJI();
        ((C80498ViY) _$_findCachedViewById(R.id.enw)).setCallback(this);
        ((C80498ViY) _$_findCachedViewById(R.id.enw)).setInputLength(this.LLFII);
        if (C46451IKx.LIZJ) {
            _$_findCachedViewById(R.id.enw).setOnLongClickListener(new IDCListenerS301S0100000_15(this, 1));
        }
        C7FC.LIZIZ(_$_findCachedViewById(R.id.ens));
        C7FC.LIZIZ(_$_findCachedViewById(R.id.enu));
        Ol(this, _$_findCachedViewById(R.id.ens));
        String string3 = getString(R.string.dqo);
        o.LJIIIIZZ(string3, "getString(R.string.commo…ation_phone_voice_button)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.dqr, string3));
        Integer LIZJ = C72972SkS.LIZJ((TuxTextView) _$_findCachedViewById(R.id.enx), "inputCodeVoiceLayout.context", R.attr.eb);
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = 0;
        }
        Integer LIZJ2 = C72972SkS.LIZJ((TuxTextView) _$_findCachedViewById(R.id.enx), "inputCodeVoiceLayout.context", R.attr.eb);
        if (LIZJ2 != null) {
            i2 = LIZJ2.intValue();
        } else {
            i2 = 0;
        }
        spannableStringBuilder.setSpan(new C85721Xkb(this, i, i2), spannableStringBuilder.length() - string3.length(), spannableStringBuilder.length(), 34);
        ((TextView) _$_findCachedViewById(R.id.enx)).setText(spannableStringBuilder);
        ((TextView) _$_findCachedViewById(R.id.enx)).setMovementMethod(AnonymousClass894.LIZ());
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.enu), this);
        if (Al() != EnumC69113RAn.EMAIL_SMS_SIGN_UP && Al() != EnumC69113RAn.EMAIL_SMS_FIND_PASSWORD) {
            C67939QlT c67939QlT = this.LLII;
            o.LJI(c67939QlT);
            String value = c67939QlT.LIZLLL.getValue();
            if (!TextUtils.isEmpty(value)) {
                ((C80498ViY) _$_findCachedViewById(R.id.enw)).setTextAndAutoCheck(value);
                C67939QlT c67939QlT2 = this.LLII;
                o.LJI(c67939QlT2);
                c67939QlT2.LIZLLL.setValue("");
                C35936E8m c35936E8m = new C35936E8m();
                c35936E8m.LIZLLL("enter_method", getEnterMethod());
                FMX.LJIIL("auto_fill_sms_verification", c35936E8m.LIZ);
            } else {
                C67939QlT c67939QlT3 = this.LLII;
                o.LJI(c67939QlT3);
                c67939QlT3.LIZLLL.observe(this, new AObserverS83S0100000_15(this, 11));
            }
        }
        if (Al() != EnumC69113RAn.PHONE_SMS_VERIFY || (this.LLIILZL.LIZ() && RBV.LIZ(this))) {
            z = true;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.getBoolean("code_sent");
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null && arguments3.getBoolean("code_sent")) {
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    arguments4.remove("code_sent");
                }
                hm();
                if ((Al() == EnumC69113RAn.PHONE_SMS_SIGN_UP || Al() == EnumC69113RAn.PHONE_SMS_LOGIN) && xl() != EnumC69116RAq.RECOVER_ACCOUNT) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!TextUtils.isEmpty(this.LLFF) && z2) {
                    if (C85735Xkp.LIZ().containsKey(this.LLFF) && C85735Xkp.LIZ().get(this.LLFF) != null) {
                        Object obj = C85735Xkp.LIZ().get(this.LLFF);
                        o.LJI(obj);
                        this.LLIIII = ((Boolean) obj).booleanValue();
                    } else {
                        C113684dA.LIZ(this.LLFF, new C85713XkT(this));
                    }
                }
            } else {
                if (this.LLFZ != null && C85735Xkp.LIZ().containsKey(this.LLFF) && C85735Xkp.LIZ().get(this.LLFF) != null) {
                    Object obj2 = C85735Xkp.LIZ().get(this.LLFF);
                    o.LJI(obj2);
                    this.LLIIII = ((Boolean) obj2).booleanValue();
                    CountDownTimer countDownTimer4 = this.LLFZ;
                    o.LJI(countDownTimer4);
                    nm(countDownTimer4.getRemainingMillis(), false);
                }
                CountDownTimer countDownTimer5 = this.LLFZ;
                if (countDownTimer5 != null && countDownTimer5.isRunning()) {
                    ((C85714XkU) _$_findCachedViewById(R.id.env)).setCallback(this.LLILLL);
                    C85714XkU c85714XkU2 = (C85714XkU) _$_findCachedViewById(R.id.env);
                    CountDownTimer countDownTimer6 = this.LLFZ;
                    o.LJI(countDownTimer6);
                    c85714XkU2.LJJJJ(countDownTimer6);
                    lm();
                } else {
                    km();
                }
            }
        } else {
            CountDownTimer countDownTimer7 = this.LLFZ;
            if (countDownTimer7 == null) {
                _$_findCachedViewById(R.id.env).setVisibility(8);
                EnumC69116RAq xl = xl();
                EnumC69113RAn Al = Al();
                String str5 = this.LLIIJI;
                Bundle arguments5 = getArguments();
                if (arguments5 != null) {
                    str4 = arguments5.getString("page");
                } else {
                    str4 = null;
                }
                i4 = R.id.env;
                z = true;
                C69093R9t.LJIILL(this, this, "", xl, Al, "", str5, "auto_system", null, null, str4, null, 2816).LJIIIZ(new AfS67S0100000_15(this, 25)).LJIILL();
            } else {
                z = true;
                if (countDownTimer7.isRunning()) {
                    ((C85714XkU) _$_findCachedViewById(R.id.env)).setCallback(this.LLILLL);
                    C85714XkU c85714XkU3 = (C85714XkU) _$_findCachedViewById(R.id.env);
                    CountDownTimer countDownTimer8 = this.LLFZ;
                    o.LJI(countDownTimer8);
                    c85714XkU3.LJJJJ(countDownTimer8);
                    lm();
                } else {
                    CountDownTimer countDownTimer9 = this.LLFZ;
                    o.LJI(countDownTimer9);
                    if (countDownTimer9.isFinished()) {
                        km();
                    }
                }
            }
        }
        EnumC69116RAq xl2 = xl();
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.RECOVER_ACCOUNT;
        if (xl2 == enumC69116RAq) {
            EnumC69113RAn Al2 = Al();
            EnumC69113RAn enumC69113RAn = EnumC69113RAn.PHONE_SMS_LOGIN;
            if (Al2 == enumC69113RAn) {
                C69135RBj LIZ2 = C69134RBi.LIZ(mo49getActivity(), dm(), xl());
                if (LIZ2 != null && (countDownTimer2 = LIZ2.LIZ) != null && countDownTimer2.isRunning() == z) {
                    return;
                }
                ((TextView) _$_findCachedViewById(R.id.enw)).setEnabled(false);
                _$_findCachedViewById(i4).setVisibility(8);
                C68988R5s c68988R5s = this.LLIIJLIL;
                if (c68988R5s != null) {
                    str = c68988R5s.getTicket();
                } else {
                    str = null;
                }
                boolean z3 = this.LLF;
                if (z3) {
                    str2 = "user_click";
                } else {
                    str2 = "auto_system";
                }
                if (z3) {
                    str3 = "choose_dialog";
                } else {
                    str3 = null;
                }
                C69093R9t.LJJI(this, this, str, enumC69116RAq, enumC69113RAn, str2, str3).LJIIIZ(new AfS67S0100000_15(this, 26)).LJIILL();
            }
        }
        if (this.LJLL.getValue() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            String str6 = this.LLIIIILZ;
            if (o.LJ(str6, "login")) {
                Bundle arguments6 = getArguments();
                if (arguments6 != null) {
                    arguments6.putInt("phone_number_source", EnumC78973Uz3.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_LOGIN.getValue());
                }
            } else if (o.LJ(str6, "signup") && (arguments = getArguments()) != null) {
                arguments.putInt("phone_number_source", EnumC78973Uz3.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_SIGN_UP.getValue());
            }
        }
        if (((Boolean) this.LLILIL.getValue()).booleanValue()) {
            C69093R9t.LJJ(this, this, this.LLFF, xl(), Al(), "resend", null, 256).LJIIIZ(new AfS67S0100000_15(this, 27)).LJIILL();
        }
    }

    public final void fm(int i, String str, boolean z) {
        String str2;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", "forgot_password");
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("platform", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        c35936E8m.LIZLLL("status", str2);
        c35936E8m.LIZ(i, "error_code");
        c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLIL, "duration");
        FMX.LJIIL("forgot_pw_code_submit", c35936E8m.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView;
        o.LJIIIZ(inflater, "inflater");
        if (Al() == EnumC69113RAn.PHONE_SMS_VERIFY) {
            Tl();
        }
        if (this.LLIFFJFJJ) {
            ((C85690Xk6) this.LLILLJJLI.getValue()).LIZIZ();
        }
        if (o.LJ(this.LJLLL.getValue(), Boolean.TRUE)) {
            onCreateView = C16880lQ.LLLLIILL(inflater, R.layout.mp, viewGroup, false);
        } else {
            onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        }
        C29S c29s = null;
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return onCreateView;
    }
}
