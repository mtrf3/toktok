package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BPV {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public static void LIZ(java.util.Map map) {
        String str;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("enter_method", BJM.LJIIIIZZ());
            hashMap.put("enter_from_merge", BJM.LJFF());
            hashMap.put("action_type", BJM.LIZLLL());
            hashMap.put("request_id", BJM.LJIILIIL());
            hashMap.put("video_id", BJM.LJIJ());
            if (room.getOwner() != null) {
                if (room.getOwner().isFollowing()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_follow", str);
            }
        }
    }

    public static void LIZJ(String str, String str2) {
        String str3;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("click_position", str);
        LIZ(hashMap);
        hashMap.put("action_type", "click");
        if (LIZIZ()) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        hashMap.put("user_type", str3);
        if (str2 != null) {
            hashMap.put("emote_id", str2);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscribe_icon_click");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(hashMap);
        LIZ2.LJJIFFI(C29232Bdc.LJIJJLI(LIZIZ(), false, room));
        LIZ2.LJJIIJZLJL();
        C30929CBx.LJIILL(str);
    }

    public static void LIZLLL(String str, String str2) {
        String str3;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        HashMap LIZJ = C03660Ck.LIZJ("show_entrance", str);
        if (LIZIZ()) {
            str3 = "anchor";
        } else {
            str3 = "user";
        }
        LIZJ.put("user_type", str3);
        if (str2 != null) {
            LIZJ.put("emote_id", str2);
        }
        LIZ(LIZJ);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_subscribe_icon_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(LIZJ);
        LIZ2.LJJIFFI(C29232Bdc.LJIJJLI(LIZIZ(), false, room));
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIIJZLJL();
        } else {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZ();
            LIZ2.LJJIIZI();
        }
        C30929CBx.LJIILLIIL(str);
    }
}
