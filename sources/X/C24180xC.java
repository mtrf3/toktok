package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.0xC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24180xC {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C26T.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C26S.LJLIL);

    public static void LIZIZ(String str, PunishEventInfo punishEventInfo) {
        if (punishEventInfo == null) {
            return;
        }
        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_violation_toast_floating", "screen_share", "live_type");
        String str2 = punishEventInfo.punishId;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        LIZIZ2.LJIJJ(str2, "record_id");
        LIZIZ2.LJIJJ(str, "action_type");
        LIZIZ2.LJIJJ(Long.valueOf(punishEventInfo.violationUid), "violation_anchor_id");
        LIZIZ2.LJIJJ(Long.valueOf(BJM.LJIILJJIL()), "room_id");
        String str4 = punishEventInfo.punishType;
        if (str4 == null) {
            str4 = "";
        }
        LIZIZ2.LJIJJ(str4, "violation_type");
        Object obj = punishEventInfo.duration;
        if (obj == null) {
            obj = "";
        }
        LIZIZ2.LJIJJ(obj.toString(), "period");
        String str5 = punishEventInfo.punishReason;
        if (str5 != null) {
            str3 = str5;
        }
        LIZIZ2.LJIJJ(str3, "violation_reason");
        LIZIZ2.LJJIIJZLJL();
    }

    public static void LIZ(int i, int i2, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_floating_ball_show");
        LIZ2.LJIJJ(Long.valueOf(((Number) LIZ.getValue()).longValue()), "room_id");
        C78895Uxn.LIZIZ(LIZ2, (String) LIZIZ.getValue(), "anchor_id", i, "error_code");
        LIZ2.LJIJJ(errorMsg, "error_msg");
        LIZ2.LJIJJ(Integer.valueOf(i2), "is_exceed_screen");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZJ(long j, long j2, String warningType, String eventPage) {
        o.LJIIIZ(warningType, "warningType");
        o.LJIIIZ(eventPage, "eventPage");
        BZI LIZIZ2 = C0N3.LIZIZ("livesdk_warning_no_rec_anchor_pop", "screen_share", "live_type");
        LIZIZ2.LJIJJ(Long.valueOf(j2), "room_id");
        LIZIZ2.LJIJJ(Long.valueOf(j), "anchor_id");
        LIZIZ2.LJIJJ(eventPage, "event_page");
        LIZIZ2.LJIJJ(warningType, "warning_type");
        LIZIZ2.LJJIIJZLJL();
    }
}
