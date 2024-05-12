package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import X.C221108m2;
import X.C56642Ke;
import X.C62822Ol8;
import X.C75792yF;
import X.C86305Xu1;
import X.EnumC62934Omw;
import X.HG3;
import X.ORY;
import X.QD3;
import X.RBX;
import X.XGA;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes16.dex */
public final class FamilyPiaringManager {
    public static final FamilyPiaringManager LIZ;
    public static final C62822Ol8 LIZIZ;
    public static FamilyPairingBean LIZJ;

    static {
        DoNotDisturbSettings doNotDisturbSettings;
        FamilyPiaringManager familyPiaringManager = new FamilyPiaringManager();
        LIZ = familyPiaringManager;
        LIZIZ = C221108m2.LIZIZ(XGA.LJLIL);
        EventBus.LIZJ().LJIILJJIL(familyPiaringManager);
        if (!LIZIZ().getBoolean("valid", false)) {
            return;
        }
        Integer valueOf = Integer.valueOf(LIZIZ().getInt("parentalGuardianMode", 0));
        int i = LIZIZ().getInt("teen_mode", 0);
        int i2 = LIZIZ().getInt("screenTimeManagement", 0);
        int i3 = LIZIZ().getInt("searchRestriction", 0);
        List list = null;
        try {
            doNotDisturbSettings = (DoNotDisturbSettings) C75792yF.LIZ(LIZIZ().getString("doNotDisturbSettings", ""), DoNotDisturbSettings.class);
        } catch (Exception unused) {
            doNotDisturbSettings = null;
        }
        int i4 = LIZIZ().getInt("screenTimeManagementStatus", 0);
        int i5 = LIZIZ().getInt("screenTimeManagementType", 0);
        int i6 = LIZIZ().getInt("screenTimeManagementRepeatType", 0);
        try {
            Object LJI = GsonHolder.LIZLLL().LIZ().LJI(LIZIZ().getString("screenTimeManagementWeekSettings", ""), ScreenTimeManagementDaySetting[].class);
            o.LJIIIIZZ(LJI, "get().gson.fromJson(\n   …va,\n                    )");
            list = ORY.LJJZZIII((Object[]) LJI);
        } catch (Exception unused2) {
        }
        LJI(new FamilyPairingBean(valueOf, new GuardianRestrictionBean(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3), doNotDisturbSettings, Integer.valueOf(i4), Integer.valueOf(i5), i6, list)));
    }

    public static int LIZ() {
        Integer num;
        List<ScreenTimeManagementDaySetting> list;
        Integer num2;
        FamilyPairingBean familyPairingBean = LIZJ;
        if (familyPairingBean == null) {
            return 0;
        }
        GuardianRestrictionBean guardianRestrictionBean = familyPairingBean.restriction;
        if (guardianRestrictionBean != null && guardianRestrictionBean.screenTimeManagementRepeatType == 2) {
            GuardianRestrictionBean guardianRestrictionBean2 = familyPairingBean.restriction;
            if (guardianRestrictionBean2 == null || (list = guardianRestrictionBean2.screenTimeManagementWeekSettings) == null) {
                return 0;
            }
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int i = 7;
            int i2 = calendar.get(7);
            if (i2 != 1) {
                i = i2 - 1;
            }
            ScreenTimeManagementDaySetting screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) ListProtector.get(list, i - 1);
            if (screenTimeManagementDaySetting == null || (num2 = screenTimeManagementDaySetting.screenTimeLimitForWeek) == null) {
                return 0;
            }
            return num2.intValue();
        }
        GuardianRestrictionBean guardianRestrictionBean3 = familyPairingBean.restriction;
        if (guardianRestrictionBean3 == null || (num = guardianRestrictionBean3.screenTimeManagement) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static Keva LIZIZ() {
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public static boolean LJ() {
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        FamilyPairingBean familyPairingBean = LIZJ;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.restrictMode) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static EnumC62934Omw LIZJ() {
        FamilyPairingBean familyPairingBean;
        if (!((RBX) HG3.LJIILL()).isLogin() || (familyPairingBean = LIZJ) == null) {
            return EnumC62934Omw.NONE;
        }
        return LIZLLL(familyPairingBean);
    }

    public static boolean LJFF() {
        FamilyPairingBean familyPairingBean;
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        if (LIZ() <= 0 || (familyPairingBean = LIZJ) == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.screenTimeManagementStatus) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static EnumC62934Omw LIZLLL(FamilyPairingBean familyPairingBean) {
        Integer num;
        if (familyPairingBean != null && (num = familyPairingBean.userIdentity) != null) {
            if (num.intValue() == 0 || num.intValue() == 1) {
                return EnumC62934Omw.NONE;
            }
            if (num.intValue() == 2) {
                return EnumC62934Omw.CHILD;
            }
            if (num.intValue() == 3) {
                return EnumC62934Omw.PARENT;
            }
            if (num.intValue() == 4) {
                return EnumC62934Omw.UNLINK_LOCKED;
            }
        }
        return EnumC62934Omw.NONE;
    }

    public static void LJI(FamilyPairingBean familyPairingBean) {
        int i;
        int i2;
        int i3;
        int i4;
        DoNotDisturbSettings doNotDisturbSettings;
        int i5;
        int i6;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        LIZJ = familyPairingBean;
        int i7 = 0;
        if (familyPairingBean == null) {
            LIZIZ().storeBoolean("valid", false);
            return;
        }
        LIZIZ().storeBoolean("valid", true);
        Keva LIZIZ2 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean = familyPairingBean.restriction;
        if (guardianRestrictionBean != null && (num5 = guardianRestrictionBean.restrictMode) != null) {
            i = num5.intValue();
        } else {
            i = 0;
        }
        LIZIZ2.storeInt("teen_mode", i);
        Keva LIZIZ3 = LIZIZ();
        Integer num6 = familyPairingBean.userIdentity;
        if (num6 != null) {
            i2 = num6.intValue();
        } else {
            i2 = 0;
        }
        LIZIZ3.storeInt("parentalGuardianMode", i2);
        Keva LIZIZ4 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean2 = familyPairingBean.restriction;
        if (guardianRestrictionBean2 != null && (num4 = guardianRestrictionBean2.screenTimeManagement) != null) {
            i3 = num4.intValue();
        } else {
            i3 = 0;
        }
        LIZIZ4.storeInt("screenTimeManagement", i3);
        Keva LIZIZ5 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean3 = familyPairingBean.restriction;
        if (guardianRestrictionBean3 != null && (num3 = guardianRestrictionBean3.searchRestriction) != null) {
            i4 = num3.intValue();
        } else {
            i4 = 0;
        }
        LIZIZ5.storeInt("searchRestriction", i4);
        Keva LIZIZ6 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean4 = familyPairingBean.restriction;
        List<ScreenTimeManagementDaySetting> list = null;
        if (guardianRestrictionBean4 != null) {
            doNotDisturbSettings = guardianRestrictionBean4.doNotDisturbSettings;
        } else {
            doNotDisturbSettings = null;
        }
        LIZIZ6.storeString("doNotDisturbSettings", C75792yF.LIZJ(doNotDisturbSettings));
        Keva LIZIZ7 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean5 = familyPairingBean.restriction;
        if (guardianRestrictionBean5 != null) {
            i5 = guardianRestrictionBean5.screenTimeManagementRepeatType;
        } else {
            i5 = 0;
        }
        LIZIZ7.storeInt("screenTimeManagementRepeatType", i5);
        Keva LIZIZ8 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean6 = familyPairingBean.restriction;
        if (guardianRestrictionBean6 != null && (num2 = guardianRestrictionBean6.screenTimeManagementType) != null) {
            i6 = num2.intValue();
        } else {
            i6 = 0;
        }
        LIZIZ8.storeInt("screenTimeManagementType", i6);
        Keva LIZIZ9 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean7 = familyPairingBean.restriction;
        if (guardianRestrictionBean7 != null && (num = guardianRestrictionBean7.screenTimeManagementStatus) != null) {
            i7 = num.intValue();
        }
        LIZIZ9.storeInt("screenTimeManagementStatus", i7);
        Keva LIZIZ10 = LIZIZ();
        GuardianRestrictionBean guardianRestrictionBean8 = familyPairingBean.restriction;
        if (guardianRestrictionBean8 != null) {
            list = guardianRestrictionBean8.screenTimeManagementWeekSettings;
        }
        LIZIZ10.storeString("screenTimeManagementWeekSettings", C75792yF.LIZJ(list));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onParentalModeChanged(C56642Ke event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals("guardian_platform_open", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName")) || TextUtils.equals("guardian_platform_close", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName")) || TextUtils.equals("guardian_platform_child_unlink", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
            C86305Xu1.LJIIIZ(null);
        }
    }
}
