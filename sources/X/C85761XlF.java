package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.LoginFailureEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.LoginNotifyEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.LoginSubmitEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.RespondCreatePasskeyPromptEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowCreatePasskeyFailToastEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.ShowCreatePasskeyPromptEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.TryShowPasskeyLoginEvent;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.TryShowPasskeySetupEvent;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import kotlin.jvm.internal.o;

/* renamed from: X.XlF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85761XlF {
    public static void LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        LoginNotifyEvent loginNotifyEvent = new LoginNotifyEvent();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_from");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        loginNotifyEvent.LIZLLL(LLJJIJIIJIL, "enter_from");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_method");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        loginNotifyEvent.LIZLLL(LLJJIJIIJIL2, "enter_method");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_type");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        loginNotifyEvent.LIZLLL(LLJJIJIIJIL3, "enter_type");
        loginNotifyEvent.LIZLLL("passkey", "platform");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "login_panel_type");
        if (LLJJIJIIJIL4 != null) {
            str = LLJJIJIIJIL4;
        }
        loginNotifyEvent.LIZLLL(str, "login_panel_type");
        loginNotifyEvent.LJFF();
    }

    public static void LIZJ(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        LoginSubmitEvent loginSubmitEvent = new LoginSubmitEvent();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_from");
        String str2 = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        loginSubmitEvent.LIZLLL(LLJJIJIIJIL, "enter_from");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_method");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        loginSubmitEvent.LIZLLL(LLJJIJIIJIL2, "enter_method");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "enter_type");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        loginSubmitEvent.LIZLLL(LLJJIJIIJIL3, "enter_type");
        loginSubmitEvent.LIZLLL(str, "platform");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(activity.getIntent(), "login_panel_type");
        if (LLJJIJIIJIL4 != null) {
            str2 = LLJJIJIIJIL4;
        }
        loginSubmitEvent.LIZLLL(str2, "login_panel_type");
        loginSubmitEvent.LJFF();
    }

    public static void LJFF(Boolean bool, boolean z) {
        String str;
        String str2;
        if (z) {
            str = "personal_homepage";
        } else {
            str = "account_page";
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            str2 = "first_passkey";
        } else {
            str2 = "replace_passkey";
        }
        ShowCreatePasskeyPromptEvent showCreatePasskeyPromptEvent = new ShowCreatePasskeyPromptEvent();
        showCreatePasskeyPromptEvent.LIZLLL(str, "enter_from");
        showCreatePasskeyPromptEvent.LIZLLL(str2, "enter_method");
        if (z) {
            showCreatePasskeyPromptEvent.LIZLLL(Integer.valueOf(PasskeyPopUpHelper.LJ().LIZLLL()), "show_num");
        }
        showCreatePasskeyPromptEvent.LJFF();
    }

    public static void LJI(int i, boolean z) {
        int i2;
        boolean LIZ = IG1.LIZ();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TryShowPasskeyLoginEvent tryShowPasskeyLoginEvent = new TryShowPasskeyLoginEvent();
        tryShowPasskeyLoginEvent.LIZLLL("login_page", "enter_method");
        tryShowPasskeyLoginEvent.LIZLLL(Integer.valueOf(i), "error_code");
        tryShowPasskeyLoginEvent.LIZLLL(Integer.valueOf(LIZ ? 1 : 0), "has_screen_lock");
        tryShowPasskeyLoginEvent.LIZLLL(Integer.valueOf(i2), "has_google_account");
        tryShowPasskeyLoginEvent.LJFF();
    }

    public static void LIZLLL(boolean z, boolean z2, int i) {
        String str;
        String str2;
        RespondCreatePasskeyPromptEvent respondCreatePasskeyPromptEvent = new RespondCreatePasskeyPromptEvent();
        if (z) {
            str = "personal_homepage";
        } else {
            str = "account_page";
        }
        respondCreatePasskeyPromptEvent.LIZLLL(str, "enter_from");
        if (z2) {
            str2 = "first_passkey";
        } else {
            str2 = "replace_passkey";
        }
        respondCreatePasskeyPromptEvent.LIZLLL(str2, "enter_method");
        respondCreatePasskeyPromptEvent.LIZLLL(Integer.valueOf(i), "result");
        if (z) {
            respondCreatePasskeyPromptEvent.LIZLLL(Integer.valueOf(PasskeyPopUpHelper.LJ().LIZLLL()), "show_num");
        }
        respondCreatePasskeyPromptEvent.LJFF();
    }

    public static void LIZ(AuthorizeActivity authorizeActivity, String str, String errorCode, String str2) {
        o.LJIIIZ(errorCode, "errorCode");
        LoginFailureEvent loginFailureEvent = new LoginFailureEvent();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(authorizeActivity.getIntent(), "enter_from");
        String str3 = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        loginFailureEvent.LIZLLL(LLJJIJIIJIL, "enter_from");
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(authorizeActivity.getIntent(), "enter_method");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        loginFailureEvent.LIZLLL(LLJJIJIIJIL2, "enter_method");
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(authorizeActivity.getIntent(), "enter_type");
        if (LLJJIJIIJIL3 == null) {
            LLJJIJIIJIL3 = "";
        }
        loginFailureEvent.LIZLLL(LLJJIJIIJIL3, "enter_type");
        loginFailureEvent.LIZLLL(str, "platform");
        String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(authorizeActivity.getIntent(), "login_panel_type");
        if (LLJJIJIIJIL4 != null) {
            str3 = LLJJIJIIJIL4;
        }
        loginFailureEvent.LIZLLL(str3, "login_panel_type");
        loginFailureEvent.LIZLLL(errorCode, "error_code");
        loginFailureEvent.LIZLLL(str2, "error_desc");
        loginFailureEvent.LJFF();
    }

    public static void LJ(boolean z, boolean z2, Boolean bool, int i) {
        String str;
        String str2;
        if (z2) {
            str = "personal_homepage";
        } else {
            str = "account_page";
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            str2 = "first_passkey";
        } else {
            str2 = "replace_passkey";
        }
        boolean LIZ = IG1.LIZ();
        ShowCreatePasskeyFailToastEvent showCreatePasskeyFailToastEvent = new ShowCreatePasskeyFailToastEvent();
        showCreatePasskeyFailToastEvent.LIZLLL(str, "enter_from");
        showCreatePasskeyFailToastEvent.LIZLLL(str2, "enter_method");
        showCreatePasskeyFailToastEvent.LIZLLL(Integer.valueOf(i), "error_code");
        showCreatePasskeyFailToastEvent.LIZLLL(Integer.valueOf(LIZ ? 1 : 0), "has_screen_lock");
        showCreatePasskeyFailToastEvent.LIZLLL(Integer.valueOf(z ? 1 : 0), "has_google_account");
        showCreatePasskeyFailToastEvent.LJFF();
    }

    public static void LJII(boolean z, boolean z2, Boolean bool, int i) {
        String str;
        int i2;
        if (z2) {
            str = "personal_homepage";
        } else {
            str = "info_page";
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            i2 = 1;
        } else if (o.LJ(bool, Boolean.FALSE)) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        boolean LIZ = IG1.LIZ();
        TryShowPasskeySetupEvent tryShowPasskeySetupEvent = new TryShowPasskeySetupEvent();
        tryShowPasskeySetupEvent.LIZLLL(str, "enter_from");
        tryShowPasskeySetupEvent.LIZLLL(Integer.valueOf(i2), "result");
        tryShowPasskeySetupEvent.LIZLLL(Integer.valueOf(i), "error_code");
        tryShowPasskeySetupEvent.LIZLLL(Integer.valueOf(LIZ ? 1 : 0), "has_screen_lock");
        tryShowPasskeySetupEvent.LIZLLL(Integer.valueOf(z ? 1 : 0), "has_google_account");
        tryShowPasskeySetupEvent.LJFF();
    }
}
