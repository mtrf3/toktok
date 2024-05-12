package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9R {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Integer num, String str, String str2) {
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_delete_resource", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_delete_resource");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(str, "access_key");
            LIZ2.LJIJJ(str2, "channel");
            LIZ2.LJIJJ(num, "grade");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }

    public static void LIZJ(Integer num, String str, String str2) {
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_sync_resource", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_sync_resource");
            LIZ2.LJIJJ(str, "access_key");
            LIZ2.LJIJJ(str2, "channel");
            LIZ2.LJIJJ(num, "grade");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJJIIZI();
            }
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ(String str, Integer num, String str2, Boolean bool) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_resource_exist_enter_room", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_resource_exist_enter_room");
            if (str == null) {
                str = "";
            }
            LIZ2.LJIJJ(str, "access");
            LIZ2.LJIJJ(str2, "channel");
            LIZ2.LJIJJ(num, "grade");
            if (o.LJ(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "is_exist");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJJIIZI();
            }
        } catch (Exception unused) {
        }
    }
}
