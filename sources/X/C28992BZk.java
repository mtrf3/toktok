package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.BZk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28992BZk {
    public static String LIZ = "";

    public static void LIZ(BZI bzi) {
        long j;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        long j2 = 0;
        if (room != null) {
            j = room.getId();
            if (room.getOwner() != null) {
                j2 = room.getOwner().getId();
            }
        } else {
            j = 0;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        bzi.LJIJJ(Long.valueOf(j), "room_id");
        bzi.LJIJJ(Long.valueOf(j2), "anchor_id");
        bzi.LJIJJ(Long.valueOf(currentUserId), "user_id");
    }

    public static void LIZIZ(String str, boolean z) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue() || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_api_info_event", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        if (o.LJ(str, "gift")) {
            str = "gift_panel";
        }
        try {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_api_info_event");
            LIZ(LIZ2);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "need_config");
            LIZ2.LJIJJ(str, WM7.SCENE_SERVICE);
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

    public static void LIZJ(Integer num, Long l, Integer num2, Long l2, Integer num3) {
        int i;
        long j;
        int i2;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_api_info_error", 0.001d)) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_api_info_error");
            LIZ2.LJIIZILJ();
            LIZ(LIZ2);
            int i3 = -1;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "current_grade");
            long j2 = -1;
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            LIZ2.LJIJJ(Long.valueOf(j), "current_score");
            if (num2 != null) {
                i3 = num2.intValue();
            }
            LIZ2.LJIJJ(Integer.valueOf(i3), "grade");
            if (l2 != null) {
                j2 = l2.longValue();
            }
            LIZ2.LJIJJ(Long.valueOf(j2), "score");
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = -3;
            }
            LIZ2.LJIJJ(Integer.valueOf(i2), "error_code");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }

    public static void LJ(boolean z, String str, long j, boolean z2, Integer num) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue() || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_api_info_result", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        if (o.LJ(str, "gift")) {
            str = "gift_panel";
        }
        try {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_api_info_result");
            LIZ(LIZ2);
            int i2 = 0;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "need_config");
            LIZ2.LJIJJ(str, WM7.SCENE_SERVICE);
            LIZ2.LJIJJ(Long.valueOf(j), "duration");
            if (z2) {
                i2 = 1;
            }
            LIZ2.LJIJJ(Integer.valueOf(i2), "status");
            LIZ2.LJIJJ(num, "error_code");
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

    public static void LIZLLL(Boolean bool, Long l, Long l2, Integer num, String str, long j) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_opt_api");
            LIZ2.LJIIZILJ();
            if (o.LJ(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "result");
            LIZ2.LJIJJ(l, "from_status");
            LIZ2.LJIJJ(l2, "to_status");
            LIZ2.LJIJJ(num, "current_level");
            LIZ2.LJIJJ(str, "error_msg");
            LIZ2.LJIJJ(Long.valueOf(j), "duration");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }

    public static void LJFF(Integer num, Long l, Integer num2, Integer num3, Long l2, Integer num4) {
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_opt_status_changed", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_opt_status_changed");
            LIZ2.LJIIZILJ();
            LIZ(LIZ2);
            LIZ2.LJIJJ(num, "current_grade");
            LIZ2.LJIJJ(l, "current_score");
            LIZ2.LJIJJ(num2, "current_grade_mode");
            LIZ2.LJIJJ(num3, "grade");
            LIZ2.LJIJJ(l2, "score");
            LIZ2.LJIJJ(num4, "grade_mode");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }
}
