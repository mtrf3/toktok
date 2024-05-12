package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.ForceInsertMetricsItem;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ctw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32792Ctw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(List list) {
        if (list != null && (!list.isEmpty())) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_frequently_used_area_show");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(list.toString(), "frequently_used_gift_id_set");
            LIZ2.LJIJJ(Integer.valueOf(list.size()), "frequently_used_gift_cnt");
            LIZ2.LJJIIJZLJL();
        }
    }

    public static final void LIZIZ(long j, long j2) {
        if (!UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_gift_panel_load_duration")) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_panel_load_duration");
        LIZ2.LJIIZILJ();
        LIZ2.LJIIIZ("live");
        LIZ2.LJIIL("click");
        LIZ2.LJIIJJI("live_detail");
        LIZ2.LJIJJ(String.valueOf(j), "duration");
        LIZ2.LJIJJ(String.valueOf(j2), "view_dur");
        LIZ2.LJJIIJZLJL();
    }

    public static java.util.Map LIZ(GiftPage giftPage, LinkedList linkedList, List list, boolean z, AbstractC32698CsQ abstractC32698CsQ) {
        Gift LJI;
        long j;
        Long l;
        long j2;
        Long l2;
        Gift gift;
        long j3;
        Long l3;
        Gift gift2;
        long j4;
        Long l4;
        long j5;
        Long l5;
        int i;
        int i2;
        long j6;
        String str;
        Integer valueOf;
        Long l6;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<Long, ForceInsertMetricsItem> map = giftPage.forceInsertMetrics;
        if (map != null) {
            for (Map.Entry<Long, ForceInsertMetricsItem> entry : map.entrySet()) {
                Iterator it = linkedList.iterator();
                int i3 = 0;
                while (true) {
                    Long l7 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC32698CsQ abstractC32698CsQ2 = (AbstractC32698CsQ) it.next();
                    if (abstractC32698CsQ2 != null) {
                        l7 = Long.valueOf(abstractC32698CsQ2.LIZJ());
                    }
                    if (o.LJ(l7, entry.getKey())) {
                        if (i3 != -1) {
                            ForceInsertMetricsItem value = entry.getValue();
                            if (value != null) {
                                i = value.forceIndexConfig;
                            } else {
                                i = -1;
                            }
                            ForceInsertMetricsItem value2 = entry.getValue();
                            if (value2 != null) {
                                i2 = value2.forceInsertType;
                            } else {
                                i2 = 0;
                            }
                            Long key = entry.getKey();
                            o.LJIIIIZZ(key, "forceMap.key");
                            long longValue = key.longValue();
                            java.util.Map<Long, Long> map2 = giftPage.forceInsertPriorityMap;
                            if (map2 != null && (l6 = map2.get(Long.valueOf(i2))) != null) {
                                j6 = l6.longValue();
                            } else {
                                j6 = -1;
                            }
                            ForceInsertMetricsItem value3 = entry.getValue();
                            if (value3 != null && (valueOf = Integer.valueOf(value3.forceInsertType)) != null) {
                                if (valueOf.intValue() == 1) {
                                    str = "treasure_box";
                                } else if (valueOf.intValue() == 4) {
                                    str = "arena_ops_gift";
                                } else if (valueOf.intValue() == 2) {
                                    str = "weekly_ranking_gift";
                                } else if (valueOf.intValue() == 3) {
                                    str = "time_limit_gift";
                                } else if (valueOf.intValue() == 5) {
                                    str = "vertical_gift";
                                }
                                C32830CuY c32830CuY = new C32830CuY(i3 + 1, str, giftPage.region, longValue, j6, i + 1);
                                Long key2 = entry.getKey();
                                o.LJIIIIZZ(key2, "forceMap.key");
                                linkedHashMap.put(key2, c32830CuY);
                            }
                            str = "unknown";
                            C32830CuY c32830CuY2 = new C32830CuY(i3 + 1, str, giftPage.region, longValue, j6, i + 1);
                            Long key22 = entry.getKey();
                            o.LJIIIIZZ(key22, "forceMap.key");
                            linkedHashMap.put(key22, c32830CuY2);
                        }
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                Iterator it3 = linkedList.iterator();
                int i4 = 0;
                while (true) {
                    if (it3.hasNext()) {
                        AbstractC32698CsQ abstractC32698CsQ3 = (AbstractC32698CsQ) it3.next();
                        if (abstractC32698CsQ3 != null && abstractC32698CsQ3.LIZJ() == longValue2) {
                            break;
                        }
                        i4++;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                java.util.Map<Long, Long> map3 = giftPage.forceInsertPriorityMap;
                if (map3 != null && (l5 = map3.get(6L)) != null) {
                    j5 = l5.longValue();
                } else {
                    j5 = -1;
                }
                int i5 = i4 + 1;
                linkedHashMap.put(Long.valueOf(longValue2), new C32830CuY(i5, "frequently_used_gift", giftPage.region, longValue2, j5, i5));
            }
        }
        if (z) {
            CCK pollGifts = GiftManager.inst().getPollGifts();
            if (pollGifts != null && (gift2 = pollGifts.LJLILLLLZI) != null) {
                Iterator it4 = linkedList.iterator();
                int i6 = 0;
                while (true) {
                    if (it4.hasNext()) {
                        AbstractC32698CsQ abstractC32698CsQ4 = (AbstractC32698CsQ) it4.next();
                        if (abstractC32698CsQ4 != null && abstractC32698CsQ4.LIZJ() == gift2.id) {
                            break;
                        }
                        i6++;
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                long j7 = gift2.id;
                java.util.Map<Long, Long> map4 = giftPage.forceInsertPriorityMap;
                if (map4 != null && (l4 = map4.get(7L)) != null) {
                    j4 = l4.longValue();
                } else {
                    j4 = -1;
                }
                int i7 = i6 + 1;
                linkedHashMap.put(Long.valueOf(gift2.id), new C32830CuY(i7, "poll_gift", giftPage.region, j7, j4, i7));
            }
            CCK pollGifts2 = GiftManager.inst().getPollGifts();
            if (pollGifts2 != null && (gift = pollGifts2.LJLIL) != null) {
                Iterator it5 = linkedList.iterator();
                int i8 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        AbstractC32698CsQ abstractC32698CsQ5 = (AbstractC32698CsQ) it5.next();
                        if (abstractC32698CsQ5 != null && abstractC32698CsQ5.LIZJ() == gift.id) {
                            break;
                        }
                        i8++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                long j8 = gift.id;
                java.util.Map<Long, Long> map5 = giftPage.forceInsertPriorityMap;
                if (map5 != null && (l3 = map5.get(7L)) != null) {
                    j3 = l3.longValue();
                } else {
                    j3 = -1;
                }
                int i9 = i8 + 1;
                linkedHashMap.put(Long.valueOf(gift.id), new C32830CuY(i9, "poll_gift", giftPage.region, j8, j3, i9));
            }
        }
        if (abstractC32698CsQ != null) {
            Iterator it6 = linkedList.iterator();
            int i10 = 0;
            while (true) {
                if (it6.hasNext()) {
                    AbstractC32698CsQ abstractC32698CsQ6 = (AbstractC32698CsQ) it6.next();
                    if (abstractC32698CsQ6 != null && abstractC32698CsQ6.LIZJ() == abstractC32698CsQ.LIZJ()) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            long LIZJ = abstractC32698CsQ.LIZJ();
            java.util.Map<Long, Long> map6 = giftPage.forceInsertPriorityMap;
            if (map6 != null && (l2 = map6.get(9L)) != null) {
                j2 = l2.longValue();
            } else {
                j2 = -1;
            }
            int i11 = i10 + 1;
            linkedHashMap.put(Long.valueOf(abstractC32698CsQ.LIZJ()), new C32830CuY(i11, "match_gift_mode", giftPage.region, LIZJ, j2, i11));
        }
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        if (c32313CmD.LJIIIZ() && (LJI = c32313CmD.LJI()) != null) {
            Iterator it7 = linkedList.iterator();
            int i12 = 0;
            while (true) {
                if (it7.hasNext()) {
                    AbstractC32698CsQ abstractC32698CsQ7 = (AbstractC32698CsQ) it7.next();
                    if (abstractC32698CsQ7 != null && abstractC32698CsQ7.LIZJ() == LJI.id) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            long j9 = LJI.id;
            java.util.Map<Long, Long> map7 = giftPage.forceInsertPriorityMap;
            if (map7 != null && (l = map7.get(8L)) != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            linkedHashMap.put(Long.valueOf(LJI.id), new C32830CuY(i12 + 1, "first_recharge_gift", giftPage.region, j9, j, i12));
        }
        return linkedHashMap;
    }

    public static final void LIZJ(String str, boolean z, String str2, String str3, List<Long> list, java.util.Map<Long, C32830CuY> map, int i) {
        String str4;
        String str5;
        String str6;
        String str7;
        Object obj;
        int i2;
        String str8;
        Integer num;
        Object obj2;
        int i3;
        Object obj3;
        Object obj4;
        Object obj5;
        String str9;
        Long l;
        Object obj6;
        Object obj7;
        LiveMode streamType;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.mv0(C29054Bak.class);
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str4 = C28509BGv.LIZ(streamType);
        } else {
            str4 = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (map != null) {
            for (Map.Entry<Long, C32830CuY> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(Long.valueOf(entry.getValue().LIZIZ));
                arrayList3.add(entry.getValue().LIZJ);
                arrayList4.add(Integer.valueOf(entry.getValue().LIZLLL));
                arrayList5.add(Integer.valueOf(entry.getValue().LJ));
                arrayList6.add(entry.getValue().LJFF);
            }
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_panel_show");
        LIZ2.LJIIZILJ();
        LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
        if (str == null) {
            str5 = "icon";
        } else {
            str5 = str;
        }
        LIZ2.LJIJJ(str5, "gift_enter_from");
        if (!C38354F3m.LJ(BJM.LJII())) {
            LIZ2.LJIJJ(BJM.LJII(), "enter_url_source");
        }
        if (BJM.LJI() != 0) {
            LIZ2.LJIJJ(String.valueOf(BJM.LJI()), "enter_gift_id");
        }
        String str10 = "1";
        if (o.LJ(C31120CJg.LIZIZ(), "manual_pk")) {
            if (C31120CJg.LJIIIZ()) {
                LIZ2.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ2.LJIJJ("punish", "match_status");
            }
            LIZ2.LJJIFFI(C31120CJg.LJFF());
            if (((IInteractService) CN1.LIZ(IInteractService.class)).yr() == 2) {
                obj7 = "1";
            } else {
                obj7 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.LJIJJ(obj7, "is_multi");
        }
        LIZ2.LJIJJ(C31120CJg.LJ().getDesc(), "send_gift_scene");
        int i4 = 0;
        String str11 = "";
        if (!ujb.o.LJJJJIZL(str, "gift_guide_bubble", false)) {
            str6 = "";
        } else {
            str6 = str;
        }
        LIZ2.LJIJJ(str6, "notification_type");
        if (ujb.o.LJJJJIZL(str, "gift_guide_bubble", false)) {
            str11 = C32650Cre.LIZIZ;
        }
        LIZ2.LJIJJ(str11, "notification_request_id");
        if (z) {
            str7 = "portrait";
        } else {
            str7 = "landscape";
        }
        LIZ2.LJIJJ(str7, "room_orientation");
        LIZ2.LJIJJ(str2, "hashtag_type");
        LIZ2.LJIJJ(str3, "hashtag_id");
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        Room room2 = (Room) dataChannelGlobal2.mv0(C29044Baa.class);
        if (room2 != null && room2.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj, "is_anchor");
        LIZ2.LJIJJ(C77283UUt.LIZ, "gift_dialog_request_id");
        LIZ2.LJIJJ(Long.valueOf(C30725C4b.LIZ()), "timestamp");
        if (list == null || list.isEmpty() || list.size() <= 1) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        LIZ2.LJIJJ(Integer.valueOf(i2), "is_frequently_used_area_show");
        if (list != null) {
            str8 = list.toString();
        } else {
            str8 = null;
        }
        LIZ2.LJIJJ(str8, "frequently_used_gift_id_set");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ2.LJIJJ(num, "frequently_used_gift_cnt");
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj2, "is_portal_user");
        LIZ2.LJIJJ(arrayList.toString(), "force_insert_gift_id_set");
        LIZ2.LJIJJ(arrayList2.toString(), "force_insert_priority");
        LIZ2.LJIJJ(arrayList3.toString(), "force_insert_from");
        LIZ2.LJIJJ(arrayList4.toString(), "force_insert_gift_position");
        LIZ2.LJIJJ(arrayList5.toString(), "force_insert_configure_position");
        LIZ2.LJIJJ(arrayList6.toString(), "force_insert_gift_country");
        LIZ2.LJIJJ(Integer.valueOf(i), "gift_cnt");
        if (map != null) {
            i3 = map.size();
        } else {
            i3 = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i3), "force_insert_gift_cnt");
        C32128CjE c32128CjE = C32129CjF.LIZ;
        LIZ2.LJJIFFI(c32128CjE.LJIILJJIL);
        LIZ2.LJIJJ(0, "is_leaderboard");
        LIZ2.LJIJJ(Integer.valueOf(EnumC35440DvY.NO_IN_RANK.getValue()), "leaderboard_user_rank");
        LIZ2.LJIJJ(str4, "live_type");
        User LJ = ((C29374Bfu) TTL.LIZJ(LIZ2, c32128CjE.LIZ, "guide_from")).LJ();
        o.LJIIIIZZ(LJ, "getInstance().user().currentUserOpt");
        LIZ2.LJIJJ(C31120CJg.LJII(LJ), "user_type");
        if (C31120CJg.LIZLLL((Room) dataChannelGlobal2.mv0(C29044Baa.class)) >= 1) {
            i4 = 1;
        }
        LIZ2.LJIJJ(Integer.valueOf(i4), "is_guest_connection");
        if (AbstractC32320CmK.LIZ.LJIIL()) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj3, "is_first_recharge");
        if (C32314CmE.LIZIZ() > 0) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj4, "has_coin");
        if (C32314CmE.LIZ()) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj5, "can_exchange");
        User user = c32128CjE.LIZJ;
        if (user != null) {
            str9 = C31120CJg.LJII(user);
        } else {
            str9 = null;
        }
        LIZ2.LJIJJ(str9, "to_user_type");
        User user2 = c32128CjE.LIZJ;
        if (user2 != null) {
            l = Long.valueOf(user2.getId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "to_user_id");
        if (C31120CJg.LJIIIIZZ()) {
            obj6 = "1";
        } else {
            obj6 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj6, "is_match_item");
        if (!C31120CJg.LJIIJ()) {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str10, "is_match_item_user");
        LIZ2.LJIJJ(Long.valueOf(C31120CJg.LIZ()), "pk_id");
        LIZ2.LJJIIJZLJL();
    }
}
