package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import ujb.o;

/* loaded from: classes16.dex */
public final class XSK {
    public static InterfaceC78491UrH<Boolean> LIZ;
    public static boolean LIZIZ;

    public static void LIZ(String str) {
        int i;
        InterfaceC78491UrH<Boolean> interfaceC78491UrH = LIZ;
        if (interfaceC78491UrH != null) {
            interfaceC78491UrH.onSuccess(Boolean.TRUE);
            LIZ = null;
        }
        if (o.LJJJJIZL(str, "time_lock", true)) {
            XSP.LIZ();
            if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
                i = 360000;
            } else {
                i = 3600000;
            }
            int i2 = i;
            TeenageModeSetting teenageModeSetting = XSJ.LIZIZ;
            if (teenageModeSetting != null) {
                teenageModeSetting.setTimeLockSelfInMin(i2);
            }
            XSJ.LIZ.LIZ(GsonProtectorUtils.toJson(new Gson(), XSJ.LIZIZ));
            Object LIZ2 = C54370LVm.LIZ(EF7.LIZIZ(), XSO.class);
            if (LIZ2 != null) {
                XSO xso = (XSO) LIZ2;
                if (TextUtils.equals(EF7.LJIILIIL, "local_test")) {
                    xso.LIZIZ(180 * 1000);
                } else {
                    xso.LIZIZ(1800 * 1000);
                }
                LIZIZ = false;
                return;
            }
            "Follow previous logic".toString();
            throw new IllegalArgumentException("Follow previous logic");
        }
    }

    public static final void LIZIZ(InterfaceC78491UrH interfaceC78491UrH, String from) {
        int i;
        int i2;
        String str;
        kotlin.jvm.internal.o.LJIIIZ(from, "from");
        int i3 = 1;
        if (o.LJJJJIZL(from, "time_lock", true)) {
            Activity topActivity = ActivityStack.getTopActivity();
            if (o.LJJJJIZL(from, "time_lock", true)) {
                if (LIZIZ) {
                    return;
                } else {
                    LIZIZ = true;
                }
            }
            LIZ = interfaceC78491UrH;
            TeenageModeSetting teenageModeSetting = XSJ.LIZIZ;
            if (teenageModeSetting != null && teenageModeSetting.getTimeLockSelfInMin() > 0) {
                str = "aweme://lynxview/?channel=fe_kids_mode_lynx&bundle=kids-screentime-soft-cap-check-password/template.js&hide_nav_bar=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1&disable_back_press=1";
            } else {
                str = "aweme://lynxview/?channel=fe_kids_mode_lynx&bundle=kids-settings-screentime/template.js&hide_nav_bar=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1&disable_back_press=1";
            }
            SmartRouter.buildRoute(topActivity, str).open();
            return;
        }
        Activity topActivity2 = ActivityStack.getTopActivity();
        TeenageModeSetting teenageModeSetting2 = XSJ.LIZIZ;
        if (teenageModeSetting2 != null) {
            i = teenageModeSetting2.getTimeLockSelfInMin();
        } else {
            i = 0;
        }
        if (o.LJJJJIZL(from, "logout", true)) {
            i2 = 1;
        } else {
            if (o.LJJJJIZL(from, "time_lock", true)) {
                if (LIZIZ) {
                    return;
                }
                LIZIZ = true;
                i2 = 2;
                LIZ = interfaceC78491UrH;
                StringBuilder LIZJ = C06460Ne.LIZJ("aweme://lynxview/?channel=fe_kids_mode_lynx&bundle=kids-settings-screentime-check-passcode/template.js&hide_nav_bar=1&use_spark=1&disable_back_press=", i3, "&biz_scene=", i2, "&max_use_duration=");
                LIZJ.append(i);
                SmartRouter.buildRoute(topActivity2, X1D.LIZIZ(LIZJ)).open();
            }
            i2 = 0;
        }
        i3 = 0;
        LIZ = interfaceC78491UrH;
        StringBuilder LIZJ2 = C06460Ne.LIZJ("aweme://lynxview/?channel=fe_kids_mode_lynx&bundle=kids-settings-screentime-check-passcode/template.js&hide_nav_bar=1&use_spark=1&disable_back_press=", i3, "&biz_scene=", i2, "&max_use_duration=");
        LIZJ2.append(i);
        SmartRouter.buildRoute(topActivity2, X1D.LIZIZ(LIZJ2)).open();
    }
}
