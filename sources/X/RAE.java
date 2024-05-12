package X;

import Y.AfS23S0400000_11;
import Y.AfS53S0100000_1;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public final class RAE extends AbstractC40941G4z {
    public final /* synthetic */ SignUpOrLoginActivity LIZ;
    public final /* synthetic */ EnumC69113RAn LIZIZ;
    public final /* synthetic */ Bundle LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final /* synthetic */ InterfaceC88471Ynr<String, Integer, C76800UCe> LJ;

    @Override // X.AbstractC40941G4z
    public final boolean onError(PNSErrorModel error) {
        o.LJIIIZ(error, "error");
        return false;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onCancel() {
        SignUpOrLoginActivity signUpOrLoginActivity = this.LIZ;
        EnumC69113RAn enumC69113RAn = this.LIZIZ;
        Bundle bundle = this.LIZJ;
        signUpOrLoginActivity.getClass();
        if (RAL.LIZ[enumC69113RAn.ordinal()] == 9) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("next_page", EnumC69113RAn.FINISH.getValue());
            bundle2.putInt("current_page", enumC69113RAn.getValue());
            bundle2.putInt("result_code", 0);
            signUpOrLoginActivity.LLFZ(bundle2);
        } else if (!RAJ.LIZ() || bundle == null || (!bundle.getBoolean("email_signup") && !bundle.getBoolean("phone_signup"))) {
            signUpOrLoginActivity.finish();
        }
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onDeviceBlocked() {
        this.LIZ.LLIIJI(this.LIZIZ);
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onSuccess(C62962OnO result) {
        BaseAccountFlowFragment LLFII;
        o.LJIIIZ(result, "result");
        SignUpOrLoginActivity signUpOrLoginActivity = this.LIZ;
        EnumC69113RAn enumC69113RAn = this.LIZIZ;
        Bundle bundle = this.LIZJ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
        InterfaceC88471Ynr<String, Integer, C76800UCe> interfaceC88471Ynr = this.LJ;
        signUpOrLoginActivity.getClass();
        if (bundle == null) {
            bundle = new Bundle();
        }
        String str = "";
        switch (RAL.LIZ[enumC69113RAn.ordinal()]) {
            case 8:
                if (RAJ.LIZ()) {
                    if (bundle.getBoolean("phone_signup", false)) {
                        String smsCodeKey = bundle.getString("sms_code_key", "");
                        String LIZ = PhoneNumberUtil.LIZ((PhoneNumberUtil.PhoneNumber) bundle.getSerializable("args_phone_number"));
                        o.LJIIIIZZ(LIZ, "formatNumber(DataHelper.…tPhoneFromBundle(bundle))");
                        BaseAccountFlowFragment LLFII2 = signUpOrLoginActivity.LLFII();
                        if (LLFII2 == null) {
                            return false;
                        }
                        o.LJIIIIZZ(smsCodeKey, "smsCodeKey");
                        C73636SvA.LIZ(LLFII2, LLFII2, C69093R9t.LJIILIIL(LLFII2, EnumC69116RAq.SIGN_UP, EnumC69113RAn.PHONE_SMS_SIGN_UP, LLFII2, LIZ, smsCodeKey, false).LJIIIZ(new RAB(bundle, LLFII2, signUpOrLoginActivity, interfaceC65784Pro)).LJIIIIZZ(new AfS23S0400000_11(LLFII2, interfaceC65784Pro, interfaceC88471Ynr, signUpOrLoginActivity, 2))).LJIILL();
                        return false;
                    }
                    if (!bundle.getBoolean("email_signup", false) || (LLFII = signUpOrLoginActivity.LLFII()) == null) {
                        return false;
                    }
                    SetPasswordMobHelper setPasswordMobHelper = new SetPasswordMobHelper(LLFII);
                    String string = bundle.getString("args_password", "");
                    o.LJIIIIZZ(string, "data.getString(PASSWORD, \"\")");
                    String LIZJ = RBV.LIZJ(bundle);
                    boolean z = bundle.getBoolean("is_multi_account_same_user", false);
                    RA4.Companion.getClass();
                    C73636SvA.LIZ(LLFII, LLFII, C69093R9t.LJI(LLFII, LLFII, LIZJ, string, z, false, RA4.ruleStrategies$delegate.getValue()).LJIIIZ(new RAC(bundle, setPasswordMobHelper, LLFII, string, signUpOrLoginActivity, interfaceC65784Pro)).LJIIIIZZ(new RAD(setPasswordMobHelper, LLFII, string, interfaceC65784Pro, interfaceC88471Ynr, signUpOrLoginActivity))).LJIILL();
                    return false;
                }
                bundle.putInt("next_page", EnumC69113RAn.PHONE_EMAIL_SIGN_UP.getValue());
                bundle.putInt("current_page", enumC69113RAn.getValue());
                signUpOrLoginActivity.LLFZ(bundle);
                interfaceC65784Pro.invoke();
                return false;
            case 9:
                if (a.LJIJI().LJFF()) {
                    bundle.putInt("next_page", EnumC69113RAn.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
                    bundle.putInt("current_page", enumC69113RAn.getValue());
                    signUpOrLoginActivity.LLFZ(bundle);
                } else {
                    bundle.putInt("next_page", EnumC69113RAn.FINISH.getValue());
                    bundle.putInt("current_page", enumC69113RAn.getValue());
                    bundle.putInt("result_code", -1);
                    signUpOrLoginActivity.LLFZ(bundle);
                }
                interfaceC65784Pro.invoke();
                return false;
            case 10:
                String string2 = bundle.getString("sms_code_key");
                if (string2 == null) {
                    string2 = "";
                }
                if (a.LJIJI().LJFF()) {
                    bundle.putInt("next_page", EnumC69113RAn.TERMS_CONSENT_NEW_PHONE_USER.getValue());
                    bundle.putBoolean("phone_signup", true);
                    bundle.putBoolean("age_gate_login", true);
                    bundle.putInt("previous_page", EnumC69113RAn.AGE_GATE_LOGIN.getValue());
                    String LIZ2 = PhoneNumberUtil.LIZ((PhoneNumberUtil.PhoneNumber) bundle.getSerializable("args_phone_number"));
                    o.LJIIIIZZ(LIZ2, "formatNumber(DataHelper.…tPhoneFromBundle(bundle))");
                    bundle.putString("phone_number_format", LIZ2);
                    bundle.putString("sms_code_key", string2);
                    signUpOrLoginActivity.LLFZ(bundle);
                    interfaceC65784Pro.invoke();
                    return false;
                }
                String string3 = bundle.getString("login_continue_method", "");
                BaseAccountFlowFragment LLFII3 = signUpOrLoginActivity.LLFII();
                if (LLFII3 == null) {
                    return false;
                }
                Bundle arguments = LLFII3.getArguments();
                if (arguments != null) {
                    arguments.putInt("previous_page", EnumC69113RAn.AGE_GATE_LOGIN.getValue());
                    arguments.putBoolean("age_gate_login", true);
                    arguments.putBoolean("phone_signup", true);
                }
                if (o.LJ(string3, "login_continue_method_ru")) {
                    String string4 = bundle.getString("mobile_profile");
                    if (string4 != null) {
                        str = string4;
                    }
                    C69093R9t.LIZIZ(LLFII3, LLFII3, str).LJIILL();
                    return false;
                }
                String LIZ3 = PhoneNumberUtil.LIZ(RBV.LJ(LLFII3));
                o.LJIIIIZZ(LIZ3, "formatNumber(phoneNumber)");
                C69093R9t.LJIILIIL(LLFII3, EnumC69116RAq.SIGN_UP, enumC69113RAn, LLFII3, LIZ3, string2, true).LJIIIZ(new AfS53S0100000_1(interfaceC65784Pro, 17)).LJIILL();
                return false;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                String string5 = bundle.getString("sms_code_key");
                if (string5 != null) {
                    str = string5;
                }
                RAK rak = EnumC69116RAq.Companion;
                int i = bundle.getInt("current_scene", EnumC69116RAq.NONE.getValue());
                rak.getClass();
                EnumC69116RAq enumC69116RAq = EnumC69116RAq.VALUES_MAP.get(Integer.valueOf(i));
                if (enumC69116RAq == null) {
                    enumC69116RAq = EnumC69116RAq.SIGN_UP;
                }
                BaseAccountFlowFragment LLFII4 = signUpOrLoginActivity.LLFII();
                if (LLFII4 == null) {
                    return false;
                }
                C69093R9t.LJIILJJIL(LLFII4, LLFII4, enumC69116RAq, enumC69113RAn, PhoneNumberUtil.LIZ(RBV.LJ(LLFII4)), str, null).LJIIIZ(new AfS53S0100000_1(interfaceC65784Pro, 18)).LJIILL();
                return false;
            default:
                interfaceC65784Pro.invoke();
                return false;
        }
    }

    @Override // X.AbstractC40941G4z
    public final boolean onUnderage(C62962OnO result) {
        o.LJIIIZ(result, "result");
        if (result.LIZ == EnumC63002Oo2.US_FTC) {
            SignUpOrLoginActivity signUpOrLoginActivity = this.LIZ;
            signUpOrLoginActivity.getClass();
            boolean z = signUpOrLoginActivity.LJLLILLLL;
            Bundle bundle = new Bundle();
            bundle.putInt("next_page", EnumC69113RAn.FTC_CREATE_ACCOUNT.getValue());
            bundle.putBoolean("child_account_not_expected_upon_signup_success", z);
            SmartRoute buildRoute = SmartRouter.buildRoute(signUpOrLoginActivity, "//account/ftc");
            buildRoute.withParam(bundle);
            buildRoute.open();
            signUpOrLoginActivity.finish();
            return true;
        }
        this.LIZ.LLIIJI(this.LIZIZ);
        return true;
    }

    public RAE(SignUpOrLoginActivity signUpOrLoginActivity, EnumC69113RAn enumC69113RAn, Bundle bundle, AqS161S0100000_11 aqS161S0100000_11, AqS197S0100000_15 aqS197S0100000_15) {
        this.LIZ = signUpOrLoginActivity;
        this.LIZIZ = enumC69113RAn;
        this.LIZJ = bundle;
        this.LIZLLL = aqS161S0100000_11;
        this.LJ = aqS197S0100000_15;
    }
}
