package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS30S0001000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Cod, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32463Cod {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZLLL(C78072UkW c78072UkW) {
        Long l;
        Long l2;
        Long l3;
        String str;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        GiftMessage giftMessage = c78072UkW.LIZ;
        String str2 = null;
        Long l9 = null;
        if (giftMessage != null && giftMessage.giftMonitorInfo != null) {
            GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
            HashMap hashMap = new HashMap();
            if (giftMonitorInfo != null) {
                l = Long.valueOf(giftMonitorInfo.anchor_id);
            } else {
                l = null;
            }
            hashMap.put("anchor_id", String.valueOf(l));
            User user = giftMessage.fromUser;
            if (user != null) {
                l2 = Long.valueOf(user.getId());
            } else {
                l2 = null;
            }
            hashMap.put("from_user_id", String.valueOf(l2));
            hashMap.put("gift_id", String.valueOf(giftMessage.giftId));
            hashMap.put("msg_id", String.valueOf(giftMessage.getMessageId()));
            if (giftMonitorInfo != null) {
                l3 = Long.valueOf(giftMonitorInfo.profit_api_message_dur);
            } else {
                l3 = null;
            }
            hashMap.put("profitapi_message_dur", String.valueOf(l3));
            hashMap.put("repeat_count", String.valueOf(giftMessage.repeatCount));
            hashMap.put("repeat_end", String.valueOf(giftMessage.repeatEnd));
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (Room.isValid(room) && room != null) {
                str = room.getIdStr();
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            o.LJIIIIZZ(str, "if (Room.isValid(room) &…null) room.idStr else \"0\"");
            hashMap.put("room_id", str);
            if (giftMonitorInfo != null) {
                l4 = Long.valueOf(giftMonitorInfo.send_gift_profit_api_start_ms);
            } else {
                l4 = null;
            }
            hashMap.put("send_gift_profit_api_start_ms", String.valueOf(l4));
            if (giftMonitorInfo != null) {
                l5 = Long.valueOf(giftMonitorInfo.send_gift_profit_core_start_ms);
            } else {
                l5 = null;
            }
            hashMap.put("send_gift_profit_core_start_ms", String.valueOf(l5));
            if (giftMonitorInfo != null) {
                l6 = Long.valueOf(giftMonitorInfo.send_gift_req_start_ms);
            } else {
                l6 = null;
            }
            hashMap.put("send_gift_req_start_ms", String.valueOf(l6));
            if (giftMonitorInfo != null) {
                l7 = Long.valueOf(giftMonitorInfo.send_gift_send_message_success_ms);
            } else {
                l7 = null;
            }
            hashMap.put("send_gift_send_message_success_ms", String.valueOf(l7));
            if (giftMonitorInfo != null) {
                l8 = Long.valueOf(giftMonitorInfo.send_profit_api_dur);
            } else {
                l8 = null;
            }
            hashMap.put("send_profitapi_dur", String.valueOf(l8));
            if (giftMonitorInfo != null) {
                l9 = Long.valueOf(giftMonitorInfo.to_user_id);
            }
            hashMap.put("to_user_id", String.valueOf(l9));
            return hashMap;
        }
        if (giftMessage != null) {
            str2 = giftMessage.LJLJI;
        }
        return C32465Cof.LIZ(str2);
    }

    public static void LJ(String str) {
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("gift_tray_gift_click")) {
            BZI LIZ2 = C28787BRn.LIZ("gift_tray_gift_click");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(str, "click_type");
            LIZ2.LJJIIJZLJL();
        }
    }

    public static void LJFF(C78072UkW c78072UkW) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        int i2;
        Object obj7;
        Object obj8;
        Object obj9;
        CommonMessageData commonMessageData;
        Gift gift;
        CommonMessageData commonMessageData2;
        User user;
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_opposite_gift_tray_show")) {
            return;
        }
        long LIZ2 = C30725C4b.LIZ();
        Object LJI = C31120CJg.LJI();
        BZI LIZ3 = C28787BRn.LIZ("livesdk_opposite_gift_tray_show");
        String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        java.util.Map map = (java.util.Map) dataChannelGlobal.mv0(C29824BnA.class);
        Object obj10 = null;
        if (map != null) {
            obj = map.get("anchor_id");
        } else {
            obj = null;
        }
        LIZ3.LJIJJ(Integer.valueOf(o.LJ(valueOf, obj) ? 1 : 0), "is_anchor");
        java.util.Map map2 = (java.util.Map) dataChannelGlobal.mv0(C29824BnA.class);
        Object obj11 = CardStruct.IStatusCode.DEFAULT;
        if (map2 == null || (obj2 = map2.get("anchor_id")) == null) {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj2, "anchor_id");
        GiftMessage giftMessage = c78072UkW.LIZ;
        if (giftMessage != null && (user = giftMessage.fromUser) != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj3, "is_own_send");
        GiftMessage giftMessage2 = c78072UkW.LIZ;
        if (giftMessage2 != null && (commonMessageData2 = giftMessage2.baseMessage) != null) {
            obj4 = Long.valueOf(commonMessageData2.createTime);
        } else {
            obj4 = null;
        }
        LIZ3.LJIJJ(obj4, "create_ms");
        LIZ3.LJIJJ(Integer.valueOf(c78072UkW.LJIIL + c78072UkW.LJIILIIL), "queue_size");
        LIZ3.LJIJJ(Long.valueOf(LIZ2), "send_gift_tray_show_ms");
        LIZ3.LJIJJ(Long.valueOf(c78072UkW.LJIL), "send_gift_receive_message_ms");
        I9A.LIZ(LIZ2, c78072UkW.LJIL, LIZ3, "receive_show_dur");
        LIZ3.LJIJJ(Long.valueOf(c78072UkW.LJIL - C32455CoV.LJIIIZ(c78072UkW.LIZ)), "send_receive_dur");
        GiftMessage giftMessage3 = c78072UkW.LIZ;
        if (giftMessage3 != null) {
            obj5 = Long.valueOf(giftMessage3.timestamp);
        } else {
            obj5 = null;
        }
        LIZ3.LJIJJ(obj5, "send_gift_pull_message_ms");
        I9A.LIZ(c78072UkW.LJJI, c78072UkW.LJIL, LIZ3, "before_queue_dur");
        I9A.LIZ(c78072UkW.LJJIFFI, c78072UkW.LJJI, LIZ3, "in_queue_dur");
        I9A.LIZ(LIZ2, c78072UkW.LJJIFFI, LIZ3, "out_queue_dur");
        LIZ3.LJIJJ(Long.valueOf((LIZ2 - c78072UkW.LJIL) - (c78072UkW.LJJIFFI - c78072UkW.LJJI)), "receive_show_without_queue_dur");
        LIZ3.LJIJJ(0L, "old_find_dur");
        LIZ3.LJIJJ(0L, "old_sort_dur");
        I9A.LIZ(c78072UkW.LJJIIJ, c78072UkW.LJJIII, LIZ3, "new_delete_dur");
        I9A.LIZ(c78072UkW.LJJIIJZLJL, c78072UkW.LJJIIJ, LIZ3, "new_insert_dur");
        LIZ3.LJIJJ(Integer.valueOf(c78072UkW.LJIIL), "others_queue_size");
        LIZ3.LJIJJ(Integer.valueOf(c78072UkW.LJIILIIL), "self_queue_size");
        if (c78072UkW.LJIJ) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ3.LJIJJ(obj6, "is_first_send");
        if (c78072UkW.LJJJJJL) {
            obj11 = "1";
        }
        LIZ3.LJIJJ(obj11, "is_local");
        ArrayList<C32665Crt> arrayList = c78072UkW.LJJIJLIJ;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator<C32665Crt> it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((!it.next().LJLJI) && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        LIZ3.LJIJJ(Integer.valueOf(i), "msg_show");
        ArrayList<C32665Crt> arrayList2 = c78072UkW.LJJIJLIJ;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<C32665Crt> it2 = arrayList2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if ((!it2.next().LJLJI) && (i2 = i2 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        LIZ3.LJIJJ(Integer.valueOf(i2), "msg_total");
        GiftMessage giftMessage4 = c78072UkW.LIZ;
        if (giftMessage4 != null && (gift = giftMessage4.mGift) != null) {
            obj7 = Integer.valueOf(gift.type);
        } else {
            obj7 = null;
        }
        LIZ3.LJIJJ(obj7, "gift_type");
        LIZ3.LJIJJ(Long.valueOf(c78072UkW.LJJJJIZL), "gift_id");
        User user2 = c78072UkW.LJJJJJ;
        if (user2 != null) {
            obj8 = Long.valueOf(user2.getId());
        } else {
            obj8 = null;
        }
        LIZ3.LJIJJ(obj8, "from_user_id");
        User user3 = c78072UkW.LJJJJZ;
        if (user3 != null) {
            obj9 = Long.valueOf(user3.getId());
        } else {
            obj9 = null;
        }
        LIZ3.LJIJJ(obj9, "to_user_id");
        GiftMessage giftMessage5 = c78072UkW.LIZ;
        if (giftMessage5 != null && (commonMessageData = giftMessage5.baseMessage) != null) {
            obj10 = Long.valueOf(commonMessageData.messageId);
        }
        LIZ3.LJIJJ(obj10, "msg_id");
        LIZ3.LJIJJ(c78072UkW.LJIILLIIL, "log_id");
        LIZ3.LJIJJ(c78072UkW.LJIIZILJ.getDesc(), "downgrade_method");
        LIZ3.LJIJJ(0, "preload_video");
        LIZ3.LJIIZILJ();
        LIZ3.LJJIFFI(LIZLLL(c78072UkW));
        LIZ3.LJIJJ(LJI, "send_gift_scene");
        if (o.LJ(LJI, "video_anchor_pk")) {
            LIZ3.LJIJJ("1", "is_opposite_host_gift");
            LIZ3.LJIJJ(Long.valueOf(C31120CJg.LIZ()), "pk_id");
            LIZ3.LJIJJ(Long.valueOf(C31120CJg.LIZ.X90()), "to_anchor_id");
            LIZ3.LJIJJ(Long.valueOf(c78072UkW.LJJJJZI), "from_user_id");
        }
        LIZ3.LJJIIJZLJL();
    }

    public static void LIZ(BZI bzi, GiftMessage giftMessage) {
        for (Map.Entry entry : ((LinkedHashMap) C32455CoV.LJ(giftMessage)).entrySet()) {
            bzi.LJIJJ(entry.getValue(), (String) entry.getKey());
        }
    }

    public static void LIZJ(JSONObject jSONObject, C78072UkW c78072UkW) {
        c78072UkW.LJJIZ.L(jSONObject);
        Long l = c78072UkW.LJJIZ.LJLILLLLZI.get("trayShow");
        if (l != null && l.longValue() > 0) {
            C77420Ua0 M = c78072UkW.LJJIZ.M();
            if (M.LIZ > 0) {
                jSONObject.put("send_show_total_dur", l.longValue() - M.LIZ);
            }
            if (M.LIZIZ > 0) {
                jSONObject.put("receive_show_dur", l.longValue() - M.LIZIZ);
            }
            if (M.LIZIZ > 0) {
                jSONObject.put("receive_show_without_queue_dur", (l.longValue() - M.LIZIZ) - M.LJII);
            }
            if (M.LIZJ > 0) {
                jSONObject.put("dequeue_show_dur", l.longValue() - M.LIZJ);
            }
        }
    }

    public static void LJIIIIZZ(C78072UkW c78072UkW, boolean z) {
        Long l;
        Long l2;
        int i;
        int i2;
        Object obj;
        Object obj2;
        int i3;
        String str;
        Object obj3;
        CommonMessageData commonMessageData;
        if (c78072UkW.LIZ == null) {
            return;
        }
        int i4 = c78072UkW.LJIIIZ;
        if (i4 == 0) {
            i4 = 1;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onTrayStartReport, on(");
        LIZ2.append(i4);
        LIZ2.append(") isCombo(");
        LIZ2.append(z);
        LIZ2.append(") set:");
        C31811Ce7.LJ(LIZ2, ORZ.LLD(c78072UkW.LJJIJLIJ, null, null, null, null, 63), LIZ2, "LiveGiftTrayMonitor");
        if (z && i4 <= 0) {
            C0NB.LIZIZ("LiveGiftTrayMonitor", "onTrayStartReport, invalid combo count");
            return;
        }
        int size = c78072UkW.LJJIJLIJ.size();
        ArrayList<C32665Crt> arrayList = c78072UkW.LJJIJLIJ;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<C32665Crt> it = arrayList.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                if (it.next().LJLILLLLZI <= i4 && (i5 = i5 + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
            if (i5 > 0) {
                C0NB.LIZIZ("LiveGiftTrayMonitor", "onTrayStartReport, reach msg combo, record!");
                boolean LJJLIL = ORS.LJJLIL(new AqS30S0001000_5(i4, 2), c78072UkW.LJJIJLIJ);
                int size2 = c78072UkW.LJJIJLIJ.size();
                int i6 = !c78072UkW.LJJIL ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                LIZIZ(c78072UkW, jSONObject, jSONObject2);
                String LJI = C31120CJg.LJI();
                long LIZ3 = C30725C4b.LIZ();
                GiftMessage giftMessage = c78072UkW.LIZ;
                if (giftMessage != null && (commonMessageData = giftMessage.baseMessage) != null) {
                    l = Long.valueOf(commonMessageData.createTime);
                } else {
                    l = null;
                }
                jSONObject2.put("create_ms", l);
                jSONObject2.put("queue_size", c78072UkW.LJIIL + c78072UkW.LJIILIIL);
                jSONObject2.put("send_gift_tray_show_ms", LIZ3);
                jSONObject2.put("send_gift_receive_message_ms", c78072UkW.LJIL);
                GiftMessage giftMessage2 = c78072UkW.LIZ;
                if (giftMessage2 != null) {
                    l2 = Long.valueOf(giftMessage2.timestamp);
                } else {
                    l2 = null;
                }
                jSONObject2.put("send_gift_pull_message_ms", l2);
                jSONObject2.put("before_queue_dur", c78072UkW.LJJI - c78072UkW.LJIL);
                jSONObject2.put("in_queue_dur", c78072UkW.LJJIFFI - c78072UkW.LJJI);
                jSONObject2.put("out_queue_dur", LIZ3 - c78072UkW.LJJIFFI);
                jSONObject2.put("old_find_dur", 0L);
                jSONObject2.put("old_sort_dur", 0L);
                jSONObject2.put("new_delete_dur", c78072UkW.LJJIIJ - c78072UkW.LJJIII);
                jSONObject2.put("new_insert_dur", c78072UkW.LJJIIJZLJL - c78072UkW.LJJIIJ);
                jSONObject2.put("others_queue_size", c78072UkW.LJIIL);
                jSONObject2.put("self_queue_size", c78072UkW.LJIILIIL);
                jSONObject2.put("downgrade_method", c78072UkW.LJIIZILJ.getDesc());
                jSONObject2.put("preload_video", 0);
                jSONObject2.put("current_combo_count", c78072UkW.LJIIIZ);
                for (Map.Entry entry : LIZLLL(c78072UkW).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject2.put("send_gift_scene", LJI);
                GiftMessage giftMessage3 = c78072UkW.LIZ;
                if (giftMessage3 != null) {
                    for (Map.Entry entry2 : ((LinkedHashMap) C32455CoV.LJ(giftMessage3)).entrySet()) {
                        jSONObject2.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
                String str2 = "1";
                if (o.LJ(LJI, "video_anchor_pk")) {
                    if (c78072UkW.LJJJLZIJ) {
                        obj3 = "1";
                    } else {
                        obj3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    jSONObject2.put("is_opposite_host_gift", obj3);
                    jSONObject2.put("pk_id", String.valueOf(C31120CJg.LIZ()));
                    jSONObject2.put("to_anchor_id", C31120CJg.LIZ.X90());
                    if (c78072UkW.LJJJLZIJ) {
                        jSONObject2.put("from_user_id", c78072UkW.LJJJJZI);
                    }
                }
                if (c78072UkW.LJJIIZ == 0) {
                    i = 2;
                } else {
                    i = 1;
                }
                jSONObject.put("tray_position", i);
                jSONObject.put("is_combo", z ? 1 : 0);
                jSONObject.put("error_code", 0);
                if (c78072UkW.LJJIIZ == 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                jSONObject2.put("tray_position", i2);
                jSONObject2.put("error_code", 0);
                jSONObject2.put("error_message", "");
                jSONObject2.put("is_combo", z ? 1 : 0);
                jSONObject2.put("is_fallback_tray", c78072UkW.LJJIIZI ? 1 : 0);
                jSONObject2.put("phase", "");
                jSONObject2.put("msg_total", i5);
                jSONObject2.put("msg_show", i5);
                jSONObject2.put("is_tray_first_message_show", i6);
                jSONObject2.put("info_list_size_old", size);
                jSONObject2.put("info_list_removed", LJJLIL ? 1 : 0);
                jSONObject2.put("info_list_size_new", size2);
                LIZJ(jSONObject2, c78072UkW);
                C32455CoV.LJII(jSONObject, jSONObject2);
                GiftMessage giftMessage4 = c78072UkW.LIZ;
                Gift gift = giftMessage4.mGift;
                if (gift == null) {
                    return;
                }
                C32455CoV.LIZJ(gift, giftMessage4.giftsInBox, giftMessage4.colorId, jSONObject, jSONObject2);
                C32455CoV.LIZIZ(giftMessage4, jSONObject, jSONObject2);
                C32433Co9.LIZIZ(jSONObject2);
                boolean LJIILLIIL = C32455CoV.LJIILLIIL();
                boolean LJIIZILJ = C32455CoV.LJIIZILJ(c78072UkW.LIZ);
                if (!GiftEventTrackSamplingSetting.shouldBlock(c78072UkW.LIZ) && (!GiftEventTrackSamplingSetting.enable() || (!LJIILLIIL && !LJIIZILJ))) {
                    boolean LJJL = UC0.LJJL(c78072UkW);
                    User LJ = ((C29374Bfu) B83.LIZ().LIZIZ()).LJ();
                    o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
                    boolean LJJJJIZL = ujb.o.LJJJJIZL(C31120CJg.LJII(LJ), "guest", true);
                    BZI LIZ4 = C28787BRn.LIZ("gift_msg_show_success");
                    LIZ4.LJJ(jSONObject);
                    LIZ4.LJJ(jSONObject2);
                    if (LJJL) {
                        obj = "1";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZ4.LJIJJ(obj, "is_for_you_show");
                    if (!LJJJJIZL) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZ4.LJIJJ(str2, "is_guest");
                    LIZ4.LJIIZILJ();
                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ4.LJIILL())) {
                        LIZ4.LJJIIJZLJL();
                    } else {
                        LIZ4.LJJIJ();
                        LIZ4.LJJIIZ();
                        LIZ4.LJJIIZI();
                    }
                    if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_msg_show_status", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                        C0K2.LJI("ttlive_gift_msg_show_status", jSONObject, new JSONObject(), jSONObject2);
                    }
                    C0NB.LIZIZ("LiveGiftTrayMonitor", "reported(gift_msg_show_success)");
                }
                boolean LJIILLIIL2 = C32455CoV.LJIILLIIL();
                boolean LJIIZILJ2 = C32455CoV.LJIIZILJ(c78072UkW.LIZ);
                if (LJIILLIIL2 || LJIIZILJ2) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("onTrayShowSuccess id(");
                    LIZ5.append(c78072UkW.LJJJJIZL);
                    LIZ5.append(") isLocal(");
                    LIZ5.append(c78072UkW.LJJJJJL);
                    LIZ5.append(") from(");
                    LIZ5.append(c78072UkW.LJJJJZI);
                    LIZ5.append(") to(");
                    User user = c78072UkW.LJJJJZ;
                    if (user != null) {
                        obj2 = Long.valueOf(user.getId());
                    } else {
                        obj2 = null;
                    }
                    LIZ5.append(obj2);
                    LIZ5.append(')');
                    C0NB.LIZIZ("LiveGiftTrayMonitor", X1D.LIZIZ(LIZ5));
                    GiftMessage giftMessage5 = c78072UkW.LIZ;
                    if (giftMessage5 != null && giftMessage5.timestamp < C31120CJg.LIZ.xX()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    jSONObject2.put("is_send_before_pk", i3);
                    jSONObject2.put("pk_start_ms", C31120CJg.LIZ.xX());
                    if (LJIIZILJ2) {
                        str = "gift_msg_show_success_self";
                    } else {
                        str = "gift_msg_show_success_anchor";
                    }
                    BZI LIZ6 = C28787BRn.LIZ(str);
                    LIZ6.LJJ(jSONObject);
                    LIZ6.LJJ(jSONObject2);
                    LIZ6.LJJIIJZLJL();
                    C0K2.LJI(str, jSONObject, new JSONObject(), jSONObject2);
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("reported(");
                    LIZ7.append(str);
                    LIZ7.append(')');
                    C0NB.LIZIZ("LiveGiftTrayMonitor", X1D.LIZIZ(LIZ7));
                }
                LJII(c78072UkW, jSONObject, jSONObject2, "");
                c78072UkW.LJJIL = true;
                return;
            }
        }
        C0NB.LIZIZ("LiveGiftTrayMonitor", "onTrayStartReport, not reach msg combo, skip!");
    }

    public static void LIZIZ(C78072UkW c78072UkW, JSONObject jSONObject, JSONObject jSONObject2) {
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long LIZ2 = C30725C4b.LIZ();
        long LJIIIZ = c78072UkW.LJIL - C32455CoV.LJIIIZ(c78072UkW.LIZ);
        linkedHashMap.put("send_receive_im_dur", Long.valueOf(LJIIIZ));
        linkedHashMap.put("msg_show", Long.valueOf(0));
        GiftMessage giftMessage = c78072UkW.LIZ;
        if (giftMessage != null) {
            j = giftMessage.timestamp;
        } else {
            j = 0;
        }
        linkedHashMap.put("send_gift_pull_message_ms", Long.valueOf(j));
        linkedHashMap.put("send_gift_receive_message_ms", Long.valueOf(c78072UkW.LJIL));
        linkedHashMap.put("send_gift_receive_message_local_ms", Long.valueOf(c78072UkW.LJJ));
        linkedHashMap.put("send_gift_tray_show_ms", Long.valueOf(LIZ2));
        linkedHashMap.put("send_gift_tray_show_local_ms", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("receive_show_dur", Long.valueOf(LIZ2 - c78072UkW.LJIL));
        linkedHashMap.put("send_show_total_dur", Long.valueOf((LIZ2 - c78072UkW.LJIL) + LJIIIZ));
        linkedHashMap.put("before_queue_dur", Long.valueOf(c78072UkW.LJJI - c78072UkW.LJIL));
        linkedHashMap.put("in_queue_dur", Long.valueOf(c78072UkW.LJJIFFI - c78072UkW.LJJI));
        linkedHashMap.put("out_queue_dur", Long.valueOf(LIZ2 - c78072UkW.LJJIFFI));
        linkedHashMap.put("receive_show_without_queue_dur", Long.valueOf((LIZ2 - c78072UkW.LJIL) - (c78072UkW.LJJIFFI - c78072UkW.LJJI)));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
        GiftMessage giftMessage2 = c78072UkW.LIZ;
        if (giftMessage2 != null) {
            C32455CoV.LJI(giftMessage2, jSONObject, jSONObject2);
        }
        for (Map.Entry entry2 : LIZLLL(c78072UkW).entrySet()) {
            jSONObject2.put((String) entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry entry3 : ((LinkedHashMap) C32455CoV.LIZLLL(c78072UkW.LJIILL, c78072UkW.LJIILJJIL, c78072UkW.LJIILIIL, c78072UkW.LJIIL)).entrySet()) {
            jSONObject2.put((String) entry3.getKey(), entry3.getValue());
        }
    }

    public static void LJI(C78072UkW c78072UkW, EnumC32093Cif enumC32093Cif, EnumC32466Cog errorPhase) {
        Integer num;
        String str;
        Integer num2;
        Object obj;
        Long l;
        Integer num3;
        String str2;
        Integer num4;
        Long l2;
        Long l3;
        int i;
        Long l4;
        Long l5;
        int i2;
        String str3;
        String str4;
        CommonMessageData commonMessageData;
        Gift gift;
        CommonMessageData commonMessageData2;
        User user;
        o.LJIIIZ(errorPhase, "errorPhase");
        long nextLong = V0Q.Default.nextLong(1L, 5L) + C30725C4b.LIZ();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Long l6 = null;
        if (enumC32093Cif != null) {
            num = Integer.valueOf(enumC32093Cif.getCode());
        } else {
            num = null;
        }
        jSONObject2.put("error_code", num);
        if (enumC32093Cif != null) {
            str = enumC32093Cif.name();
        } else {
            str = null;
        }
        jSONObject2.put("error_msg", str);
        if (enumC32093Cif != null) {
            num2 = Integer.valueOf(enumC32093Cif.getCode());
        } else {
            num2 = null;
        }
        jSONObject.put("error_code", num2);
        jSONObject2.put("is_anchor", C32455CoV.LJIILLIIL() ? 1 : 0);
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29824BnA.class);
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject2.put("anchor_id", obj);
        GiftMessage giftMessage = c78072UkW.LIZ;
        if (giftMessage != null && (user = giftMessage.fromUser) != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            str5 = "1";
        }
        jSONObject2.put("is_own_send", str5);
        GiftMessage giftMessage2 = c78072UkW.LIZ;
        if (giftMessage2 != null && (commonMessageData2 = giftMessage2.baseMessage) != null) {
            l = Long.valueOf(commonMessageData2.createTime);
        } else {
            l = null;
        }
        jSONObject2.put("create_ms", l);
        jSONObject2.put("send_gift_receive_message_ms", Long.valueOf(c78072UkW.LJIL));
        jSONObject2.put("before_queue_dur", c78072UkW.LJJI - c78072UkW.LJIL);
        jSONObject2.put("in_queue_dur", c78072UkW.LJJIFFI - c78072UkW.LJJI);
        jSONObject2.put("out_queue_dur", nextLong - c78072UkW.LJJIFFI);
        jSONObject2.put("receive_show_without_queue_dur", (nextLong - c78072UkW.LJIL) - (c78072UkW.LJJIFFI - c78072UkW.LJJI));
        if (enumC32093Cif != null) {
            num3 = Integer.valueOf(enumC32093Cif.getCode());
        } else {
            num3 = null;
        }
        jSONObject2.put("error_code", num3);
        if (enumC32093Cif != null) {
            str2 = enumC32093Cif.name();
        } else {
            str2 = null;
        }
        jSONObject2.put("error_msg", str2);
        GiftMessage giftMessage3 = c78072UkW.LIZ;
        if (giftMessage3 != null && (gift = giftMessage3.mGift) != null) {
            num4 = Integer.valueOf(gift.type);
        } else {
            num4 = null;
        }
        jSONObject2.put("gift_type", num4);
        jSONObject2.put("gift_id", Long.valueOf(c78072UkW.LJJJJIZL));
        User user2 = c78072UkW.LJJJJJ;
        if (user2 != null) {
            l2 = Long.valueOf(user2.getId());
        } else {
            l2 = null;
        }
        jSONObject2.put("from_user_id", l2);
        User user3 = c78072UkW.LJJJJZ;
        if (user3 != null) {
            l3 = Long.valueOf(user3.getId());
        } else {
            l3 = null;
        }
        jSONObject2.put("to_user_id", l3);
        ArrayList<C32665Crt> arrayList = c78072UkW.LJJIJLIJ;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator<C32665Crt> it = arrayList.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((!it.next().LJLJI) && (i = i + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
        } else {
            i = 1;
        }
        jSONObject2.put("msg_total", i);
        GiftMessage giftMessage4 = c78072UkW.LIZ;
        if (giftMessage4 != null && (commonMessageData = giftMessage4.baseMessage) != null) {
            l4 = Long.valueOf(commonMessageData.messageId);
        } else {
            l4 = null;
        }
        jSONObject2.put("msg_id", l4);
        jSONObject2.put("log_id", c78072UkW.LJIILLIIL);
        jSONObject2.put("phase", "enqueue");
        GiftMessage giftMessage5 = c78072UkW.LIZ;
        if (giftMessage5 != null) {
            boolean LJIILLIIL = C32455CoV.LJIILLIIL();
            boolean LJIIZILJ = C32455CoV.LJIIZILJ(giftMessage5);
            if (LJIILLIIL || LJIIZILJ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onTrayShowFail id(");
                LIZ2.append(giftMessage5.giftId);
                LIZ2.append(") isLocal(");
                LIZ2.append(giftMessage5.LJLILLLLZI);
                LIZ2.append(") from(");
                User user4 = giftMessage5.fromUser;
                if (user4 != null) {
                    l5 = Long.valueOf(user4.getId());
                } else {
                    l5 = null;
                }
                LIZ2.append(l5);
                LIZ2.append(") to(");
                User user5 = giftMessage5.toUser;
                if (user5 != null) {
                    l6 = Long.valueOf(user5.getId());
                }
                LIZ2.append(l6);
                LIZ2.append(')');
                C0NB.LIZIZ("LiveGiftTrayMonitor", X1D.LIZIZ(LIZ2));
                JSONObject jSONObject3 = new JSONObject();
                int i3 = 0;
                jSONObject3.put("tray_position", 0);
                jSONObject3.put("is_combo", 0);
                if (enumC32093Cif != null) {
                    i3 = enumC32093Cif.getCode();
                }
                jSONObject3.put("error_code", i3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("tray_position", 0);
                if (enumC32093Cif != null) {
                    i2 = enumC32093Cif.getCode();
                } else {
                    i2 = 0;
                }
                jSONObject4.put("error_code", i2);
                if (enumC32093Cif == null || (str3 = enumC32093Cif.getDesc()) == null) {
                    str3 = "";
                }
                jSONObject4.put("error_message", str3);
                jSONObject4.put("is_combo", 0);
                jSONObject4.put("is_fallback_tray", 0);
                jSONObject4.put("phase", "enqueue");
                jSONObject4.put("msg_total", 0);
                jSONObject4.put("send_receive_dur", C32455CoV.LJIIIIZZ(giftMessage5, System.currentTimeMillis(), C30725C4b.LIZ()));
                C32455CoV.LJII(jSONObject3, jSONObject4);
                Gift gift2 = giftMessage5.mGift;
                if (gift2 != null) {
                    C32455CoV.LIZJ(gift2, giftMessage5.giftsInBox, giftMessage5.colorId, jSONObject3, jSONObject4);
                    C32455CoV.LIZIZ(giftMessage5, jSONObject3, jSONObject4);
                    C32433Co9.LIZIZ(jSONObject4);
                    if (LJIIZILJ) {
                        str4 = "gift_msg_show_fail_self";
                    } else {
                        str4 = "gift_msg_show_fail_anchor";
                    }
                    BZI LIZ3 = C28787BRn.LIZ(str4);
                    LIZ3.LJJ(jSONObject3);
                    LIZ3.LJJ(jSONObject4);
                    LIZ3.LJJIIJZLJL();
                    C0K2.LJI(str4, jSONObject3, new JSONObject(), jSONObject4);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("reported(");
                    LIZ4.append(str4);
                    LIZ4.append(')');
                    C0NB.LIZIZ("LiveGiftTrayMonitor", X1D.LIZIZ(LIZ4));
                }
            }
        }
        LIZIZ(c78072UkW, jSONObject, jSONObject2);
        BZI LIZ5 = C28787BRn.LIZ("gift_msg_show_fail");
        LIZ5.LJJ(jSONObject);
        LIZ5.LJJ(jSONObject2);
        LIZ5.LJIIZILJ();
        GiftMessage giftMessage6 = c78072UkW.LIZ;
        if (giftMessage6 != null) {
            LIZ5.LJIJJ(Long.valueOf(C32455CoV.LJIIIIZZ(giftMessage6, c78072UkW.LJJ, c78072UkW.LJIL)), "send_receive_dur");
        }
        LIZ(LIZ5, c78072UkW.LIZ);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ5.LJIILL())) {
            LIZ5.LJJIIJZLJL();
        } else {
            LIZ5.LJJIJ();
            LIZ5.LJJIIZ();
            LIZ5.LJJIIZI();
        }
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_msg_show_status", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            C0K2.LJ("ttlive_gift_msg_show_status", jSONObject, new JSONObject(), jSONObject2);
        }
        C0K2.LJI("ttlive_gift_msg_show_status_error", jSONObject, new JSONObject(), jSONObject2);
        LJII(c78072UkW, jSONObject, jSONObject2, errorPhase.getPhase());
    }

    public static void LJII(C78072UkW c78072UkW, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Long l;
        Boolean bool;
        Long l2;
        String str2;
        User user;
        User user2;
        if (c78072UkW == null) {
            return;
        }
        boolean LJIILLIIL = C32455CoV.LJIILLIIL();
        boolean LJIIZILJ = C32455CoV.LJIIZILJ(c78072UkW.LIZ);
        if (LJIILLIIL || LJIIZILJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onTrayShowStatus id(");
            GiftMessage giftMessage = c78072UkW.LIZ;
            Long l3 = null;
            if (giftMessage != null) {
                l = Long.valueOf(giftMessage.giftId);
            } else {
                l = null;
            }
            LIZ2.append(l);
            LIZ2.append(") isLocal(");
            GiftMessage giftMessage2 = c78072UkW.LIZ;
            if (giftMessage2 != null) {
                bool = Boolean.valueOf(giftMessage2.LJLILLLLZI);
            } else {
                bool = null;
            }
            LIZ2.append(bool);
            LIZ2.append(") from(");
            GiftMessage giftMessage3 = c78072UkW.LIZ;
            if (giftMessage3 != null && (user2 = giftMessage3.fromUser) != null) {
                l2 = Long.valueOf(user2.getId());
            } else {
                l2 = null;
            }
            LIZ2.append(l2);
            LIZ2.append(") to(");
            GiftMessage giftMessage4 = c78072UkW.LIZ;
            if (giftMessage4 != null && (user = giftMessage4.toUser) != null) {
                l3 = Long.valueOf(user.getId());
            }
            LIZ2.append(l3);
            LIZ2.append(')');
            C0NB.LIZIZ("LiveGiftTrayMonitor", X1D.LIZIZ(LIZ2));
            jSONObject2.put("phase", str);
            C32455CoV.LJII(jSONObject, jSONObject2);
            GiftMessage giftMessage5 = c78072UkW.LIZ;
            if (giftMessage5 != null) {
                Gift gift = giftMessage5.mGift;
                o.LJIIIIZZ(gift, "it.mGift");
                C32455CoV.LIZJ(gift, giftMessage5.giftsInBox, giftMessage5.colorId, jSONObject, jSONObject2);
                C32455CoV.LIZIZ(giftMessage5, jSONObject, jSONObject2);
            }
            C32433Co9.LIZIZ(jSONObject2);
            if (LJIIZILJ) {
                str2 = "gift_msg_show_status_self";
            } else {
                str2 = "gift_msg_show_status_anchor";
            }
            BZI LIZ3 = C28787BRn.LIZ(str2);
            LIZ3.LJJ(jSONObject);
            LIZ3.LJJ(jSONObject2);
            LIZ3.LJJIIJZLJL();
            C0K2.LJI(str2, jSONObject, new JSONObject(), jSONObject2);
            C0NB.LIZIZ("LiveGiftTrayMonitor", "reported(" + str2 + ')');
        }
    }
}
