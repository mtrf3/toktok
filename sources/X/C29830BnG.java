package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BnG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29830BnG extends C05630Jz {
    public static void LJIIIIZZ(JSONObject jSONObject) {
        InterfaceC05190Ih interfaceC05190Ih;
        String str;
        long j;
        Object value;
        Boolean bool;
        String str2;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        Boolean bool2 = null;
        if (LIZIZ != null) {
            interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ;
        } else {
            interfaceC05190Ih = null;
        }
        if (Room.isValid(room)) {
            o.LJI(room);
            str = room.getIdStr();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("room_id", str);
        long j2 = 0;
        if (interfaceC05190Ih != null) {
            j = interfaceC05190Ih.getId();
        } else {
            j = 0;
        }
        if (Room.isValid(room)) {
            o.LJI(room);
            j2 = room.getOwnerUserId();
        }
        hashMap.put("current_user_id", Long.valueOf(j));
        hashMap.put("current_anchor_id", Long.valueOf(j2));
        if (Room.isValid(room) && room != null && room.getOwner() != null) {
            if (Room.isValid(room)) {
                User owner = room.getOwner();
                if (owner != null) {
                    bool = Boolean.valueOf(owner.isAnchorHasSubQualification());
                } else {
                    bool = null;
                }
            } else {
                bool = Boolean.FALSE;
            }
            hashMap.put("anchor_qualification", bool);
            if (room.getOwner().isSubscribed()) {
                str2 = "subscribed_not_expired";
            } else {
                SubscribeInfo subscribeInfo = room.getOwner().getSubscribeInfo();
                if (subscribeInfo != null) {
                    bool2 = Boolean.valueOf(subscribeInfo.isInGracePeriod());
                }
                if (!C29306Beo.LJIL(bool2)) {
                    str2 = "subscribed_expired_grace_period";
                } else {
                    str2 = "not_subscribed";
                }
            }
            hashMap.put("is_subscription", Boolean.valueOf(room.getOwner().isSubscribed()));
            hashMap.put("subscribe_state", str2);
        }
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()));
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!jSONObject.has((String) entry.getKey()) && (value = entry.getValue()) != null) {
                String key = (String) entry.getKey();
                o.LJIIIZ(key, "key");
                if (value instanceof Long) {
                    C05630Jz.LJFF(jSONObject, key, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    C05630Jz.LJ(jSONObject, key, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    C05630Jz.LIZLLL(jSONObject, key, ((Number) value).doubleValue());
                } else if (value instanceof JSONObject) {
                    C05630Jz.LIZJ(key, jSONObject, (JSONObject) value);
                } else if (value instanceof String) {
                    C05630Jz.LJI(jSONObject, key, (String) value);
                } else {
                    C05630Jz.LJI(jSONObject, key, value.toString());
                }
            }
        }
        if (!jSONObject.has("server_timestamp")) {
            C05630Jz.LJFF(jSONObject, "server_timestamp", C31012CFc.LIZIZ());
        }
        if (!jSONObject.has("client_and_server_diff_time")) {
            C05630Jz.LJFF(jSONObject, "client_and_server_diff_time", C31012CFc.LIZIZ);
        }
        if (!jSONObject.has("client_timestamp")) {
            C05630Jz.LJFF(jSONObject, "client_timestamp", System.currentTimeMillis());
        }
    }

    public final void LJIIIZ(Throwable th, JSONObject jSONObject) {
        String str;
        int i;
        if (th != null) {
            str = th.toString();
        } else {
            str = null;
        }
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            i = c29401Dk.getErrorCode();
            str = c29401Dk.getErrorMsg();
        } else if (th instanceof C0TL) {
            C0TL c0tl = (C0TL) th;
            i = c0tl.statusCode;
            str = c0tl.getMessage();
        } else {
            i = 100001;
        }
        C05630Jz.LJFF(jSONObject, "error_msg", i);
        C05630Jz.LJI(jSONObject, "error_detail", str);
        if (th != null) {
            C05630Jz.LJI(jSONObject, "error_class", th.getClass().getName());
        }
    }
}
