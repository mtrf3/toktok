package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.expriements.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Xu3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86307Xu3 implements InterfaceC53832LAu {
    public final /* synthetic */ DialogC25756A8y LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    @Override // X.InterfaceC53832LAu
    public final void onSuccess() {
        boolean z;
        DoNotDisturbSettings LIZ;
        String str;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Boolean bool;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Boolean bool2;
        FamilyPairingBean familyPairingBean;
        GuardianRestrictionBean guardianRestrictionBean;
        DoNotDisturbSettings doNotDisturbSettings;
        Boolean bool3;
        GuardianRestrictionBean guardianRestrictionBean2;
        this.LJLIL.dismiss();
        FamilyPiaringManager.LIZ.getClass();
        int i9 = 0;
        if (FamilyPiaringManager.LIZJ() == EnumC62934Omw.CHILD && (familyPairingBean = FamilyPiaringManager.LIZJ) != null && (guardianRestrictionBean = familyPairingBean.restriction) != null && (doNotDisturbSettings = guardianRestrictionBean.doNotDisturbSettings) != null && (bool3 = doNotDisturbSettings.pauseNotificationEnabled) != null && bool3.booleanValue()) {
            z = true;
            FamilyPairingBean familyPairingBean2 = FamilyPiaringManager.LIZJ;
            if (familyPairingBean2 != null && (guardianRestrictionBean2 = familyPairingBean2.restriction) != null) {
                LIZ = guardianRestrictionBean2.doNotDisturbSettings;
            } else {
                LIZ = null;
            }
        } else {
            z = false;
            LIZ = C86308Xu4.LIZ();
        }
        DoNotDisturbSettings LIZLLL = C86308Xu4.LIZLLL();
        if (C52254Kf4.LIZ()) {
            str = "fe_tns_reminder";
        } else {
            str = "fe_privacy_and_safety_lynx";
        }
        String LJ = a1.LJ("aweme://lynxview/?channel=", str, "&bundle=mute-notifications-page/template.js&hide_nav_bar=1&use_spark=1&wait_gecko_update=1&use_forest=1&status_bar_color=f5f5f5&status_bar_color_light=f5f5f5&status_bar_color_dark=000000&loading_bg_color=f5f5f5&loading_bg_color_light=f5f5f5&loading_bg_color_dark=000000");
        DigitalWellbeingEntranceSettings.LIZ.getClass();
        C38281F0r c38281F0r = new C38281F0r(DigitalWellbeingEntranceSettings.LIZ(LJ));
        if (LIZLLL != null && (bool2 = LIZLLL.pauseNotificationEnabled) != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        c38281F0r.LIZLLL("system_mute_notification_enabled", String.valueOf(z2));
        if (LIZLLL != null && (num8 = LIZLLL.pauseNotificationStartHour) != null) {
            i = num8.intValue();
        } else {
            i = 0;
        }
        c38281F0r.LIZ(i, "system_start_hour");
        if (LIZLLL != null && (num7 = LIZLLL.pauseNotificationStartMinute) != null) {
            i2 = num7.intValue();
        } else {
            i2 = 0;
        }
        c38281F0r.LIZ(i2, "system_start_minute");
        if (LIZLLL != null && (num6 = LIZLLL.pauseNotificationEndHour) != null) {
            i3 = num6.intValue();
        } else {
            i3 = 0;
        }
        c38281F0r.LIZ(i3, "system_end_hour");
        if (LIZLLL != null && (num5 = LIZLLL.pauseNotificationEndMinute) != null) {
            i4 = num5.intValue();
        } else {
            i4 = 0;
        }
        c38281F0r.LIZ(i4, "system_end_minute");
        if (LIZ != null && (bool = LIZ.pauseNotificationEnabled) != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = false;
        }
        c38281F0r.LIZLLL("pause_notification_enabled", String.valueOf(z3));
        if (LIZ != null && (num4 = LIZ.pauseNotificationStartHour) != null) {
            i5 = num4.intValue();
        } else {
            i5 = 0;
        }
        c38281F0r.LIZ(i5, "pause_start_hour");
        if (LIZ != null && (num3 = LIZ.pauseNotificationStartMinute) != null) {
            i6 = num3.intValue();
        } else {
            i6 = 0;
        }
        c38281F0r.LIZ(i6, "pause_start_minute");
        if (LIZ != null && (num2 = LIZ.pauseNotificationEndHour) != null) {
            i7 = num2.intValue();
        } else {
            i7 = 0;
        }
        c38281F0r.LIZ(i7, "pause_end_hour");
        if (LIZ != null && (num = LIZ.pauseNotificationEndMinute) != null) {
            i8 = num.intValue();
        } else {
            i8 = 0;
        }
        c38281F0r.LIZ(i8, "pause_end_minute");
        if (!z) {
            i9 = -1;
        }
        c38281F0r.LIZ(i9, "isParent");
        SmartRouter.buildRoute(this.LJLILLLLZI, c38281F0r.LJ()).open();
    }

    @Override // X.InterfaceC53832LAu
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.dismiss();
        C1A7.LJIJJ(this.LJLILLLLZI, e);
    }

    public C86307Xu3(DialogC25756A8y dialogC25756A8y, Activity activity) {
        this.LJLIL = dialogC25756A8y;
        this.LJLILLLLZI = activity;
    }
}
