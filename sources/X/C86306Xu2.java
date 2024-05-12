package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xu2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86306Xu2 {
    public static final InterfaceC86312Xu8 LIZ;
    public static DigitalWellbeingSetting LIZIZ;
    public static boolean LIZJ;
    public static DigitalWellbeingBean LIZLLL;

    public static int LIZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LIZIZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getScreenTimeBreaks();
        }
        return 0;
    }

    public static int LIZIZ() {
        Integer num;
        List<ScreenTimeManagementDaySetting> list;
        Integer num2;
        DigitalWellbeingBean digitalWellbeingBean = LIZLLL;
        if (digitalWellbeingBean == null || (num = digitalWellbeingBean.screenTimeManagementRepeatType) == null || num.intValue() != 2) {
            DigitalWellbeingSetting digitalWellbeingSetting = LIZIZ;
            if (digitalWellbeingSetting == null) {
                return 0;
            }
            return digitalWellbeingSetting.getTimeLockSelfInMin();
        }
        DigitalWellbeingBean digitalWellbeingBean2 = LIZLLL;
        if (digitalWellbeingBean2 == null || (list = digitalWellbeingBean2.screenTimeManagementWeekSettings) == null) {
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

    public static boolean LIZJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LIZIZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.isRestrictModeSelf();
        }
        return false;
    }

    static {
        Object obj;
        Context LLLLL = C16880lQ.LLLLL(EF7.LIZIZ());
        DigitalWellbeingSetting digitalWellbeingSetting = null;
        if (LLLLL == null || !InterfaceC86312Xu8.class.isInterface() || !InterfaceC86312Xu8.class.equals(InterfaceC86312Xu8.class)) {
            obj = null;
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C58251Mtb.LIZ;
            obj = concurrentHashMap.get(InterfaceC86312Xu8.class);
            if (obj == null || !(obj instanceof C54372LVo)) {
                obj = new C54372LVo(LLLLL);
                concurrentHashMap.put(InterfaceC86312Xu8.class, obj);
            }
        }
        o.LJIIIIZZ(obj, "getSP(AppContextManager.…ePreferences::class.java)");
        InterfaceC86312Xu8 interfaceC86312Xu8 = (InterfaceC86312Xu8) obj;
        LIZ = interfaceC86312Xu8;
        String LIZ2 = interfaceC86312Xu8.LIZ();
        o.LJIIIIZZ(LIZ2, "mPreference.restrictModeSetting");
        if (!TextUtils.isEmpty(LIZ2)) {
            try {
                digitalWellbeingSetting = (DigitalWellbeingSetting) new Gson().LJI(LIZ2, DigitalWellbeingSetting.class);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        LIZIZ = digitalWellbeingSetting;
        C10K.LIZJ(CallableC86310Xu6.LJLIL);
    }

    public static boolean LIZLLL() {
        DigitalWellbeingSetting digitalWellbeingSetting;
        if (LIZIZ() <= 0 || (digitalWellbeingSetting = LIZIZ) == null || digitalWellbeingSetting.getTimeLockSelfEnable() != 1) {
            return false;
        }
        return true;
    }

    public static void LJFF(DigitalWellbeingSetting digitalWellbeingSetting) {
        int i;
        LIZ.LIZIZ(GsonProtectorUtils.toJson(new Gson(), digitalWellbeingSetting));
        Bundle bundle = new Bundle();
        if (C86305Xu1.LJ()) {
            i = 2;
        } else {
            i = 0;
        }
        bundle.putInt("filter_warn", i);
        AppLog.setCustomerHeader(bundle);
    }

    public static void LJ(ActivityC45651qj activityC45651qj, int i, boolean z, int i2, int i3, List list) {
        if (activityC45651qj == null) {
            return;
        }
        DigitalWellbeingSetting digitalWellbeingSetting = LIZIZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setTimeLockSelfInMin(i);
        }
        DigitalWellbeingSetting digitalWellbeingSetting2 = LIZIZ;
        if (digitalWellbeingSetting2 != null) {
            digitalWellbeingSetting2.setTimeLockSelfEnable(z ? 1 : 0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting3 = LIZIZ;
        if (digitalWellbeingSetting3 != null) {
            digitalWellbeingSetting3.setTimeLockSelfType(i2);
        }
        LJFF(LIZIZ);
        C86308Xu4.LIZ.storeInt(C86308Xu4.LJ("screen_time_management_repeat_type"), i3);
        C86308Xu4.LJI(list);
        LIZLLL = new DigitalWellbeingBean(null, 0, null, null, null, null, null, null, null, C86308Xu4.LIZIZ(), C86308Xu4.LIZ(), C86308Xu4.LIZLLL(), Integer.valueOf(i3), list, 511, null);
    }
}
