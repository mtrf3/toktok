package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.BZj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28991BZj {
    public static final /* synthetic */ int LIZ = 0;

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

    public static void LIZJ(String str, boolean z) {
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_badge_load_result", LiveLogMonitorSampleSetting.getSAMPLE_1000())) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_badge_load_result");
        LIZ(LIZ2);
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "status");
        LIZ2.LJIJJ(str, "uri");
        LIZ2.LJIJJ("user_level_avatar", WM7.SCENE_SERVICE);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZI();
        }
    }

    public static void LIZIZ(Integer num, Integer num2, Long l, Integer num3, Long l2, Boolean bool, Integer num4) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_view_grade_updated", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_view_grade_updated");
            LIZ2.LJIIZILJ();
            LIZ(LIZ2);
            LIZ2.LJIJJ(num, "current_grade");
            LIZ2.LJIJJ(num2, "grade");
            LIZ2.LJIJJ(l, "score");
            LIZ2.LJIJJ(num3, "grade_mode");
            LIZ2.LJIJJ(l2, "time_to_sleep");
            if (o.LJ(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "is_animating");
            LIZ2.LJIJJ(num4, "grade_upgrade_type");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }
}
