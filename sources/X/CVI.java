package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CVI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(BZI bzi, DataChannel dataChannel) {
        String str;
        LiveMode streamType;
        bzi.LJIILLIIL(dataChannel);
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = streamType.logStreamingType;
        } else {
            str = null;
        }
        bzi.LJIJ(str);
        if (C29306Beo.LJIIL(dataChannel)) {
            bzi.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).dK()), "user_rank");
            bzi.LJIJJ("user", "user_type");
        } else {
            bzi.LJIJJ("anchor", "user_type");
        }
        if (C15380j0.LJIILLIIL()) {
            bzi.LJIJJ("portrait", "room_orientation");
        } else {
            bzi.LJIJJ("landscape", "room_orientation");
        }
    }

    public static void LIZIZ(DataChannel dataChannel, CVC data, String str) {
        String str2;
        o.LJIIIZ(data, "data");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_delete_show");
        LIZLLL(LIZ2, dataChannel);
        LIZ2.LJIJJ(data.LJLIL, "comment_id");
        if (data.LJLJJLL == 10) {
            str2 = "basic";
        } else {
            str2 = "up_grade";
        }
        C06490Nh.LIZLLL(LIZ2, str2, "gear_type", str, "delete_position");
    }

    public static void LIZJ(CVC data, DataChannel dataChannel, boolean z) {
        String str;
        int i;
        o.LJIIIZ(data, "data");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_show");
        LIZLLL(LIZ2, dataChannel);
        if (data.LJLJJLL == 10) {
            str = "basic";
        } else {
            str = "up_grade";
        }
        LIZ2.LJIJJ(str, "gear_type");
        LIZ2.LJIJJ(data.LJLIL, "comment_id");
        CZZ czz = (CZZ) dataChannel.kv0(CV2.class);
        int i2 = 0;
        if (czz != null) {
            i = czz.LIZ();
        } else {
            i = 0;
        }
        LIZ2.LJIJJ(CZT.LIZ(i), "role");
        LIZ2.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()), "online_watch_users");
        if (data.LJLILLLLZI.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            i2 = 1;
        }
        LIZ2.LJIJJ(Integer.valueOf(i2), "is_self");
        LIZ2.LJIJJ(Long.valueOf(data.LJLJJI), "server_start_time_ms");
        LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis()), "client_start_time_ms");
        LIZ2.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "client_start_time_ntp_ms");
        C0JT.LIZJ(LIZ2, data.LJLLJ, "source", z ? 1 : 0, "has_received_msg");
    }

    public static void LIZ(DataChannel dataChannel, CVC data, String str, String str2) {
        String str3;
        o.LJIIIZ(data, "data");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_deleted");
        LIZLLL(LIZ2, dataChannel);
        LIZ2.LJIJJ(str, "deleted_by");
        LIZ2.LJIJJ(data.LJLIL, "comment_id");
        if (data.LJLJJLL == 10) {
            str3 = "basic";
        } else {
            str3 = "up_grade";
        }
        C06490Nh.LIZLLL(LIZ2, str3, "gear_type", str2, "delete_position");
    }
}
