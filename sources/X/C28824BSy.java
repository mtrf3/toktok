package X;

import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BSy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28824BSy {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Room room, String str, String str2, BT1 requestPage, String str3) {
        String str4;
        Long l;
        o.LJIIIZ(room, "room");
        o.LJIIIZ(requestPage, "requestPage");
        int i = BT0.LIZ[requestPage.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str4 = "sharing_panel";
            } else {
                throw new C162476Zf();
            }
        } else {
            str4 = "long_press";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C28347BAp.LIZ(linkedHashMap, room, str, str2, "");
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        BZI LIZ2 = C28787BRn.LIZ("dislike");
        LIZ2.LJIIZILJ();
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        Hashtag hashtag = room.hashtag;
        String str5 = null;
        if (hashtag != null) {
            l = hashtag.id;
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "hashtag_id");
        Hashtag hashtag2 = room.hashtag;
        if (hashtag2 != null) {
            str5 = hashtag2.title;
        }
        LIZ2.LJIJJ(str5, "hashtag_type");
        LIZ2.LJIJJ(str3, "event_page");
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        LIZ2.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        LIZ2.LJJIFFI(linkedHashMap);
        LIZ2.LJIJJ(str4, "request_page");
        LIZ2.LJJIIJZLJL();
    }
}
