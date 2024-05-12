package X;

import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LivePlayAbnormalReportSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B5S {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static final void LIZIZ(String str) {
        EnterRoomConfig enterRoomConfig;
        if (!LivePlayAbnormalReportSetting.INSTANCE.isEnable() || LIZ || LIZIZ || LIZJ) {
            return;
        }
        EnterRoomLinkSession LIZ2 = B57.LIZ.LIZ();
        if (LIZ2 != null) {
            enterRoomConfig = LIZ2.mEnterRoomConfig;
        } else {
            enterRoomConfig = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (enterRoomConfig != null) {
            linkedHashMap.putAll(C113554cx.LJJLIIIIJ(new OSZ("enter_from_merge", String.valueOf(enterRoomConfig.mRoomsData.enterFromMerge)), new OSZ("enter_method", String.valueOf(enterRoomConfig.mRoomsData.enterMethod)), new OSZ("action_type", String.valueOf(enterRoomConfig.mRoomsData.actionType)), new OSZ("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId)), new OSZ("anchor_id", String.valueOf(enterRoomConfig.mRoomsData.userId))));
        }
        LJFF(linkedHashMap, B5T.ENTER_ROOM_FAIL_OTHER, 401, str);
    }

    public static final void LIZJ(EnterRoomConfig enterRoomConfig, B5T reason) {
        o.LJIIIZ(reason, "reason");
        LJ(enterRoomConfig, reason, "exit_room_container", null);
    }

    public static final void LIZ(EnterRoomConfig enterRoomConfig, B5T reason, String action) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(action, "action");
        if (!LivePlayAbnormalReportSetting.INSTANCE.isEnable()) {
            return;
        }
        LIZJ = true;
        if (enterRoomConfig != null) {
            LJFF(C113554cx.LJJLIIIIJ(new OSZ("enter_from_merge", String.valueOf(enterRoomConfig.mRoomsData.enterFromMerge)), new OSZ("enter_method", String.valueOf(enterRoomConfig.mRoomsData.enterMethod)), new OSZ("action_type", String.valueOf(enterRoomConfig.mRoomsData.actionType)), new OSZ("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId)), new OSZ("anchor_id", String.valueOf(enterRoomConfig.mRoomsData.userId))), reason, 402, action);
        }
    }

    public static final void LIZLLL(EnterRoomConfig enterRoomConfig, B5T reason, String str) {
        o.LJIIIZ(reason, "reason");
        LJ(enterRoomConfig, reason, str, null);
    }

    public static final void LJ(EnterRoomConfig enterRoomConfig, B5T reason, String action, Integer num) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(action, "action");
        if (!LivePlayAbnormalReportSetting.INSTANCE.isEnable()) {
            return;
        }
        LIZJ = true;
        if (enterRoomConfig != null) {
            java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from_merge", String.valueOf(enterRoomConfig.mRoomsData.enterFromMerge)), new OSZ("enter_method", String.valueOf(enterRoomConfig.mRoomsData.enterMethod)), new OSZ("action_type", String.valueOf(enterRoomConfig.mRoomsData.actionType)), new OSZ("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId)), new OSZ("anchor_id", String.valueOf(enterRoomConfig.mRoomsData.userId)));
            if (num != null) {
                num.intValue();
                LJJLIIIIJ.put("server_error_code", num.toString());
            }
            LJFF(LJJLIIIIJ, reason, 401, action);
        }
    }

    public static final void LJFF(java.util.Map<String, String> map, B5T b5t, int i, String str) {
        map.put("error_code", String.valueOf(i));
        map.put("detail_error_code", String.valueOf(b5t.getDetailCode()));
        map.put("error_msg", b5t.name());
        map.put("error_action", str);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_abnormal_live_play");
        LIZ2.LJJIFFI(map);
        LIZ2.LJJIIJZLJL();
    }
}
