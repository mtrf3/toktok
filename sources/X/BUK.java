package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BUK extends AbstractC38127Exn<JSONObject, Object> {
    @Override // X.AbstractC38127Exn
    public final Object invoke(JSONObject params, C38131Exr context) {
        User user;
        String LJ;
        User user2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        if (room != null && user != null && user.getFollowInfo() != null) {
            int pushStatus = (int) user.getFollowInfo().getPushStatus();
            IMicRoomService iMicRoomService = (IMicRoomService) CN1.LIZ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.jT(room) && iMicRoomService.Qo(room)) {
                OfficialChannelInfo officialChannelInfo = room.officialChannelInfo;
                if (officialChannelInfo != null && (user2 = officialChannelInfo.channelUser) != null) {
                    LJ = C05170If.LJ(user2);
                } else {
                    LJ = "";
                }
            } else {
                LJ = C05170If.LJ(user);
            }
            C28486BFy c28486BFy = new C28486BFy();
            c28486BFy.LIZIZ = String.valueOf(user.getId());
            c28486BFy.LIZ = String.valueOf(room.getId());
            c28486BFy.LIZJ = "jsb";
            c28486BFy.LIZLLL = "live_cell";
            java.util.Map<String, String> map = c28486BFy.LJ;
            o.LJIIIIZZ(map, "config.extras");
            ((HashMap) map).put("event_belong", "live");
            java.util.Map<String, String> map2 = c28486BFy.LJ;
            o.LJIIIIZZ(map2, "config.extras");
            ((HashMap) map2).put("event_page", "notification_setting");
            java.util.Map<String, String> map3 = c28486BFy.LJ;
            o.LJIIIIZZ(map3, "config.extras");
            ((HashMap) map3).put("previous_page", "subscription_benefits_to_do");
            BUL bul = new BUL();
            bul.LIZ = c28486BFy;
            bul.LIZIZ = user;
            bul.LIZJ = LJ;
            bul.LIZLLL = pushStatus;
            String LIZLLL = C05170If.LIZLLL(user);
            o.LJIIIIZZ(LIZLLL, "getNickname(user)");
            bul.LJ = LIZLLL;
            C73943T0h.LIZ().LIZIZ(bul);
        }
        return C770830u.LIZLLL("code", 1);
    }
}
