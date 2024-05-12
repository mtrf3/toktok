package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CF4 {
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

    public static void LIZIZ(BarrageMessage barrageMessage) {
        Integer valueOf;
        String str;
        int i;
        long messageId;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue() || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_receive_im", 0.1d) || barrageMessage == null || (valueOf = Integer.valueOf(barrageMessage.msgType)) == null) {
            return;
        }
        if (valueOf.intValue() == 8) {
            str = "upgrade";
        } else if (valueOf.intValue() == 9) {
            str = "enter_room";
        } else if (valueOf.intValue() == 10) {
            str = "fans_level_upgrade";
        } else if (valueOf.intValue() != 11) {
            return;
        } else {
            str = "fans_level_enter_room";
        }
        BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
        int i2 = 0;
        if (barrageTypeUserGradeParam != null) {
            i = barrageTypeUserGradeParam.currentGrade;
        } else {
            i = 0;
        }
        boolean LJ = o.LJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), CF1.LJFF(barrageMessage));
        try {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_receive_im");
            LIZ2.LJIIZILJ();
            LIZ(LIZ2);
            LIZ2.LJIJJ(str, "type");
            if (barrageMessage.isLocalInsertMsg) {
                messageId = -1;
            } else {
                messageId = barrageMessage.getMessageId();
            }
            LIZ2.LJIJJ(Long.valueOf(messageId), "message_id");
            if (barrageMessage.isLocalInsertMsg) {
                i2 = 1;
            }
            LIZ2.LJIJJ(Integer.valueOf(i2), "is_fake_message");
            LIZ2.LJIJJ(Integer.valueOf(LJ ? 1 : 0), "is_own_send");
            LIZ2.LJIJJ(Integer.valueOf(i), "barrage_grade");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }

    public static void LIZJ(String str, String str2, Integer num, Integer num2, Boolean bool) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_resource_exist_when_use");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(str, "access_key");
            LIZ2.LJIJJ(str2, "channel");
            LIZ2.LJIJJ(num, "barrage_grade");
            if (o.LJ(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "is_exist");
            LIZ2.LJIJJ(num2, "barrage_msg_type");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }

    public static void LIZLLL(String str, String str2, Integer num, Integer num2, Boolean bool, Boolean bool2, String str3) {
        int i;
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_sync_resource_result", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_level_sync_resource_result");
            LIZ2.LJIJJ(str, "access_key");
            LIZ2.LJIJJ(str2, "channel");
            LIZ2.LJIJJ(num, "barrage_grade");
            LIZ2.LJIJJ(num2, "barrage_msg_type");
            Boolean bool3 = Boolean.TRUE;
            int i2 = 0;
            if (o.LJ(bool, bool3)) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "success");
            if (o.LJ(bool2, bool3)) {
                i2 = 1;
            }
            LIZ2.LJIJJ(Integer.valueOf(i2), "call_back_state");
            LIZ2.LJIJJ(str3, "error_msg");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            } else {
                LIZ2.LJJIJ();
                LIZ2.LJI();
                LIZ2.LJJIIZI();
            }
        } catch (Exception unused) {
        }
    }
}
