package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CVJ {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final HashSet<String> LJI = new HashSet<>();

    public static void LIZLLL(BZI bzi, DataChannel dataChannel) {
        String str;
        int i;
        LiveMode streamType;
        bzi.LJIILLIIL(dataChannel);
        if (C29306Beo.LJIIL(dataChannel)) {
            bzi.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).dK()), "user_rank");
            bzi.LJIJJ("user", "user_type");
        } else {
            bzi.LJIJJ("anchor", "user_type");
        }
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = streamType.logStreamingType;
        } else {
            str = null;
        }
        bzi.LJIJ(str);
        bzi.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()), "online_watch_users");
        CZZ czz = (CZZ) dataChannel.kv0(CV2.class);
        if (czz != null) {
            i = czz.LIZ();
        } else {
            i = 0;
        }
        bzi.LJIJJ(CZT.LIZ(i), "role");
        if (C15380j0.LJIILLIIL()) {
            bzi.LJIJJ("portrait", "room_orientation");
        } else {
            bzi.LJIJJ("landscape", "room_orientation");
        }
    }

    public static void LJ(BZI bzi, Throwable th) {
        int i;
        if (th instanceof CH1) {
            bzi.LJIJJ("custom_api_error", "error_type");
            CH1 ch1 = (CH1) th;
            bzi.LJIJJ(Integer.valueOf(ch1.getErrorCode()), "error_code");
            bzi.LJIJJ(ch1.getErrorMsg(), "error_msg");
            bzi.LJIJJ(ch1.getxTtLogId(), "log_id");
            return;
        }
        if (th instanceof C29401Dk) {
            bzi.LJIJJ("api_error", "error_type");
            C29401Dk c29401Dk = (C29401Dk) th;
            bzi.LJIJJ(Integer.valueOf(c29401Dk.getErrorCode()), "error_code");
            bzi.LJIJJ(c29401Dk.getErrorMsg(), "error_msg");
            bzi.LJIJJ(c29401Dk.getLogId(), "log_id");
            return;
        }
        if (th instanceof C0TL) {
            bzi.LJIJJ("net_error", "error_type");
            bzi.LJIJJ(Integer.valueOf(((C0TL) th).getCronetError()), "error_code");
            bzi.LJIJJ(th.getMessage(), "error_msg");
            return;
        }
        if (th instanceof C64799Pbv) {
            bzi.LJIJJ("cronet_io_error", "error_type");
            bzi.LJIJJ(-2, "error_code");
            bzi.LJIJJ(th.getMessage(), "error_msg");
            return;
        }
        if (th instanceof C64698PaI) {
            bzi.LJIJJ("net_not_available_error", "error_type");
            C15380j0.LIZLLL();
            if (C2NU.LIZ.LIZIZ()) {
                i = -4;
                bzi.LJIJJ(Integer.valueOf(i), "error_code");
                bzi.LJIJJ(th.getMessage(), "error_msg");
                return;
            }
            i = -3;
            bzi.LJIJJ(Integer.valueOf(i), "error_code");
            bzi.LJIJJ(th.getMessage(), "error_msg");
            return;
        }
        bzi.LJIJJ(C16880lQ.LJLLILLLL(th.getClass()), "error_type");
        bzi.LJIJJ(-1, "error_code");
        bzi.LJIJJ(th.getMessage(), "error_msg");
    }

    public static void LIZJ(CVC cvc, DataChannel dataChannel, boolean z) {
        String str;
        int i;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_show_finish");
        LIZLLL(LIZ2, dataChannel);
        if (cvc.LJLJJLL == 10) {
            str = "basic";
        } else {
            str = "up_grade";
        }
        LIZ2.LJIJJ(str, "gear_type");
        LIZ2.LJIJJ(cvc.LJLIL, "comment_id");
        if (cvc.LJLILLLLZI.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i), "is_self");
        I9A.LIZ(SystemClock.elapsedRealtime() - cvc.LJLL, cvc.LJLLILLLL, LIZ2, "duration");
        C0JT.LIZJ(LIZ2, cvc.LJLLJ, "source", z ? 1 : 0, "has_received_msg");
    }

    public static void LIZ(DataChannel dataChannel, CVK data, Throwable throwable, long j) {
        String str;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(throwable, "throwable");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_delete_request");
        LIZLLL(LIZ2, dataChannel);
        LJ(LIZ2, throwable);
        LIZ2.LJIJJ(Integer.valueOf(data.LIZJ ? 1 : 0), "is_floating");
        LIZ2.LJIJJ(0, "is_successful");
        LIZ2.LJIJJ(Long.valueOf(j), "duration");
        LIZ2.LJIJJ(data.LIZ.LJLIL, "comment_id");
        LIZ2.LJIJJ(data.LIZIZ, "delete_position");
        if (data.LIZ.LJLJJLL == 10) {
            str = "basic";
        } else {
            str = "up_grade";
        }
        LIZ2.LJIJJ(str, "gear_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZIZ(DataChannel dataChannel, CVK data, long j, String str) {
        String str2;
        o.LJIIIZ(data, "data");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_delete_request");
        LIZLLL(LIZ2, dataChannel);
        LIZ2.LJIJJ(Integer.valueOf(data.LIZJ ? 1 : 0), "is_floating");
        LIZ2.LJIJJ(1, "is_successful");
        LIZ2.LJIJJ(Long.valueOf(j), "duration");
        LIZ2.LJIJJ(data.LIZ.LJLIL, "comment_id");
        LIZ2.LJIJJ(data.LIZIZ, "delete_position");
        if (data.LIZ.LJLJJLL == 10) {
            str2 = "basic";
        } else {
            str2 = "up_grade";
        }
        C06490Nh.LIZLLL(LIZ2, str2, "gear_type", str, "log_id");
    }
}
