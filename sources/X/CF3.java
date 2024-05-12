package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CF3 {
    public static void LIZ(BarrageMessage barrageMessage, DataChannel dataChannel) {
        int i;
        String str;
        if (barrageMessage == null || dataChannel == null) {
            return;
        }
        int i2 = barrageMessage.msgType;
        if (i2 == 4) {
            i = 1;
        } else if (i2 == 7) {
            i = 2;
        } else {
            i = 0;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_barrage_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(Integer.valueOf(i), "subscribe_show_type");
        if (barrageMessage.msgType == 4 && CF1.LIZJ && barrageMessage.displayConfig > 0) {
            str = "strong";
        } else {
            str = "normal";
        }
        LIZ.LJIJJ(str, "show_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage r20, com.bytedance.ies.sdk.datachannel.DataChannel r21) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CF3.LIZJ(com.bytedance.android.livesdk.model.message.BarrageMessage, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public static void LIZIZ(BarrageMessage barrageMessage, DataChannel dataChannel, boolean z, boolean z2) {
        int i;
        if (dataChannel == null || !CF1.LJIIJJI(barrageMessage)) {
            return;
        }
        if (z) {
            i = 2;
        } else if (!z2) {
            i = 1;
        } else {
            i = 0;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_barrage_show_real_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(String.valueOf(i), "show_type");
        LIZ.LJJIIJZLJL();
    }

    public static void LIZLLL(DataChannel dataChannel, long j, int i, String str, boolean z, int i2, String str2, long j2) {
        Room room;
        long ownerUserId;
        int i3;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_user_level_up_message", 0.1d)) {
            return;
        }
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            ownerUserId = 0;
        } else {
            ownerUserId = room.getOwnerUserId();
        }
        HashMap hashMap = new HashMap();
        if (i2 > 0) {
            hashMap.put("display_config", Long.valueOf(i2));
        }
        if (((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() == j) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_user_level_up_message");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
        LIZ.LJIJJ(Long.valueOf(ownerUserId), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "user_id");
        LIZ.LJIJJ(str, "message_position");
        LIZ.LJIJJ(Integer.valueOf(i3), "is_own_send");
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_fake_message");
        KNV.LJ(i, LIZ, "user_level", str2, "privilege_type");
        if (z) {
            j2 = -1;
        }
        LIZ.LJIJJ(Long.valueOf(j2), "message_id");
        LIZ.LJJII(hashMap);
        LIZ.LJJIIJZLJL();
    }
}
