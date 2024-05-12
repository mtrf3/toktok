package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C35936E8m;
import X.C56662Kg;
import X.C68972R5c;
import X.C77117UOj;
import X.C85579XiJ;
import X.E6T;
import X.EOO;
import X.FMX;
import X.MLL;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.google.android.gms.auth.api.credentials.Credential;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class SmartLockEventHelper {
    public static final SmartLockEventHelper INSTANCE = new SmartLockEventHelper();
    public static long enableTokenTime;
    public static long loginStartTime;
    public static long readSmartLockTime;

    public final void onGoogleServiceNotReady$account_awemeaccount_release() {
        FMX.onEventV3("google_service_not_ready");
    }

    public final void onCheckSmartLockInfo$account_awemeaccount_release(boolean z) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(z ? 1 : 0, "has_smart_lock_info");
        FMX.LJIIL("check_smart_lock_info", c35936E8m.LIZ);
    }

    public final void onEnableToken$account_awemeaccount_release(int i) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", C77117UOj.LJJIFFI(i));
        FMX.LJIIL("enable_token", c35936E8m.LIZ);
        enableTokenTime = SystemClock.elapsedRealtime();
    }

    public final void onEnableTokenSuccess$account_awemeaccount_release(int i) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", C77117UOj.LJJIFFI(i));
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - enableTokenTime, "duration");
        FMX.LJIIL("enable_token_success", c35936E8m.LIZ);
    }

    public final void onReadSmartLock$account_awemeaccount_release(String readType) {
        o.LJIIIZ(readType, "readType");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("read_type", readType);
        FMX.LJIIL("read_smart_lock", c35936E8m.LIZ);
        readSmartLockTime = SystemClock.elapsedRealtime();
    }

    public final void onReadSmartLockSuccess$account_awemeaccount_release(String readType) {
        o.LJIIIZ(readType, "readType");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("read_type", readType);
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - readSmartLockTime, "duration");
        FMX.LJIIL("read_smart_lock_success", c35936E8m.LIZ);
    }

    public final void onEnableTokenFail$account_awemeaccount_release(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", C77117UOj.LJJIFFI(i));
        c35936E8m.LIZLLL("error_msg", errorMsg);
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - enableTokenTime, "duration");
        FMX.LJIIL("enable_token_fail", c35936E8m.LIZ);
    }

    public final void onReadSmartLockFail$account_awemeaccount_release(String readType, String errorMsg) {
        o.LJIIIZ(readType, "readType");
        o.LJIIIZ(errorMsg, "errorMsg");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("read_type", readType);
        c35936E8m.LIZLLL("error_msg", errorMsg);
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - readSmartLockTime, "duration");
        FMX.LJIIL("read_smart_lock_fail", c35936E8m.LIZ);
    }

    public final void onSaveCredentialFail$account_awemeaccount_release(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("exit_method", errorMsg);
        c35936E8m.LIZLLL("enter_from", C77117UOj.LJJIFFI(i));
        FMX.LJIIL("express_login_authority_finish", c35936E8m.LIZ);
    }

    public final void onSaveCredentialSuccess$account_awemeaccount_release(int i, String type) {
        o.LJIIIZ(type, "type");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("exit_method", "save");
        c35936E8m.LIZ(1, "is_token_return_success");
        c35936E8m.LIZLLL("enter_from", C77117UOj.LJJIFFI(i));
        c35936E8m.LIZLLL("type", type);
        FMX.LJIIL("express_login_authority_finish", c35936E8m.LIZ);
    }

    public final void sendParseCredentialEvent$account_awemeaccount_release(Credential credential, String errorMsg, boolean z) {
        String str;
        int i;
        int i2;
        String str2;
        String uri;
        o.LJIIIZ(credential, "credential");
        o.LJIIIZ(errorMsg, "errorMsg");
        String str3 = credential.zba;
        int i3 = 0;
        if (str3 != null && !"".equals(str3) && PatternProtector.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*").matcher(str3).matches()) {
            str = "email";
        } else {
            String str4 = credential.zba;
            o.LJIIIIZZ(str4, "credential.id");
            if (s.LJJJLZIJ(str4, "+", false)) {
                str = "maybe_phone_number";
            } else {
                str = "other";
            }
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("error_msg", errorMsg);
        c35936E8m.LIZLLL("credential_id_type", str);
        c35936E8m.LIZ(credential.zba.length(), "credential_id_length");
        String str5 = credential.zbe;
        if (str5 == null || str5.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c35936E8m.LIZ(i, "credential_password_is_empty");
        String str6 = credential.zbb;
        if (str6 == null || str6.length() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c35936E8m.LIZ(i2, "credential_name_is_empty");
        Uri uri2 = credential.zbc;
        if (uri2 == null || (uri = uri2.toString()) == null || uri.length() == 0) {
            i3 = 1;
        }
        c35936E8m.LIZ(i3, "credential_picture_is_empty");
        if (z) {
            str2 = "auto_login";
        } else {
            str2 = "click_login";
        }
        c35936E8m.LIZLLL("express_login_type", str2);
        FMX.LJIIL("parse_credential_error", c35936E8m.LIZ);
    }

    private final C35936E8m getLoginEventBuilder(Activity activity, MLL mll, long j, String str) {
        C35936E8m c35936E8m = new C35936E8m();
        Bundle LLJJIJI = C16880lQ.LLJJIJI(activity.getIntent());
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        Map LIZJ = C68972R5c.LIZJ(LLJJIJI);
        HashMap hashMap = new HashMap();
        if (LIZJ != null) {
            hashMap.putAll(LIZJ);
        }
        C68972R5c.LIZIZ(c35936E8m, hashMap);
        c35936E8m.LIZLLL("enter_from", str);
        String string = LLJJIJI.getString("login_panel_type");
        String str2 = "";
        if (string == null) {
            string = "";
        }
        c35936E8m.LIZLLL("login_panel_type", string);
        String string2 = LLJJIJI.getString("channel");
        if (string2 == null) {
            string2 = "";
        }
        c35936E8m.LIZLLL("channel", string2);
        c35936E8m.LIZ(0, "is_register");
        c35936E8m.LIZ(0, "error_code");
        c35936E8m.LIZLLL("user_id", mll.LIZ);
        c35936E8m.LIZLLL("carrier", C85579XiJ.LIZ());
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - j, "stay_time");
        c35936E8m.LIZLLL("platform", "express_login");
        String string3 = LLJJIJI.getString("group_id");
        if (string3 == null) {
            string3 = "";
        }
        c35936E8m.LIZLLL("group_id", string3);
        String string4 = LLJJIJI.getString("author_id");
        if (string4 == null) {
            string4 = "";
        }
        c35936E8m.LIZLLL("author_id", string4);
        String string5 = LLJJIJI.getString("log_pb");
        if (TextUtils.isEmpty(string5)) {
            string5 = "";
        }
        c35936E8m.LIZLLL("log_pb", string5);
        String string6 = LLJJIJI.getString("previous_login_method");
        if (string6 != null) {
            str2 = string6;
        }
        c35936E8m.LIZLLL("previous_login_method", str2);
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
        if (LIZIZ != null) {
            c35936E8m.LIZ(LIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        c35936E8m.LIZ(E6T.LJIIIIZZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c35936E8m.LIZ(1, "is_express_login");
        return c35936E8m;
    }

    public final void onLoginStart$account_awemeaccount_release(Activity activity, MLL account, long j, String enterFrom) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(account, "account");
        o.LJIIIZ(enterFrom, "enterFrom");
        C35936E8m loginEventBuilder = getLoginEventBuilder(activity, account, j, enterFrom);
        C68972R5c.LIZ(loginEventBuilder);
        FMX.LJIIL("login_submit", loginEventBuilder.LIZ);
        loginStartTime = SystemClock.elapsedRealtime();
    }

    public final void onLoginSuccess$account_awemeaccount_release(Activity activity, MLL account, long j, String enterFrom) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(account, "account");
        o.LJIIIZ(enterFrom, "enterFrom");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - j, "stay_time");
        c35936E8m.LIZIZ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "cold_start_to_express_login_success_duration");
        c35936E8m.LIZLLL("enter_method", enterFrom);
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - loginStartTime, "duration");
        FMX.LJIIL("express_login_success", c35936E8m.LIZ);
        C35936E8m loginEventBuilder = getLoginEventBuilder(activity, account, j, enterFrom);
        C68972R5c.LIZ(loginEventBuilder);
        FMX.LJIIL("login_success", loginEventBuilder.LIZ);
    }

    public final void onLoginFail$account_awemeaccount_release(Activity activity, MLL account, long j, String enterFrom, int i) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(account, "account");
        o.LJIIIZ(enterFrom, "enterFrom");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(i, "error_code");
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZIZ(SystemClock.elapsedRealtime() - loginStartTime, "duration");
        FMX.LJIIL("express_login_failure", c35936E8m.LIZ);
        FMX.LJIIL("login_failure", getLoginEventBuilder(activity, account, j, enterFrom).LIZ);
    }
}
