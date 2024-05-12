package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelTeaMonitorEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.B7t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28273B7t {
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

    public static void LIZIZ(Integer num) {
        if (!UserLevelTeaMonitorEnableSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_receive_gift_unlock_im");
            LIZ2.LJIIZILJ();
            LIZ(LIZ2);
            LIZ2.LJIJJ("unlock", "type");
            LIZ2.LJIJJ(num, "unlock_num");
            LIZ2.LJJIIJZLJL();
        } catch (Exception unused) {
        }
    }
}
