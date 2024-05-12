package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TfA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C75192TfA extends C05630Jz {
    public static HashMap LJIILJJIL() {
        String str;
        String str2;
        String str3;
        long j;
        LiveMode streamType;
        HashMap hashMap = new HashMap();
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        hashMap.put("channel_id", Long.valueOf(LIZIZ.LJFF));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        boolean isValid = Room.isValid(room);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (isValid) {
            o.LJI(room);
            str = room.getIdStr();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("room_id", str);
        String str5 = null;
        if (room != null && (streamType = room.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        } else {
            str2 = null;
        }
        hashMap.put("live_type", str2);
        Config.Vendor fromValue = Config.Vendor.fromValue(LIZIZ.LJIILJJIL);
        o.LJIIIIZZ(fromValue, "fromValue(linkMicVendor)");
        hashMap.put("vendor", String.valueOf(fromValue.getValue()));
        if (LIZIZ.LJIIL) {
            str3 = "inviter";
        } else {
            str3 = "invitee";
        }
        hashMap.put("role_type", str3);
        if (Room.isValid(room)) {
            o.LJI(room);
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        hashMap.put("user_id", Long.valueOf(j));
        hashMap.put("guest_user_id", Long.valueOf(LIZIZ.LJI));
        hashMap.put("link_mic_id", LIZIZ.LJJIJIIJI);
        hashMap.put("rtc_join_channel_advance", 0L);
        hashMap.put("server_auto_joinchannel", Boolean.TRUE);
        EnumC75636TmK LIZJ = LIZIZ.LIZJ();
        if (LIZJ != null) {
            str5 = LIZJ.name();
        }
        hashMap.put("link_state", str5);
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()));
        if (hashMap.get("invitee_list") == null) {
            hashMap.put("invitee_list", C75545Tkr.LIZIZ(B5G.LIZIZ().LJIIJ));
        }
        hashMap.put("server_timestamp", Long.valueOf(C30725C4b.LIZ()));
        if (CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
            str4 = "1";
        }
        hashMap.put("need_wait_rtc_joinchannel_succeed", str4);
        return hashMap;
    }

    public static final void LJIILIIL(JSONObject jSONObject) {
        if (!jSONObject.has("server_timestamp")) {
            C05630Jz.LJFF(jSONObject, "server_timestamp", C30725C4b.LIZ());
        }
        if (!jSONObject.has("client_and_server_diff_time")) {
            C05630Jz.LJFF(jSONObject, "client_and_server_diff_time", C31012CFc.LIZIZ);
        }
        if (!jSONObject.has("client_timestamp")) {
            C05630Jz.LJFF(jSONObject, "client_timestamp", System.currentTimeMillis());
        }
    }

    public static final HashMap<String, Object> LJIILL(boolean z) {
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        LiveMode streamType;
        HashMap<String, Object> hashMap = new HashMap<>();
        C74838TYs LJ = C74838TYs.LJ();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (Room.isValid(room)) {
            o.LJI(room);
            str = room.getIdStr();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        long j2 = 0;
        if (Room.isValid(room)) {
            o.LJI(room);
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", str);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        } else {
            str2 = null;
        }
        hashMap.put("live_type", str2);
        hashMap.put("anchor_id", Long.valueOf(j));
        hashMap.put("in_rtc_room", Boolean.valueOf(LJ.LJJIII));
        if (z) {
            str3 = "anchor";
        } else {
            str3 = "guest";
        }
        hashMap.put("role_type", str3);
        hashMap.put("vendor", String.valueOf(Config.Vendor.fromValue(0).getValue()));
        hashMap.put("link_mic_id", LJ.LIZLLL());
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j2 = ((C29374Bfu) LIZIZ).getCurrentUserId();
        }
        hashMap.put("current_user_id", Long.valueOf(j2));
        hashMap.put("current_linkmic_id", TS8.LIZ.LIZ(j2));
        hashMap.put("server_timestamp", Long.valueOf(C30725C4b.LIZ()));
        if (z || C74740TUy.LIZLLL().LJIIJJI != 2) {
            str4 = "video";
        } else {
            str4 = "audio";
        }
        hashMap.put("link_type", str4);
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()));
        String LIZJ = U4C.LIZJ();
        if (LIZJ == null) {
            LIZJ = "";
        }
        hashMap.put("guest_ab_params", LIZJ);
        hashMap.put("live_ab_label", LiveAbLabelSetting.INSTANCE.getValue());
        hashMap.put("sequential_enable", Boolean.valueOf(LinkmicSequentialEventReportSetting.INSTANCE.getValue().enable));
        return hashMap;
    }

    public final void LJIIJJI(JSONObject jSONObject) {
        Object value;
        for (Map.Entry entry : LJIILJJIL().entrySet()) {
            if (!jSONObject.has((String) entry.getKey()) && (value = entry.getValue()) != null) {
                LJIIIIZZ(jSONObject, (String) entry.getKey(), value);
            }
        }
        LJIILIIL(jSONObject);
    }

    public static void LJIIIZ(LinkMicBattleMessage message, JSONObject jSONObject) {
        o.LJIIIZ(message, "message");
        C05630Jz.LJFF(jSONObject, "battle_id", message.battleId);
        C05630Jz.LJFF(jSONObject, "message_create_time", message.baseMessage.createTime);
        C05630Jz.LJFF(jSONObject, "message_fetch_time", message.timestamp);
        C05630Jz.LJFF(jSONObject, "message_id", message.baseMessage.messageId);
    }

    public static void LJIIJ(Throwable th, JSONObject jSONObject) {
        String str;
        long j;
        if (th != null) {
            if (th instanceof C29401Dk) {
                C05630Jz.LJI(jSONObject, "error_type", "api_error");
                C05630Jz.LJFF(jSONObject, "error_code", r4.getErrorCode());
                C05630Jz.LJI(jSONObject, "error_msg", ((C29401Dk) th).getErrorMsg());
            } else if (th instanceof C0TL) {
                C05630Jz.LJI(jSONObject, "error_type", "net_error");
                C05630Jz.LJFF(jSONObject, "error_code", r4.statusCode);
                C05630Jz.LJI(jSONObject, "error_msg", ((C0TL) th).getMessage());
            } else {
                C05630Jz.LJI(jSONObject, "error_type", "unknow");
                C05630Jz.LJFF(jSONObject, "error_code", -1L);
                C05630Jz.LJI(jSONObject, "error_msg", th.getClass().getName());
            }
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (Room.isValid(room)) {
            o.LJI(room);
            str = room.getIdStr();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (Room.isValid(room)) {
            o.LJI(room);
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C05630Jz.LJI(jSONObject, "room_id", str);
        C05630Jz.LJFF(jSONObject, "anchor_id", j);
    }

    public final void LJIIL(Throwable th, JSONObject jSONObject) {
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
        } else if (th instanceof C276516r) {
            C276516r c276516r = (C276516r) th;
            i = c276516r.getErrorCode();
            str = c276516r.getMessage();
        } else if (th instanceof C64799Pbv) {
            C64799Pbv c64799Pbv = (C64799Pbv) th;
            i = c64799Pbv.getCronetInternalErrorCode();
            str = c64799Pbv.getMessage();
        } else {
            i = 100001;
        }
        C05630Jz.LJFF(jSONObject, "error_msg", i);
        C05630Jz.LJI(jSONObject, "error_detail", str);
        if (th != null) {
            C05630Jz.LJI(jSONObject, "error_class", th.getClass().getName());
        }
    }

    public static final void LJIIIIZZ(JSONObject jSONObject, String key, Object obj) {
        o.LJIIIZ(key, "key");
        if (obj == null) {
            return;
        }
        if (obj instanceof Long) {
            C05630Jz.LJFF(jSONObject, key, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            C05630Jz.LJ(jSONObject, key, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            C05630Jz.LIZLLL(jSONObject, key, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof JSONObject) {
            C05630Jz.LIZJ(key, jSONObject, (JSONObject) obj);
        } else if (obj instanceof String) {
            C05630Jz.LJI(jSONObject, key, (String) obj);
        } else {
            C05630Jz.LJI(jSONObject, key, obj.toString());
        }
    }
}
