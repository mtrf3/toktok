package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C252949wI;
import X.C35368DuO;
import X.C62783OkV;
import X.C62822Ol8;
import X.C67714Qhq;
import X.C69093R9t;
import X.C69101RAb;
import X.C69134RBi;
import X.C69135RBj;
import X.C73495Sst;
import X.C74088T5w;
import X.C85657XjZ;
import X.C85665Xjh;
import X.C85667Xjj;
import X.C85671Xjn;
import X.C85712XkS;
import X.C85837XmT;
import X.C86804Y4y;
import X.C9W6;
import X.C9WD;
import X.DialogC85670Xjm;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC34471Wx;
import X.LSD;
import X.RBV;
import X.RC2;
import X.V1B;
import Y.ACListenerS33S0110000_15;
import Y.ACListenerS35S0100000_15;
import Y.AfS67S0100000_15;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import o3.IDaS92S0000000_14;
import o3.h0;

/* loaded from: classes16.dex */
public class PhoneSignUpFragment extends BaseI18nLoginFragment implements InterfaceC34471Wx {
    public static final /* synthetic */ int LLFZ = 0;
    public DialogC85670Xjm LJZL;
    public boolean LL;
    public boolean LLFF;
    public C73495Sst LLFFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final long LLD = System.currentTimeMillis();
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 188));

    static {
        new RC2();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.op;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "PhoneEmailSignUpStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        return new C85712XkS(null, null, false, null, null, false, null, false, true, 114687);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.hnn)).LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.hnn);
        if (c74088T5w != null) {
            c74088T5w.LIZIZ(true);
        }
    }

    public final void Ql() {
        String string;
        String string2;
        if (LSD.LIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getCountryCodeString()) != null) {
            if (mo49getActivity() == null) {
                return;
            }
            String countryCodeString = ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getCountryCodeString();
            boolean LIZIZ = LSD.LIZIZ(countryCodeString);
            if (LSD.LIZIZ(countryCodeString)) {
                string = getString(R.string.qii);
                o.LJIIIIZZ(string, "getString(R.string.send_…de_dialog_item_whats_app)");
                string2 = getString(R.string.qih);
                o.LJIIIIZZ(string2, "getString(R.string.send_code_dialog_item_sms)");
            } else {
                string = getString(R.string.qih);
                o.LJIIIIZZ(string, "getString(R.string.send_code_dialog_item_sms)");
                string2 = getString(R.string.qii);
                o.LJIIIIZZ(string2, "getString(R.string.send_…de_dialog_item_whats_app)");
            }
            String fullPhoneNumber = ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getFullPhoneNumber();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            String string3 = getString(R.string.qij);
            o.LJIIIIZZ(string3, "getString(R.string.send_code_dialog_title)");
            String string4 = getString(R.string.qig, fullPhoneNumber);
            o.LJIIIIZZ(string4, "getString(R.string.send_…og_desc, phoneNumberText)");
            DialogC85670Xjm dialogC85670Xjm = new DialogC85670Xjm(mo49getActivity, new C85671Xjn(string3, string4, string, string2, this.LJLJL, fullPhoneNumber));
            this.LJZL = dialogC85670Xjm;
            dialogC85670Xjm.LJLJL = new C85667Xjj(this);
            dialogC85670Xjm.LJLJLJ = new ACListenerS33S0110000_15(this, LIZIZ, 2);
            dialogC85670Xjm.LJLJLLL = new ACListenerS33S0110000_15(this, LIZIZ, 3);
            DialogC85670Xjm dialogC85670Xjm2 = this.LJZL;
            if (dialogC85670Xjm2 == null) {
                return;
            }
            V1B.LJLJJL(dialogC85670Xjm2);
            return;
        }
        Sl(false, false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C73495Sst c73495Sst = this.LLFFF;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (C9W6.LIZ()) {
            C9WD.LIZIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getInputView().getEditText());
        } else {
            ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getInputView().getEditText().requestFocus();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((C67714Qhq) this.LLF.getValue()).LIZLLL();
        this.LLFF = false;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C67714Qhq) this.LLF.getValue()).LIZJ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        C85665Xjh c85665Xjh = (C85665Xjh) _$_findCachedViewById(R.id.hnq);
        c85665Xjh.getClass();
        C86804Y4y c86804Y4y = C69101RAb.LIZ;
        if (c86804Y4y != null) {
            c85665Xjh.setCountry(c86804Y4y);
            C69101RAb.LIZ = null;
        }
    }

    public final void Rl(boolean z, boolean z2) {
        RBV.LJIIL(this, ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_SIGN_UP.getValue());
        if (C62783OkV.LIZ()) {
            arguments.putInt("current_scene", EnumC69116RAq.LOGIN.getValue());
        } else {
            arguments.putInt("current_scene", EnumC69116RAq.SIGN_UP.getValue());
        }
        arguments.putBoolean("code_sent", z2);
        arguments.putBoolean("use_whatsapp", z);
        rh(arguments);
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.hnp);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
    }

    public final void Sl(boolean z, boolean z2) {
        String str;
        CountDownTimer countDownTimer;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        String fullPhoneNumber = ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getFullPhoneNumber();
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
        C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity, fullPhoneNumber, enumC69116RAq);
        if (LIZ != null && (countDownTimer = LIZ.LIZ) != null && countDownTimer.isRunning()) {
            Rl(z, false);
            return;
        }
        if (z) {
            String LIZ2 = PhoneNumberUtil.LIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getPhoneNumberObject());
            o.LJIIIIZZ(LIZ2, "formatNumber(phoneSignUp…t.getPhoneNumberObject())");
            C69093R9t.LJJII(this, this, LIZ2, enumC69116RAq, EnumC69113RAn.PHONE_SMS_SIGN_UP, "user_click", "").LJIIIZ(new AfS67S0100000_15(this, 35)).LJIILL();
            return;
        }
        String LIZ3 = PhoneNumberUtil.LIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getPhoneNumberObject());
        o.LJIIIIZZ(LIZ3, "formatNumber(phoneSignUp…t.getPhoneNumberObject())");
        EnumC69113RAn enumC69113RAn = EnumC69113RAn.PHONE_SMS_SIGN_UP;
        if (z2) {
            str = "choose_dialog";
        } else {
            str = null;
        }
        C69093R9t.LJJ(this, this, LIZ3, enumC69116RAq, enumC69113RAn, "first_time", str, 256).LJIIIZ(new AfS67S0100000_15(this, 36)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C85665Xjh c85665Xjh = (C85665Xjh) _$_findCachedViewById(R.id.hnq);
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        c85665Xjh.LJLILLLLZI = enterFrom;
        c85665Xjh.LJLJI = "signup";
        ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getInputView().setTextWatcher(new C85657XjZ(this));
        h0.LJIJI(_$_findCachedViewById(R.id.hnn), new IDaS92S0000000_14(0));
        C85837XmT.LIZJ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.hno), 1, 1, null);
        h0.LIZLLL(_$_findCachedViewById(R.id.hno));
        ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).LIZJ();
        if (!this.LL) {
            ((C67714Qhq) this.LLF.getValue()).LJ(((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getEditText());
            this.LL = true;
        }
        if (C35368DuO.LIZIZ()) {
            C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.hnn);
            String string = getString(R.string.iav);
            o.LJIIIIZZ(string, "getString(R.string.mus_continue)");
            c74088T5w.setButtonText(string);
        }
        ((C85665Xjh) _$_findCachedViewById(R.id.hnq)).getInputView();
        Ol(new ACListenerS35S0100000_15(this, 74), _$_findCachedViewById(R.id.hnn));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C67714Qhq) this.LLF.getValue()).LIZIZ(i, i2, intent);
    }
}
