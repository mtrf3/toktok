package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC65590Pog;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C221108m2;
import X.C252949wI;
import X.C35368DuO;
import X.C42442GlC;
import X.C54081LKj;
import X.C54082LKk;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C67714Qhq;
import X.C69093R9t;
import X.C69101RAb;
import X.C69134RBi;
import X.C69135RBj;
import X.C73495Sst;
import X.C74088T5w;
import X.C85649XjR;
import X.C85658Xja;
import X.C85665Xjh;
import X.C85666Xji;
import X.C85671Xjn;
import X.C85712XkS;
import X.C86804Y4y;
import X.C9WD;
import X.DialogC85670Xjm;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC34471Wx;
import X.InterfaceC56322M8o;
import X.LSD;
import X.RAS;
import X.RBV;
import X.V1B;
import Y.ACListenerS33S0110000_15;
import Y.ACListenerS35S0100000_15;
import Y.AfS30S0110000_15;
import Y.AfS67S0100000_15;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import o3.IDaS471S0100000_14;
import o3.h0;

/* loaded from: classes16.dex */
public final class PhoneLoginFragment extends BaseI18nLoginFragment implements RAS, InterfaceC34471Wx, InterfaceC56322M8o {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public DialogC85670Xjm LJZL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public C73495Sst LLFII;
    public final Map<Integer, View> LLI = new LinkedHashMap();
    public boolean LL = true;
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 187));
    public final String LLFZ = "phone_login";

    static {
        new C85649XjR();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
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
        return R.layout.oo;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        return new C85712XkS(null, null, false, null, null, true, null, false, false, 128254);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.hnk)).LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        ((C74088T5w) _$_findCachedViewById(R.id.hnk)).LIZIZ(true);
    }

    public final void Ql() {
        String string;
        String string2;
        if (LSD.LIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getCountryCodeString()) != null && xl() != EnumC69116RAq.RECOVER_ACCOUNT) {
            if (mo49getActivity() == null) {
                return;
            }
            String countryCodeString = ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getCountryCodeString();
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
            String fullPhoneNumber = ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getFullPhoneNumber();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            String string3 = getString(R.string.qij);
            o.LJIIIIZZ(string3, "getString(R.string.send_code_dialog_title)");
            String string4 = getString(R.string.qig, fullPhoneNumber);
            o.LJIIIIZZ(string4, "getString(R.string.send_…og_desc, phoneNumberText)");
            DialogC85670Xjm dialogC85670Xjm = new DialogC85670Xjm(mo49getActivity, new C85671Xjn(string3, string4, string, string2, this.LJLJL, fullPhoneNumber));
            this.LJZL = dialogC85670Xjm;
            dialogC85670Xjm.LJLJL = new C85666Xji(this);
            dialogC85670Xjm.LJLJLJ = new ACListenerS33S0110000_15(this, LIZIZ, 0);
            dialogC85670Xjm.LJLJLLL = new ACListenerS33S0110000_15(this, LIZIZ, 1);
            DialogC85670Xjm dialogC85670Xjm2 = this.LJZL;
            if (dialogC85670Xjm2 == null) {
                return;
            }
            V1B.LJLJJL(dialogC85670Xjm2);
            return;
        }
        Tl(false, false);
    }

    public final void Rl() {
        if (((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getPhoneNumber() <= 0 && !this.LLF) {
            ((C67714Qhq) this.LLFFF.getValue()).LJ(((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getEditText());
        }
        this.LLF = true;
        C9WD.LIZIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getInputView().getEditText());
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KeyboardUtils.LIZIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getEditText());
        C73495Sst c73495Sst = this.LLFII;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((C67714Qhq) this.LLFFF.getValue()).LIZLLL();
        this.LLFF = false;
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LLFZ;
    }

    @Override // X.RAS
    public final boolean o0() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C67714Qhq) this.LLFFF.getValue()).LIZJ();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        C85665Xjh c85665Xjh = (C85665Xjh) _$_findCachedViewById(R.id.hnm);
        c85665Xjh.getClass();
        C86804Y4y c86804Y4y = C69101RAb.LIZ;
        if (c86804Y4y != null) {
            c85665Xjh.setCountry(c86804Y4y);
            C69101RAb.LIZ = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "3164038768807487310");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/PhoneLoginFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/PhoneLoginFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                Rl();
            } else {
                this.LLD = true;
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/account/login/v2/ui/fragments/PhoneLoginFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.hnl);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.hnk);
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
        }
        if (i == 1053) {
            PopupManager.LJIIL(new C42442GlC(this, mo49getActivity()));
        }
    }

    public final void Tl(boolean z, boolean z2) {
        String str;
        CountDownTimer countDownTimer;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        String fullPhoneNumber = ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getFullPhoneNumber();
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity, fullPhoneNumber, enumC69116RAq);
        if (LIZ != null && (countDownTimer = LIZ.LIZ) != null && countDownTimer.isRunning()) {
            Sl(z, false, false);
            return;
        }
        if (z && xl() != EnumC69116RAq.RECOVER_ACCOUNT) {
            String LIZ2 = PhoneNumberUtil.LIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getPhoneNumberObject());
            o.LJIIIIZZ(LIZ2, "formatNumber(phoneLoginP…t.getPhoneNumberObject())");
            C69093R9t.LJJII(this, this, LIZ2, enumC69116RAq, EnumC69113RAn.PHONE_SMS_LOGIN, "user_click", "").LJIIIZ(new AfS67S0100000_15(this, 34)).LJIILL();
            return;
        }
        String LIZ3 = PhoneNumberUtil.LIZ(((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getPhoneNumberObject());
        o.LJIIIIZZ(LIZ3, "formatNumber(phoneLoginP…t.getPhoneNumberObject())");
        EnumC69113RAn enumC69113RAn = EnumC69113RAn.PHONE_SMS_LOGIN;
        if (z2) {
            str = "choose_dialog";
        } else {
            str = null;
        }
        C69093R9t.LJJ(this, this, LIZ3, enumC69116RAq, enumC69113RAn, "user_click", str, 256).LJIIIZ(new AfS30S0110000_15(this, z2, 2)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PhoneNumberUtil.PhoneNumber phoneNumber;
        String countryIso;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C35368DuO.LIZIZ()) {
            C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.hnk);
            String string = getString(R.string.iav);
            o.LJIIIIZZ(string, "getString(R.string.mus_continue)");
            c74088T5w.setButtonText(string);
        }
        h0.LJIJI(_$_findCachedViewById(R.id.hnk), new IDaS471S0100000_14(this, 1));
        C85665Xjh c85665Xjh = (C85665Xjh) _$_findCachedViewById(R.id.hnm);
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        c85665Xjh.LJLILLLLZI = enterFrom;
        c85665Xjh.LJLJI = "login";
        Ol(new ACListenerS35S0100000_15(this, 73), _$_findCachedViewById(R.id.hnk));
        ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getInputView().setTextWatcher(new C85658Xja(this));
        if (xl() != EnumC69116RAq.RECOVER_ACCOUNT) {
            Bundle arguments = getArguments();
            o.LJI(arguments);
            Serializable serializable = arguments.getSerializable("auto_fill_phone_number");
            C86804Y4y c86804Y4y = null;
            if ((serializable instanceof PhoneNumberUtil.PhoneNumber) && (phoneNumber = (PhoneNumberUtil.PhoneNumber) serializable) != null) {
                try {
                    if (CastLongProtector.parseLong(phoneNumber.getNationalNumber()) != 0) {
                        C85665Xjh c85665Xjh2 = (C85665Xjh) _$_findCachedViewById(R.id.hnm);
                        String nationalNumber = phoneNumber.getNationalNumber();
                        nationalNumber.toString();
                        c85665Xjh2.setPhoneNumber(nationalNumber);
                    }
                } catch (Exception unused) {
                }
                AbstractC65590Pog<C86804Y4y> abstractC65590Pog = C86804Y4y.LJLJL;
                if (abstractC65590Pog != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = abstractC65590Pog.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C86804Y4y c86804Y4y2 = (C86804Y4y) next;
                        if (c86804Y4y2.L() == phoneNumber.getCountryCode() && ((countryIso = phoneNumber.getCountryIso()) == null || countryIso.length() == 0 || o.LJ(c86804Y4y2.LJLJI, phoneNumber.getCountryIso()))) {
                            arrayList.add(next);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        c86804Y4y = (C86804Y4y) ListProtector.get(arrayList, 0);
                    }
                }
                ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).setCountry(c86804Y4y);
            }
        }
        if (((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getCountryCodeString().length() == 0 && ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getCountryName().length() == 0) {
            ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).LIZJ();
        }
        if (this.LLD) {
            Rl();
            this.LLD = false;
        }
    }

    public final void Sl(boolean z, boolean z2, boolean z3) {
        if (_$_findCachedViewById(R.id.hnm) != null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            boolean z4 = false;
            if (mo49getActivity != null && mo49getActivity.isFinishing()) {
                return;
            }
            RBV.LJIIL(this, ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getPhoneNumberObject());
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_LOGIN.getValue());
            arguments.putInt("current_scene", EnumC69116RAq.LOGIN.getValue());
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.getString("auto_fill_for_auto_test_sms", "");
            }
            if (xl() == EnumC69116RAq.RECOVER_ACCOUNT) {
                z4 = true;
            }
            arguments.putBoolean("recover_mobile_code", z4);
            arguments.putBoolean("code_sent", z2);
            arguments.putBoolean("use_whatsapp", z);
            arguments.putBoolean("from_choose_dialog", z3);
            arguments.putSerializable("args_phone_number", ((C85665Xjh) _$_findCachedViewById(R.id.hnm)).getPhoneNumberObject());
            rh(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C67714Qhq) this.LLFFF.getValue()).LIZIZ(i, i2, intent);
    }
}
