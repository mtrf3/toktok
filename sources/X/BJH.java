package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* loaded from: classes6.dex */
public final class BJH {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Room room) {
        boolean z;
        List<Long> list;
        if (room == null) {
            LIZIZ(false, false);
            return;
        }
        RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
        if (linkMicInfo != null && (list = linkMicInfo.audienceIdList) != null && list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(false, z);
    }

    public static final void LIZIZ(boolean z, boolean z2) {
        String str;
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        long uptimeMillis = SystemClock.uptimeMillis() - BJI.LIZ;
        BZI LIZ2 = C28787BRn.LIZ("convenient_gift_show");
        LIZ2.LJIIZILJ();
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        LIZ2.LJIJJ(valueOf, "user_id");
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str, "is_guest_connection");
        LIZ2.LJIJJ(Long.valueOf(uptimeMillis), "room_enter_to_show_duration");
        LIZ2.LJIJJ(Boolean.valueOf(z), "is_transparent");
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIIJ("bottom_tab");
        LIZ2.LJIIIZ("live");
        LIZ2.LJIIL("other");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIIJZLJL();
            return;
        }
        LIZ2.LJJIJ();
        LIZ2.LJJIIZ();
        LIZ2.LJIJJ(BJM.LJLIL.LIZJ(), "live_type");
        LIZ2.LJJIIZI();
    }
}
