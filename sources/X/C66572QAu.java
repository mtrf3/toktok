package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.network.ttp.TTPSettingsObject;

/* renamed from: X.QAu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66572QAu {
    public static final C66572QAu LIZ = new C66572QAu();
    public static final TTPSettingsObject LIZIZ = new TTPSettingsObject(false, C47261Igj.LJJIJIIJI("api16-normal-c-alisg.tiktokv.com", "api16-normal-useast5.us.tiktokv.com"), C47261Igj.LJJIJIIJI("/user/mobile/send_code/", "/user/mobile/send_code/v1/", "/passport/mobile/send_code/", "/passport/mobile/send_code/v1/", "/passport/mobile/send_voice_code/"), C47261Igj.LJJIJIIJI(8, 9, 10, 20, 21, 26, 42), C47261Igj.LJJIJ("/passport/email/send_code/"), C47261Igj.LJJIJIIJI(6, 7, 8), C47261Igj.LJJIJIIJI("/passport/app/region/", "/passport/app/region_alert/", "/passport/app/auth_broadcast/", "/passport/account/info/v2/", "/passport/token/beat/v2/", "/passport/account/set/", "/passport/web/account/set/", "/passport/password/change/", "/passport/web/password/change/", "/user/mobile/change_password/", "/open/api/user/mobile/change_password/", "/user/mobile/change_password/v1/", "/passport/web/email/change_password/", "/passport/email/change_password/", "/passport/account/set/", "/passport/web/account/set/", "/passport/password/set/", "/passport/password/set_by_verify_ticket/", "/passport/web/password_set/", "/passport/password/update/", "/passport/web/password/update/", "/passport/mobile/authorize/", "/passport/email/bind_email_for_device_login/", "/passport/email/bind_without_verify/", "/passport/mobile/bind/v1/", "/passport/web/mobile/bind/", "/user/mobile/bind_mobile/", "/open/api/user/mobile/bind_mobile/", "/user/mobile/lbind_mobile/v1/", "/passport/mobile/bind_with_change_password/", "/passport/web/mobile/bind_with_2sv/", "/passport/account/authorize/", "/passport/web/account/authorzie/", "/passport/account/verify/", "/passport/web/account/verify/", "/passport/auth/get_nonce/", "/passport/mobile/authorize/", "/passport/mobile/bind/v1/", "/passport/web/mobile/bind/", "/user/mobile/bind_mobile/", "/user/mobile/bind_mobile/v1/", "/open/api/user/mobile/bind_mobile/", "/user/mobile/bind_mobile/v1/", "/passport/mobile/bind_with_change_password/", "/passport/web/mobile/bind_with_2sv/", "/passport/account/authorize/", "/passport/web/account/authorzie/", "/passport/account/verify/", "/passport/web/account/verify/", "/passport/user/change_mobile/submit_mobile/", "/passport/mobile/change/", "/passport/mobile/change/v1/", "/user/mobile/change_mobile/", "/passport/web/mobile/change/", "/passport/safe/get_user_worth/", "/passport/mobile/check_unusable/", "/passport/mobile/bind_for_connect/", "/passport/mobile/can_send_voice_code/", "/passport/mobile/conditional_bind_login/", "/passport/email/bind_email_for_device_login/", "/passport/email/bind_without_verify/", "/passport/account/authorize/", "/passport/web/account/authorzie/", "/passport/account/verify/", "/passport/web/account/verify/", "/passport/email/bind/", "/passport/web/email/bind/", "/passport/email/bind_and_verify/", "/passport/email/bind_with_change_password/", "/passport/email/bind_with_set_password/", "/passport/web/email/bind_with_2sv/", "/passport/email/change/", "/passport/web/email/change/", "/passport/email/change_with_update_password/"), 3);

    public static TTPSettingsObject LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TTPSettingsObject tTPSettingsObject = LIZIZ;
        TTPSettingsObject tTPSettingsObject2 = (TTPSettingsObject) LIZLLL.LJIIIIZZ("ttp_login_assurance_config", TTPSettingsObject.class, tTPSettingsObject);
        if (tTPSettingsObject2 == null) {
            return tTPSettingsObject;
        }
        return tTPSettingsObject2;
    }
}
