package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SignUpTermsConsentFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.RAz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C69125RAz extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C69125RAz(Object obj) {
        super(0, obj, SignUpTermsConsentFragment.class, "onNextAction", "onNextAction()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Bundle arguments;
        SignUpTermsConsentFragment signUpTermsConsentFragment = (SignUpTermsConsentFragment) this.receiver;
        boolean z = false;
        if (signUpTermsConsentFragment.LLD) {
            signUpTermsConsentFragment.getContext();
            try {
                z = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
            }
            if (z) {
                signUpTermsConsentFragment.LLFF = -1;
                signUpTermsConsentFragment.Ql();
            } else {
                C26045AKb c26045AKb = new C26045AKb(signUpTermsConsentFragment);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
                return C76800UCe.LIZ;
            }
        } else if (signUpTermsConsentFragment.Al() == EnumC69113RAn.TERMS_CONSENT_SIGN_UP) {
            Bundle requireArguments = signUpTermsConsentFragment.requireArguments();
            requireArguments.putInt("next_page", EnumC69113RAn.PHONE_EMAIL_SIGN_UP.getValue());
            signUpTermsConsentFragment.rh(requireArguments);
        } else if (signUpTermsConsentFragment.Al() == EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER) {
            if (!RAJ.LIZIZ() || ((arguments = signUpTermsConsentFragment.getArguments()) != null && arguments.getInt("previous_page", -1) == EnumC69113RAn.AGE_GATE_LOGIN.getValue())) {
                String LIZ = PhoneNumberUtil.LIZ(RBV.LJ(signUpTermsConsentFragment));
                o.LJIIIIZZ(LIZ, "formatNumber(phoneNumber)");
                C69093R9t.LJIILIIL(signUpTermsConsentFragment, EnumC69116RAq.SIGN_UP, signUpTermsConsentFragment.Al(), signUpTermsConsentFragment, LIZ, signUpTermsConsentFragment.LLFFF, true).LJIILL();
            } else {
                Bundle arguments2 = signUpTermsConsentFragment.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", EnumC69113RAn.AGE_GATE_SIGN_UP.getValue());
                arguments2.putString("sms_code_key", signUpTermsConsentFragment.LLFFF);
                signUpTermsConsentFragment.rh(arguments2);
            }
        } else if (signUpTermsConsentFragment.Al() == EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER_PHONE_RECYCLE_PROCESS_LOGIN) {
            PhoneNumberUtil.PhoneNumber LJ = RBV.LJ(signUpTermsConsentFragment);
            EnumC69116RAq enumC69116RAq = EnumC69116RAq.SIGN_UP;
            EnumC69113RAn Al = signUpTermsConsentFragment.Al();
            String LIZ2 = PhoneNumberUtil.LIZ(LJ);
            String str = signUpTermsConsentFragment.LLFFF;
            signUpTermsConsentFragment = signUpTermsConsentFragment;
            C69093R9t.LJIILJJIL(signUpTermsConsentFragment, signUpTermsConsentFragment, enumC69116RAq, Al, LIZ2, str, null).LJIILL();
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", signUpTermsConsentFragment.getEnterFrom());
        c35936E8m.LIZLLL("enter_method", signUpTermsConsentFragment.getEnterMethod());
        c35936E8m.LIZLLL("platform", signUpTermsConsentFragment.LL);
        FMX.LJIIL("register_terms_click_next", c35936E8m.LIZ);
        return C76800UCe.LIZ;
    }
}
