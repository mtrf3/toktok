package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TTg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74696TTg {
    public static long LIZ;
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static final void LIZ(String str) {
        String str2;
        if (LIZ > 0) {
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("guest_id", LIZLLL);
                String idStr = room.getIdStr();
                o.LJIIIIZZ(idStr, "room.idStr");
                hashMap.put("room_id", idStr);
                hashMap.put("duration", String.valueOf(System.currentTimeMillis() - LIZ));
                LiveMode streamType = room.getStreamType();
                if (streamType != null) {
                    str2 = C28509BGv.LIZ(streamType);
                } else {
                    str2 = "live_studio";
                }
                hashMap.put("live_type", str2);
                hashMap.put("connection_over_type", str);
                hashMap.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                hashMap.put("guest_invite_type", LIZIZ);
                hashMap.put("enter_method", BJM.LJIIIIZZ());
                hashMap.put("enter_from_merge", BJM.LJFF());
                hashMap.put("action_type", BJM.LIZLLL());
                hashMap.put("layout_setting", "floating");
                hashMap.put("window_setting", "unfixed");
                hashMap.put("camera_status", "off");
                hashMap.put("permission_type", TV2.LJFF());
                hashMap.put("link_id", LIZJ);
                C77125UOr.LJI(hashMap);
                hashMap.put("enhance_level", CardStruct.IStatusCode.DEFAULT);
                C77125UOr.LJ(hashMap);
                C77125UOr.LJFF(hashMap);
                BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_over");
                LIZ2.LJJIFFI(hashMap);
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
            }
            LIZ = 0L;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_name", "ttlive_multilive_guest_end");
            jSONObject.put("way", str);
            C0NB.LJIIIZ("GameLinkGuestEnd", jSONObject.toString());
        }
    }
}
