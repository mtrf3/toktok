package X;

import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public final class CVL {
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
        bzi.LJIJJ(Long.valueOf(j), "room_id");
        bzi.LJIJJ(Long.valueOf(j2), "anchor_id");
        bzi.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).dK()), "user_rank");
        if (C15380j0.LJIILLIIL()) {
            bzi.LJIJJ("portrait", "room_orientation");
        } else {
            bzi.LJIJJ("landscape", "room_orientation");
        }
    }

    public static void LIZIZ(BZI bzi, Throwable th, String str) {
        int i;
        if (th instanceof CH1) {
            bzi.LJIJJ("custom_api_error", "error_type");
            CH1 ch1 = (CH1) th;
            bzi.LJIJJ(Integer.valueOf(ch1.getErrorCode()), str);
            bzi.LJIJJ(ch1.getErrorMsg(), "error_msg");
            bzi.LJIJJ(ch1.getxTtLogId(), "log_id");
            return;
        }
        if (th instanceof C29401Dk) {
            bzi.LJIJJ("api_error", "error_type");
            C29401Dk c29401Dk = (C29401Dk) th;
            bzi.LJIJJ(Integer.valueOf(c29401Dk.getErrorCode()), str);
            bzi.LJIJJ(c29401Dk.getErrorMsg(), "error_msg");
            bzi.LJIJJ(c29401Dk.getLogId(), "log_id");
            return;
        }
        if (th instanceof C0TL) {
            bzi.LJIJJ("net_error", "error_type");
            bzi.LJIJJ(Integer.valueOf(((C0TL) th).getCronetError()), str);
            bzi.LJIJJ(th.getMessage(), "error_msg");
            return;
        }
        if (th instanceof C64799Pbv) {
            bzi.LJIJJ("cronet_io_error", "error_type");
            bzi.LJIJJ(-2, str);
            bzi.LJIJJ(th.getMessage(), "error_msg");
            return;
        }
        if (th instanceof C64698PaI) {
            bzi.LJIJJ("net_not_available_error", "error_type");
            C15380j0.LIZLLL();
            if (C2NU.LIZ.LIZIZ()) {
                i = -4;
                bzi.LJIJJ(Integer.valueOf(i), str);
                bzi.LJIJJ(th.getMessage(), "error_msg");
                return;
            }
            i = -3;
            bzi.LJIJJ(Integer.valueOf(i), str);
            bzi.LJIJJ(th.getMessage(), "error_msg");
            return;
        }
        bzi.LJIJJ(C16880lQ.LJLLILLLL(th.getClass()), "error_type");
        bzi.LJIJJ(-1, str);
        bzi.LJIJJ(th.getMessage(), "error_msg");
    }

    public static void LIZJ(long j, String str, boolean z) {
        int i;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_panel_show");
        LIZ2.LJIIZILJ();
        LIZ(LIZ2);
        LIZ2.LJIJJ(str, "enter_from");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i), "is_qualified");
        LIZ2.LJIJJ(Long.valueOf(j), "unavailable_reason");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(int i, String str, String str2) {
        String str3;
        if (i != 10) {
            if (i != 20) {
                str3 = "";
            } else {
                str3 = "up_grade";
            }
        } else {
            str3 = "basic";
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_star_comment_send_fail");
        LIZ2.LJIIZILJ();
        LIZ(LIZ2);
        LIZ2.LJIJJ(str2, "enter_from");
        LIZ2.LJIJJ(str3, "gear_type");
        LIZ2.LJIJJ(str, "error_code");
        LIZ2.LJJIIJZLJL();
    }
}
