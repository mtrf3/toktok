package X;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BestTeammateRelation;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ujb.o;

/* renamed from: X.TpU */
/* loaded from: classes14.dex */
public final class C75832TpU {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static C76244Tw8 LJII;
    public static java.util.Map<String, String> LJIIIZ;
    public static long LJIIJ;
    public static final C75832TpU LIZ = new C75832TpU();
    public static java.util.Map<String, String> LJIIIIZZ = new LinkedHashMap();

    public static long LJIILLIIL() {
        User owner;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null) {
            return owner.getId();
        }
        return 0L;
    }

    public static boolean LJIIZILJ() {
        if (C8E.LIZLLL().LLIFFJFJJ() && C8E.LIZLLL().LJIILJJIL().size() == 4) {
            return true;
        }
        return false;
    }

    public static void LIZ(java.util.Map map) {
        map.put("old_channel_id", String.valueOf(C8E.LIZLLL().S6()));
        map.put("is_two_apply_two", String.valueOf(C8E.LIZLLL().q3() ? 1 : 0));
    }

    public static void LIZIZ(java.util.Map map) {
        String str;
        if (C76265TwT.LIZ.LJIILIIL) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        map.put("anchor_type", str);
    }

    public static void LIZJ(java.util.Map map) {
        map.put("connection_inviter_id", String.valueOf(B5G.LIZIZ().LJJLIIIJL));
        map.put("connection_invitee_id", String.valueOf(B5G.LIZIZ().LJJLIIIJLJLI));
    }

    public static void LIZLLL(java.util.Map map) {
        String str;
        String str2;
        C75755ToF c75755ToF = B5G.LIZIZ().LJJJI;
        if (c75755ToF == null || (str = c75755ToF.LIZ) == null || o.LJJJJJL(str)) {
            return;
        }
        C75755ToF c75755ToF2 = B5G.LIZIZ().LJJJI;
        if (c75755ToF2 == null || (str2 = c75755ToF2.LIZ) == null) {
            str2 = "";
        }
        map.put("cohost_invite_request_from", str2);
    }

    public static void LJ(java.util.Map map) {
        map.put("last_request_id", B5G.LIZIZ().LJJJIL);
    }

    public static void LJIIJ(java.util.Map map) {
        String str;
        if (C75642TmQ.LJIIZILJ) {
            if (C75642TmQ.LJIILL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_linked_before", str);
            if (C75642TmQ.LJIJ != EnumC75672Tmu.INVITEE) {
                map.put("relation_label", C75642TmQ.LJIILJJIL);
                return;
            }
            return;
        }
        C75642TmQ.LJIILLIIL(map, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
    }

    public static void LJIILIIL(java.util.Map map) {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            kotlin.jvm.internal.o.LJIIIIZZ(idStr, "room.idStr");
            map.put("room_id", idStr);
            map.put("enter_method", BJM.LJIIIIZZ());
            map.put("enter_from_merge", BJM.LJFF());
            map.put("action_type", BJM.LIZLLL());
            String str = C75642TmQ.LJIJJ;
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    str = "";
                }
                map.put("request_id", str);
            }
            if (!TextUtils.isEmpty(B5G.LIZIZ().LJJIFFI)) {
                map.put("last_request_id", String.valueOf(B5G.LIZIZ().LJJIFFI));
            } else {
                if (TextUtils.isEmpty(B5G.LIZIZ().LJJJIL)) {
                    return;
                }
                map.put("last_request_id", B5G.LIZIZ().LJJJIL);
            }
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        Object obj;
        List<C75883TqJ> list;
        MutableLiveData<List<C75883TqJ>> mutableLiveData;
        MutableLiveData<List<C75883TqJ>> mutableLiveData2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJI(linkedHashMap, z);
        LJIIL(linkedHashMap, z);
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        LIZ(linkedHashMap);
        if (LJIIZILJ()) {
            C76244Tw8 c76244Tw8 = LJII;
            List<C75883TqJ> list2 = null;
            if (c76244Tw8 != null && (mutableLiveData2 = c76244Tw8.LJ) != null) {
                list = mutableLiveData2.getValue();
            } else {
                list = null;
            }
            C76244Tw8 c76244Tw82 = LJII;
            if (c76244Tw82 != null && (mutableLiveData = c76244Tw82.LJFF) != null) {
                list2 = mutableLiveData.getValue();
            }
            LJIILJJIL(list, list2, linkedHashMap);
            LJJJIL(this, "livesdk_pk_option_selection_click", linkedHashMap, "1");
            return;
        }
        LJJJIL(this, "livesdk_pk_option_selection_click", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJJIIZI(int i) {
        Object obj;
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = "1";
        if (i == 5) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_multi_guide", obj);
        LJFF(this, linkedHashMap, false, false, 6);
        if (i != 0) {
            if (i != 4) {
                if (i != 5) {
                    str = "";
                } else {
                    str = "multi_pk_guide";
                }
            } else {
                str = "match_rules";
            }
        } else {
            str = "pk_guide";
        }
        linkedHashMap.put("guide_type", str);
        LJIILIIL(linkedHashMap);
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        String label = B5G.LIZIZ().LJJJLIIL.getLabel();
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            EnumC75672Tmu enumC75672Tmu = EnumC75672Tmu.IDLE;
            if (!kotlin.jvm.internal.o.LJ(label, enumC75672Tmu.getLabel())) {
                linkedHashMap.put("anchor_type", label);
            } else if (!kotlin.jvm.internal.o.LJ(B5G.LIZIZ().LJJJLZIJ, enumC75672Tmu.getLabel())) {
                linkedHashMap.put("anchor_type", B5G.LIZIZ().LJJJLZIJ);
            }
        } else {
            if (B5G.LIZIZ().LJIIL) {
                str2 = "inviter";
            } else {
                str2 = "invitee";
            }
            linkedHashMap.put("anchor_type", str2);
        }
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        LJ(linkedHashMap);
        if (i != 5) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJI("livesdk_pk_guide_show", str3, EnumC75831TpT.ANCHOR.getType(), linkedHashMap);
    }

    public static void LJI(java.util.Map map, boolean z) {
        C76280Twi c76280Twi;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        if (c76280Twi.LJIILL != 0) {
            map.put("match_option", "only_gift");
            map.put("only_gift_id", String.valueOf(c76280Twi.LJIILL));
        } else {
            map.put("match_option", "all_gift");
        }
    }

    public static void LJII(java.util.Map map, boolean z) {
        String str;
        String l;
        String str2;
        String l2;
        Object obj = ((LinkedHashMap) LJIIIIZZ).get("is_oncemore");
        String str3 = "";
        if (obj == null) {
            obj = "";
        }
        map.put("is_oncemore", obj);
        if (!map.containsKey("oncemore_type")) {
            Object obj2 = ((LinkedHashMap) LJIIIIZZ).get("oncemore_type");
            if (obj2 == null) {
                obj2 = "";
            }
            map.put("oncemore_type", obj2);
        }
        if (!map.containsKey("red_team_uid_list") && !map.containsKey("blue_team_uid_list")) {
            Object obj3 = ((LinkedHashMap) LJIIIIZZ).get("red_team_uid_list");
            if (obj3 == null) {
                obj3 = "";
            }
            map.put("red_team_uid_list", obj3);
            Object obj4 = ((LinkedHashMap) LJIIIIZZ).get("blue_team_uid_list");
            if (obj4 == null) {
                obj4 = "";
            }
            map.put("blue_team_uid_list", obj4);
        }
        Object obj5 = ((LinkedHashMap) LJIIIIZZ).get("anchor_type");
        if (obj5 == null) {
            obj5 = "";
        }
        map.put("anchor_type", obj5);
        Object obj6 = ((LinkedHashMap) LJIIIIZZ).get("current_connection_cnts");
        if (obj6 == null) {
            obj6 = "";
        }
        map.put("current_connection_cnts", obj6);
        Object obj7 = ((LinkedHashMap) LJIIIIZZ).get("right_user_id");
        if (obj7 == null) {
            obj7 = "";
        }
        map.put("right_user_id", obj7);
        Object obj8 = ((LinkedHashMap) LJIIIIZZ).get("request_id");
        if (obj8 == null) {
            obj8 = "";
        }
        map.put("request_id", obj8);
        Object obj9 = ((LinkedHashMap) LJIIIIZZ).get("channel_id");
        if (obj9 == null) {
            obj9 = "";
        }
        map.put("channel_id", obj9);
        Object obj10 = ((LinkedHashMap) LJIIIIZZ).get("invitee_list");
        if (obj10 == null) {
            obj10 = "";
        }
        map.put("invitee_list", obj10);
        Object obj11 = ((LinkedHashMap) LJIIIIZZ).get("pk_id");
        if (obj11 == null) {
            obj11 = "";
        }
        map.put("pk_id", obj11);
        Object obj12 = ((LinkedHashMap) LJIIIIZZ).get("request_from");
        if (obj12 == null) {
            obj12 = "";
        }
        map.put("request_from", obj12);
        Object obj13 = ((LinkedHashMap) LJIIIIZZ).get("connection_inviter_id");
        if (obj13 == null) {
            obj13 = "";
        }
        map.put("connection_inviter_id", obj13);
        Object obj14 = ((LinkedHashMap) LJIIIIZZ).get("connection_invitee_id");
        if (obj14 == null) {
            obj14 = "";
        }
        map.put("connection_invitee_id", obj14);
        String str4 = (String) ((LinkedHashMap) LJIIIIZZ).get("pk_inviter_id");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) ((LinkedHashMap) LJIIIIZZ).get("pk_invitee_id");
        if (str5 != null) {
            str3 = str5;
        }
        map.put("pk_inviter_id", str4);
        map.put("pk_invitee_id", str3);
        String str6 = CardStruct.IStatusCode.DEFAULT;
        try {
            if (z) {
                C76280Twi c76280Twi = C76265TwT.LIZ;
                Long l3 = (Long) ((HashMap) c76280Twi.LJJIJL).get(1L);
                if (l3 == null || (str = l3.toString()) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("inviter_pk_score", str);
                Long l4 = (Long) ((HashMap) c76280Twi.LJJIJL).get(2L);
                if (l4 != null && (l = l4.toString()) != null) {
                    str6 = l;
                }
                map.put("invitee_pk_score", str6);
                return;
            }
            C76280Twi c76280Twi2 = C76265TwT.LIZ;
            Long l5 = (Long) ((HashMap) c76280Twi2.LJJIJL).get(Long.valueOf(CastLongProtector.parseLong(str4)));
            if (l5 == null || (str2 = l5.toString()) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("inviter_pk_score", str2);
            Long l6 = (Long) ((HashMap) c76280Twi2.LJJIJL).get(Long.valueOf(CastLongProtector.parseLong(str3)));
            if (l6 != null && (l2 = l6.toString()) != null) {
                str6 = l2;
            }
            map.put("invitee_pk_score", str6);
        } catch (Exception unused) {
        }
    }

    public static void LJIIJJI(java.util.Map map, EnumC76319TxL enumC76319TxL) {
        if (enumC76319TxL == null) {
            return;
        }
        String value = enumC76319TxL.getValue();
        if (value == null) {
            value = "";
        }
        map.put("request_from", value);
    }

    public static void LJIIL(java.util.Map map, boolean z) {
        C76280Twi c76280Twi;
        String str;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        EnumC76319TxL enumC76319TxL = c76280Twi.LJJJI;
        if (enumC76319TxL == null || (str = enumC76319TxL.getValue()) == null) {
            str = "";
        }
        map.put("request_from", str);
    }

    public static void LJIILL(List list, java.util.Map map) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TeamUsersInfo teamUsersInfo = (TeamUsersInfo) it.next();
                if (teamUsersInfo.teamId == 1) {
                    List<Long> list2 = teamUsersInfo.userIds;
                    kotlin.jvm.internal.o.LJIIIIZZ(list2, "it.userIds");
                    map.put("red_team_uid_list", ORZ.LLD(list2, ",", null, null, null, 62));
                } else {
                    List<Long> list3 = teamUsersInfo.userIds;
                    kotlin.jvm.internal.o.LJIIIIZZ(list3, "it.userIds");
                    map.put("blue_team_uid_list", ORZ.LLD(list3, ",", null, null, null, 62));
                }
            }
        }
    }

    public static void LJIIIIZZ(java.util.Map map, boolean z, boolean z2) {
        String str;
        boolean z3 = C76265TwT.LIZ.LJ;
        if (z3 || z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_oncemore", str);
        if (z3 || z2) {
            String str2 = "draw";
            if (z) {
                BattleTeamResult battleTeamResult = C76265TwT.LJ;
                if (battleTeamResult == null || battleTeamResult.result != 2) {
                    str2 = "not_draw";
                }
                map.put("oncemore_type", str2);
                return;
            }
            BattleResult battleResult = C76265TwT.LIZJ;
            if (battleResult == null || battleResult.result != 2) {
                str2 = "not_draw";
            }
            map.put("oncemore_type", str2);
        }
    }

    public static void LJIIIZ(C75832TpU c75832TpU, java.util.Map map, boolean z) {
        String str;
        c75832TpU.getClass();
        boolean z2 = C76265TwT.LIZ.LJ;
        if (!z2) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put("is_oncemore", str);
        if (!z2) {
            return;
        }
        String str2 = "draw";
        if (z) {
            BattleTeamResult battleTeamResult = C76265TwT.LJII;
            if (battleTeamResult == null || battleTeamResult.result != 2) {
                str2 = "not_draw";
            }
            map.put("oncemore_type", str2);
            return;
        }
        BattleResult battleResult = C76265TwT.LJI;
        if (battleResult == null || battleResult.result != 2) {
            str2 = "not_draw";
        }
        map.put("oncemore_type", str2);
    }

    public static void LJIILJJIL(List list, List list2, java.util.Map map) {
        if (list == null || list2 == null) {
            return;
        }
        map.put("red_team_uid_list", ORZ.LLD(list, ",", null, null, C75834TpW.LJLIL, 30));
        map.put("blue_team_uid_list", ORZ.LLD(list2, ",", null, null, C75835TpX.LJLIL, 30));
    }

    public final void LJIJJLI(List list, boolean z, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        LIZLLL = C30725C4b.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(linkedHashMap);
        LJIILL(list, linkedHashMap);
        linkedHashMap.put("is_multi", "1");
        LJFF(this, linkedHashMap, false, false, 6);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        LJIIJJI(linkedHashMap, c76280Twi.LJJJI);
        linkedHashMap.put("connection_type", "manual_pk");
        LIZIZ(linkedHashMap);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        linkedHashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        LJIIIIZZ(linkedHashMap, z, false);
        LJIILIIL(linkedHashMap);
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        linkedHashMap.put("time_stamp", String.valueOf(C30725C4b.LIZ()));
        if (c76280Twi.LJIILIIL) {
            linkedHashMap.put("invite_to_success_dur", String.valueOf(C30725C4b.LIZ() - LIZIZ));
        }
        Iterator LIZLLL2 = C08880Wm.LIZLLL();
        do {
            obj = null;
            if (!LIZLLL2.hasNext()) {
                break;
            } else {
                obj = LIZLLL2.next();
            }
        } while (!((C75883TqJ) obj).LJIJ);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (obj != null) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_best_teammate_occur", obj2);
        List<BestTeammateRelation> list2 = C76265TwT.LIZ.LJFF;
        if (list2 != null) {
            Iterator<BestTeammateRelation> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BestTeammateRelation next = it.next();
                if (next.userId == LJIILLIIL()) {
                    if (next != null) {
                        obj3 = "1";
                    }
                }
            }
        }
        obj3 = CardStruct.IStatusCode.DEFAULT;
        linkedHashMap.put("is_best_teammate", obj3);
        linkedHashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND || B5G.LIZIZ().LJIIJJI == EnumC75617Tm1.RANDOM_LINK_MIC_RECOMMEND) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_quick_recommend", obj4);
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        LJI(linkedHashMap, false);
        C76280Twi c76280Twi2 = C76265TwT.LIZ;
        if (c76280Twi2.LJIIL && kotlin.jvm.internal.o.LJ(str, "livesdk_connection_success")) {
            linkedHashMap.put("enter_from", "activity_banner");
            c76280Twi2.LJIIL = false;
        }
        if (kotlin.jvm.internal.o.LJ(str, "livesdk_connection_success") && C75893TqT.LJI != 0 && (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVED_INVITE || B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVATION_BUBBLE_INVITE)) {
            linkedHashMap.put("reservation_id", String.valueOf(C75893TqT.LJI));
        }
        if (!z) {
            if (c76280Twi2.LJIILIIL) {
                linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
                linkedHashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
            } else {
                linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
                linkedHashMap.put("pk_inviter_id", String.valueOf(B5G.LIZIZ().LJI));
            }
            linkedHashMap.put("right_user_id", String.valueOf(B5G.LIZIZ().LJI));
        }
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        LJ(linkedHashMap);
        LJIIIIZZ = linkedHashMap;
        if (z) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (c76280Twi2.LJIILIIL) {
                str2 = "1";
            }
            linkedHashMap2.put("is_starter", str2);
            linkedHashMap2.put("cur_anchor_id", String.valueOf(LJIILLIIL()));
            linkedHashMap2.put("multi_match_inviter_id", String.valueOf(c76280Twi2.LJI));
            LJIIIZ = linkedHashMap2;
            LJJJIL(this, str, linkedHashMap, "1");
            return;
        }
        LJJJIL(this, str, linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJIL(List list, boolean z, boolean z2) {
        String valueOf;
        String str;
        String str2;
        if (z2) {
            LJIIJ = C30725C4b.LIZ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        if (z) {
            LJIILL(list, linkedHashMap);
        } else {
            linkedHashMap.put("right_user_id", String.valueOf(B5G.LIZIZ().LJI));
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        linkedHashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        BattleSetting battleSetting = c76280Twi.LIZLLL;
        if (battleSetting == null || (valueOf = Integer.valueOf(battleSetting.duration).toString()) == null) {
            valueOf = String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue());
        }
        linkedHashMap.put("pk_time", valueOf);
        LJI(linkedHashMap, false);
        LIZ(linkedHashMap);
        boolean rk = ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk();
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (rk) {
            linkedHashMap.put("is_lineup_status", "1");
        } else {
            linkedHashMap.put("is_lineup_status", CardStruct.IStatusCode.DEFAULT);
        }
        if (kotlin.jvm.internal.o.LJ(linkedHashMap.get("current_connection_cnts"), "1")) {
            if (z) {
                str2 = "4";
            } else {
                str2 = "2";
            }
            linkedHashMap.put("current_connection_cnts", str2);
        }
        if (z) {
            str3 = "1";
        }
        if (z2) {
            str = "manual_pk";
        } else {
            str = "anchor";
        }
        linkedHashMap.put("connection_type", str);
        linkedHashMap.put("is_multi", str3);
        C75642TmQ.LJIILL(B5G.LIZIZ().LJIIJ, linkedHashMap);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_connection_transform");
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(linkedHashMap);
        if (kotlin.jvm.internal.o.LJ("livesdk_connection_transform", "livesdk_connection_transform") && BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZ();
            LIZ2.LJJIIZI();
            return;
        }
        LIZ2.LJJIIJZLJL();
    }

    public final void LJJII(List list, boolean z, boolean z2) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        linkedHashMap.put("pk_id", String.valueOf(C76265TwT.LIZ.LIZIZ()));
        LJI(linkedHashMap, false);
        if (z2) {
            LJIILL(list, linkedHashMap);
            LJJJIL(this, "livesdk_pk_ranking_entrance_show", linkedHashMap, "1");
        } else {
            LJJJIL(this, "livesdk_pk_ranking_entrance_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIIJ(List<? extends TeamUsersInfo> list, boolean z, EnumC75744To4 overType) {
        Object obj;
        String str;
        BattleBaseUserInfo battleBaseUserInfo;
        Long l;
        String l2;
        BattleBaseUserInfo battleBaseUserInfo2;
        Long l3;
        String str2;
        BattleBaseUserInfo battleBaseUserInfo3;
        Long l4;
        String l5;
        BattleBaseUserInfo battleBaseUserInfo4;
        Long l6;
        String str3;
        kotlin.jvm.internal.o.LJIIIZ(overType, "overType");
        C76280Twi c76280Twi = C76265TwT.LIZ;
        long j = c76280Twi.LJJIJ;
        if (j <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILL(list, linkedHashMap);
        linkedHashMap.put("is_multi", "1");
        linkedHashMap.put("user_type", "anchor");
        LJFF(this, linkedHashMap, false, false, 6);
        LJIIJJI(linkedHashMap, c76280Twi.LJJJI);
        linkedHashMap.put("connection_type", "manual_pk");
        LIZIZ(linkedHashMap);
        if (c76280Twi.LJJJJZ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_punish_activity", obj);
        if (c76280Twi.LJJJJZ) {
            if (c76280Twi.LJJJJLI) {
                str3 = "open";
            } else {
                str3 = "close";
            }
            linkedHashMap.put("punish_activity_status", str3);
        }
        LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        LJIIIZ(this, linkedHashMap, z);
        linkedHashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - j) / 1000));
        linkedHashMap.put("over_type", overType.getType());
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        LJI(linkedHashMap, false);
        long j2 = C75893TqT.LJI;
        if (j2 != 0) {
            linkedHashMap.put("reservation_id", String.valueOf(j2));
        } else {
            long j3 = C75893TqT.LJIIIIZZ;
            if (j3 != 0) {
                linkedHashMap.put("reservation_id", String.valueOf(j3));
                C75893TqT.LJIIIIZZ = 0L;
            }
        }
        LIZ(linkedHashMap);
        LJIIJ(linkedHashMap);
        LJII(linkedHashMap, z);
        if (!z) {
            if (LJIILLIIL() == 0) {
                String str4 = "0L";
                if (c76280Twi.LJIILIIL) {
                    BattleUserInfo LIZLLL2 = c76280Twi.LIZLLL();
                    if (LIZLLL2 == null || (battleBaseUserInfo4 = LIZLLL2.user) == null || (l6 = battleBaseUserInfo4.userId) == null || (str2 = l6.toString()) == null) {
                        str2 = "0L";
                    }
                    linkedHashMap.put("pk_inviter_id", str2);
                    BattleUserInfo LJFF2 = c76280Twi.LJFF();
                    if (LJFF2 != null && (battleBaseUserInfo3 = LJFF2.user) != null && (l4 = battleBaseUserInfo3.userId) != null && (l5 = l4.toString()) != null) {
                        str4 = l5;
                    }
                    linkedHashMap.put("pk_invitee_id", str4);
                } else {
                    BattleUserInfo LIZLLL3 = c76280Twi.LIZLLL();
                    if (LIZLLL3 == null || (battleBaseUserInfo2 = LIZLLL3.user) == null || (l3 = battleBaseUserInfo2.userId) == null || (str = l3.toString()) == null) {
                        str = "0L";
                    }
                    linkedHashMap.put("pk_invitee_id", str);
                    BattleUserInfo LJFF3 = c76280Twi.LJFF();
                    if (LJFF3 != null && (battleBaseUserInfo = LJFF3.user) != null && (l = battleBaseUserInfo.userId) != null && (l2 = l.toString()) != null) {
                        str4 = l2;
                    }
                    linkedHashMap.put("pk_inviter_id", str4);
                }
            } else if (c76280Twi.LJIILIIL) {
                linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
                linkedHashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
            } else {
                linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
                linkedHashMap.put("pk_inviter_id", String.valueOf(B5G.LIZIZ().LJI));
            }
        } else {
            java.util.Map<String, String> map = LJIIIZ;
            if (map != null) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
                String str5 = "";
                if (kotlin.jvm.internal.o.LJ(linkedHashMap2.get("is_starter"), "1")) {
                    Object obj2 = linkedHashMap2.get("cur_anchor_id");
                    if (obj2 != 0) {
                        str5 = obj2;
                    }
                    linkedHashMap.put("pk_inviter_id", str5);
                    linkedHashMap.remove("pk_invitee_id");
                } else {
                    Object obj3 = linkedHashMap2.get("cur_anchor_id");
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    linkedHashMap.put("pk_invitee_id", obj3);
                    Object obj4 = linkedHashMap2.get("multi_match_inviter_id");
                    if (obj4 != 0) {
                        str5 = obj4;
                    }
                    linkedHashMap.put("pk_inviter_id", str5);
                }
            }
        }
        LJIIIZ = null;
        if (z) {
            linkedHashMap.put("current_connection_cnts", "4");
            LJJJIL(this, "livesdk_punish_end", linkedHashMap, "1");
        } else {
            linkedHashMap.put("current_connection_cnts", "2");
            LJJJIL(this, "livesdk_punish_end", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public final void LJJIIZ(String from, boolean z, boolean z2) {
        String str;
        Object obj;
        kotlin.jvm.internal.o.LJIIIZ(from, "from");
        C76280Twi c76280Twi = C76265TwT.LIZ;
        EnumC76178Tv4 LJ2 = c76280Twi.LJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C76265TwT.LJFF()) {
            linkedHashMap.put("click_reason", "cancel_pk_invite");
        } else if (LJ2.compareTo(EnumC76178Tv4.START) >= 0 && LJ2.compareTo(EnumC76178Tv4.DRAW) < 0) {
            linkedHashMap.put("click_reason", "disconnect_pk");
        } else {
            linkedHashMap.put("click_reason", "pk_invite");
        }
        if (c76280Twi.LJ().compareTo(EnumC76178Tv4.START) >= 0 && c76280Twi.LJ().compareTo(EnumC76178Tv4.END) < 0) {
            str = "during_pk";
        } else if ((C8E.LIZLLL().LLIFFJFJJ() && C8E.LIZLLL().LLII() == EnumC75620Tm4.Linked) || ((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            str = "during_connection";
        } else {
            str = "normal";
        }
        linkedHashMap.put("click_time", str);
        LJFF(this, linkedHashMap, false, false, 6);
        if (!z) {
            C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        } else {
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
        }
        LJIILIIL(linkedHashMap);
        linkedHashMap.put("request_from", from);
        String str2 = "1";
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_effective", obj);
        if (!z) {
            linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
            linkedHashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
        }
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        LIZ(linkedHashMap);
        LJ(linkedHashMap);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (C75893TqT.LJI != 0 && (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVED_INVITE || B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVATION_BUBBLE_INVITE)) {
            linkedHashMap.put("reservation_id", String.valueOf(C75893TqT.LJI));
        }
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJIL(this, "livesdk_pk_click", linkedHashMap, str2);
    }

    public final void LJJIJ(List list, List list2, boolean z) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJI(linkedHashMap, z);
        LJIIL(linkedHashMap, z);
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        long j = C75893TqT.LJI;
        if (j != 0) {
            linkedHashMap.put("reservation_id", String.valueOf(j));
        }
        if (LJIIZILJ()) {
            LJIILJJIL(list, list2, linkedHashMap);
            LJJJIL(this, "livesdk_pk_invite_popup_show", linkedHashMap, "1");
        } else {
            LJJJIL(this, "livesdk_pk_invite_popup_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public final void LJJIJIIJI(boolean z, MatchBaseWidget matchBaseWidget, boolean z2) {
        boolean z3;
        String str;
        String str2;
        String str3;
        List<Long> list;
        kotlin.jvm.internal.o.LJIIIZ(matchBaseWidget, "matchBaseWidget");
        EnumC76178Tv4 LJ2 = C76265TwT.LIZ.LJ();
        if ((EnumC76178Tv4.START.compareTo(LJ2) <= 0 && LJ2.compareTo(EnumC76178Tv4.FINISH) < 0) || EnumC76178Tv4.PUNISH.compareTo(LJ2) > 0 || LJ2.compareTo(EnumC76178Tv4.DRAW) >= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        List<TeamUsersInfo> list2 = ((C76244Tw8) matchBaseWidget.LJZI(C76244Tw8.class)).LJIILL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILL(list2, linkedHashMap);
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        if (list2 != null) {
            for (TeamUsersInfo teamUsersInfo : list2) {
                if (teamUsersInfo.teamId == C76265TwT.LIZ.LJJJJJ && (list = teamUsersInfo.userIds) != null) {
                    for (Long l : list) {
                        long LJIILLIIL = LJIILLIIL();
                        if (l == null || l.longValue() != LJIILLIIL) {
                            linkedHashMap.put("pk_inviter_id", String.valueOf(l));
                        } else {
                            linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
                        }
                    }
                }
            }
        }
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        if (!z3) {
            str = "disconnect_pk";
        } else {
            str = "disconnect_punish";
        }
        linkedHashMap.put("request_type", str);
        if (z) {
            str2 = "accept";
        } else {
            str2 = "reject";
        }
        linkedHashMap.put("selection", str2);
        if (z2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_turn_off", str3);
        LJI(linkedHashMap, false);
        LJIIIZ(this, linkedHashMap, true);
        RandomLinkMicManager.LJLIL.getClass();
        if (RandomLinkMicManager.LJLLLLLL) {
            C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        }
        Object obj = ((LinkedHashMap) LJIIIIZZ).get("invitee_list");
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("invitee_list", obj);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        LJJJIL(this, "livesdk_pk_disconnect_received_click", linkedHashMap, "1");
    }

    public final void LJJIJIL(int i, boolean z, List<? extends TeamUsersInfo> list) {
        String str;
        List<Long> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        LJIIIZ(this, linkedHashMap, z);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        if (i == 0) {
            str = "disconnect_pk";
        } else {
            str = "disconnect_punish";
        }
        linkedHashMap.put("request_type", str);
        LJI(linkedHashMap, false);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (z) {
            if (list != null) {
                for (TeamUsersInfo teamUsersInfo : list) {
                    if (teamUsersInfo.teamId == C76265TwT.LIZ.LJJJJJ && (list2 = teamUsersInfo.userIds) != null) {
                        for (Long l : list2) {
                            long LJIILLIIL = LJIILLIIL();
                            if (l == null || l.longValue() != LJIILLIIL) {
                                linkedHashMap.put("pk_invitee_id", String.valueOf(l));
                            } else {
                                linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
                            }
                        }
                    }
                }
            }
            LJIILL(list, linkedHashMap);
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL && !C75642TmQ.LJIILLIIL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
            LJJJIL(this, "livesdk_pk_disconnect_show", linkedHashMap, "1");
            return;
        }
        linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
        linkedHashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
        if (!C75642TmQ.LJIILLIIL) {
            C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        }
        LJJJIL(this, "livesdk_pk_disconnect_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJJIL(int i, boolean z, List<? extends TeamUsersInfo> list) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILIIL(linkedHashMap);
        LJFF(this, linkedHashMap, false, false, 6);
        if (i == 0) {
            str = "draw";
        } else {
            str = "not_draw";
        }
        linkedHashMap.put("oncemore_type", str);
        LIZLLL(linkedHashMap);
        LIZ(linkedHashMap);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (z) {
            LJIILL(list, linkedHashMap);
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
            LJJJIL(this, "livesdk_pk_oncemore_click", linkedHashMap, "1");
            return;
        }
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        linkedHashMap.put("right_user_id", String.valueOf(B5G.LIZIZ().LJI));
        LJJJIL(this, "livesdk_pk_oncemore_click", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJJIZ(int i, boolean z, List<? extends TeamUsersInfo> list) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILIIL(linkedHashMap);
        LJFF(this, linkedHashMap, false, false, 6);
        if (i == 0) {
            str = "draw";
        } else {
            str = "not_draw";
        }
        linkedHashMap.put("oncemore_type", str);
        LIZLLL(linkedHashMap);
        LIZ(linkedHashMap);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (z) {
            LJIILL(list, linkedHashMap);
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
            LJJJIL(this, "livesdk_pk_oncemore_show", linkedHashMap, "1");
            return;
        }
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        linkedHashMap.put("right_user_id", String.valueOf(B5G.LIZIZ().LJI));
        LJJJIL(this, "livesdk_pk_oncemore_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public static void LJJJI(String str, String str2, String str3, java.util.Map map) {
        map.put("connection_type", str3);
        map.put("is_multi", str2);
        C75642TmQ.LJIILL(B5G.LIZIZ().LJIIJ, map);
        map.put("overload_score", C1H.LJ());
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        if (kotlin.jvm.internal.o.LJ("livesdk_connection_watch_duration", str) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(str)) {
            LIZ2.LJJIJ();
            LIZ2.LJJIIZ();
            LIZ2.LJJIIZI();
            return;
        }
        LIZ2.LJJIIJZLJL();
    }

    public static /* synthetic */ void LJJJIL(C75832TpU c75832TpU, String str, java.util.Map map, String str2) {
        String type = EnumC75831TpT.MANUAL_PK.getType();
        c75832TpU.getClass();
        LJJJI(str, str2, type, map);
    }

    public final void LJIJ(long j, long j2, long j3, boolean z) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        String label = B5G.LIZIZ().LJJJLIIL.getLabel();
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            EnumC75672Tmu enumC75672Tmu = EnumC75672Tmu.IDLE;
            if (!kotlin.jvm.internal.o.LJ(label, enumC75672Tmu.getLabel())) {
                linkedHashMap.put("anchor_type", label);
            } else if (!kotlin.jvm.internal.o.LJ(B5G.LIZIZ().LJJJLZIJ, enumC75672Tmu.getLabel())) {
                linkedHashMap.put("anchor_type", B5G.LIZIZ().LJJJLZIJ);
            }
        } else {
            if (B5G.LIZIZ().LJIIL) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            linkedHashMap.put("anchor_type", str);
        }
        linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
        linkedHashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_finish", str2);
        linkedHashMap.put("task_target", String.valueOf(j));
        linkedHashMap.put("task_finish", String.valueOf(j2));
        linkedHashMap.put("recommend_gift_finish", String.valueOf(j3));
        linkedHashMap.put("pk_id", String.valueOf(C76265TwT.LIZ.LIZIZ()));
        C65124PhA.LIZLLL().getClass();
        java.util.Map LIZIZ2 = C65124PhA.LIZIZ();
        if (LIZIZ2 == null) {
            LIZIZ2 = C113554cx.LJJJLIIL();
        }
        String str3 = (String) LIZIZ2.get("fake_region");
        String str4 = (String) LIZIZ2.get("carrier_region");
        if (TextUtils.isEmpty(str3)) {
            str3 = str4;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        } else if (str3 == null) {
            "region mast not null".toString();
            throw new IllegalArgumentException("region mast not null");
        }
        Locale US = Locale.US;
        kotlin.jvm.internal.o.LJIIIIZZ(US, "US");
        String upperCase = str3.toUpperCase(US);
        kotlin.jvm.internal.o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        linkedHashMap.put("country", upperCase);
        if (j2 != 0) {
            linkedHashMap.put("recommend_gift_contribution", String.valueOf((((float) j3) * 1.0f) / (((float) j2) * 1.0f)));
        } else {
            linkedHashMap.put("recommend_gift_contribution", CardStruct.IStatusCode.DEFAULT);
        }
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        LJJJIL(this, "livesdk_pk_task_recommend_contribute", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJIJI(boolean z, List<? extends TeamUsersInfo> list, Long l, Room room) {
        C76280Twi c76280Twi = C76265TwT.LIZ;
        long j = 0;
        if (c76280Twi.LJJIIZ <= 0 && LJIIJ <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        LJIILIIL(hashMap);
        LJFF(this, hashMap, false, true, 2);
        hashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        hashMap.put("watch_connection_duration", String.valueOf((C30725C4b.LIZ() - LJIIJ) / 1000));
        hashMap.put("connection_type", "manual_pk");
        if (z) {
            LJIILL(list, hashMap);
        } else {
            if (l != null) {
                j = l.longValue();
            }
            hashMap.put("right_user_id", String.valueOf(j));
        }
        String str = "1";
        if (!z && ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).jT(room)) {
            hashMap.put("is_lineup_status", "1");
        } else {
            hashMap.put("is_lineup_status", CardStruct.IStatusCode.DEFAULT);
        }
        hashMap.put("overload_score", C1H.LJ());
        LJI(hashMap, false);
        LIZ(hashMap);
        if (!z) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJIL(this, "livesdk_connection_watch_duration", hashMap, str);
    }

    public final void LJJIFFI(List list, int i, boolean z, boolean z2) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        LJIILL(list, linkedHashMap);
        String str2 = "anchor";
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        if (i != 1) {
            if (i == 2) {
                str2 = "blue_team";
            }
        } else {
            str2 = "red_team";
        }
        linkedHashMap.put("click_type", str2);
        if (z) {
            linkedHashMap.put("click_anchor_id", String.valueOf(LJIILLIIL()));
        }
        linkedHashMap.put("pk_id", String.valueOf(C76265TwT.LIZ.LIZIZ()));
        LJI(linkedHashMap, false);
        if (z2) {
            LJJJIL(this, "livesdk_pk_ranking_entrance_click", linkedHashMap, "1");
        } else {
            LJJJIL(this, "livesdk_pk_ranking_entrance_click", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public final void LJJIII(List<? extends TeamUsersInfo> list, boolean z, EnumC75744To4 overType, java.util.Map<String, String> map) {
        Object obj;
        Object obj2;
        long j;
        long j2;
        long j3;
        long j4;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        String str2;
        kotlin.jvm.internal.o.LJIIIZ(overType, "overType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILL(list, linkedHashMap);
        LJFF(this, linkedHashMap, false, false, 6);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        LJIIJJI(linkedHashMap, c76280Twi.LJJJI);
        linkedHashMap.put("connection_type", "manual_pk");
        linkedHashMap.put("user_type", "anchor");
        LIZIZ(linkedHashMap);
        if (c76280Twi.LJJJJZ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_punish_activity", obj);
        if (c76280Twi.LJJJJZ) {
            if (c76280Twi.LJJJJLI) {
                str2 = "open";
            } else {
                str2 = "close";
            }
            linkedHashMap.put("punish_activity_status", str2);
        }
        LJIILIIL(linkedHashMap);
        linkedHashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        LJIIIIZZ(linkedHashMap, z, false);
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        linkedHashMap.put("over_type", overType.getType());
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_quick_recommend", obj2);
        if (kotlin.jvm.internal.o.LJ(((LinkedHashMap) map).get("is_live_end"), "1")) {
            linkedHashMap.put("is_live_end", "1");
        } else {
            linkedHashMap.put("is_live_end", CardStruct.IStatusCode.DEFAULT);
        }
        if (!z) {
            if (c76280Twi.LJIILIIL) {
                linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
                linkedHashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
            } else {
                linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
                linkedHashMap.put("pk_inviter_id", String.valueOf(B5G.LIZIZ().LJI));
            }
            linkedHashMap.put("right_user_id", String.valueOf(B5G.LIZIZ().LJI));
        }
        if (z) {
            linkedHashMap.put("inviter_pk_score", String.valueOf(((HashMap) c76280Twi.LJJIJL).get(1L)));
            linkedHashMap.put("invitee_pk_score", String.valueOf(((HashMap) c76280Twi.LJJIJL).get(2L)));
        } else if (c76280Twi.LJIILIIL) {
            Long l = (Long) ((HashMap) c76280Twi.LJJIJL).get(Long.valueOf(LJIILLIIL()));
            if (l != null) {
                j3 = l.longValue();
            } else {
                j3 = 0;
            }
            linkedHashMap.put("inviter_pk_score", String.valueOf(j3));
            Long l2 = (Long) ((HashMap) c76280Twi.LJJIJL).get(Long.valueOf(B5G.LIZIZ().LJI));
            if (l2 != null) {
                j4 = l2.longValue();
            } else {
                j4 = 0;
            }
            linkedHashMap.put("invitee_pk_score", String.valueOf(j4));
        } else {
            Long l3 = (Long) ((HashMap) c76280Twi.LJJIJL).get(Long.valueOf(B5G.LIZIZ().LJI));
            if (l3 != null) {
                j = l3.longValue();
            } else {
                j = 0;
            }
            linkedHashMap.put("inviter_pk_score", String.valueOf(j));
            Long l4 = (Long) ((HashMap) c76280Twi.LJJIJL).get(Long.valueOf(LJIILLIIL()));
            if (l4 != null) {
                j2 = l4.longValue();
            } else {
                j2 = 0;
            }
            linkedHashMap.put("invitee_pk_score", String.valueOf(j2));
        }
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        linkedHashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(key, value);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        LJI(linkedHashMap, false);
        linkedHashMap.put("connection_time", String.valueOf((C30725C4b.LIZ() - LIZLLL) / 1000));
        if (!z) {
            C76280Twi c76280Twi2 = C76265TwT.LIZ;
            if (c76280Twi2.LJJL) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("for_lineup_end", obj3);
            if (c76280Twi2.LJJL) {
                if (!BM1.LIZIZ) {
                    str = "1";
                } else {
                    str = "2";
                }
                linkedHashMap.put("lineup_end_type", str);
            }
            if (B5G.LIZIZ().LJJLL) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_lineup_start", obj4);
            if (B5G.LIZIZ().LJJZ) {
                obj5 = "1";
            } else {
                obj5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_lineup_end", obj5);
        }
        long j5 = C75893TqT.LJI;
        if (j5 != 0) {
            linkedHashMap.put("reservation_id", String.valueOf(j5));
        }
        LIZ(linkedHashMap);
        LJIIJ(linkedHashMap);
        LJII(linkedHashMap, z);
        LJ(linkedHashMap);
        linkedHashMap.put("overload_score", C1H.LJ());
        if (z) {
            LJJJIL(this, "livesdk_pk_end", linkedHashMap, "1");
        } else {
            LJJJIL(this, "livesdk_pk_end", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public final void LJJIJIIJIL(List list, int i, boolean z, boolean z2) {
        String str;
        String str2;
        List<Long> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        LJIIIZ(this, linkedHashMap, z);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        if (i == 0) {
            str = "disconnect_pk";
        } else {
            str = "disconnect_punish";
        }
        linkedHashMap.put("request_type", str);
        if (z2) {
            str2 = "disconnect";
        } else {
            str2 = "go_back";
        }
        linkedHashMap.put("selection", str2);
        LJI(linkedHashMap, false);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (z) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    TeamUsersInfo teamUsersInfo = (TeamUsersInfo) it.next();
                    if (teamUsersInfo.teamId == C76265TwT.LIZ.LJJJJJ && (list2 = teamUsersInfo.userIds) != null) {
                        for (Long l : list2) {
                            long LJIILLIIL = LJIILLIIL();
                            if (l == null || l.longValue() != LJIILLIIL) {
                                linkedHashMap.put("pk_invitee_id", String.valueOf(l));
                            } else {
                                linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
                            }
                        }
                    }
                }
            }
            LJIILL(list, linkedHashMap);
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL && !C75642TmQ.LJIILLIIL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
            LJJJIL(this, "livesdk_pk_disconnect_click", linkedHashMap, "1");
            return;
        }
        linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
        linkedHashMap.put("pk_invitee_id", String.valueOf(B5G.LIZIZ().LJI));
        if (!C75642TmQ.LJIILLIIL) {
            C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        }
        LJJJIL(this, "livesdk_pk_disconnect_click", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJJIJL(boolean z, int i, boolean z2, boolean z3) {
        String str;
        Object obj;
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (c76280Twi.LJJIIZ <= 0 && LJIIJ <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        LJIILIIL(hashMap);
        hashMap.put("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        hashMap.put("pk_id", String.valueOf(c76280Twi.LIZIZ()));
        hashMap.put("screen_height", String.valueOf(B9K.LIZIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context())));
        String str2 = "1";
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C116484hg.LIZIZ(hashMap, "pk_task_bar_location", str, i, "pk_task_bar_type");
        if (z3) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_cqc_toast_show", obj);
        if (!z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJIL(this, "livesdk_pk_task_processbar_show", hashMap, str2);
    }

    public static void LJFF(C75832TpU c75832TpU, java.util.Map map, boolean z, boolean z2, int i) {
        String valueOf;
        MutableLiveData<Long> mutableLiveData;
        Long value;
        MutableLiveData<Long> mutableLiveData2;
        Long value2;
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c75832TpU.getClass();
        ArrayList arrayList = new ArrayList();
        if (C8E.LIZLLL().LLIFFJFJJ()) {
            List<C75883TqJ> LJIILJJIL = C8E.LIZLLL().LJIILJJIL();
            i2 = LJIILJJIL.size();
            Iterator<C75883TqJ> it = LJIILJJIL.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().LIZ));
            }
        } else if (((IInteractService) CN1.LIZ(IInteractService.class)).OB()) {
            arrayList.add(Long.valueOf(LJIILLIIL()));
            arrayList.add(Long.valueOf(B5G.LIZIZ().LJI));
            i2 = 2;
        }
        map.put("current_connection_cnts", String.valueOf(i2));
        if (arrayList.size() > 0) {
            if (z) {
                map.put("popup_uid_list", ORZ.LLD(arrayList, ",", null, null, null, 62));
            } else {
                map.put("uid_list", ORZ.LLD(arrayList, ",", null, null, null, 62));
            }
        }
        if (z2) {
            C76244Tw8 c76244Tw8 = LJII;
            if (c76244Tw8 != null && (mutableLiveData2 = c76244Tw8.LIZ) != null && (value2 = mutableLiveData2.getValue()) != null) {
                valueOf = String.valueOf(value2);
            } else {
                valueOf = String.valueOf(LinkCrossRoomDataHolder.LJLJJI);
            }
        } else {
            C76244Tw8 c76244Tw82 = LJII;
            if (c76244Tw82 != null && (mutableLiveData = c76244Tw82.LIZ) != null && (value = mutableLiveData.getValue()) != null) {
                valueOf = String.valueOf(value);
            } else {
                valueOf = String.valueOf(B5G.LIZIZ().LJFF);
            }
        }
        map.put("channel_id", valueOf);
    }

    public final void LJJIJLIJ(long j, boolean z, List<? extends TeamUsersInfo> list, LinkMicBattleMessage message, boolean z2) {
        kotlin.jvm.internal.o.LJIIIZ(message, "message");
        LIZJ = C30725C4b.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJFF(this, linkedHashMap, true, false, 4);
        linkedHashMap.put("is_multi", "1");
        LJIILIIL(linkedHashMap);
        LJIIIIZZ(linkedHashMap, z, z2);
        linkedHashMap.put("pk_id", String.valueOf(message.battleId));
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        LJI(linkedHashMap, z2);
        linkedHashMap.put("reservation_id", String.valueOf(C75893TqT.LJI));
        LIZ(linkedHashMap);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVED_INVITE || B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVATION_BUBBLE_INVITE) {
            long j2 = C75893TqT.LJI;
            if (j2 != 0) {
                linkedHashMap.put("reservation_id", String.valueOf(j2));
            }
        }
        if (z) {
            LJIILL(list, linkedHashMap);
            linkedHashMap.put("pk_inviter_id", String.valueOf(j));
            linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
            LJJJIL(this, "livesdk_connection_invited_received", linkedHashMap, "1");
            return;
        }
        linkedHashMap.put("right_user_id", String.valueOf(B5G.LIZIZ().LJI));
        linkedHashMap.put("pk_inviter_id", String.valueOf(B5G.LIZIZ().LJI));
        linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        LJJJIL(this, "livesdk_connection_invited_received", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJIJJ(Long l, boolean z, List<? extends TeamUsersInfo> list, long j, boolean z2, String str) {
        Object obj;
        String str2;
        String str3 = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILL(list, linkedHashMap);
        LJFF(this, linkedHashMap, true, false, 4);
        LJIILIIL(linkedHashMap);
        LJIIIIZZ(linkedHashMap, z, z2);
        LIZIZ(linkedHashMap);
        linkedHashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
        linkedHashMap.put("pk_id", String.valueOf(j));
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_quick_recommend", obj);
        LJI(linkedHashMap, z2);
        if (l == null || (str2 = l.toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("pk_inviter_id", str2);
        linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
        linkedHashMap.put("reservation_id", String.valueOf(C75893TqT.LJI));
        LIZ(linkedHashMap);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVED_INVITE || B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVATION_BUBBLE_INVITE) {
            long j2 = C75893TqT.LJI;
            if (j2 != 0) {
                linkedHashMap.put("reservation_id", String.valueOf(j2));
            }
        }
        LIZJ(linkedHashMap);
        if (z) {
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("reason", str3);
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
            LJJJIL(this, "livesdk_connected_popup_show", linkedHashMap, "1");
            return;
        }
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        LJJJIL(this, "livesdk_connected_popup_show", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJJ(boolean z, boolean z2, Long l, List<? extends TeamUsersInfo> list, long j, boolean z3) {
        String str;
        String str2;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (l == null || (str = l.toString()) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("pk_inviter_id", str);
        linkedHashMap.put("pk_invitee_id", String.valueOf(LJIILLIIL()));
        if (z) {
            str2 = "accept";
        } else {
            str2 = "reject";
        }
        linkedHashMap.put("selection", str2);
        linkedHashMap.put("time_stamp", String.valueOf(C30725C4b.LIZ()));
        linkedHashMap.put("show_to_decide_dur", String.valueOf(C30725C4b.LIZ() - LIZJ));
        LJIILIIL(linkedHashMap);
        LIZIZ(linkedHashMap);
        LJFF(this, linkedHashMap, true, false, 4);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        linkedHashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
        LJIIIIZZ(linkedHashMap, z2, z3);
        linkedHashMap.put("pk_id", String.valueOf(j));
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_quick_recommend", obj);
        if (!z2) {
            linkedHashMap.put("right_user_id", String.valueOf(B5G.LIZIZ().LJI));
        }
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        LJI(linkedHashMap, z3);
        linkedHashMap.put("reservation_id", String.valueOf(C75893TqT.LJI));
        LIZ(linkedHashMap);
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVED_INVITE || B5G.LIZIZ().LJIIJ == EnumC75614Tly.RESERVATION_BUBBLE_INVITE) {
            long j2 = C75893TqT.LJI;
            if (j2 != 0) {
                linkedHashMap.put("reservation_id", String.valueOf(j2));
            }
        }
        if (z2) {
            LJIILL(list, linkedHashMap);
            RandomLinkMicManager.LJLIL.getClass();
            if (RandomLinkMicManager.LJLLLLLL) {
                C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
            }
            LJJJIL(this, "livesdk_connection_invited", linkedHashMap, "1");
            return;
        }
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        LJJJIL(this, "livesdk_connection_invited", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
    }

    public final void LJJJ(long j, EnumC76319TxL enumC76319TxL, List list, List list2, boolean z, boolean z2) {
        Object obj;
        LIZIZ = C30725C4b.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILJJIL(list, list2, linkedHashMap);
        linkedHashMap.put("is_multi", "1");
        LJIIJJI(linkedHashMap, enumC76319TxL);
        LJFF(this, linkedHashMap, false, false, 6);
        LJIILIIL(linkedHashMap);
        linkedHashMap.put("connection_type", "manual_pk");
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        linkedHashMap.put("pk_time", String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue()));
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_oncemore", obj);
        linkedHashMap.put("invitee_status", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("pk_inviter_id", String.valueOf(LJIILLIIL()));
        linkedHashMap.put("pk_invitee_id", String.valueOf(j));
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        linkedHashMap.put("time_stamp", String.valueOf(C30725C4b.LIZ()));
        if (String.valueOf(j).equals(B5G.LIZIZ().LJJLIIIJJIZ)) {
            linkedHashMap.put("relation_type", String.valueOf(B5G.LIZIZ().LJJLIIIJJI));
        } else {
            linkedHashMap.put("relation_type", CardStruct.IStatusCode.DEFAULT);
        }
        if (z2) {
            String str = "draw";
            if (z) {
                BattleTeamResult battleTeamResult = C76265TwT.LJ;
                if (battleTeamResult == null || battleTeamResult.result != 2) {
                    str = "not_draw";
                }
                linkedHashMap.put("oncemore_type", str);
            } else {
                BattleResult battleResult = C76265TwT.LIZJ;
                if (battleResult == null || battleResult.result != 2) {
                    str = "not_draw";
                }
                linkedHashMap.put("oncemore_type", str);
            }
        }
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        LJI(linkedHashMap, z2);
        long j2 = C75893TqT.LJI;
        if (j2 != 0) {
            linkedHashMap.put("reservation_id", String.valueOf(j2));
        }
        LIZ(linkedHashMap);
        LJ(linkedHashMap);
        if (z) {
            LJJJIL(this, "livesdk_connection_invite", linkedHashMap, "1");
        } else {
            LJJJIL(this, "livesdk_connection_invite", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }

    public final void LJJI(long j, boolean z, List<C75883TqJ> list, List<C75883TqJ> list2, long j2, long j3, EnumC76319TxL enumC76319TxL, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIILIIL(linkedHashMap);
        LJFF(this, linkedHashMap, false, false, 6);
        LJI(linkedHashMap, z2);
        linkedHashMap.put("pk_invitee_id", String.valueOf(j2));
        linkedHashMap.put("pk_inviter_id", String.valueOf(j3));
        linkedHashMap.put("click_type", "invite");
        linkedHashMap.put("connection_type", "manual_pk");
        C75642TmQ.LJII(C75642TmQ.LIZ, linkedHashMap);
        LJIILJJIL(list, list2, linkedHashMap);
        LJIIJJI(linkedHashMap, enumC76319TxL);
        linkedHashMap.put("is_multi", "1");
        linkedHashMap.put("pk_id", String.valueOf(j));
        LIZJ(linkedHashMap);
        LIZLLL(linkedHashMap);
        LJIIIIZZ(linkedHashMap, z, false);
        C75545Tkr.LIZJ(linkedHashMap, B5G.LIZIZ().LJIIJ, false);
        if (kotlin.jvm.internal.o.LJ(B5G.LIZIZ().LJJJLIIL.getLabel(), "invitee")) {
            linkedHashMap.put("enter_from", "");
        }
        long j4 = C75893TqT.LJI;
        if (j4 != 0) {
            linkedHashMap.put("reservation_id", String.valueOf(j4));
        }
        C75642TmQ.LJIILLIIL(linkedHashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        LIZ(linkedHashMap);
        LJ(linkedHashMap);
        if (z) {
            LJJJIL(this, "livesdk_connection_invite_send_success", linkedHashMap, "1");
        } else {
            LJJJIL(this, "livesdk_connection_invite_send_success", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
    }
}
