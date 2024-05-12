package X;

import Y.IDeS356S0100000_11;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.services.interceptor.ConditionalBindLoginParam;
import com.ss.android.ugc.aweme.services.interceptor.ForcePhoneVerificationManager;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R72 {
    public static boolean LIZ(InterfaceC69056R8i interfaceC69056R8i, Activity activity, Bundle bundle) {
        EnumC69116RAq enumC69116RAq;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        ForcePhoneVerificationManager forcePhoneVerificationManager = ForcePhoneVerificationManager.INSTANCE;
        if (forcePhoneVerificationManager.getConditionalBindLoginParam() == null) {
            return false;
        }
        ConditionalBindLoginParam conditionalBindLoginParam = forcePhoneVerificationManager.getConditionalBindLoginParam();
        if (conditionalBindLoginParam != null && conditionalBindLoginParam.isRegister()) {
            enumC69116RAq = EnumC69116RAq.SIGN_UP;
        } else {
            enumC69116RAq = EnumC69116RAq.LOGIN;
        }
        if (interfaceC69056R8i != null) {
            bundle.putInt("next_page", EnumC69113RAn.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE.getValue());
            interfaceC69056R8i.rh(bundle);
        } else {
            CommonFlowActivity.Companion.LIZIZ(activity, EnumC69113RAn.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE, enumC69116RAq, bundle, new IDeS356S0100000_11(activity, 0), null, Boolean.FALSE);
        }
        return true;
    }
}
