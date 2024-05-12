package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSendGiftToUserCheckSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ctz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32795Ctz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(Long l, Long l2, Long l3, Long l4, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("gift_id", l);
        jSONObject.put("gift_enter_from", str);
        jSONObject.put("send_gift_scene", C31120CJg.LJI());
        jSONObject.put("fail_reason", str2);
        jSONObject2.put("room_id", l2);
        jSONObject2.put("anchor_id", l3);
        jSONObject2.put("to_user_id", l4);
        LiveGiftSendGiftToUserCheckSettings liveGiftSendGiftToUserCheckSettings = LiveGiftSendGiftToUserCheckSettings.INSTANCE;
        jSONObject2.put("is_open_fix_normal_link", liveGiftSendGiftToUserCheckSettings.blockForNormalLink());
        jSONObject2.put("is_open_fix_guest_link_host", liveGiftSendGiftToUserCheckSettings.blockForGuestLinkHost());
        jSONObject2.put("is_open_fix_guest_link_guest", liveGiftSendGiftToUserCheckSettings.blockForGuestLinkGuest());
        BZI LIZ2 = C28787BRn.LIZ("send_to_wrong_user");
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(jSONObject2);
        LIZ2.LJJIIJZLJL();
        C0K2.LJI("send_to_wrong_user", jSONObject, new JSONObject(), jSONObject2);
    }

    public static void LIZLLL(Long l, Long l2, Integer num, String sendGiftRequestId, String errorCode, int i, boolean z) {
        String str;
        o.LJIIIZ(sendGiftRequestId, "sendGiftRequestId");
        o.LJIIIZ(errorCode, "errorCode");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("gift_id", l);
        jSONObject.put("to_user_id", l2);
        jSONObject.put("from_user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        jSONObject.put("repeat_count", num);
        jSONObject2.put("send_gift_request_id", sendGiftRequestId);
        jSONObject2.put("error_code", errorCode);
        jSONObject2.put("retry_count", i);
        if (z) {
            str = "send_gift_retry_success";
        } else {
            str = "send_gift_retry_final_fail";
        }
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(jSONObject2);
        LIZ2.LJJIIJZLJL();
        C0K2.LJI(str, jSONObject, new JSONObject(), jSONObject2);
    }

    public static void LIZ(long j, String str, long j2, Long l, Long l2, Integer num, Long l3, String str2) {
        String str3;
        long LIZ2 = C30725C4b.LIZ();
        BZI LIZ3 = C28787BRn.LIZ("self_gift_msg_sent");
        LIZ3.LJIIZILJ();
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (str3 = (String) map.get("anchor_id")) == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C06530Nl.LIZLLL(LIZ3, str3, "anchor_id", j2, "send_request_ms");
        LIZ3.LJIJJ(Long.valueOf(LIZ2), "response_receive_ms");
        LIZ3.LJIJJ(Long.valueOf(LIZ2 - j2), "duration");
        LIZ3.LJIJJ(Long.valueOf(C30725C4b.LIZ() - j), "send_click_duration");
        LIZ3.LJIJJ(l, "gift_id");
        LIZ3.LJIJJ(l2, "to_user_id");
        LIZ3.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "from_user_id");
        LIZ3.LJIJJ(num, "repeat_count");
        LIZ3.LJIJJ(l3, "msg_id");
        LIZ3.LJIJJ(str2, "log_id");
        LIZ3.LJJIFFI(C32465Cof.LIZ(str));
        LIZ3.LJJIIJZLJL();
    }

    public static void LIZIZ(Long l, Integer num, Long l2, Integer num2, DataChannel dataChannel, Room room, String str, String str2, int i) {
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Integer num3;
        Object obj;
        long j;
        int i2;
        Room room2;
        Room room3;
        Room room4;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (room != null) {
            l3 = Long.valueOf(room.getId());
        } else {
            l3 = null;
        }
        if (dataChannel != null && (room4 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l4 = Long.valueOf(room4.getId());
        } else {
            l4 = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        C28246B6s c28246B6s = (C28246B6s) dataChannelGlobal.mv0(C29049Baf.class);
        if (c28246B6s != null && (room3 = c28246B6s.LIZIZ) != null) {
            l5 = Long.valueOf(room3.getId());
        } else {
            l5 = null;
        }
        jSONObject3.put("send_room", l3);
        jSONObject3.put("datachannel_room", l4);
        jSONObject3.put("global_room", l5);
        jSONObject3.put("send_scenario", str);
        jSONObject3.put("send_to_user_type", str2);
        C28246B6s c28246B6s2 = (C28246B6s) dataChannelGlobal.mv0(C29049Baf.class);
        if (c28246B6s2 != null) {
            l6 = c28246B6s2.LIZJ;
        } else {
            l6 = null;
        }
        jSONObject3.put("global_anchor_id", l6);
        if (room != null) {
            l7 = Long.valueOf(room.getOwnerUserId());
        } else {
            l7 = null;
        }
        jSONObject3.put("send_anchor_id", l7);
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            l8 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l8 = null;
        }
        jSONObject3.put("datachannel_anchor_id", l8);
        jSONObject3.put("sender_hash_code", i);
        if (dataChannel != null) {
            num3 = Integer.valueOf(dataChannel.hashCode());
        } else {
            num3 = null;
        }
        jSONObject3.put("datachannel_hash_code", num3);
        java.util.Map map = (java.util.Map) dataChannelGlobal.mv0(C29824BnA.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject3.put("anchor_id", obj);
        jSONObject3.put("send_request_ms", C30725C4b.LIZ());
        jSONObject3.put("gift_id", l);
        jSONObject3.put("gift_type", num);
        jSONObject3.put("to_user_id", l2);
        jSONObject3.put("from_user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        jSONObject3.put("repeat_count", num2);
        C32455CoV.LJII(jSONObject, jSONObject3);
        GiftManager inst = GiftManager.inst();
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Gift findGiftById = inst.findGiftById(j);
        if (findGiftById != null) {
            C32455CoV.LIZJ(findGiftById, null, 0L, jSONObject, jSONObject3);
        }
        if (l != null) {
            j2 = l.longValue();
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, j2);
        if (dataChannel != null) {
            jSONObject.put("anchor_client_version", C32455CoV.LJIILJJIL(dataChannel));
            Room room5 = (Room) dataChannel.kv0(RoomChannel.class);
            if (room5 != null) {
                i2 = room5.getPlatform();
            } else {
                i2 = 0;
            }
            jSONObject.put("anchor_os_type", i2);
        }
        BZI LIZ2 = C28787BRn.LIZ("send_gift_request");
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJ(jSONObject2);
        LIZ2.LJJ(jSONObject3);
        LIZ2.LJJIIJZLJL();
        C0K2.LJ("send_gift_request", jSONObject, jSONObject2, jSONObject3);
        if (!o.LJ(l4, l5)) {
            jSONObject.put("type", "room_error");
            C0K2.LJI("gift_core_monitor", jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static void LJ(long j, String str, long j2, String str2, String str3, Long l, Integer num, Long l2, Integer num2, Long l3, String str4, long j3, String str5, String str6, DataChannel dataChannel) {
        long j4;
        String str7;
        int i;
        long LIZ2 = C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject LJ = C47135Ieh.LJ("log_id", str4, "send_scenario", str5);
        LJ.put("send_to_user_type", str6);
        C32455CoV.LJII(jSONObject, LJ);
        GiftManager inst = GiftManager.inst();
        long j5 = 0;
        if (l != null) {
            j4 = l.longValue();
        } else {
            j4 = 0;
        }
        Gift findGiftById = inst.findGiftById(j4);
        if (findGiftById != null) {
            C32455CoV.LIZJ(findGiftById, null, 0L, jSONObject, LJ);
        }
        if (l != null) {
            j5 = l.longValue();
        }
        C32455CoV.LJIJ(jSONObject, jSONObject2, j5);
        if (dataChannel != null) {
            Room room = (Room) dataChannel.kv0(RoomChannel.class);
            boolean z = false;
            if (room != null) {
                i = room.getPlatform();
            } else {
                i = 0;
            }
            jSONObject.put("anchor_client_version", C32455CoV.LJIILJJIL(dataChannel));
            jSONObject.put("anchor_os_type", i);
            if (i == 0) {
                z = true;
            }
            jSONObject.put("disable_gift_tracking", z);
        }
        BZI LIZ3 = C28787BRn.LIZ("send_gift_response");
        LIZ3.LJIIZILJ();
        LIZ3.LJJ(jSONObject);
        LIZ3.LJJ(LJ);
        LIZ3.LJJ(jSONObject2);
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        if (map == null || (str7 = (String) map.get("anchor_id")) == null) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        C06530Nl.LIZLLL(LIZ3, str7, "anchor_id", j2, "send_request_ms");
        LIZ3.LJIJJ(Long.valueOf(LIZ2), "response_receive_ms");
        LIZ3.LJIJJ(Long.valueOf(LIZ2 - j2), "duration");
        LIZ3.LJIJJ(str2, "status_code");
        LIZ3.LJIJJ(str3, "status_msg");
        LIZ3.LJIJJ(Long.valueOf(C30725C4b.LIZ() - j), "send_click_duration");
        LIZ3.LJIJJ(l, "gift_id");
        LIZ3.LJIJJ(num, "gift_type");
        LIZ3.LJIJJ(l2, "to_user_id");
        LIZ3.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "from_user_id");
        LIZ3.LJIJJ(num2, "repeat_count");
        LIZ3.LJIJJ(l3, "msg_id");
        LIZ3.LJIJJ(Long.valueOf(j3 - j2), "api_time");
        LIZ3.LJIJJ(Long.valueOf(LIZ2 - j3), "response_process_time");
        LIZ3.LJJIFFI(C32465Cof.LIZ(str));
        LIZ3.LJJIIJZLJL();
        C0K2.LJI("send_gift_response", jSONObject, jSONObject2, LJ);
    }
}
