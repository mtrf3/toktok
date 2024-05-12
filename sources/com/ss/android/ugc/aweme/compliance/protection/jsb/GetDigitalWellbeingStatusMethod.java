package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.C75792yF;
import X.C86306Xu2;
import X.C86308Xu4;
import X.EnumC62934Omw;
import X.F3T;
import X.InterfaceC37146Ehy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes16.dex */
public final class GetDigitalWellbeingStatusMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDigitalWellbeingStatusMethod(F3T factory) {
        super(factory);
        o.LJIIIZ(factory, "factory");
        this.LJLIL = "getDigitalWellbeingStatus";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r6v0, types: [org.json.JSONObject] */
    public static void LIZJ(JSONObject jSONObject) {
        int i;
        ?? r1;
        int i2;
        Integer num;
        int i3;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Boolean bool;
        Boolean bool2;
        int i4;
        int i5;
        GuardianRestrictionBean guardianRestrictionBean;
        GuardianRestrictionBean guardianRestrictionBean2;
        Integer num6;
        GuardianRestrictionBean guardianRestrictionBean3;
        Integer num7;
        DigitalWellbeingSetting digitalWellbeingSetting = C86306Xu2.LIZIZ;
        int i6 = 0;
        if (digitalWellbeingSetting != null) {
            i = digitalWellbeingSetting.getTimeLockSelfEnable();
        } else {
            i = 0;
        }
        jSONObject.put("self_timelock", i);
        jSONObject.put("self_restricted_mode", C86306Xu2.LIZJ() ? 1 : 0);
        DigitalWellbeingSetting digitalWellbeingSetting2 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting2 != null) {
            r1 = digitalWellbeingSetting2.isWeeklyUpdate();
        } else {
            r1 = 0;
        }
        jSONObject.put("self_weekly_update", r1);
        jSONObject.put("max_use_duration_in_minutes", C86306Xu2.LIZIZ());
        DigitalWellbeingSetting digitalWellbeingSetting3 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting3 != null) {
            i2 = digitalWellbeingSetting3.getTimeLockSelfType();
        } else {
            i2 = 0;
        }
        jSONObject.put("self_timelock_type", i2);
        EnumC62934Omw LIZ = a.LJIIIZ().LIZ();
        List<ScreenTimeManagementDaySetting> list = null;
        if (LIZ != null) {
            num = Integer.valueOf(LIZ.getValue());
        } else {
            num = null;
        }
        jSONObject.put("family_role", num);
        FamilyPiaringManager.LIZ.getClass();
        jSONObject.put("family_restricted_mode", FamilyPiaringManager.LJ() ? 1 : 0);
        jSONObject.put("family_timelock", FamilyPiaringManager.LJFF() ? 1 : 0);
        jSONObject.put("session_duration_reminder", C86306Xu2.LIZ());
        DigitalWellbeingSetting digitalWellbeingSetting4 = C86306Xu2.LIZIZ;
        if (digitalWellbeingSetting4 != null) {
            i3 = digitalWellbeingSetting4.getScreenTimeType();
        } else {
            i3 = 0;
        }
        jSONObject.put("session_duration_type", i3);
        JSONObject jSONObject2 = new JSONObject();
        UserNightScreenTimeSettings LIZIZ = C86308Xu4.LIZIZ();
        if (LIZIZ != null) {
            num2 = LIZIZ.getSleepTimeStartHour();
        } else {
            num2 = null;
        }
        jSONObject2.put("sleep_time_start_hour", num2);
        UserNightScreenTimeSettings LIZIZ2 = C86308Xu4.LIZIZ();
        if (LIZIZ2 != null) {
            num3 = LIZIZ2.getSleepTimeStartMinute();
        } else {
            num3 = null;
        }
        jSONObject2.put("sleep_time_start_minute", num3);
        UserNightScreenTimeSettings LIZIZ3 = C86308Xu4.LIZIZ();
        if (LIZIZ3 != null) {
            num4 = LIZIZ3.getSleepTimeEndHour();
        } else {
            num4 = null;
        }
        jSONObject2.put("sleep_time_end_hour", num4);
        UserNightScreenTimeSettings LIZIZ4 = C86308Xu4.LIZIZ();
        if (LIZIZ4 != null) {
            num5 = LIZIZ4.getSleepTimeEndMinute();
        } else {
            num5 = null;
        }
        jSONObject2.put("sleep_time_end_minute", num5);
        UserNightScreenTimeSettings LIZIZ5 = C86308Xu4.LIZIZ();
        if (LIZIZ5 != null) {
            bool = LIZIZ5.getSleepReminderEnabled();
        } else {
            bool = null;
        }
        jSONObject2.put("sleep_reminder_enabled", bool);
        jSONObject.put("sleep_time_settings", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        if (C86308Xu4.LIZJ == null) {
            try {
                C86308Xu4.LIZJ = (UserDetailsInfoBean) C75792yF.LIZ(C86308Xu4.LIZ.getString(C86308Xu4.LJ("user_detail_info"), ""), UserDetailsInfoBean.class);
            } catch (Exception unused) {
            }
        }
        UserDetailsInfoBean userDetailsInfoBean = C86308Xu4.LIZJ;
        if (userDetailsInfoBean != null) {
            bool2 = userDetailsInfoBean.isMinor;
        } else {
            bool2 = null;
        }
        jSONObject3.put("is_minor", bool2);
        jSONObject.put("user_details", jSONObject3);
        DigitalWellbeingBean digitalWellbeingBean = C86306Xu2.LIZLLL;
        if (digitalWellbeingBean != null && (num7 = digitalWellbeingBean.screenTimeManagementRepeatType) != null) {
            i4 = num7.intValue();
        } else {
            i4 = 0;
        }
        jSONObject.put("self_timelock_repeat_type", i4);
        jSONObject.put("self_timelock_week_settings", LIZLLL(C86308Xu4.LIZJ()));
        FamilyPiaringManager.LIZ.getClass();
        FamilyPairingBean familyPairingBean = FamilyPiaringManager.LIZJ;
        if (familyPairingBean != null && (guardianRestrictionBean3 = familyPairingBean.restriction) != null) {
            i5 = guardianRestrictionBean3.screenTimeManagementRepeatType;
        } else {
            i5 = 0;
        }
        jSONObject.put("family_timelock_repeat_type", i5);
        jSONObject.put("family_max_use_duration_in_minutes", FamilyPiaringManager.LIZ());
        FamilyPairingBean familyPairingBean2 = FamilyPiaringManager.LIZJ;
        if (familyPairingBean2 != null && (guardianRestrictionBean2 = familyPairingBean2.restriction) != null && (num6 = guardianRestrictionBean2.screenTimeManagementType) != null) {
            i6 = num6.intValue();
        }
        jSONObject.put("family_timelock_type", i6);
        FamilyPairingBean familyPairingBean3 = FamilyPiaringManager.LIZJ;
        if (familyPairingBean3 != null && (guardianRestrictionBean = familyPairingBean3.restriction) != null) {
            list = guardianRestrictionBean.screenTimeManagementWeekSettings;
        }
        jSONObject.put("family_timelock_week_settings", LIZLLL(list));
    }

    public static JSONArray LIZLLL(List list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ScreenTimeManagementDaySetting screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("day", screenTimeManagementDaySetting.dayOfWeek);
                jSONObject.put("screen_time_limit", screenTimeManagementDaySetting.screenTimeLimitForWeek);
                jSONObject.put("screen_time_setting_type", screenTimeManagementDaySetting.screenTimeSettingTypeForWeek);
                jSONObject.put("status", screenTimeManagementDaySetting.screenTimeStatusForWeek);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            JSONObject jSONObject = new JSONObject();
            LIZJ(jSONObject);
            iReturn.onSuccess(jSONObject);
        } catch (Exception e) {
            iReturn.LIZ(-1, e.getMessage());
        }
    }
}
