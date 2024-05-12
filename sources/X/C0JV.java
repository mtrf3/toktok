package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;

/* renamed from: X.0JV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JV {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ() {
        if (B83.LIZ().LIZIZ() != null) {
            return ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        return 0L;
    }

    public static void LJIIIIZZ(boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_screencasting_livestudio_connected_show");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "anchor_id");
        C0JT.LIZJ(LIZ2, LiveMode.LIVE_STUDIO.logStreamingType, "live_type", z ? 1 : 0, "is_wireless");
    }

    public static void LIZIZ(String errorCode, String detail) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(detail, "detail");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_dual_device_connection_failed");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "user_id");
        LIZ2.LJIJJ(errorCode, "error_code");
        LIZ2.LJIJJ(detail, "detail_error_code");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(String roomId, String str) {
        o.LJIIIZ(roomId, "roomId");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_dual_device_shooting_popup_click");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "user_id");
        LIZ2.LJIJJ(roomId, "room_id");
        LIZ2.LJIJJ(str, "position");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJI(String roomId, String str) {
        o.LJIIIZ(roomId, "roomId");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_dual_device_connected_show");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "user_id");
        LIZ2.LJIJJ(roomId, "room_id");
        LIZ2.LJIJJ(str, "device_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJII(String roomId, String str) {
        o.LJIIIZ(roomId, "roomId");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_dual_device_shooting_click");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "user_id");
        LIZ2.LJIJJ(roomId, "room_id");
        LIZ2.LJIJJ(str, "position");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIZ(String str, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_screencasting_livestudio_disconnect_show");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "anchor_id");
        LIZ2.LJIJJ(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        LIZ2.LJIJJ(str, "disconnect_type");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJ(String str, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_screencasting_livestudio_disconnect_click");
        LIZ2.LJIILLIIL(null);
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "anchor_id");
        LIZ2.LJIJJ(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        LIZ2.LJIJJ(str, "enter_from");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJJI(Integer num, Integer num2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_screencasting_livestudio_connect_failed_show");
        LIZ2.LJIILLIIL(null);
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "anchor_id");
        LIZ2.LJIJJ(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        LIZ2.LJIJJ(num, "error_code");
        LIZ2.LJIJJ(num2, "sub_code");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(num);
        LIZ3.append('-');
        LIZ3.append(num2);
        LIZ2.LJIJJ(X1D.LIZIZ(LIZ3), "combin_code");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIILIIL(String str, boolean z, boolean z2) {
        if (str == null) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_screencasting_type_click");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "anchor_id");
        LIZ2.LJIJJ(str, "enter_from");
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_wireless");
        C0JT.LIZJ(LIZ2, LiveMode.LIVE_STUDIO.logStreamingType, "live_type", z2 ? 1 : 0, "if_start");
    }

    public static void LJ(int i, long j, Integer num, String str, String str2) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_dual_device_tech_monitor");
        LIZ2.LJIJJ("screen_share", "device_type");
        LIZ2.LJIJJ(Long.valueOf(j), "room_id");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "user_id");
        C78895Uxn.LIZIZ(LIZ2, str, WM7.SCENE_SERVICE, i, "code");
        if (num != null) {
            LIZ2.LJIJJ(num, "extra_code");
        }
        if (str2 != null) {
            LIZ2.LJIJJ(str2, "extra_msg");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(int i, int i2, String roomId, String str, String extraMsg, boolean z) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(extraMsg, "extraMsg");
        BZI LIZIZ = C0JU.LIZIZ("livesdk_dual_device_tech_monitor", "shoot", "device_type", roomId, "room_id");
        LIZIZ.LJIJJ(Long.valueOf(LIZ()), "user_id");
        LIZIZ.LJIJJ(str, WM7.SCENE_SERVICE);
        LIZIZ.LJIJJ(Integer.valueOf(i), "code");
        LIZIZ.LJIJJ(Integer.valueOf(i2), "extra_code");
        LIZIZ.LJIJJ(extraMsg, "extra_msg");
        LIZIZ.LJIJJ(Boolean.valueOf(z), "is_in_background");
        LIZIZ.LJJIIJZLJL();
    }

    public static /* synthetic */ void LJFF(long j, String str, int i, Integer num, String str2, int i2) {
        Integer num2 = num;
        String str3 = null;
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        if ((i2 & 16) == 0) {
            str3 = str2;
        }
        LJ(i, j, num2, str, str3);
    }
}
