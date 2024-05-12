package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.ActivityC45651qj;
import X.C10I;
import X.C10K;
import X.C45804HyK;
import X.C57399Mfr;
import X.C86305Xu1;
import X.C86306Xu2;
import X.C86308Xu4;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.compliance.protection.common.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.protection.common.model.UserNightScreenTimeSettings;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class SetDigitalWellbeingStatusMethod extends BaseBridgeMethod {
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
    public SetDigitalWellbeingStatusMethod(F3T factory) {
        super(factory);
        o.LJIIIZ(factory, "factory");
        this.LJLIL = "setDigitalWellbeingStatus";
    }

    public static List LIZJ(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(jSONObject.optString("self_timelock_week_settings"))) {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "self_timelock_week_settings");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                o.LJII(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj;
                arrayList.add(new ScreenTimeManagementDaySetting(Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "screen_time_limit")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "screen_time_setting_type")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "status")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "day"))));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        boolean z;
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            int i = 1;
            if (!TextUtils.isEmpty(params.optString("self_timelock_enable"))) {
                boolean z2 = JSONObjectProtectorUtils.getBoolean(params, "self_timelock_enable");
                if (!TextUtils.isEmpty(params.optString("max_use_duration_in_minutes")) && !TextUtils.isEmpty(params.optString("self_timelock_type"))) {
                    int i2 = JSONObjectProtectorUtils.getInt(params, "max_use_duration_in_minutes");
                    int i3 = JSONObjectProtectorUtils.getInt(params, "self_timelock_type");
                    if (!TextUtils.isEmpty(params.optString("self_timelock_repeat_type"))) {
                        i = params.optInt("self_timelock_repeat_type");
                    }
                    getContext();
                    Context context = getContext();
                    if (context != null) {
                        activityC45651qj = C45804HyK.LJJIFFI(context);
                    } else {
                        activityC45651qj = null;
                    }
                    C86306Xu2.LJ(activityC45651qj, i2, z2, i3, i, LIZJ(params));
                }
            } else if (!TextUtils.isEmpty(params.optString("self_restricted_mode_enable")) && (z = JSONObjectProtectorUtils.getBoolean(params, "self_restricted_mode_enable")) != C86306Xu2.LIZJ()) {
                if (z) {
                    DigitalWellbeingSetting digitalWellbeingSetting = C86306Xu2.LIZIZ;
                    if (digitalWellbeingSetting != null) {
                        digitalWellbeingSetting.setRestrictModeSelf(true);
                    }
                    C86305Xu1.LJIIIIZZ();
                    C86305Xu1.LJIIIZ(null);
                    C86306Xu2.LJFF(C86306Xu2.LIZIZ);
                    C10K.LJII(500L).LJ(new C10I() { // from class: X.4dC
                        @Override // X.C10I
                        public final Object then(C10K c10k) {
                            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                            c5s1.LIZJ(R.string.eid);
                            c5s1.LJ();
                            return C76800UCe.LIZ;
                        }
                    }, C10K.LJIIIIZZ, null);
                } else {
                    DigitalWellbeingSetting digitalWellbeingSetting2 = C86306Xu2.LIZIZ;
                    if (digitalWellbeingSetting2 != null) {
                        digitalWellbeingSetting2.setRestrictModeSelf(false);
                    }
                    C86305Xu1.LJIIIIZZ();
                    C86305Xu1.LJIIIZ(null);
                    C86306Xu2.LJFF(C86306Xu2.LIZIZ);
                    C10K.LJII(500L).LJ(new C10I() { // from class: X.4dB
                        @Override // X.C10I
                        public final Object then(C10K c10k) {
                            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                            c5s1.LIZJ(R.string.eic);
                            c5s1.LJ();
                            return C76800UCe.LIZ;
                        }
                    }, C10K.LJIIIIZZ, null);
                }
            }
            if (!TextUtils.isEmpty(params.optString("self_weekly_update"))) {
                boolean z3 = JSONObjectProtectorUtils.getBoolean(params, "self_weekly_update");
                DigitalWellbeingSetting digitalWellbeingSetting3 = C86306Xu2.LIZIZ;
                if (digitalWellbeingSetting3 != null) {
                    digitalWellbeingSetting3.setWeeklyUpdate(z3);
                }
            }
            if (!TextUtils.isEmpty(params.optString("session_duration_reminder")) && !TextUtils.isEmpty(params.optString("session_duration_type"))) {
                int i4 = JSONObjectProtectorUtils.getInt(params, "session_duration_reminder");
                int i5 = JSONObjectProtectorUtils.getInt(params, "session_duration_type");
                DigitalWellbeingSetting digitalWellbeingSetting4 = C86306Xu2.LIZIZ;
                if (digitalWellbeingSetting4 != null) {
                    digitalWellbeingSetting4.setScreenTimeBreaks(i4);
                }
                DigitalWellbeingSetting digitalWellbeingSetting5 = C86306Xu2.LIZIZ;
                if (digitalWellbeingSetting5 != null) {
                    digitalWellbeingSetting5.setScreenTimeType(i5);
                }
                C86306Xu2.LJFF(C86306Xu2.LIZIZ);
            }
            if (!TextUtils.isEmpty(params.optString("sleep_time_settings"))) {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(params, "sleep_time_settings");
                C86308Xu4.LJFF(new UserNightScreenTimeSettings(Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "sleep_time_start_hour")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "sleep_time_start_minute")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "sleep_time_end_hour")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, "sleep_time_end_minute")), Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(jSONObject, "sleep_reminder_enabled"))));
            }
            if (!TextUtils.isEmpty(params.optString("next_sleep_reminder_check_timestamp"))) {
                C57399Mfr.LIZ = JSONObjectProtectorUtils.getInt(params, "next_sleep_reminder_check_timestamp");
            }
            iReturn.onSuccess(null);
        } catch (Exception e) {
            iReturn.LIZ(-1, e.getMessage());
        }
    }
}
