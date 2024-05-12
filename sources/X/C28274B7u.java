package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.B7u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28274B7u {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Boolean bool, Boolean bool2, Integer num, String str, String str2) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_resource_cache_exist", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_resource_cache_exist");
            LIZ2.LJIJJ(str, "uri");
            Boolean bool3 = Boolean.TRUE;
            int i2 = 0;
            if (o.LJ(bool2, bool3)) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "is_enter_room");
            LIZ2.LJIJJ(num, WM7.SCENE_SERVICE);
            LIZ2.LJIJJ(str2, "current_level");
            if (o.LJ(bool, bool3)) {
                i2 = 1;
            }
            LIZ2.LJIJJ(Integer.valueOf(i2), "is_exist");
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

    public static void LIZ(String str, String str2, Boolean bool, Integer num, Boolean bool2, String str3) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_resource_cache_download", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_resource_cache_download");
            LIZ2.LJIJJ(str, "uri");
            Boolean bool3 = Boolean.TRUE;
            int i2 = 0;
            if (o.LJ(bool, bool3)) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "result");
            if (o.LJ(bool2, bool3)) {
                i2 = 1;
            }
            LIZ2.LJIJJ(Integer.valueOf(i2), "is_enter_room");
            LIZ2.LJIJJ(num, WM7.SCENE_SERVICE);
            LIZ2.LJIJJ(str2, "current_level");
            LIZ2.LJIJJ(str3, "error_msg");
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
