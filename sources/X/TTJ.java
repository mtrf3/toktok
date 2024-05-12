package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes14.dex */
public final class TTJ {
    public static void LIZ(boolean z) {
        String str;
        String str2;
        U8H LJJZZI;
        C76696U8e LJJIII;
        String LJJJJLL = C78886Uxe.LJJJJLL(C8E.LJ());
        int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
        BZI LIZ = C28787BRn.LIZ("livesdk_guest_guest_window_click");
        C78895Uxn.LIZIZ(LIZ, LJJJJLL, "link_id", LJJJJZI, "guest_cnt");
        LIZ.LJIJJ("click", "action_type");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_empty");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            LIZ.LJIJJ(room.getIdStr(), "room_id");
            LIZ.LJIJJ(room.getOwner().getIdStr(), "anchor_id");
            LIZ.LJIJJ("live_voice", "live_type");
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            str2 = LJJIII.getLayoutId();
        } else {
            str2 = null;
        }
        LIZ.LJIJJ(str2, "layout_id");
        LIZ.LJJIIJZLJL();
    }
}
