package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* loaded from: classes8.dex */
public final class I9C {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C86343Xud c86343Xud, String str) {
        LiveRoomStruct liveRoomStruct;
        if (c86343Xud != null && (liveRoomStruct = c86343Xud.LIZIZ) != null) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_currently_live_popup_click");
            LIZ2.LJIJJ(c86343Xud.LIZJ, "enter_from_merge");
            LIZ2.LJIJJ("live_cell", "enter_method");
            LIZ2.LJIJJ("click", "action_type");
            LIZ2.LJIJJ(Long.valueOf(liveRoomStruct.id), "room_id");
            LIZ2.LJIJJ(Long.valueOf(liveRoomStruct.getAnchorId()), "anchor_id");
            LIZ2.LJIJJ(str, "buttom_name");
            LIZ2.LJJIIJZLJL();
        }
    }
}
