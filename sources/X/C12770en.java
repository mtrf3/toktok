package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;

/* renamed from: X.0en, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12770en {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C515220m.LJLIL);

    public static final long LIZ() {
        return ((Number) LIZ.getValue()).longValue();
    }

    public static final void LIZIZ(String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_stream_quality_icon_click");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "room_id");
        LIZ2.LJIJJ(str, "btn_name");
        LIZ2.LJIJJ(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LIZJ(String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_stream_quality_page_show");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "room_id");
        LIZ2.LJIJJ(str, "page_name");
        LIZ2.LJIJJ(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LIZLLL(String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_stream_quality_retest_click");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "room_id");
        LIZ2.LJIJJ(str, "btn_name");
        LIZ2.LJIJJ(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJ(int i, String str, String btnName) {
        o.LJIIIZ(btnName, "btnName");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_stream_quality_toast");
        LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(LIZ()), "room_id");
        C78895Uxn.LIZIZ(LIZ2, str, "action_type", i, "reason");
        LIZ2.LJIJJ(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        if (o.LJ(str, "click")) {
            LIZ2.LJIJJ(btnName, "btn_name");
        }
        LIZ2.LJJIIJZLJL();
    }
}
