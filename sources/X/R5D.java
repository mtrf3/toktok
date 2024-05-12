package X;

import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5D {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(BaseLoginMethod method) {
        o.LJIIIZ(method, "method");
        if (method.m102isOneClickLogin()) {
            return "oneclick";
        }
        return "history";
    }

    public static String LIZIZ(BaseLoginMethod baseLoginMethod) {
        o.LJIIIZ(baseLoginMethod, "baseLoginMethod");
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        if (loginMethodName == LoginMethodName.EMAIL_PASS) {
            return "email";
        }
        if (loginMethodName == LoginMethodName.USER_NAME_PASS) {
            return "username";
        }
        if (loginMethodName == LoginMethodName.PHONE_NUMBER_PASS) {
            return "phone";
        }
        if (loginMethodName == LoginMethodName.PHONE_SMS) {
            return "sms_verification";
        }
        if (loginMethodName == LoginMethodName.THIRD_PARTY) {
            return baseLoginMethod.findPlatform();
        }
        return "";
    }
}
