package X;

import Y.AgS115S0200000_15;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ChangeRemoveBindingResultEvent;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.unbind.IUnbindApi;
import com.ss.android.ugc.aweme.account.unbind.UnbindResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.UserStore;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Xj9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85631Xj9 {
    public static final /* synthetic */ int LIZ = 0;

    public static List LJ() {
        JSONArray jSONArray;
        boolean z;
        JSONObject jSONObject;
        QTX LIZJ = C36244EKi.LIZJ();
        if (LIZJ != null && (jSONObject = LIZJ.LJIIL) != null) {
            jSONArray = jSONObject.optJSONArray("connects");
        } else {
            jSONArray = null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String platform = JSONObjectProtectorUtils.getString(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), "platform");
                    o.LJIIIIZZ(platform, "platform");
                    if (platform.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        linkedHashSet.add(platform);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return ORZ.LLJI(linkedHashSet);
    }

    public static ArrayList LIZJ(boolean z) {
        User LIZJ = UserStore.LIZJ(false);
        ArrayList arrayList = new ArrayList();
        if (LIZJ.isHasEmail() && z) {
            arrayList.add("email");
        }
        if (LIZJ.isPhoneBinded() && !z) {
            arrayList.add("mobile");
        }
        arrayList.addAll(LJ());
        return arrayList;
    }

    public static List LIZLLL(BaseAccountFlowFragment fragment) {
        ArrayList arrayList;
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("eligible_verification_methods");
        }
        if (!(serializable instanceof ArrayList) || (arrayList = (ArrayList) serializable) == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(ORZ.LLIL(arrayList));
        if (LJIIIZ(fragment)) {
            arrayList2.remove(VerificationMethodType.MOBILE);
        } else if (LJIIIIZZ(fragment)) {
            arrayList2.remove(VerificationMethodType.EMAIL);
        } else if (fragment.Al() == EnumC69113RAn.VERIFY_PASSWORD || fragment.Al() == EnumC69113RAn.UNBIND_PHONE_VERIFY_USING_PASSWORD || fragment.Al() == EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_PASSWORD) {
            arrayList2.remove(VerificationMethodType.PASSWORD);
        }
        return arrayList2;
    }

    public static String LJFF(BaseAccountFlowFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments.getString("passport_ticket");
        }
        return null;
    }

    public static java.util.Map LJI(BaseAccountFlowFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        String LJFF = LJFF(fragment);
        if (LJFF != null) {
            return E2C.LIZJ("passport_ticket", LJFF);
        }
        return C113554cx.LJJJLIIL();
    }

    public static boolean LJIIIIZZ(BaseAccountFlowFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return C47261Igj.LJJIJIIJI(EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_EMAIL, EnumC69113RAn.VERIFY_EMAIL_BEFORE_CHANGE, EnumC69113RAn.UNBIND_PHONE_VERIFY_USING_EMAIL, EnumC69113RAn.EMAIL_SMS_VERIFY, EnumC69113RAn.EMAIL_SMS_CHANGE, EnumC69113RAn.EMAIL_SMS_BIND).contains(fragment.Al());
    }

    public static boolean LJIIIZ(BaseAccountFlowFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return C47261Igj.LJJIJIIJI(EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_PHONE, EnumC69113RAn.UNBIND_PHONE_VERIFY, EnumC69113RAn.PHONE_SMS_VERIFY, EnumC69113RAn.PHONE_SMS_BIND, EnumC69113RAn.PHONE_SMS_MODIFY).contains(fragment.Al());
    }

    public static void LIZ(BaseAccountFlowFragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        XJ4 xj4 = IUnbindApi.LIZ;
        String LJFF = LJFF(fragment);
        if (LJFF == null) {
            LJFF = "";
        }
        xj4.getClass();
        IUnbindApi iUnbindApi = XJ4.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(EFJ.LIZJ);
        LIZ2.append("/passport/email/unbind/");
        String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(LIZLLL, "getCsrfToken(CommonConst…X_SI + PATH_UNBIND_EMAIL)");
        iUnbindApi.unbindEmailWithPassportTicket(LJFF, LIZLLL).LJ(new AgS115S0200000_15(fragment, interfaceC65784Pro, 1), C10K.LJIIIIZZ, null);
    }

    public static void LIZIZ(BaseAccountFlowFragment fragment, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(fragment, "fragment");
        XJ4 xj4 = IUnbindApi.LIZ;
        String LJFF = LJFF(fragment);
        if (LJFF == null) {
            LJFF = "";
        }
        xj4.getClass();
        IUnbindApi iUnbindApi = XJ4.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(EFJ.LIZJ);
        LIZ2.append("/passport/mobile/unbind/");
        String LIZLLL = AbstractC66965QPx.LIZLLL(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(LIZLLL, "getCsrfToken(CommonConst…_SI + PATH_UNBIND_MOBILE)");
        iUnbindApi.unbindMobileWithPassportTicket(LJFF, LIZLLL).LJ(new AgS115S0200000_15(fragment, interfaceC65784Pro, 2), C10K.LJIIIIZZ, null);
    }

    public static void LJII(BaseAccountFlowFragment baseAccountFlowFragment, C10K c10k, boolean z) {
        boolean z2;
        Integer num;
        if (!C82544WaS.LJ(c10k) || ((UnbindResponse) c10k.LJIIJJI()).data == null) {
            C26045AKb c26045AKb = new C26045AKb(baseAccountFlowFragment);
            c26045AKb.LJIIIIZZ(R.string.gqr);
            c26045AKb.LJIIJ();
            return;
        }
        UnbindResponse.Data data = ((UnbindResponse) c10k.LJIIJJI()).data;
        if (data != null && data.errorCode == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            User LIZJ = R41.LIZJ();
            if (C85642XjK.LIZIZ(baseAccountFlowFragment)) {
                LIZJ.setPhoneBinded(false);
                LIZJ.setBindPhone("");
            } else {
                LIZJ.setHasEmail(false);
                LIZJ.setEmail("");
                LIZJ.setEmailVerified(false);
            }
            C77266UUc c77266UUc = C77266UUc.LIZIZ;
            c77266UUc.LJIJ().LIZJ();
            c77266UUc.LJIJ().LIZIZ(System.currentTimeMillis());
            Bundle bundle = new Bundle();
            bundle.putBoolean("unbind_success", true);
            bundle.putInt("unbind_type", baseAccountFlowFragment.xl().getValue());
            baseAccountFlowFragment.Dl(bundle);
            String enterFrom = baseAccountFlowFragment.getEnterFrom();
            o.LJIIIIZZ(enterFrom, "fragment.enterFrom");
            String enterMethod = baseAccountFlowFragment.getEnterMethod();
            o.LJIIIIZZ(enterMethod, "fragment.enterMethod");
            LJIIJ(baseAccountFlowFragment, z, enterFrom, enterMethod, String.valueOf(data.errorCode), 1, true);
            return;
        }
        Bundle LIZ2 = C01R.LIZ("unbind_success", false);
        LIZ2.putInt("unbind_type", baseAccountFlowFragment.xl().getValue());
        baseAccountFlowFragment.Dl(LIZ2);
        String enterFrom2 = baseAccountFlowFragment.getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "fragment.enterFrom");
        String enterMethod2 = baseAccountFlowFragment.getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "fragment.enterMethod");
        if (data != null) {
            num = Integer.valueOf(data.errorCode);
        } else {
            num = null;
        }
        LJIIJ(baseAccountFlowFragment, z, enterFrom2, enterMethod2, String.valueOf(num), 0, true);
    }

    public static void LJIIJJI(BaseAccountFlowFragment fragment, int i, int i2) {
        String str;
        o.LJIIIZ(fragment, "fragment");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(i2, "error_code");
        c35936E8m.LIZLLL("enter_from", fragment.getEnterFrom());
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            str = arguments.getString("page");
        } else {
            str = null;
        }
        c35936E8m.LIZLLL("page", str);
        c35936E8m.LIZLLL("enter_method", fragment.getEnterMethod());
        c35936E8m.LIZ(i, "is_success");
        FMX.LJIIL("sms_code_verification_result", c35936E8m.LIZ);
    }

    public static void LJIIJ(BaseAccountFlowFragment fragment, boolean z, String str, String str2, String errorCode, int i, boolean z2) {
        EnumC85632XjA actionType;
        EnumC85643XjL enumC85643XjL;
        IMJ isSafeEnv;
        IML isEmailVerified;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(errorCode, "errorCode");
        ChangeRemoveBindingResultEvent changeRemoveBindingResultEvent = new ChangeRemoveBindingResultEvent();
        changeRemoveBindingResultEvent.LIZLLL(errorCode, "error_code");
        changeRemoveBindingResultEvent.LIZLLL(str, "enter_from");
        changeRemoveBindingResultEvent.LIZLLL(str2, "enter_method");
        if (z2) {
            actionType = EnumC85632XjA.UNLINK;
        } else {
            actionType = EnumC85632XjA.CHANGE;
        }
        o.LJIIIZ(actionType, "actionType");
        changeRemoveBindingResultEvent.LIZLLL(actionType.getValue(), "action_type");
        if (z) {
            enumC85643XjL = EnumC85643XjL.PHONE;
        } else {
            enumC85643XjL = EnumC85643XjL.EMAIL;
        }
        String unlinkType = enumC85643XjL.getValue();
        o.LJIIIZ(unlinkType, "unlinkType");
        changeRemoveBindingResultEvent.LIZLLL(unlinkType, "unlink_type");
        Bundle arguments = fragment.getArguments();
        if (arguments != null && arguments.getBoolean("is_safe_env")) {
            isSafeEnv = IMJ.DIGITAL_1;
        } else {
            isSafeEnv = IMJ.DIGITAL_0;
        }
        o.LJIIIZ(isSafeEnv, "isSafeEnv");
        changeRemoveBindingResultEvent.LIZLLL(Integer.valueOf(isSafeEnv.getValue()), "is_safe_env");
        if (z) {
            isEmailVerified = IML.NULL;
        } else if (R41.LIZJ().isEmailVerified()) {
            isEmailVerified = IML.DIGITAL_1;
        } else {
            isEmailVerified = IML.DIGITAL_0;
        }
        o.LJIIIZ(isEmailVerified, "isEmailVerified");
        changeRemoveBindingResultEvent.LIZLLL(isEmailVerified.getValue(), "is_email_verified");
        String isSuccess = String.valueOf(i);
        o.LJIIIZ(isSuccess, "isSuccess");
        changeRemoveBindingResultEvent.LIZLLL(isSuccess, "is_success");
        changeRemoveBindingResultEvent.LJFF();
    }
}
