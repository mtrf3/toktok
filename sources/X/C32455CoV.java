package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAudienceDeviceScoreSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CoV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32455CoV {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static String LJIIL() {
        Long l;
        String str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        java.util.Map map = (java.util.Map) dataChannelGlobal.mv0(C29824BnA.class);
        if (map == null || (str = (String) map.get("anchor_id")) == null) {
            C28246B6s c28246B6s = (C28246B6s) dataChannelGlobal.mv0(C29049Baf.class);
            if (c28246B6s != null && (l = c28246B6s.LIZJ) != null) {
                return l.toString();
            }
            return "";
        }
        return str;
    }

    public static String LJIILL() {
        Room room;
        String LIZ2;
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s == null || (room = c28246B6s.LIZIZ) == null || (LIZ2 = C17280m4.LIZ(room)) == null) {
            return "";
        }
        return LIZ2;
    }

    public static String LJIILIIL() {
        return String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
    }

    public static boolean LJIILLIIL() {
        return o.LJ(LJIILIIL(), LJIIL());
    }

    public static java.util.Map LJ(GiftMessage giftMessage) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = null;
        if (giftMessage != null) {
            str3 = giftMessage.LJLJI;
        }
        if (str3 != null) {
            HashMap hashMap = (HashMap) C32465Cof.LIZ(giftMessage.LJLJI);
            Object obj = hashMap.get("from_platform");
            if (obj != null) {
                linkedHashMap.put("from_platform", obj);
            }
            Object obj2 = hashMap.get("from_version");
            if (obj2 != null) {
                linkedHashMap.put("from_version", obj2);
            }
        } else if (giftMessage != null && giftMessage.giftMonitorInfo != null) {
            GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo != null && (str2 = giftMonitorInfo.fromPlatform) != null) {
                linkedHashMap.put("from_platform", str2);
            }
            GiftMonitorInfo giftMonitorInfo2 = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo2 != null && (str = giftMonitorInfo2.fromVersion) != null) {
                linkedHashMap.put("from_version", str);
            }
        }
        return linkedHashMap;
    }

    public static java.util.Map LJFF(GiftMessage giftMessage) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        long longValue;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object obj4;
        String str8;
        List<Integer> list;
        String valueOf;
        long j;
        Object obj5;
        List<Integer> list2;
        Room room;
        o.LJIIIZ(giftMessage, "giftMessage");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        String str9 = "1";
        if (giftMessage.isFirstSendGift) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_first_send", obj);
        Gift gift = giftMessage.mGift;
        String str10 = "";
        if (gift == null || (str = Integer.valueOf(gift.type).toString()) == null) {
            str = "";
        }
        linkedHashMap.put("gift_type", str);
        if (giftMessage.LJLILLLLZI) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_local", obj2);
        if (c28246B6s == null || (room = c28246B6s.LIZIZ) == null || (str2 = Integer.valueOf(room.getOrientation()).toString()) == null) {
            str2 = "";
        }
        linkedHashMap.put("room_type", str2);
        User user = giftMessage.fromUser;
        boolean z = false;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_own_send", obj3);
        Long l = giftMessage.colorId;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        linkedHashMap.put("color_id", String.valueOf(longValue));
        Gift gift2 = giftMessage.mGift;
        if (gift2 == null || (str3 = Long.valueOf(gift2.id).toString()) == null) {
            str3 = "";
        }
        linkedHashMap.put("gift_id", str3);
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData == null || (str4 = Long.valueOf(commonMessageData.messageId).toString()) == null) {
            str4 = "";
        }
        linkedHashMap.put("msg_id", str4);
        String str11 = giftMessage.mLogId;
        if (str11 == null) {
            str11 = "";
        }
        linkedHashMap.put("log_id", str11);
        User user2 = giftMessage.toUser;
        if (user2 == null || (str5 = C278817o.LIZIZ(user2)) == null) {
            str5 = "";
        }
        linkedHashMap.put("to_user_id", str5);
        User user3 = giftMessage.fromUser;
        if (user3 == null || (str6 = C278817o.LIZIZ(user3)) == null) {
            str6 = "";
        }
        linkedHashMap.put("from_user_id", str6);
        linkedHashMap.put("current_server_time_ms", String.valueOf(C30725C4b.LIZ()));
        linkedHashMap.put("current_local_time_ms", String.valueOf(System.currentTimeMillis()));
        String valueOf2 = String.valueOf(giftMessage.comboCount);
        if (valueOf2 == null) {
            valueOf2 = "";
        }
        linkedHashMap.put("combo_count", valueOf2);
        String valueOf3 = String.valueOf(giftMessage.repeatCount);
        if (valueOf3 == null) {
            valueOf3 = "";
        }
        linkedHashMap.put("repeat_count", valueOf3);
        Gift gift3 = giftMessage.mGift;
        if (gift3 == null || (str7 = Long.valueOf(gift3.primaryEffectId).toString()) == null) {
            str7 = "";
        }
        linkedHashMap.put("effect_id", str7);
        if (LJIILLIIL()) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_anchor", obj4);
        Gift gift4 = giftMessage.mGift;
        if (gift4 == null || (str8 = Integer.valueOf(gift4.giftSubType).toString()) == null) {
            str8 = "";
        }
        linkedHashMap.put("gift_sub_type", str8);
        if (gift4 == null || (list2 = gift4.giftVerticalScenarios) == null || list2.isEmpty()) {
            z = true;
        }
        if (z) {
            linkedHashMap.put("gift_vertical_scenarios", "");
        } else {
            if (gift4 != null && (list = gift4.giftVerticalScenarios) != null) {
                str10 = ORZ.LLD(list, ",", null, null, null, 62);
            }
            linkedHashMap.put("gift_vertical_scenarios", str10);
        }
        if (gift4 == null) {
            valueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            valueOf = String.valueOf(LIZ(gift4, giftMessage.giftsInBox));
        }
        linkedHashMap.put("gift_price", valueOf);
        long j2 = 0;
        if (gift4 != null) {
            j = gift4.primaryEffectId;
        } else {
            j = 0;
        }
        if (C32341Cmf.LIZ(j) != null) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_effect_model_ready", obj5);
        if (gift4 != null) {
            j2 = gift4.primaryEffectId;
        }
        if (!C32341Cmf.LJ(Long.valueOf(j2))) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_resource_ready", str9);
        for (Map.Entry entry : ((LinkedHashMap) LJ(giftMessage)).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static long LJIIIZ(GiftMessage giftMessage) {
        String str = null;
        if (giftMessage != null && giftMessage.giftMonitorInfo != null) {
            return giftMessage.giftMonitorInfo.send_gift_req_start_ms;
        }
        if (giftMessage != null) {
            str = giftMessage.LJLJI;
        }
        try {
            String str2 = (String) ((HashMap) C32465Cof.LIZ(str)).get("send_gift_req_start_ms");
            if (str2 != null) {
                return CastLongProtector.parseLong(str2);
            }
        } catch (Exception unused) {
        }
        return 0L;
    }

    public static long LJIIJ(GiftMessage giftMessage) {
        String str = null;
        if (giftMessage != null) {
            str = giftMessage.LJLJI;
        }
        if (str != null) {
            String str2 = (String) ((HashMap) C32465Cof.LIZ(giftMessage.LJLJI)).get("send_gift_start_client_local_ms");
            if (str2 == null) {
                return 0L;
            }
            return CastLongProtector.parseLong(str2);
        }
        if (giftMessage == null || giftMessage.giftMonitorInfo == null) {
            return 0L;
        }
        return giftMessage.giftMonitorInfo.sendGiftStartClientLocalMs;
    }

    public static void LJIIJJI(java.util.Map map) {
        map.put("enter_from_merge", BJM.LJFF());
        map.put("enter_method", BJM.LJIIIIZZ());
        map.put("action_type", BJM.LIZLLL());
        map.put("video_id", BJM.LJIJ());
        map.put("anchor_id", String.valueOf(BJM.LJ()));
        map.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        map.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        map.put("audience_device_score", String.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue()));
        map.put("broadcast_scene", C31120CJg.LJI());
        int value = LiveGiftUserConsumeLayerSetting.INSTANCE.getValue();
        if (value != 0) {
            map.put("live_user_consume_layer", String.valueOf(value));
        }
        map.put("current_server_time_ms", String.valueOf(C30725C4b.LIZ()));
        map.put("current_local_time_ms", String.valueOf(System.currentTimeMillis()));
    }

    public static long LJIILJJIL(DataChannel dataChannel) {
        String clientVersion;
        Long LJIJJLI;
        o.LJIIIZ(dataChannel, "dataChannel");
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room != null && (clientVersion = room.getClientVersion()) != null && (LJIJJLI = C79043V0l.LJIJJLI(clientVersion)) != null) {
            return LJIJJLI.longValue();
        }
        return 0L;
    }

    public static boolean LJIIZILJ(GiftMessage giftMessage) {
        String str;
        User user;
        String LJIILIIL = LJIILIIL();
        if (giftMessage != null && (user = giftMessage.fromUser) != null) {
            str = C278817o.LIZIZ(user);
        } else {
            str = null;
        }
        return o.LJ(LJIILIIL, str);
    }

    public static int LIZ(Gift gift, GiftsBoxInfo giftsBoxInfo) {
        o.LJIIIZ(gift, "gift");
        if (gift.isBoxGift && giftsBoxInfo != null) {
            List<GiftInfoInBox> list = giftsBoxInfo.gifts;
            ArrayList arrayList = new ArrayList();
            Iterator<GiftInfoInBox> it = list.iterator();
            while (it.hasNext()) {
                Gift findGiftById = GiftManager.inst().findGiftById(it.next().giftId);
                if (findGiftById != null) {
                    arrayList.add(findGiftById);
                }
            }
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                i += ((Gift) it2.next()).diamondCount;
            }
            return i + gift.diamondCount;
        }
        return gift.diamondCount;
    }

    public static void LJII(JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        long j;
        Room room;
        Room room2;
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        jSONObject.put("is_anchor", LJIILLIIL() ? 1 : 0);
        if (c28246B6s != null && (room2 = c28246B6s.LIZIZ) != null) {
            i = room2.getOrientation();
        } else {
            i = 0;
        }
        jSONObject.put("room_type", i);
        jSONObject.put("broadcast_scene", C31120CJg.LJI());
        int value = LiveGiftUserConsumeLayerSetting.INSTANCE.getValue();
        if (value != 0) {
            jSONObject.put("live_user_consume_layer", value);
        }
        jSONObject.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        jSONObject.put("audience_device_score", Float.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue()));
        if (c28246B6s != null && (room = c28246B6s.LIZIZ) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        jSONObject2.put("room_id", j);
        Long LJIJJLI = C79043V0l.LJIJJLI(LJIIL());
        if (LJIJJLI != null) {
            jSONObject2.put("anchor_id", LJIJJLI.longValue());
        }
        jSONObject2.put("current_server_time_ms", String.valueOf(C30725C4b.LIZ()));
        jSONObject2.put("current_local_time_ms", String.valueOf(System.currentTimeMillis()));
        jSONObject2.put("overload_score", C1H.LJ());
    }

    public static void LIZIZ(GiftMessage msg, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        long j;
        long j2;
        long j3;
        o.LJIIIZ(msg, "msg");
        jSONObject.put("is_local", msg.LJLILLLLZI);
        User user = msg.fromUser;
        if (user != null) {
            str = C278817o.LIZIZ(user);
        } else {
            str = null;
        }
        jSONObject.put("is_own_send", o.LJ(str, LJIILIIL()) ? 1 : 0);
        jSONObject.put("is_first_send", msg.isFirstSendGift ? 1 : 0);
        for (Map.Entry entry : ((LinkedHashMap) LJ(msg)).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        User user2 = msg.fromUser;
        if (user2 != null) {
            j = user2.getId();
        } else {
            j = 0;
        }
        jSONObject2.put("from_user_id", j);
        User user3 = msg.toUser;
        if (user3 != null) {
            j2 = user3.getId();
        } else {
            j2 = 0;
        }
        jSONObject2.put("to_user_id", j2);
        CommonMessageData commonMessageData = msg.baseMessage;
        if (commonMessageData != null) {
            j3 = commonMessageData.messageId;
        } else {
            j3 = 0;
        }
        jSONObject2.put("msg_id", j3);
        Object obj = msg.mLogId;
        if (obj == null) {
            obj = 0L;
        }
        jSONObject2.put("log_id", obj);
        jSONObject2.put("combo_count", msg.comboCount);
        jSONObject2.put("repeat_count", msg.repeatCount);
        jSONObject2.put("disable_gift_tracking", msg.disableGiftTracking ? 1 : 0);
    }

    public static void LJI(GiftMessage giftMessage, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        Object obj;
        int i2;
        Object obj2;
        int i3;
        Object obj3;
        int i4;
        long longValue;
        long j;
        long j2;
        long j3;
        long j4;
        Room room;
        String str;
        Room room2;
        o.LJIIIZ(giftMessage, "giftMessage");
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        jSONObject.put("is_first_send", giftMessage.isFirstSendGift ? 1 : 0);
        Gift gift = giftMessage.mGift;
        if (gift != null) {
            i = gift.type;
        } else {
            i = 0;
        }
        jSONObject.put("gift_type", i);
        String str2 = "1";
        if (giftMessage.LJLILLLLZI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_local", obj);
        if (c28246B6s != null && (room2 = c28246B6s.LIZIZ) != null) {
            i2 = room2.getOrientation();
        } else {
            i2 = 0;
        }
        jSONObject.put("room_type", i2);
        User user = giftMessage.fromUser;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_own_send", obj2);
        Gift gift2 = giftMessage.mGift;
        String str3 = null;
        if (gift2 != null) {
            AssetsModel LIZ2 = C32341Cmf.LIZ(gift2.primaryEffectId);
            if (LIZ2 != null) {
                str = LIZ2.getResourceFormat();
            } else {
                str = null;
            }
            jSONObject.put("resources_format", str);
        }
        jSONObject2.put("is_first_send", giftMessage.isFirstSendGift ? 1 : 0);
        Gift gift3 = giftMessage.mGift;
        if (gift3 != null) {
            i3 = gift3.type;
        } else {
            i3 = 0;
        }
        jSONObject2.put("gift_type", i3);
        if (giftMessage.LJLILLLLZI) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_local", obj3);
        jSONObject2.put("is_anchor", LJIILLIIL() ? 1 : 0);
        if (c28246B6s != null && (room = c28246B6s.LIZIZ) != null) {
            i4 = room.getOrientation();
        } else {
            i4 = 0;
        }
        jSONObject2.put("room_type", i4);
        User user2 = giftMessage.fromUser;
        if (user2 == null || user2.getId() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("is_own_send", str2);
        Gift gift4 = giftMessage.mGift;
        if (gift4 != null) {
            AssetsModel LIZ3 = C32341Cmf.LIZ(gift4.primaryEffectId);
            if (LIZ3 != null) {
                str3 = LIZ3.getResourceFormat();
            }
            jSONObject.put("resources_format", str3);
        }
        Long l = giftMessage.colorId;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        jSONObject2.put("color_id", longValue);
        Gift gift5 = giftMessage.mGift;
        long j5 = 0;
        if (gift5 != null) {
            j = gift5.id;
        } else {
            j = 0;
        }
        jSONObject2.put("gift_id", j);
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData != null) {
            j2 = commonMessageData.messageId;
        } else {
            j2 = 0;
        }
        jSONObject2.put("msg_id", j2);
        Object obj4 = giftMessage.mLogId;
        if (obj4 == null) {
            obj4 = 0;
        }
        jSONObject2.put("log_id", obj4);
        User user3 = giftMessage.toUser;
        if (user3 != null) {
            j3 = user3.getId();
        } else {
            j3 = 0;
        }
        jSONObject2.put("to_user_id", j3);
        User user4 = giftMessage.fromUser;
        if (user4 != null) {
            j4 = user4.getId();
        } else {
            j4 = 0;
        }
        jSONObject2.put("from_user_id", j4);
        jSONObject2.put("current_server_time_ms", C30725C4b.LIZ());
        jSONObject2.put("current_local_time_ms", System.currentTimeMillis());
        jSONObject2.put("combo_count", giftMessage.comboCount);
        jSONObject2.put("repeat_count", giftMessage.repeatCount);
        Gift gift6 = giftMessage.mGift;
        if (gift6 != null) {
            j5 = gift6.primaryEffectId;
        }
        jSONObject2.put("effect_id", j5);
    }

    public static long LJIIIIZZ(GiftMessage message, long j, long j2) {
        o.LJIIIZ(message, "message");
        User user = message.fromUser;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return j - LJIIJ(message);
        }
        return j2 - LJIIIZ(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(org.json.JSONObject r3, org.json.JSONObject r4, long r5) {
        /*
            com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            com.bytedance.android.livesdk.model.Gift r2 = r0.findGiftById(r5)
            r1 = 0
            if (r2 == 0) goto L67
            com.bytedance.android.livesdk.model.GiftLockInfo r0 = r2.giftSubInfo
            if (r0 == 0) goto L67
            if (r2 == 0) goto L13
            com.bytedance.android.livesdk.model.GiftLockInfo r1 = r2.giftSubInfo
        L13:
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.android.livesdk.model.GiftLockInfo"
            kotlin.jvm.internal.o.LJII(r1, r0)
            boolean r0 = r1.mLock
            if (r0 == 0) goto L67
            r1 = 1
        L1d:
            java.lang.String r0 = "is_lock"
            r3.put(r0, r1)
            com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager r0 = com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager.inst()
            boolean r1 = r0.isDynamicGift(r5)
            java.lang.String r0 = "dynamic_preview"
            r3.put(r0, r1)
            int r0 = X.C32694CsM.LJJIJ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "preview_count"
            r4.put(r0, r1)
            boolean r0 = X.C15380j0.LJIILLIIL()
            if (r0 == 0) goto L64
            long r2 = X.C30725C4b.LIZ()
            X.CjE r0 = X.C32129CjF.LIZ
            long r0 = r0.LJIIIZ
            long r2 = r2 - r0
        L49:
            java.lang.String r0 = "panel_stay_time"
            r4.put(r0, r2)
            long r2 = android.os.SystemClock.uptimeMillis()
            long r0 = X.C32455CoV.LIZ
            long r2 = r2 - r0
            java.lang.String r0 = "live_duration"
            r4.put(r0, r2)
            java.lang.String r1 = X.C1H.LJ()
            java.lang.String r0 = "overload_score"
            r4.put(r0, r1)
            return
        L64:
            r2 = 0
            goto L49
        L67:
            r1 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32455CoV.LJIJ(org.json.JSONObject, org.json.JSONObject, long):void");
    }

    public static java.util.Map LIZLLL(int i, int i2, int i3, int i4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("queue_size", String.valueOf(i3 + i4));
        linkedHashMap.put("self_queue_size", String.valueOf(i3));
        linkedHashMap.put("others_queue_size", String.valueOf(i4));
        linkedHashMap.put("queue_node_count", String.valueOf(i + i2));
        linkedHashMap.put("self_queue_node_count", String.valueOf(i));
        linkedHashMap.put("others_queue_node_count", String.valueOf(i2));
        return linkedHashMap;
    }

    public static void LIZJ(Gift gift, GiftsBoxInfo giftsBoxInfo, Long l, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        String str;
        long j;
        o.LJIIIZ(gift, "gift");
        jSONObject.put("gift_id", gift.id);
        jSONObject.put("gift_type", gift.type);
        jSONObject.put("gift_sub_type", gift.giftSubType);
        List<Integer> list = gift.giftVerticalScenarios;
        int i = 1;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            jSONObject.put("gift_vertical_scenarios", "");
        } else {
            List<Integer> list2 = gift.giftVerticalScenarios;
            if (list2 != null) {
                str = ORZ.LLD(list2, ",", null, null, null, 62);
            } else {
                str = null;
            }
            jSONObject.put("gift_vertical_scenarios", str);
        }
        jSONObject.put("gift_price", LIZ(gift, giftsBoxInfo));
        jSONObject.put("effect_id", gift.primaryEffectId);
        if (C32341Cmf.LIZ(gift.primaryEffectId) == null) {
            i = 0;
        }
        jSONObject.put("is_effect_model_ready", i);
        jSONObject.put("is_resource_ready", C32341Cmf.LJ(Long.valueOf(gift.primaryEffectId)) ? 1 : 0);
        AssetsModel LIZ2 = C32341Cmf.LIZ(gift.primaryEffectId);
        if (LIZ2 != null) {
            str2 = LIZ2.getResourceFormat();
        }
        jSONObject.put("resources_format", str2);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        jSONObject2.put("color_id", j);
    }
}
