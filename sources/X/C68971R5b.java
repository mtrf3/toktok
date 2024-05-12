package X;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivityWithNoAnimation;
import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.RuInstantLoginSettingsObject;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R5b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68971R5b {
    public static void LIZJ(Activity activity, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intent intent;
        boolean z4;
        int i;
        RuInstantLoginSettingsObject.RealConfig LIZ;
        o.LJIIIZ(activity, "activity");
        if (z3) {
            intent = new Intent(activity, (Class<?>) I18nSignUpActivityWithNoAnimation.class);
        } else {
            intent = new Intent(activity, (Class<?>) I18nSignUpActivity.class);
        }
        if (bundle != null) {
            bundle.putLong("login_panel_open_time", SystemClock.elapsedRealtime());
        }
        intent.putExtra("sign_up_data", bundle);
        if (z || (bundle != null && bundle.getBoolean("show_login_page_first"))) {
            z4 = true;
        } else {
            z4 = false;
        }
        intent.putExtra("show_login_page_first", z4);
        intent.putExtra("has_callBack", z2);
        if (bundle != null && bundle.getBoolean("prevent_multiple_panels")) {
            intent.addFlags(536870912);
        }
        C16880lQ.LIZIZ(activity, intent);
        if (z3) {
            i = 0;
        } else {
            i = R.anim.a4;
        }
        activity.overridePendingTransition(i, 0);
        if (!C82727WdP.LIZ) {
            RuInstantLoginSettingsObject.RealConfig LIZ2 = C35368DuO.LIZ();
            if (LIZ2 != null && Integer.valueOf(LIZ2.type) != null && ((LIZ = C35368DuO.LIZ()) == null || LIZ.type != 0)) {
                if (!P5T.LIZIZ) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction("android.intent.action.SERVICE_STATE");
                    intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
                    if (P5T.LIZ == null) {
                        P5T.LIZ = new P5T();
                    }
                    C16880lQ.LJJLIIIJILLIZJL(P5T.LIZ, activity, intentFilter);
                    P5T.LIZIZ = true;
                }
                C82727WdP.LJFF(activity);
            }
            C82727WdP.LIZ = true;
        }
    }

    public static C35936E8m LIZ(String enterFrom, String enterMethod, String str, String str2, String str3, java.util.Map map) {
        int i;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", enterMethod);
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZ(1, "_perf_monitor");
        if (str2 == null) {
            str2 = "";
        }
        c35936E8m.LIZLLL("channel", str2);
        c35936E8m.LIZLLL("enter_type", str);
        if (str3 == null) {
            str3 = "";
        }
        c35936E8m.LIZLLL("login_panel_type", str3);
        if (C84763XOl.LJIIIIZZ() != null) {
            i = C78555UsJ.LJIJI(C84763XOl.LJIIIIZZ());
        } else {
            i = -1;
        }
        c35936E8m.LIZ(i, "google_status");
        C68972R5c.LIZIZ(c35936E8m, map);
        return c35936E8m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(String str, String str2, String str3, String str4, java.util.Map map, List list, int i, String str5, boolean z, String str6, String str7, Bundle data, boolean z2, String str8) {
        String name;
        String str9;
        o.LJIIIZ(data, "data");
        C35936E8m LIZ = LIZ(str, str2, str3, str4, str7, map);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 <= i) {
                LIZ.LIZ(1, ((C85542Xhi) ListProtector.get(list, i2)).LJ);
            } else {
                LIZ.LIZ(0, ((C85542Xhi) ListProtector.get(list, i2)).LJ);
            }
        }
        BaseLoginMethod LJIIJJI = C68517Qun.LIZ.LJIIJJI();
        LIZ.LIZ(data.getInt("login_last_time"), "login_last_time");
        LIZ.LIZLLL("nonpersonalized_mode_is_show", CardStruct.IStatusCode.DEFAULT);
        LIZ.LIZ(AccountService.LJIJ().LJFF().isLogin() ? 1 : 0, "is_login");
        LIZ.LIZJ("group_id", str5);
        LIZ.LIZJ("author_id", str6);
        if (LJIIJJI instanceof TPLoginMethod) {
            name = ((TPLoginMethod) LJIIJJI).getPlatform();
        } else {
            name = LJIIJJI.getLoginMethodName().name();
        }
        LIZ.LIZJ("previous_login_method", name);
        IPrevLoginPlatformService LJIIL = PrevLoginPlatformService.LJIIL();
        o.LJIIIIZZ(LJIIL, "get().getService(IPrevLo…tformService::class.java)");
        LIZ.LIZJ("prev_login_platform", (String) LJIIL.getPlatform().getValue());
        LIZ.LIZ(LJIIL.LJIIIZ(), "encouraged_platform");
        if (LJIIL.LIZ()) {
            LIZ.LIZ(LJIIL.LJII(), "is_plugin_did_ab_recv");
        }
        if (z) {
            LIZ.LIZ(-1, "is_from_express_login");
            LIZ.LIZ(1, "is_express_login");
        }
        LIZ.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        if (z2) {
            str9 = "full_screen";
        } else {
            str9 = "cover";
        }
        LIZ.LIZJ("show_type", str9);
        LIZ.LIZJ("sdk_name", data.getString("sdk_name", ""));
        LIZ.LIZJ("sdk_version", data.getString("sdk_version", ""));
        LIZ.LIZJ("proactive_design_type", str8);
        C68972R5c.LIZ(LIZ);
        LIZ.LIZ(C38985FRt.LIZIZ.LJIIL().LJII(str2) ? 1 : 0, "is_forced_login_copywrite_show");
        FMX.LJIIL("login_notify", LIZ.LIZ);
        ((Boolean) C34124DaK.LIZ.getValue()).booleanValue();
    }
}
