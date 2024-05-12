package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C1JD;
import X.C2068389v;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C235929Ns;
import X.C252709vu;
import X.C252949wI;
import X.C26338AVi;
import X.C32151Nz;
import X.C35936E8m;
import X.C41565GSz;
import X.C42440GlA;
import X.C52927Kpv;
import X.C54081LKj;
import X.C54082LKk;
import X.C62822Ol8;
import X.C69117RAr;
import X.C74088T5w;
import X.C76800UCe;
import X.C78685UuP;
import X.C78897Uxp;
import X.C7GR;
import X.C7MY;
import X.C85144XbI;
import X.C85665Xjh;
import X.C85711XkR;
import X.C85712XkS;
import X.C85716XkW;
import X.C85726Xkg;
import X.C85739Xkt;
import X.C85837XmT;
import X.C9KF;
import X.C9WD;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.InterfaceC56322M8o;
import X.InterfaceC65784Pro;
import X.O6R;
import X.RBU;
import X.RBV;
import X.RC0;
import X.T5T;
import X.X1D;
import Y.ACListenerS31S0100000_11;
import Y.ACListenerS35S0100000_15;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InputPhoneFragment extends BaseI18nLoginFragment implements InterfaceC56322M8o {
    public boolean LLFF;
    public int LLFII;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public String LJZL = "";
    public String LL = "";
    public long LLD = System.currentTimeMillis();
    public String LLF = "";
    public int LLFFF = 48;
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new C85726Xkg(this));
    public final IAccountBindingsService LLI = AccountBindingsService.LIZJ();
    public final String LLIFFJFJJ = "input_phone";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
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
        return R.layout.ol;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Il() {
        if (Al() != EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN || _$_findCachedViewById(R.id.aha).getVisibility() == 8) {
            return;
        }
        C85712XkS Jl = Jl();
        C235119Kp c235119Kp = new C235119Kp();
        String str = Jl.LIZIZ;
        c235119Kp.LIZLLL = false;
        String str2 = Jl.LIZ;
        if (str2 != null && C78685UuP.LJJJZ(str2)) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = str2;
            c235119Kp.LIZJ = c9kf;
        }
        if (C78685UuP.LJJJZ(str)) {
            Context context = getContext();
            if (context != null) {
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setText(str);
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 69));
                tuxTextView.setTuxFont(41);
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
                tuxTextView.setGravity(17);
                C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 26);
                C78897Uxp.LJJJJLI(tuxTextView, null);
                C235929Ns c235929Ns = new C235929Ns();
                c235929Ns.LIZJ = tuxTextView;
                c235929Ns.LIZIZ = "start_text";
                c235119Kp.LIZLLL(c235929Ns);
            }
        } else {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.eo9);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            Ol(new ACListenerS35S0100000_15(this, 70), _$_findCachedViewById(R.id.eo9));
        }
        if (Jl.LJIILIIL) {
            C234529Ii c234529Ii = new C234529Ii();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_question_mark_circle_ltr;
            c2068389v.LJ = Integer.valueOf(R.attr.gv);
            c234529Ii.LIZ(c2068389v);
            c234529Ii.LIZIZ(new AqS162S0200000_15(Jl, this, 11));
            c235119Kp.LIZIZ(c234529Ii);
        }
        ((C252709vu) _$_findCachedViewById(R.id.aha)).setNavActions(c235119Kp);
        View LJI = ((C252709vu) _$_findCachedViewById(R.id.aha)).LJI("start_text");
        if (LJI != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(40));
            layoutParams.gravity = 16;
            LJI.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b1, code lost:
    
        if (kotlin.jvm.internal.o.LJ("twosv_setup", r0) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment.Jl():X.XkS");
    }

    public final boolean Sl() {
        return ((Boolean) this.LLFZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.eo7);
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int Kl() {
        if (Al() != EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            return 1;
        }
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC68974R5e
    public final String LJJLIIIJJI() {
        if (Al() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            String str = this.LLF;
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
        if (C69117RAr.LIZ[Al().ordinal()] == 3) {
            int i = C69117RAr.LIZIZ[xl().ordinal()];
            if (i != 1 && i != 2) {
                return "use_email";
            }
            return "third_platform";
        }
        return super.LJJLIIIJLLLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void LLFII() {
        View _$_findCachedViewById;
        if (Al() != EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN || (_$_findCachedViewById = _$_findCachedViewById(R.id.g_7)) == null) {
            return;
        }
        _$_findCachedViewById.setTranslationY(0.0f);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.eo7);
        if (c74088T5w != null) {
            c74088T5w.LIZIZ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void Rg() {
        ActivityC45651qj mo49getActivity;
        View _$_findCachedViewById;
        if (Al() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN && (mo49getActivity = mo49getActivity()) != null && (_$_findCachedViewById = _$_findCachedViewById(R.id.g_7)) != null) {
            _$_findCachedViewById.post(new ARunnableS34S0200000_15(this, mo49getActivity, 18));
        }
    }

    public final String Rl() {
        if (xl() == EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_LOGIN || xl() == EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_SIGN_UP) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                return arguments.getString("platform");
            }
            return null;
        }
        return "email";
    }

    public final boolean Vl() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("progress", -1) >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context context = getContext();
        o.LJI(context);
        return C54081LKj.LIZ(context, this);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        boolean z;
        String str;
        if (Sl()) {
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", "Set up by Phone");
            c35936E8m.LIZIZ(System.currentTimeMillis() - this.LJLIL, "duration");
            FMX.LJIIL("back", c35936E8m.LIZ);
        }
        if (xl() == EnumC69116RAq.BIND_PHONE) {
            C1JD.LJJIFFI(getEnterFrom(), (String) this.LJLJJI.getValue(), getEnterMethod(), "mobile");
        }
        if (Al() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            C85711XkR.LIZ(LJJLIIIJJI(), Rl(), LJJLIIIJLLLLLLLZ(), "mobile");
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putBoolean("should_bind_phone", false);
            }
            if (o.LJ(this.LLF, "login")) {
                Ql(new AqS165S0100000_15(this, 185));
            } else if (o.LJ(this.LLF, "signup")) {
                Ql(new C85716XkW(this));
            }
            return true;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("show_skip", false);
        } else {
            z = false;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("page")) == null) {
            str = "";
        }
        boolean LJ = o.LJ(str, "twosv_setup");
        if (z && LJ) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJJIII(enterFrom, enterMethod, "sms");
        }
        if (Vl() && !z) {
            if (!C41565GSz.LIZJ(mo49getActivity())) {
                return false;
            }
            return true;
        }
        if (Al() == EnumC69113RAn.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE) {
            ForcePhoneVerificationManager.INSTANCE.conditionalBindLoginSuccessOrCancel();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ActivityC45651qj mo49getActivity;
        Window window;
        super.onDestroyView();
        if (Al() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN && (mo49getActivity = mo49getActivity()) != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(this.LLFFF);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        if (Al() != EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C9WD.LIZIZ(((C85665Xjh) _$_findCachedViewById(R.id.eo_)).getEditText());
        } else {
            ((C85665Xjh) _$_findCachedViewById(R.id.eo_)).getEditText().requestFocus();
        }
        this.LLD = System.currentTimeMillis();
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLIFFJFJJ;
    }

    public final void Ql(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
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

    public final void Tl(boolean z) {
        RBV.LJIIL(this, ((C85665Xjh) _$_findCachedViewById(R.id.eo_)).getPhoneNumberObject());
        String LIZ = PhoneNumberUtil.LIZ(((C85665Xjh) _$_findCachedViewById(R.id.eo_)).getPhoneNumberObject());
        o.LJIIIIZZ(LIZ, "formatNumber(inputPhoneV…w.getPhoneNumberObject())");
        RBV.LJIILJJIL(this, LIZ);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("code_sent", z);
        int i = C69117RAr.LIZ[Al().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            arguments.putInt("next_page", EnumC69113RAn.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_CODE.getValue());
                        }
                    } else {
                        arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_MODIFY.getValue());
                    }
                } else {
                    arguments.putInt("previous_page", Al().getValue());
                    arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_BIND.getValue());
                }
            } else {
                arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_BIND.getValue());
            }
        } else {
            arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_FIND_PASSWORD.getValue());
        }
        rh(arguments);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        Window window;
        String str;
        String str2;
        String string2;
        super.onCreate(bundle);
        String str3 = null;
        String str4 = "";
        if (xl() == EnumC69116RAq.MODIFY_PHONE) {
            Bundle arguments = getArguments();
            if (arguments == null || (str = arguments.getString("ticket")) == null) {
                str = "";
            }
            this.LJZL = str;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (str2 = arguments2.getString("mUnusableMobileTicket")) == null) {
                str2 = "";
            }
            this.LL = str2;
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (string2 = arguments3.getString("page")) != null) {
                str4 = string2;
            }
            RC0.LIZ(enterMethod, enterFrom, str4);
        } else if (xl() == EnumC69116RAq.BIND_PHONE) {
            C1JD.LJJIIJ(getEnterFrom(), "mobile", (String) this.LJLJJI.getValue(), getEnterMethod());
            String enterMethod2 = getEnterMethod();
            o.LJIIIIZZ(enterMethod2, "enterMethod");
            String enterFrom2 = getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            Bundle arguments4 = getArguments();
            if (arguments4 != null && (string = arguments4.getString("page")) != null) {
                str4 = string;
            }
            RC0.LIZ(enterMethod2, enterFrom2, str4);
        }
        if (Al() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                str3 = arguments5.getString("auth_type");
            }
            this.LLF = String.valueOf(str3);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
                this.LLFFF = window.getAttributes().softInputMode;
                window.setSoftInputMode(34);
            }
            C85739Xkt c85739Xkt = new C85739Xkt();
            ((Keva) c85739Xkt.LIZIZ.getValue()).storeInt("show_pii_index", ((Keva) c85739Xkt.LIZIZ.getValue()).getInt("show_pii_index", 0) + 1);
            C85711XkR.LJ(LJJLIIIJJI(), "mobile", Rl(), LJJLIIIJLLLLLLLZ(), String.valueOf(((Keva) new C85739Xkt().LIZIZ.getValue()).getInt("show_pii_index", 0)));
        }
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.eo8);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
        if (i == 1356) {
            PopupManager.LJIIL(new C42440GlA(this, mo49getActivity()));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        T5T t5t;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C85665Xjh c85665Xjh = (C85665Xjh) _$_findCachedViewById(R.id.eo_);
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String loginPanelType = wl();
        o.LJIIIIZZ(loginPanelType, "loginPanelType");
        c85665Xjh.LJLILLLLZI = enterFrom;
        c85665Xjh.LJLJI = loginPanelType;
        EditText editText = c85665Xjh.getEditText();
        editText.setInputType(3);
        editText.addTextChangedListener(new RBU(this, editText));
        editText.setHint(getString(R.string.idp));
        if (Al() == EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            editText.setHintTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
            if ((editText instanceof T5T) && (t5t = (T5T) editText) != null) {
                t5t.setTuxFont(41);
            }
        }
        PhoneNumberUtil.PhoneNumber LJ = RBV.LJ(this);
        if (LJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(LJ.getCountryCode());
            c85665Xjh.setCountryCode(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(LJ.getCountryIso());
            c85665Xjh.setCountryName(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("");
            LIZ3.append(LJ.getNationalNumber());
            c85665Xjh.setPhoneNumber(X1D.LIZIZ(LIZ3));
        } else {
            c85665Xjh.LIZJ();
        }
        Bundle arguments = getArguments();
        o.LJI(arguments);
        if (arguments.getBoolean("use_email", false) || Sl()) {
            _$_findCachedViewById(R.id.b9_).setVisibility(0);
            TuxTextView change_step1 = (TuxTextView) _$_findCachedViewById(R.id.b9_);
            o.LJIIIIZZ(change_step1, "change_step1");
            C7GR.LIZ(change_step1, new ACListenerS31S0100000_11(this, 8), R.string.qvn, R.string.qvo);
        }
        Ol(new ACListenerS35S0100000_15(this, 71), _$_findCachedViewById(R.id.eo7));
        view.post(new ARunnableS51S0100000_15(this, 24));
        if (!C52927Kpv.LIZ()) {
            C85837XmT.LIZJ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.ah8), 3, Integer.valueOf(Kl()), new ACListenerS35S0100000_15(this, 72));
        }
    }
}
