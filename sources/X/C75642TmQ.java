package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUserState;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.AgeRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TmQ */
/* loaded from: classes14.dex */
public final class C75642TmQ {
    public static long LIZLLL;
    public static C75975Trn LJFF;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static boolean LJIIZILJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static LinkerInfo LJJ;
    public static final C75642TmQ LIZ = new C75642TmQ();
    public static final java.util.Map<Long, C53734L7a> LIZIZ = new LinkedHashMap();
    public static final java.util.Set<Long> LIZJ = new LinkedHashSet();
    public static String LJ = "";
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C75646TmU.LJLIL);
    public static final ConcurrentHashMap<Long, String> LJIIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Boolean> LJIILIIL = new ConcurrentHashMap<>();
    public static String LJIILJJIL = "";
    public static EnumC75672Tmu LJIJ = EnumC75672Tmu.IDLE;
    public static String LJIJI = "";
    public static String LJIJJ = "";

    public static String LJIJJ() {
        return ((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType();
    }

    public static EnumMap LJIJJLI() {
        return (EnumMap) LJI.getValue();
    }

    public static void LJJIZ() {
        Long l;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        BZI LIZ2 = C28787BRn.LIZ("anchor_connection_setting_click");
        String str = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "anchor_id");
        if (room != null) {
            str = room.getIdStr();
        }
        LIZ2.LJIJJ(str, "room_id");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJJLIIIJ() {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
        }
        LJJLIIJ("livesdk_anchor_live_notification_setting_popoup", hashMap);
    }

    public static void LJJLIIIJLLLLLLLZ() {
        LIZJ.clear();
        LJIIL.clear();
        LJIILIIL.clear();
        ((LinkedHashMap) LIZIZ).clear();
        LJIILLIIL = false;
        LJIJ = EnumC75672Tmu.IDLE;
        LJIJJ = "";
        LJIL = 0L;
        LJJ = null;
    }

    public static void LIZ(java.util.Map map) {
        String label = B5G.LIZIZ().LJJJLIIL.getLabel();
        if (!o.LJ("idle", label)) {
            ((HashMap) map).put("anchor_type", label);
        }
    }

    public static void LIZIZ(java.util.Map map) {
        List<C75883TqJ> LJIL2 = C8E.LIZLLL().LJIL();
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : LJIL2) {
            C75883TqJ c75883TqJ2 = c75883TqJ;
            if (c75883TqJ2.LJFF() && c75883TqJ2.LJJI == EnumC75909Tqj.APPLIED) {
                arrayList.add(c75883TqJ);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((C75883TqJ) it.next()).LIZ));
        }
        ((HashMap) map).put("current_applying_cnts", String.valueOf(arrayList2.size()));
    }

    public static void LIZJ(java.util.Map map) {
        List<C75883TqJ> LJIL2 = C8E.LIZLLL().LJIL();
        int i = 1;
        if (!(LJIL2 instanceof Collection) || !LJIL2.isEmpty()) {
            for (C75883TqJ c75883TqJ : LJIL2) {
                if (c75883TqJ.LJIJJ || c75883TqJ.LJIILL != EnumC75674Tmw.SUPPORT_MULTI) {
                    i = 0;
                    break;
                }
            }
        }
        ((HashMap) map).put("multi_authority", String.valueOf(i));
    }

    public static void LJ(java.util.Map map) {
        IMultiHostService LIZLLL2 = C8E.LIZLLL();
        HashMap hashMap = (HashMap) map;
        hashMap.put("current_connection_cnts", String.valueOf(LIZLLL2.LJIILJJIL().size()));
        hashMap.put("current_position_left", String.valueOf(4 - LIZLLL2.LJIL().size()));
    }

    public static void LJIIIIZZ(java.util.Map map) {
        List<C75883TqJ> LJIL2 = C8E.LIZLLL().LJIL();
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : LJIL2) {
            if (c75883TqJ.LJFF()) {
                arrayList.add(c75883TqJ);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((C75883TqJ) it.next()).LIZ));
        }
        String abstractCollection = arrayList2.toString();
        abstractCollection.toString();
        ((HashMap) map).put("uid_list", abstractCollection);
    }

    public static void LJIIIZ(java.util.Map map) {
        List<C75883TqJ> LJIL2 = C8E.LIZLLL().LJIL();
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : LJIL2) {
            if (c75883TqJ.LJJI == EnumC75909Tqj.INVITED) {
                arrayList.add(c75883TqJ);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((C75883TqJ) it.next()).LIZ));
        }
        ((HashMap) map).put("current_inviting_cnts", String.valueOf(arrayList2.size()));
    }

    public static void LJIIJ(java.util.Map map) {
        String str = B5G.LIZIZ().LJJLIIIIJ;
        String str2 = "1";
        if (str != null && !o.LJ(str, "")) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("is_anchor_icon_show", "1");
            hashMap.put("show_anchor_type", B5G.LIZIZ().LJJLIIIJ);
        } else {
            ((HashMap) map).put("is_anchor_icon_show", CardStruct.IStatusCode.DEFAULT);
        }
        if (!B5G.LIZIZ().LJJLIIIJILLIZJL) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) map).put("is_sound_effect", str2);
    }

    public static void LJIIJJI(java.util.Map map) {
        ((HashMap) map).put("last_request_id", B5G.LIZIZ().LJJJIL);
    }

    public static void LJIILIIL(java.util.Map map) {
        ((HashMap) map).put("old_channel_id", String.valueOf(C8E.LIZLLL().S6()));
    }

    public static void LJIILJJIL(java.util.Map map) {
        ((HashMap) map).put("current_connection_position_left", String.valueOf(4 - C8E.LIZLLL().LJIL().size()));
    }

    public static void LJIJ(java.util.Map map) {
        long j;
        CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
        HashMap hashMap = (HashMap) map;
        hashMap.put("topic_hot", String.valueOf(C75633TmH.LJIIIZ));
        LJIJI(B5G.LIZIZ().LJIIJ.getType(), map);
        if (cohostTopic != null) {
            j = cohostTopic.id;
        } else {
            j = C75633TmH.LJIIIIZZ;
        }
        hashMap.put("topic_id", String.valueOf(j));
    }

    public static void LJJIJIIJI(String str) {
        Long l;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        hashMap.put("click_type", str);
        AnonymousClass172.LIZ("livesdk_connection_list_topic_banner_click", hashMap);
    }

    public static void LJJIJIIJIL(int i) {
        Long l;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        hashMap.put("reason", String.valueOf(i));
        AnonymousClass172.LIZ("livesdk_connection_list_topic_banner_hide", hashMap);
    }

    public static void LJJL(boolean z) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            idStr.toString();
            hashMap.put("room_id", idStr);
        }
        hashMap.put("is_open", String.valueOf(z ? 1 : 0));
        LJJLIIJ("livesdk_anchor_live_notification_open", hashMap);
    }

    public static final void LJJLIIIIJ(String str) {
        HashMap LIZJ2 = C03660Ck.LIZJ("show_reason", str);
        LJII(LIZ, LIZJ2);
        String str2 = B5G.LIZIZ().LJJJIL;
        if (!TextUtils.isEmpty(str2)) {
            LIZJ2.put("request_id", str2);
        }
        LJJLIIJ("livesdk_multi_connection_guide_show", LIZJ2);
    }

    public static void LJJLIIIJILLIZJL(User user) {
        Long l;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        HashMap hashMap = new HashMap();
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        String LJIJJ2 = LJIJJ();
        LJIJJ2.toString();
        hashMap.put("before_connection_status", LJIJJ2);
        if (user != null) {
            l2 = Long.valueOf(user.getId());
        }
        hashMap.put("programming_anchor_id", String.valueOf(l2));
        LJJLIIJ("livesdk_connection_pair_designed_toast_show", hashMap);
    }

    public static void LJI(java.util.Map map, C75648TmW c75648TmW) {
        String str;
        Boolean bool;
        String str2;
        if (c75648TmW != null && TextUtils.equals(c75648TmW.LIZ, "anchor_host_notice")) {
            if (c75648TmW.LIZIZ) {
                str2 = "random_notice";
            } else if (c75648TmW.LIZLLL) {
                str2 = "appointment_guide";
            } else {
                str2 = "normal_notice";
            }
            map.put("notice_type", str2);
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        map.put("is_multi_bubble_guide", CardStruct.IStatusCode.DEFAULT);
        if (c75648TmW != null && (bool = c75648TmW.LIZJ) != null) {
            if (bool.booleanValue()) {
                str3 = "1";
            }
            map.put("is_multi_bubble_guide", str3);
        }
        if (B5G.LIZIZ().LJJJLIIL == EnumC75672Tmu.IDLE || B5G.LIZIZ().LJJJLIIL == EnumC75672Tmu.INVITER) {
            if (c75648TmW == null || (str = c75648TmW.LIZ) == null) {
                str = "";
            }
            map.put("enter_from", str);
        }
    }

    public static /* synthetic */ void LJII(C75642TmQ c75642TmQ, java.util.Map map) {
        C75648TmW c75648TmW = B5G.LIZIZ().LJJJ;
        c75642TmQ.getClass();
        LJI(map, c75648TmW);
    }

    public static void LJIIL(List list, java.util.Map map) {
        if (list == null) {
            list = C8E.LIZLLL().LJIILJJIL();
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((C75883TqJ) it.next()).LIZ));
        }
        if (arrayList.size() <= 1) {
            HashMap hashMap = (HashMap) map;
            hashMap.put("current_connection_cnts", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("uid_list", C61878OQg.INSTANCE.toString());
        } else {
            HashMap hashMap2 = (HashMap) map;
            hashMap2.put("current_connection_cnts", String.valueOf(arrayList.size()));
            hashMap2.put("uid_list", arrayList.toString());
        }
    }

    public static void LJIILL(EnumC75614Tly inviteType, java.util.Map map) {
        o.LJIIIZ(inviteType, "inviteType");
        map.put("event_type", String.valueOf(B5G.LIZIZ().LJIIJ.getType()));
        int i = 1;
        if (!TextUtils.isEmpty(B5G.LIZIZ().LJJIIZ.rankType)) {
            String str = B5G.LIZIZ().LJJIIZ.rankType;
            o.LJIIIIZZ(str, "inst().topHostInfo.rankType");
            map.put("rank_type", str);
        } else if (inviteType.getType() >= EnumC75614Tly.WEEKLY_RANK_INVITE.getType() && inviteType.getType() <= EnumC75614Tly.DAILY_ROOKIE_RANK.getType()) {
            switch (C75613Tlx.LIZ[inviteType.ordinal()]) {
                case 3:
                    map.put("rank_type", CM9.WEEKLY_RANK.getRankName());
                    break;
                case 4:
                    map.put("rank_type", CM9.HOURLY_RANK.getRankName());
                    break;
                case 5:
                    map.put("rank_type", CM9.WEEKLY_ROOKIE_RANK.getRankName());
                    break;
                case 6:
                    map.put("rank_type", CM9.DAILY_RANK.getRankName());
                    break;
                case 7:
                    map.put("rank_type", CM9.DAILY_RANK_HALL_OF_FAME.getRankName());
                    break;
                case 8:
                    map.put("rank_type", RankTypeV2.LJIIIIZZ.rankName);
                    break;
                case 9:
                    map.put("rank_type", RankTypeV2.LJIIIZ.rankName);
                    break;
                case 10:
                    map.put("rank_type", RankTypeV2.LJIIJ.rankName);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    map.put("rank_type", RankTypeV2.LJIIJJI.rankName);
                    break;
                default:
                    map.put("rank_type", "not_in_rank");
                    break;
            }
        } else {
            map.put("rank_type", "not_in_rank");
        }
        if (B5G.LIZIZ().LJJIIZ.topIndex <= 0) {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        o.LJIIIIZZ(valueOf, "inst().topHostInfo.rankingOppositeAnchorValue");
        map.put("is_ranking_opposite_anchor", valueOf);
    }

    public static void LJIIZILJ(C75642TmQ c75642TmQ, java.util.Map map) {
        String str;
        C75755ToF c75755ToF = B5G.LIZIZ().LJJJI;
        c75642TmQ.getClass();
        if (c75755ToF == null || (str = c75755ToF.LIZ) == null) {
            str = "";
        }
        ((HashMap) map).put("cohost_invite_request_from", str);
    }

    public static void LJIJI(int i, java.util.Map map) {
        String str;
        if (o.LJ(LJIJI, "topic")) {
            str = String.valueOf(C75633TmH.LJIIL);
        } else if (i != 13) {
            if (i != 14) {
                str = "-1";
            } else {
                str = "1";
            }
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) map).put("is_topic_recommend", str);
    }

    public static void LJJ(String str, boolean z) {
        Long l;
        String str2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        HashMap hashMap = new HashMap();
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        hashMap.put("room_id", String.valueOf(l2));
        hashMap.put("click_page", str);
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        hashMap.put("user_type", str2);
        hashMap.put("user_id", String.valueOf(C44432HcC.LJI()));
        LJJLIIJ("livesdk_connection_activity_entrance_click", hashMap);
    }

    public static void LJJI(String str, boolean z) {
        String str2;
        Long l;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        BZI LIZ2 = C28787BRn.LIZ("anchor_connection_open");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str2, "is_open");
        LIZ2.LJIJJ("settings", "enter_from");
        String str3 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "anchor_id");
        if (room != null) {
            str3 = room.getIdStr();
        }
        C06490Nh.LIZLLL(LIZ2, str3, "room_id", str, "click_type");
    }

    public static void LJJIFFI(String str, boolean z) {
        String str2;
        Long l;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        BZI LIZ2 = C28787BRn.LIZ("anchor_connection_recommend_open");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str2, "is_open");
        LIZ2.LJIJJ("settings", "enter_from");
        String str3 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "anchor_id");
        if (room != null) {
            str3 = room.getIdStr();
        }
        C06490Nh.LIZLLL(LIZ2, str3, "room_id", str, "click_type");
    }

    public static void LJJJJI(long j, Room room) {
        long j2;
        Long l;
        long j3 = 0;
        if (C75585TlV.LIZ <= 0 || C75633TmH.LJIIJJI || C75633TmH.LJIIJ || C75633TmH.LIZ.isEmpty() || C75633TmH.LIZ.size() > 1) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator it = ((LinkedHashMap) C75633TmH.LIZ).entrySet().iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 = ((Number) ((Map.Entry) it.next()).getKey()).longValue();
        }
        if (room == null) {
            room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        }
        hashMap.put("watch_connection_duration", String.valueOf(j));
        hashMap.put("current_connection_cnts", String.valueOf(C8E.LIZLLL().LJIILJJIL().size()));
        hashMap.put("channel_id", String.valueOf(j4));
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        hashMap.put("anchor_id", String.valueOf(j2));
        if (room != null) {
            j3 = room.getId();
        }
        hashMap.put("room_id", String.valueOf(j3));
        CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(Long.valueOf(j4));
        if (cohostTopic != null) {
            l = Long.valueOf(cohostTopic.id);
        } else {
            l = null;
        }
        hashMap.put("topic_id", String.valueOf(l));
        AnonymousClass172.LIZ("livesdk_connection_topic_watch_duration", hashMap);
    }

    public static final void LJJJJIZL(long j, boolean z) {
        Object obj;
        C32039Chn c32039Chn = new C32039Chn();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && !z) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_connection_transform");
            LIZ2.LJIIJJI("live_detail");
            LIZ2.LJIIIZ("live");
            LIZ2.LJIIL("other");
            BZJ bzj = LIZ2.LIZ;
            if (bzj != null) {
                bzj.LIZLLL(c32039Chn);
            }
            LIZ2.LJIIZILJ();
            HashMap hashMap = new HashMap();
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            LJIIL(null, hashMap);
            LJIILIIL(hashMap);
            hashMap.put("is_two_apply_two", String.valueOf(C8E.LIZLLL().q3() ? 1 : 0));
            LIZ2.LJIJJ(Long.valueOf(room.getOwnerUserId()), "anchor_id");
            if (B5G.LIZIZ().LJFF != 0) {
                LIZ2.LJIJJ(String.valueOf(B5G.LIZIZ().LJFF), "channel_id");
            } else if (j != 0) {
                LIZ2.LJIJJ(String.valueOf(j), "channel_id");
            }
            LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
            List<C75883TqJ> LJIILJJIL2 = C8E.LIZLLL().LJIILJJIL();
            ArrayList arrayList = new ArrayList();
            for (C75883TqJ c75883TqJ : LJIILJJIL2) {
                if (c75883TqJ.LIZ != room.getOwnerUserId()) {
                    arrayList.add(c75883TqJ);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((C75883TqJ) it.next()).LIZ));
            }
            hashMap.put("connection_type", "anchor");
            LIZ2.LJIJJ(arrayList2.toString(), "opposite_anchor_id");
            if (LJIILJJIL2.size() > 2) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.LJIJJ(obj, "is_multi");
            LIZ2.LJJIFFI(hashMap);
            if (((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk()) {
                LIZ2.LJIJJ("1", "is_lineup_status");
            } else {
                LIZ2.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_lineup_status");
            }
            LIZ2.LJIJJ(C1H.LJ(), "overload_score");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJJIIJZLJL();
                return;
            }
            LIZ2.LJJIJ();
            LIZ2.LJJIIZ();
            LIZ2.LJJIIZI();
        }
    }

    public static void LJJJJJ(int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", String.valueOf(i));
        hashMap.put("waiting_time", String.valueOf(j));
        AnonymousClass172.LIZ("livesdk_connection_wating_page_show", hashMap);
    }

    public static void LJJJJJL(String withdrawType, String withDrawUid) {
        Long l;
        LinkerInfo linkerInfo;
        List<UserInfo> list;
        o.LJIIIZ(withdrawType, "withdrawType");
        o.LJIIIZ(withDrawUid, "withDrawUid");
        HashMap hashMap = new HashMap();
        hashMap.put("withdraw_type", withdrawType);
        hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        if (TextUtils.isEmpty(withDrawUid)) {
            if (o.LJ(withdrawType, EnumC75769ToT.APPLY_INVITE.getLabel()) || o.LJ(withdrawType, EnumC75769ToT.APPLY_PAIR.getLabel())) {
                Room room = B5G.LIZIZ().LJJIIJ;
                if (room != null) {
                    l = Long.valueOf(room.getOwnerUserId());
                } else {
                    l = null;
                }
                List LJJIJIL = C47261Igj.LJJIJIL(l);
                RivalExtraInfo rivalExtraInfo = B5G.LIZIZ().LJJIIJZLJL;
                if (rivalExtraInfo != null && (linkerInfo = rivalExtraInfo.linkerInfo) != null && (list = linkerInfo.linkedUsers) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (UserInfo userInfo : list) {
                        long j = userInfo.user_id;
                        if (l == null || j != l.longValue()) {
                            arrayList.add(userInfo);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        LJJIJIL.add(Long.valueOf(((UserInfo) it.next()).user_id));
                    }
                }
                hashMap.put("uid_list", LJJIJIL.toString());
            } else {
                LJIIIIZZ(hashMap);
            }
        } else {
            hashMap.put("uid_list", C47261Igj.LJJIJ(withDrawUid).toString());
        }
        C75545Tkr.LIZJ(hashMap, B5G.LIZIZ().LJIIJ, true);
        LJJLIIJ("livesdk_connection_withdraw", hashMap);
    }

    public static void LJJLI(int i, String str) {
        Long l;
        String str2;
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        hashMap.put("room_id", String.valueOf(l));
        hashMap.put("anchor_id", String.valueOf(C44432HcC.LJFF()));
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService == null || (str2 = iInteractService.getConnectionType()) == null) {
            str2 = "";
        }
        hashMap.put("connection_type", str2);
        if (o.LJ(str2, "manual_pk")) {
            IInteractService iInteractService2 = (IInteractService) CN1.LIZ(IInteractService.class);
            if (iInteractService2 != null) {
                l2 = Long.valueOf(iInteractService2.eq());
            }
            hashMap.put("pk_id", String.valueOf(l2));
        } else if (o.LJ(str2, "anchor")) {
            IInteractService iInteractService3 = (IInteractService) CN1.LIZ(IInteractService.class);
            if (iInteractService3 != null) {
                l2 = Long.valueOf(iInteractService3.LJJLI());
            }
            hashMap.put("channel_id", String.valueOf(l2));
        }
        hashMap.put("action_type", str);
        if (!o.LJ(str, "left")) {
            hashMap.put("pause_duration", String.valueOf(i));
        }
        AnonymousClass172.LIZ("livesdk_live_pause", hashMap);
    }

    public static final void LJJLIIJ(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        LIZ2.LJJIIJZLJL();
    }

    public final void LJJII(long j, String str) {
        ArrayList arrayList;
        HashMap LIZ2 = C45243HpH.LIZ("connection_type", "anchor", "turnover_type", str);
        if (B5G.LIZIZ().LJFF != 0) {
            LIZ2.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        }
        int i = 1;
        if (TextUtils.equals(str, "create")) {
            List<C75883TqJ> LJIL2 = C8E.LIZLLL().LJIL();
            arrayList = new ArrayList();
            for (C75883TqJ c75883TqJ : LJIL2) {
                if (!c75883TqJ.LIZJ()) {
                    arrayList.add(c75883TqJ);
                }
            }
        } else if (TextUtils.equals(str, "left") && ((ArrayList) B5G.LIZIZ().LJJJZ).size() > 0) {
            arrayList = new ArrayList();
            List<Object> list = B5G.LIZIZ().LJJJZ;
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.Collection<com.bytedance.android.live.liveinteract.multihost.biz.model.MultiCoHostUser>");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((C75883TqJ) next).LIZJ()) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
            ((ArrayList) B5G.LIZIZ().LJJJZ).clear();
        } else {
            List<C75883TqJ> LJIL3 = C8E.LIZLLL().LJIL();
            arrayList = new ArrayList();
            for (C75883TqJ c75883TqJ2 : LJIL3) {
                C75883TqJ c75883TqJ3 = c75883TqJ2;
                if (c75883TqJ3.LJJI == EnumC75909Tqj.LINKED && (!TextUtils.equals(str, "left") || c75883TqJ3.LIZ != j)) {
                    arrayList.add(c75883TqJ2);
                }
            }
        }
        LJIIL(arrayList, LIZ2);
        if (TextUtils.equals(str, "create")) {
            LIZ2.put("current_connection_cnts", String.valueOf(arrayList.size()));
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((C75883TqJ) it2.next()).LIZ));
            }
            LIZ2.put("uid_list", arrayList3.toString());
        }
        LJIIZILJ(this, LIZ2);
        LJIJ(LIZ2);
        C75545Tkr.LIZJ(LIZ2, B5G.LIZIZ().LJIIJ, true);
        LJIILLIIL(LIZ2, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((C75883TqJ) it3.next()).LJIJI != 2) {
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (((C75883TqJ) it4.next()).LJIJI == 2) {
                                i = 2;
                                break;
                            }
                        }
                    }
                    i = 0;
                }
            }
        }
        LIZ2.put("follow_status", String.valueOf(i));
        LIZ2.put("turnover_anchor_id", String.valueOf(j));
        LJJLIIJ("livesdk_connection_anchor_turnover", LIZ2);
    }

    public final void LJJJJ(Room room, List<LinkUser> linkedUsers) {
        o.LJIIIZ(linkedUsers, "linkedUsers");
        List list = (List) LJIJJLI().get(LinkUserState.LINKED);
        if (list == null) {
            list = new ArrayList();
        }
        if (list.size() >= linkedUsers.size()) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (B5G.LIZIZ().LJJLIIJ == 0 && B5G.LIZIZ().LJJLIIJ == 0) {
            return;
        }
        hashMap.put("connection_inviter_id", String.valueOf(B5G.LIZIZ().LJJLIIIJLLLLLLLZ));
        hashMap.put("connection_invitee_id", String.valueOf(B5G.LIZIZ().LJJLIIJ));
        LJJJIL("livesdk_connection_success_rec", room, hashMap);
    }

    public final void LJJJJL(String str, boolean z) {
        String str2;
        HashMap hashMap = new HashMap();
        LJIIL(null, hashMap);
        LJIILJJIL(hashMap);
        if (B5G.LIZIZ().LJFF != 0) {
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_dont_suggest_again_show", str2);
        hashMap.put("selection", str);
        hashMap.put("anchor_id", String.valueOf(C44432HcC.LJI()));
        LIZ(hashMap);
        LJIIZILJ(this, hashMap);
        LJIJ(hashMap);
        C75545Tkr.LIZJ(hashMap, B5G.LIZIZ().LJIIJ, true);
        LJIILLIIL(hashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        LJJLIIJ("livesdk_disconnect_connection_popup_click", hashMap);
    }

    public final void LJJLIIIJJI(String clickTime, boolean z) {
        String str;
        o.LJIIIZ(clickTime, "clickTime");
        HashMap hashMap = new HashMap();
        hashMap.put("invitee_list", "random_match");
        hashMap.put("connection_type", "anchor");
        hashMap.put("invitee_id", CardStruct.IStatusCode.DEFAULT);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_clickable", str);
        hashMap.put("click_time", clickTime);
        hashMap.put("connection_inviter_id", String.valueOf(C44432HcC.LJI()));
        hashMap.put("connection_invitee_id", CardStruct.IStatusCode.DEFAULT);
        LJII(this, hashMap);
        LJJLIIJ("livesdk_connection_invite_show", hashMap);
    }

    public static void LJFF(String str, String str2, java.util.Map map) {
        Long l;
        LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
        HashMap hashMap = (HashMap) map;
        hashMap.put("dismiss_reason", str2);
        long j = LIZIZ2.LJFF;
        if (j != 0) {
            hashMap.put("channel_id", String.valueOf(j));
        } else if (C29306Beo.LJIJJLI(str)) {
            hashMap.put("channel_id", String.valueOf(str));
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        hashMap.put("room_id", String.valueOf(l2));
    }

    public static String LJIL(Room room, RivalExtraInfo rivalExtraInfo, EnumC75614Tly enumC75614Tly) {
        TagV2 tagV2;
        Integer valueOf;
        User owner;
        if (enumC75614Tly == EnumC75614Tly.FOLLOW_INVITE || (room != null && (owner = room.getOwner()) != null && C44432HcC.LJIJ(owner))) {
            return "mutual_follow";
        }
        if (rivalExtraInfo != null && (tagV2 = rivalExtraInfo.tagV2) != null && (valueOf = Integer.valueOf(tagV2.tagClassification)) != null) {
            if (valueOf.intValue() == 3) {
                return "second_relation";
            }
            if (valueOf.intValue() == 2) {
                return "first_relation";
            }
            if (valueOf.intValue() == 1) {
                return "";
            }
        }
        return "stranger";
    }

    public static void LJJIJIL(int i, long j, long j2) {
        if (C8E.LIZLLL().LJIILJJIL().isEmpty() || C75633TmH.LJIIJJI || C75633TmH.LJIIJ) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("topic_hot", String.valueOf(j));
        hashMap.put("topic_achor_cnt", String.valueOf(j2));
        C7MY.LJFF(System.currentTimeMillis(), C75633TmH.LIZLLL, hashMap, "topic_duration");
        hashMap.put("topic_hot_single_score", String.valueOf(C75633TmH.LJFF));
        hashMap.put("reason", String.valueOf(i));
        AnonymousClass172.LIZ("livesdk_connection_management_topic_quit", hashMap);
    }

    public static void LJJIJL(int i, long j, long j2) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            idStr.toString();
            hashMap.put("room_id", idStr);
        }
        String LIZ2 = C30443Bx9.LIZ();
        o.LJIIIIZZ(LIZ2, "getSdkVersion()");
        hashMap.put("sdk_version", LIZ2);
        hashMap.put("connection_inviter_id", String.valueOf(j));
        hashMap.put("connection_invitee_id", String.valueOf(j2));
        hashMap.put("reject_reason", String.valueOf(i));
        LJJLIIJ("livesdk_connection_reject_toast_show", hashMap);
    }

    public static final void LJJJLZIJ(String str, C75648TmW c75648TmW, ReserveInfo reserveInfo) {
        Long l;
        String str2;
        System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", "room");
        hashMap.put("click_reason", str);
        LJI(hashMap, c75648TmW);
        LIZ(hashMap);
        LJIIJ(hashMap);
        if (B5G.LIZIZ().LIZJ) {
            hashMap.put("live_icon_show_time", "during_connection");
            LJ(hashMap);
        } else {
            hashMap.put("live_icon_show_time", "single_live");
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        hashMap.put("room_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        hashMap.put("anchor_id", String.valueOf(l2));
        String str3 = B5G.LIZIZ().LJJLIIIIJ;
        String str4 = B5G.LIZIZ().LJJLI;
        if (str3 == null || str3.length() == 0) {
            hashMap.put("log_id", "");
        } else {
            hashMap.put("to_anchor_id", str3);
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put("log_id", str4);
        }
        if (B5G.LIZIZ().LJFF != 0) {
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        }
        hashMap.put("click_time", C44432HcC.LJIIIIZZ().getType());
        hashMap.put("reservation_anchor_cnts", String.valueOf(C75893TqT.LJIIJ));
        String str5 = CardStruct.IStatusCode.DEFAULT;
        if (reserveInfo == null || (str2 = Long.valueOf(reserveInfo.acceptAppointmentCnts).toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("current_accept_appointment_cnts", str2);
        if (C75893TqT.LJIIIZ) {
            str5 = "1";
        }
        hashMap.put("is_reservation_sender", str5);
        LJJLIIJ("livesdk_connection_icon_click", hashMap);
        if (room != null) {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).upLoadLiveEcoEvent(room.getId(), 3);
        }
    }

    public static /* synthetic */ void LJJJZ(String str, C75648TmW c75648TmW, int i) {
        if ((i & 2) != 0) {
            c75648TmW = B5G.LIZIZ().LJJJ;
        }
        LJJJLZIJ(str, c75648TmW, null);
    }

    public static void LJJLIIIJL(long j, String str, String str2) {
        Long l;
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(C44432HcC.LJFF()));
        hashMap.put("connection_inviter_id", String.valueOf(C44432HcC.LJFF()));
        hashMap.put("connection_invitee_id", String.valueOf(j));
        hashMap.put("show_type", str);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        hashMap.put("room_id", String.valueOf(l));
        hashMap.put("anchor_id", String.valueOf(C44432HcC.LJFF()));
        hashMap.put("status", str2);
        AnonymousClass172.LIZ("livesdk_reservation_guide_pop_show", hashMap);
    }

    public static void LJJLIIIJLJLI(EnumC46483IMd hotscoreType, String str, long j) {
        Long l;
        String str2;
        o.LJIIIZ(hotscoreType, "hotscoreType");
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        hashMap.put("room_id", String.valueOf(l));
        hashMap.put("user_id", String.valueOf(C44432HcC.LJI()));
        hashMap.put("topic_id", str);
        if (hotscoreType == EnumC46483IMd.UPDATE_SOURCE_DIFF) {
            str2 = "like";
        } else {
            str2 = "gift";
        }
        AnonymousClass391.LJFF(hashMap, "hotscores_type", str2, j, "hotscoes");
        AnonymousClass172.LIZ("livesdk_topic_hotscores_detail", hashMap);
    }

    public final void LJJIII(List<LinkUser> linkedUsers, List<LinkUser> applicants, List<LinkUser> invitees) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        o.LJIIIZ(linkedUsers, "linkedUsers");
        o.LJIIIZ(applicants, "applicants");
        o.LJIIIZ(invitees, "invitees");
        List list = (List) LJIJJLI().get(LinkUserState.LINKED);
        if (list == null) {
            list = new ArrayList();
        }
        List list2 = (List) LJIJJLI().get(LinkUserState.APPLICANT);
        if (list2 == null) {
            list2 = new ArrayList();
        }
        List list3 = (List) LJIJJLI().get(LinkUserState.INVITEE);
        if (list3 == null) {
            list3 = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(linkedUsers, 10));
        Iterator<LinkUser> it = linkedUsers.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getUserId());
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LinkUser) it2.next()).getUserId());
        }
        List LLJILJILJ2 = ORZ.LLJILJILJ(arrayList2);
        ArrayList arrayList3 = (ArrayList) LLJILJILJ;
        if (arrayList3.size() <= 1 || !arrayList3.contains(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()))) {
            return;
        }
        if (arrayList3.size() <= 1 || !arrayList3.contains(Long.valueOf(C44432HcC.LJI())) || !((ArrayList) LLJILJILJ2).isEmpty() || arrayList3.size() != 2 || B5G.LIZIZ().LJJJLIIL != EnumC75672Tmu.INVITER) {
            if (arrayList3.size() > 1 && arrayList3.contains(Long.valueOf(C44432HcC.LJI()))) {
                ArrayList arrayList4 = (ArrayList) LLJILJILJ2;
                if (arrayList4.isEmpty() && arrayList3.size() == 2 && B5G.LIZIZ().LJJLIIJ == C44432HcC.LJI()) {
                    LJJII(C44432HcC.LJI(), "enter");
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        Long l = (Long) next;
                        long LJI2 = C44432HcC.LJI();
                        if (l == null || l.longValue() != LJI2) {
                            arrayList5.add(next);
                        }
                    }
                    Long l2 = (Long) ORZ.LJLLLLLL(0, arrayList5);
                    if (l2 != null) {
                        C75724Tnk.LIZIZ(l2.longValue());
                    }
                } else if (arrayList3.size() == arrayList4.size() + 1) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        if (!arrayList4.contains(next2)) {
                            arrayList6.add(next2);
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        Long l3 = (Long) ListProtector.get(arrayList6, 0);
                        if (l3 != null) {
                            j2 = l3.longValue();
                        } else {
                            j2 = 0;
                        }
                        LJJII(j2, "enter");
                        C75724Tnk.LIZIZ(j2);
                    }
                } else if (arrayList3.size() > arrayList4.size()) {
                    LJJII(C44432HcC.LJI(), "enter");
                }
            }
            ArrayList arrayList7 = (ArrayList) LLJILJILJ2;
            if (arrayList7.size() > 1 && arrayList3.size() > 1 && arrayList3.size() < arrayList7.size()) {
                ArrayList arrayList8 = new ArrayList();
                Iterator it5 = arrayList7.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    if (!arrayList3.contains(next3)) {
                        arrayList8.add(next3);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    Long l4 = (Long) ListProtector.get(arrayList8, 0);
                    if (l4 != null) {
                        j = l4.longValue();
                    } else {
                        j = 0;
                    }
                    LJJII(j, "left");
                }
            }
        } else {
            LJJII(C44432HcC.LJI(), "create");
            ArrayList arrayList9 = new ArrayList();
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                Object next4 = it6.next();
                Long l5 = (Long) next4;
                long LJI3 = C44432HcC.LJI();
                if (l5 == null || l5.longValue() != LJI3) {
                    arrayList9.add(next4);
                }
            }
            Long l6 = (Long) ORZ.LJLLLLLL(0, arrayList9);
            if (l6 != null) {
                long longValue = l6.longValue();
                LIZ.LJJII(longValue, "enter");
                C75724Tnk.LIZIZ(longValue);
            }
        }
        List list4 = (List) LJIJJLI().get(LinkUserState.LINKED);
        if (list4 == null) {
            list4 = new ArrayList();
        }
        if (LJIJJLI().get(LinkUserState.APPLICANT) == null) {
            new ArrayList();
        }
        if (LJIJJLI().get(LinkUserState.INVITEE) == null) {
            new ArrayList();
        }
        ArrayList arrayList10 = new ArrayList(C32I.LJJL(list4, 10));
        Iterator it7 = list4.iterator();
        while (it7.hasNext()) {
            arrayList10.add(((LinkUser) it7.next()).getUserId());
        }
        List LLJILJILJ3 = ORZ.LLJILJILJ(arrayList10);
        ArrayList arrayList11 = new ArrayList(C32I.LJJL(linkedUsers, 10));
        Iterator<LinkUser> it8 = linkedUsers.iterator();
        while (it8.hasNext()) {
            arrayList11.add(it8.next().getUserId());
        }
        ArrayList arrayList12 = (ArrayList) ORZ.LLJILJILJ(arrayList11);
        if (arrayList12.size() > 1 && arrayList12.contains(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()))) {
            if (arrayList12.size() <= 1 || !arrayList12.contains(Long.valueOf(C44432HcC.LJI()))) {
                C0NB.LJIIIZ("CoHostAppLog", "logConnectionAnchorTurnOverForApply, return =======");
            } else {
                ArrayList arrayList13 = (ArrayList) LLJILJILJ3;
                if (arrayList13.isEmpty() && arrayList12.size() >= 2 && B5G.LIZIZ().LJJJLL == EnumC75672Tmu.APPLY) {
                    C75883TqJ LJI4 = C8E.LIZLLL().LJI(C44432HcC.LJI());
                    if (LJI4 != null) {
                        j5 = LJI4.LIZLLL;
                    } else {
                        j5 = 0;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("logConnectionAnchorTurnOverForApply, APPLY, rivalUserId=");
                    LIZ2.append(j5);
                    C0NB.LJIIIZ("CoHostAppLog", X1D.LIZIZ(LIZ2));
                    C75724Tnk.LIZ(j5);
                } else if (arrayList13.size() >= 2 && arrayList12.size() > arrayList13.size() && B5G.LIZIZ().LJJJLL == EnumC75672Tmu.HANDLER) {
                    C75883TqJ LJI5 = C8E.LIZLLL().LJI(C44432HcC.LJI());
                    if (LJI5 != null) {
                        j4 = LJI5.LIZLLL;
                    } else {
                        j4 = 0;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("logConnectionAnchorTurnOverForApply, HANDLER, rivalUserId=");
                    LIZ3.append(j4);
                    C0NB.LJIIIZ("CoHostAppLog", X1D.LIZIZ(LIZ3));
                    C75724Tnk.LIZ(j4);
                } else if (arrayList13.size() == 2 && arrayList12.size() == 4 && B5G.LIZIZ().LJJJLL == EnumC75672Tmu.APPLY) {
                    C75883TqJ LJI6 = C8E.LIZLLL().LJI(C44432HcC.LJI());
                    if (LJI6 != null) {
                        j3 = LJI6.LIZLLL;
                    } else {
                        j3 = 0;
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("logConnectionAnchorTurnOverForApply, 2+2 APPLY, rivalUserId=");
                    LIZ4.append(j3);
                    C0NB.LJIIIZ("CoHostAppLog", X1D.LIZIZ(LIZ4));
                    C75724Tnk.LIZ(j3);
                }
            }
        }
        list.clear();
        list2.clear();
        list3.clear();
        list.addAll(linkedUsers);
        list2.addAll(applicants);
        list3.addAll(invitees);
        LJIJJLI().put((EnumMap) LinkUserState.LINKED, (LinkUserState) list);
        LJIJJLI().put((EnumMap) LinkUserState.APPLICANT, (LinkUserState) list2);
        LJIJJLI().put((EnumMap) LinkUserState.INVITEE, (LinkUserState) list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(com.bytedance.android.livesdkapi.depend.model.live.Room r17, java.util.List r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75642TmQ.LJJJI(com.bytedance.android.livesdkapi.depend.model.live.Room, java.util.List, boolean):void");
    }

    public final void LJJJIL(String str, Room room, java.util.Map<String, String> map) {
        C75883TqJ c75883TqJ;
        String str2;
        boolean z;
        int i;
        boolean z2;
        Object obj;
        boolean z3;
        AgeRestricted ageRestricted;
        AgeRestricted ageRestricted2;
        LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
        HashMap hashMap = (HashMap) map;
        hashMap.put("before_connection_status", "anchor");
        hashMap.put("invited_room_id", String.valueOf(LIZIZ2.LJIIIIZZ));
        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        hashMap.put("overload_score", C1H.LJ());
        Iterator<C75883TqJ> it = C8E.LIZLLL().LJIL().iterator();
        while (true) {
            if (it.hasNext()) {
                c75883TqJ = it.next();
                C75883TqJ c75883TqJ2 = c75883TqJ;
                if (!c75883TqJ2.LIZJ() && c75883TqJ2.LJFF() && c75883TqJ2.LJJI == EnumC75909Tqj.LINKED) {
                    break;
                }
            } else {
                c75883TqJ = null;
                break;
            }
        }
        C75883TqJ c75883TqJ3 = c75883TqJ;
        if (!o.LJ(B5G.LIZIZ().LJJJLIIL.getLabel(), "idle") && !o.LJ(B5G.LIZIZ().LJJJLIIL.getLabel(), "invitee") && !TextUtils.isEmpty(B5G.LIZIZ().LJJJIL)) {
            hashMap.put("request_id", B5G.LIZIZ().LJJJIL);
        }
        if (c75883TqJ3 == null || (str2 = c75883TqJ3.LJIJJLI) == null) {
            str2 = B5G.LIZIZ().LJJJIL;
        }
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("request_id", str2);
        if (TextUtils.isEmpty(LJIJJ)) {
            String str4 = (String) hashMap.get("request_id");
            if (str4 == null) {
                str4 = "";
            }
            LJIJJ = str4;
        }
        EnumC75672Tmu enumC75672Tmu = LIZIZ2.LJJJLIIL;
        EnumC75614Tly enumC75614Tly = B5G.LIZIZ().LJIIJ;
        EnumC75672Tmu enumC75672Tmu2 = EnumC75672Tmu.INVITEE;
        if (enumC75672Tmu != enumC75672Tmu2) {
            z = true;
        } else {
            z = false;
        }
        C75545Tkr.LIZJ(map, enumC75614Tly, z);
        if (ujb.o.LJJJJIZL((String) hashMap.get("invitee_list"), "random_match", false) || ujb.o.LJJJJIZL((String) hashMap.get("invitee_list"), "topic", false)) {
            LJIILLIIL = true;
            String str5 = (String) hashMap.get("invitee_list");
            if (str5 == null) {
                str5 = "";
            }
            LJIJI = str5;
            if (B5G.LIZIZ().LJIIJ.getType() == 13) {
                i = 0;
            } else if (B5G.LIZIZ().LJIIJ.getType() == 14) {
                i = 1;
            } else {
                i = -1;
            }
            C75633TmH.LJIIL = i;
        }
        ConcurrentHashMap<Long, String> concurrentHashMap = LJIIL;
        if (concurrentHashMap.containsKey(Long.valueOf(B5G.LIZIZ().LJJLIIJ)) && !LJIILLIIL && enumC75672Tmu != enumC75672Tmu2) {
            LJIILLIIL = true;
            LJIILL = o.LJ(LJIILIIL.get(Long.valueOf(B5G.LIZIZ().LJJLIIJ)), Boolean.TRUE);
            LJIILJJIL = String.valueOf(concurrentHashMap.get(Long.valueOf(B5G.LIZIZ().LJJLIIJ)));
            LJIJ = B5G.LIZIZ().LJJJLL;
            String str6 = (String) hashMap.get("invitee_list");
            if (str6 != null) {
                str3 = str6;
            }
            LJIJI = str3;
        } else if (enumC75672Tmu == enumC75672Tmu2 && !LJIILLIIL) {
            LJIILLIIL = true;
            LJIJ = B5G.LIZIZ().LJJJLL;
            String str7 = (String) hashMap.get("invitee_list");
            if (str7 != null) {
                str3 = str7;
            }
            LJIJI = str3;
        }
        if (enumC75614Tly == EnumC75614Tly.RANDOM_LINK_MIC_INVITE || enumC75614Tly == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            hashMap.put("random_match_waiting_time", String.valueOf(RandomLinkMicManager.LJLJJI * 1000));
        }
        if ((enumC75614Tly == EnumC75614Tly.FOLLOW_INVITE || enumC75614Tly == EnumC75614Tly.RECOMMEND_INVITE) && enumC75672Tmu != enumC75672Tmu2 && LIZLLL > 0) {
            C7MY.LJFF(System.currentTimeMillis(), LIZLLL, hashMap, "invite_to_success_dur");
        }
        if (B5G.LIZIZ().LIZJ) {
            hashMap.put("live_icon_show_time", "during_connection");
        } else {
            hashMap.put("live_icon_show_time", "single_live");
        }
        LJ(map);
        LJIIJ(map);
        if (B5G.LIZIZ().LJJLIIIIJ != null && o.LJ(B5G.LIZIZ().LJJLIIIIJ, String.valueOf(B5G.LIZIZ().LJI))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_icon_show_anchor", obj);
        if (EnumC75672Tmu.INVITER == B5G.LIZIZ().LJJJLIIL) {
            hashMap.put("is_multi_bubble_guide", CardStruct.IStatusCode.DEFAULT);
        }
        LJII(this, map);
        LIZJ(map);
        LIZ(map);
        List<C75883TqJ> LJIILJJIL2 = C8E.LIZLLL().LJIILJJIL();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJIILJJIL2, 10));
        Iterator<C75883TqJ> it2 = LJIILJJIL2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LIZ));
        }
        hashMap.put("current_connection_cnts", String.valueOf(arrayList.size()));
        hashMap.put("uid_list", arrayList.toString());
        long j = LIZIZ2.LJFF;
        if (j != 0) {
            hashMap.put("channel_id", String.valueOf(j));
        }
        LJIILIIL(map);
        hashMap.put("relation_type", String.valueOf(LIZIZ2.LJJLIIIJJI));
        LJIILL(enumC75614Tly, map);
        LJIIZILJ(this, map);
        LJIIJJI(map);
        C75545Tkr.LJFF(map);
        if (room != null && (ageRestricted2 = room.ageRestricted) != null && ageRestricted2.ageInterval == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            hashMap.put("is_invitee_mature", CardStruct.IStatusCode.DEFAULT);
            hashMap.put("is_inviter_mature", CardStruct.IStatusCode.DEFAULT);
        } else if (room != null && (ageRestricted = room.ageRestricted) != null && ageRestricted.ageInterval == 4) {
            hashMap.put("is_invitee_mature", "1");
            hashMap.put("is_inviter_mature", "1");
        }
        if (B5G.LIZIZ().LJIIJJI == EnumC75617Tm1.RANDOM_LINK_MIC_RECOMMEND || B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            hashMap.put("is_quick_recommend", "1");
        } else {
            hashMap.put("is_quick_recommend", CardStruct.IStatusCode.DEFAULT);
        }
        LJIILLIIL(map, LIZIZ2.LJJII, LIZIZ2.LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        hashMap.put("connection_type", "anchor");
        LJJLIIJ(str, map);
    }

    public final void LJJJJZ(Room targetRoom, String str, RivalExtraInfo rivalExtraInfo) {
        o.LJIIIZ(targetRoom, "targetRoom");
        LJJIIJZLJL("livesdk_connection_invite_send_success", targetRoom, str, rivalExtraInfo, null, null, null, null);
    }

    public static void LJJIIZ(String str, String str2, List list, boolean z) {
        String str3;
        B5G.LIZIZ();
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        hashMap.put("popup_uid_cnts", String.valueOf(((ArrayList) list).size()));
        if (z) {
            str3 = "application";
        } else {
            str3 = "invitation";
        }
        hashMap.put("show_type", str3);
        LJFF(str, str2, hashMap);
        C29822Bn8.LIZIZ("livesdk_connection_invited_dismiss", hashMap);
    }

    public static final void LJJIJLIJ(String fromUserId, Room room, String reservationId, boolean z) {
        Long l;
        String str;
        o.LJIIIZ(fromUserId, "fromUserId");
        o.LJIIIZ(reservationId, "reservationId");
        HashMap hashMap = new HashMap();
        hashMap.put("from_user_id", fromUserId);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        hashMap.put("room_id", String.valueOf(l2));
        hashMap.put("reservation_id", reservationId);
        if (!z) {
            str = "multi_guest";
        } else {
            str = "cohost";
        }
        hashMap.put("reservation_type", str);
        hashMap.put("receive_time", C44432HcC.LJIIIIZZ().getType());
        AnonymousClass172.LIZ("livesdk_connection_reservation_receive", hashMap);
    }

    public static void LJJIL(String str, Room room, String str2, boolean z) {
        Long l;
        String str3;
        HashMap LIZJ2 = C03660Ck.LIZJ("from_user_id", str);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZJ2.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        LIZJ2.put("room_id", String.valueOf(l2));
        LIZJ2.put("reservation_id", str2);
        if (z) {
            str3 = "cohost";
        } else {
            str3 = "multi_guest";
        }
        LIZJ2.put("reservation_type", str3);
        AnonymousClass172.LIZ("livesdk_connection_reservation_response", LIZJ2);
    }

    public static void LJJJ(boolean z, boolean z2, boolean z3, boolean z4) {
        Long l;
        Object obj;
        Object obj2;
        Object obj3;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        BZI LIZ2 = C28787BRn.LIZ("anchor_connection_setting_show");
        String str = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "anchor_id");
        if (room != null) {
            str = room.getIdStr();
        }
        LIZ2.LJIJJ(str, "room_id");
        String str2 = "open";
        if (z) {
            obj = "open";
        } else {
            obj = "close";
        }
        LIZ2.LJIJJ(obj, "mutual_invitation_receive_status");
        if (z2) {
            obj2 = "open";
        } else {
            obj2 = "close";
        }
        LIZ2.LJIJJ(obj2, "recommend_invitation_receive_status");
        if (z3) {
            obj3 = "open";
        } else {
            obj3 = "close";
        }
        LIZ2.LJIJJ(obj3, "mutual_application_receive_status");
        if (!z4) {
            str2 = "close";
        }
        LIZ2.LJIJJ(str2, "recommend_application_receive_status");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJJLIIIJJIZ(boolean z, long j, List uidList, Integer num) {
        Object obj;
        String str;
        o.LJIIIZ(uidList, "uidList");
        LJIJJLI = System.currentTimeMillis();
        if (z) {
            obj = "apply";
        } else {
            obj = "invite";
        }
        int size = uidList.size() + 1;
        if (o.LJ(obj, "invite")) {
            LJ = "invite_others";
        } else if (o.LJ(obj, "apply") && size == 1) {
            LJ = "one_apply";
        } else if (o.LJ(obj, "apply") && size == 2) {
            LJ = "two_apply_two";
        }
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap, z, j, uidList, num);
        Long l = B5G.LIZIZ().LJLIIL;
        if (l == null || l.longValue() != j) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        hashMap.put("is_best_teammate", str);
        LJIIJJI(hashMap);
        LJJLIIJ("livesdk_connection_invited_received", hashMap);
    }

    public static void LIZLLL(java.util.Map map, boolean z, long j, List list, Integer num) {
        String str;
        EnumC75614Tly enumC75614Tly;
        if (z) {
            str = "application";
        } else {
            str = "invitation";
        }
        HashMap hashMap = (HashMap) map;
        hashMap.put("show_type", str);
        ArrayList LJII2 = C47261Igj.LJII(Long.valueOf(j));
        LJII2.addAll(list);
        hashMap.put("popup_uid_list", LJII2.toString());
        hashMap.put("popup_uid_cnts", String.valueOf(LJII2.size()));
        if (B5G.LIZIZ().LJFF != 0) {
            hashMap.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        }
        C75457TjR.LIZLLL(map);
        hashMap.put("connection_type", "anchor");
        String LJIJJ2 = LJIJJ();
        o.LJIIIIZZ(LJIJJ2, "getConnectionType()");
        hashMap.put("before_connection_status", LJIJJ2);
        hashMap.put("source", LJ);
        hashMap.put("connection_inviter_id", String.valueOf(j));
        hashMap.put("connection_invitee_id", String.valueOf(C44432HcC.LJI()));
        if (num != null) {
            C75619Tm3 c75619Tm3 = EnumC75614Tly.Companion;
            int intValue = num.intValue();
            c75619Tm3.getClass();
            enumC75614Tly = C75619Tm3.LIZ(intValue);
        } else {
            enumC75614Tly = B5G.LIZIZ().LJIIJ;
        }
        C75545Tkr.LIZJ(map, enumC75614Tly, false);
    }

    public static void LJIILLIIL(java.util.Map map, Room room, RivalExtraInfo rivalExtraInfo, EnumC75614Tly enumC75614Tly, EnumC75672Tmu enumC75672Tmu) {
        RivalExtraInfo.Tag tag;
        Object obj;
        String str = "1";
        if (LJIILLIIL) {
            if (LJIJ != EnumC75672Tmu.INVITEE) {
                map.put("relation_label", LJIILJJIL);
            }
            if (LJIILL) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_linked_before", obj);
            map.put("invitee_list", LJIJI);
            if (o.LJ(LJIJI, "random_match")) {
                if (RandomLinkMicManager.LL != EnumC75546Tks.SYSTEM_REMATCH) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("is_system_rematching", str);
                return;
            }
            return;
        }
        if (enumC75672Tmu != EnumC75672Tmu.INVITEE) {
            map.put("relation_label", LJIL(room, rivalExtraInfo, enumC75614Tly));
        }
        if (rivalExtraInfo == null || (tag = rivalExtraInfo.tag) == null || tag.tagType != EnumC75640TmO.COHOST_TYPE.value) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_linked_before", str);
    }

    public static void LJJIIZI(String str, String pkId, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        EnumC75643TmR enumC75643TmR;
        String str2;
        o.LJIIIZ(pkId, "pkId");
        if (z) {
            enumC75643TmR = EnumC75643TmR.INVITE_WITHDRAW;
        } else if (z2) {
            enumC75643TmR = EnumC75643TmR.OVER_TIME;
        } else if (z3) {
            enumC75643TmR = EnumC75643TmR.REJECT;
        } else if (z4) {
            enumC75643TmR = EnumC75643TmR.OTHERS_REJECT;
        } else if (z5) {
            enumC75643TmR = EnumC75643TmR.ACCEPT;
        } else {
            enumC75643TmR = EnumC75643TmR.UNKNOW;
        }
        String value = enumC75643TmR.getValue();
        B5G.LIZIZ();
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "manual_pk");
        if (C8E.LIZLLL().LLIFFJFJJ() && C8E.LIZLLL().LJIL().size() > 2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_multi", str2);
        hashMap.put("pk_id", pkId);
        LJFF(str, value, hashMap);
        C29822Bn8.LIZIZ("livesdk_connection_invited_dismiss", hashMap);
    }

    public static /* synthetic */ void LJJJJLL(Room room, String str, RivalExtraInfo rivalExtraInfo, ReserveInfo reserveInfo, OptPairInfo optPairInfo, CohostTopic cohostTopic, int i) {
        OptPairInfo optPairInfo2 = optPairInfo;
        RivalExtraInfo rivalExtraInfo2 = rivalExtraInfo;
        ReserveInfo reserveInfo2 = reserveInfo;
        C75642TmQ c75642TmQ = LIZ;
        CohostTopic cohostTopic2 = null;
        if ((i & 4) != 0) {
            rivalExtraInfo2 = null;
        }
        if ((i & 8) != 0) {
            reserveInfo2 = null;
        }
        if ((i & 16) != 0) {
            optPairInfo2 = null;
        }
        if ((i & 32) == 0) {
            cohostTopic2 = cohostTopic;
        }
        c75642TmQ.LJJJJLI(room, str, rivalExtraInfo2, reserveInfo2, optPairInfo2, cohostTopic2, null);
    }

    public static void LJJJJZI(boolean z, long j, List uidList, int i, RivalExtraInfo.Tag tag, Integer num, CohostTopic cohostTopic) {
        Integer num2;
        boolean z2;
        AgeRestricted ageRestricted;
        Object obj;
        Object obj2;
        long j2;
        AgeRestricted ageRestricted2;
        o.LJIIIZ(uidList, "uidList");
        LJIIJ = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        LIZLLL(hashMap, z, j, uidList, num);
        LJIILLIIL(hashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        LIZ(hashMap);
        hashMap.put("time_stamp", String.valueOf(LJIJJLI));
        if (tag != null) {
            num2 = Integer.valueOf(tag.tagType);
        } else {
            num2 = null;
        }
        hashMap.put("relation_type", String.valueOf(num2));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (ageRestricted2 = room.ageRestricted) != null && ageRestricted2.ageInterval == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = "1";
        if (z2) {
            hashMap.put("is_invitee_mature", CardStruct.IStatusCode.DEFAULT);
        } else if (room != null && (ageRestricted = room.ageRestricted) != null && ageRestricted.ageInterval == 4) {
            hashMap.put("is_invitee_mature", "1");
        }
        if (i != 0) {
            if (i == 4) {
                hashMap.put("is_inviter_mature", "1");
            }
        } else {
            hashMap.put("is_inviter_mature", CardStruct.IStatusCode.DEFAULT);
        }
        Long l = B5G.LIZIZ().LJLIIL;
        if (l != null && l.longValue() == j) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_best_teammate", obj);
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_quick_recommend", obj2);
        hashMap.put("invited_to_popupshow_duration", String.valueOf(O6R.LJJIJ(((float) (LJIIJ - LJIJJLI)) / 1000.0f)));
        if (cohostTopic == null || !cohostTopic.liked) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("like_status", str);
        long j3 = 0;
        if (cohostTopic != null) {
            j2 = cohostTopic.totalHeat;
        } else {
            j2 = 0;
        }
        hashMap.put("topic_hot", String.valueOf(j2));
        if (cohostTopic != null) {
            j3 = cohostTopic.id;
        }
        hashMap.put("topic_id", String.valueOf(j3));
        if (cohostTopic != null) {
            int type = EnumC75614Tly.TOPIC_RECOMMEND.getType();
            if (num != null && num.intValue() == type) {
                hashMap.put("invitee_list", "topic");
            }
        }
        LJIJI(B5G.LIZIZ().LJIIJ.getType(), hashMap);
        hashMap.put("connection_type", "anchor");
        LJJLIIJ("livesdk_connected_popup_show", hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJLL(java.lang.String r14, com.bytedance.android.livesdkapi.depend.model.live.Room r15, X.EnumC75614Tly r16, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo r17, boolean r18, X.EnumC75958TrW r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75642TmQ.LJJJLL(java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room, X.Tly, com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo, boolean, X.TrW, java.lang.String):void");
    }

    public final void LJJJJLI(Room targetRoom, String clickType, RivalExtraInfo rivalExtraInfo, ReserveInfo reserveInfo, OptPairInfo optPairInfo, CohostTopic cohostTopic, C75647TmV c75647TmV) {
        o.LJIIIZ(targetRoom, "targetRoom");
        o.LJIIIZ(clickType, "clickType");
        LIZLLL = System.currentTimeMillis();
        LJIIIZ = System.currentTimeMillis();
        int size = C8E.LIZLLL().LJIILJJIL().size();
        if (o.LJ(clickType, "invite")) {
            LJ = "invite_others";
        } else if (o.LJ(clickType, "apply") && size <= 1) {
            LJ = "one_apply";
        } else if (o.LJ(clickType, "apply") && size == 2) {
            LJ = "two_apply_two";
        }
        if (!o.LJ(clickType, "invite")) {
            C75724Tnk.LJ();
        } else {
            C75877TqD.LJIILJJIL = "";
        }
        LJJIIJZLJL("livesdk_connection_invite", targetRoom, clickType, rivalExtraInfo, reserveInfo, optPairInfo, cohostTopic, c75647TmV);
    }

    public static void LJJIIJ(long j, boolean z, String reservationId, String str, EnumC75182Tf0 showTime, int i, List list, int i2) {
        Long l;
        String str2;
        if ((i2 & 32) != 0) {
            i = 0;
        }
        Long l2 = null;
        if ((i2 & 64) != 0) {
            list = null;
        }
        o.LJIIIZ(reservationId, "reservationId");
        o.LJIIIZ(showTime, "showTime");
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        hashMap.put("accept_appointment_cnts", String.valueOf(j));
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        hashMap.put("room_id", String.valueOf(l2));
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_reservation_sender", str2);
        if (list != null && list.size() == 1) {
            hashMap.put("reservation_id", reservationId);
        }
        hashMap.put("reservation_type", str);
        hashMap.put("show_time", showTime.getType());
        if (i > 0) {
            hashMap.put("current_accept_appointment_cnts", String.valueOf(i));
        }
        AnonymousClass172.LIZ("livesdk_connection_appointment_guide_show", hashMap);
    }

    public static void LJJJLIIL(boolean z, boolean z2, boolean z3, long j, List uidList, RivalExtraInfo.Tag tag, Integer num, CohostTopic cohostTopic) {
        Object obj;
        String str;
        Object obj2;
        Integer num2;
        Object obj3;
        long j2;
        o.LJIIIZ(uidList, "uidList");
        LJIIJJI = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        LIZLLL(hashMap, z, j, uidList, num);
        LJIILLIIL(hashMap, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        Long l = B5G.LIZIZ().LJLIIL;
        String str2 = "1";
        if (l != null && l.longValue() == j) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_best_teammate", obj);
        long currentTimeMillis = System.currentTimeMillis();
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        C7MY.LJFF(currentTimeMillis, LJIJJLI, hashMap, "show_to_decide_dur");
        if (z2) {
            str = "accept";
        } else {
            str = "reject";
        }
        hashMap.put("selection", str);
        if (z3) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_turn_off_invitation", obj2);
        if (tag != null) {
            num2 = Integer.valueOf(tag.tagType);
        } else {
            num2 = null;
        }
        hashMap.put("relation_type", String.valueOf(num2));
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_quick_recommend", obj3);
        hashMap.put("popupshow_to_selected_duration", String.valueOf(O6R.LJJIJ(((float) (LJIIJJI - LJIIJ)) / 1000.0f)));
        if (cohostTopic == null || !cohostTopic.liked) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("like_status", str2);
        long j3 = 0;
        if (cohostTopic != null) {
            j2 = cohostTopic.totalHeat;
        } else {
            j2 = 0;
        }
        hashMap.put("topic_hot", String.valueOf(j2));
        if (cohostTopic != null) {
            j3 = cohostTopic.id;
        }
        hashMap.put("topic_id", String.valueOf(j3));
        LJIJI(B5G.LIZIZ().LJIIJ.getType(), hashMap);
        if (cohostTopic != null) {
            int type = EnumC75614Tly.TOPIC_RECOMMEND.getType();
            if (num != null && num.intValue() == type) {
                hashMap.put("invitee_list", "topic");
            }
        }
        LJJLIIJ("livesdk_connection_invited", hashMap);
    }

    public final void LJJIIJZLJL(String str, Room room, String str2, RivalExtraInfo rivalExtraInfo, ReserveInfo reserveInfo, OptPairInfo optPairInfo, CohostTopic cohostTopic, C75647TmV c75647TmV) {
        boolean z;
        Object obj;
        String str3;
        String str4;
        Object obj2;
        boolean z2;
        boolean z3;
        AgeRestricted ageRestricted;
        long j;
        boolean z4;
        Object obj3;
        Object obj4;
        com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo optPairInfo2;
        AgeRestricted ageRestricted2;
        String str5;
        Long l;
        String str6;
        RivalExtraInfo.Tag tag;
        Object obj5;
        Object obj6;
        HashMap<String, Long> hashMap;
        Long l2;
        HashMap LIZJ2 = C03660Ck.LIZJ("connection_type", "anchor");
        String LJIJJ2 = LJIJJ();
        o.LJIIIIZZ(LJIJJ2, "getConnectionType()");
        LIZJ2.put("before_connection_status", LJIJJ2);
        LJIIZILJ(this, LIZJ2);
        String str7 = "";
        if (o.LJ(str, "livesdk_connection_invite")) {
            C75975Trn c75975Trn = LJFF;
            if (c75975Trn == null || (obj5 = ((HashMap) c75975Trn.LIZ()).get("mutual_actual_see_cnts")) == null) {
                obj5 = "";
            }
            LIZJ2.put("mutual_actual_see_cnts", obj5);
            C75975Trn c75975Trn2 = LJFF;
            if (c75975Trn2 == null || (obj6 = ((HashMap) c75975Trn2.LIZ()).get("recommend_show_cnts")) == null) {
                obj6 = "";
            }
            LIZJ2.put("recommend_show_cnts", obj6);
            C75975Trn c75975Trn3 = LJFF;
            if (c75975Trn3 != null && (hashMap = c75975Trn3.LJIIL) != null && (l2 = hashMap.get(room.getIdStr())) != null) {
                LIZJ2.put("show_to_invite_duration", String.valueOf(O6R.LJJIJ(((float) (LJIIIZ - l2.longValue())) / 1000.0f)));
            }
        }
        LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
        C75545Tkr.LIZJ(LIZJ2, B5G.LIZIZ().LJIIJ, false);
        LIZJ2.put("relation_label", LJIL(room, rivalExtraInfo, B5G.LIZIZ().LJIIJ));
        if (rivalExtraInfo != null && (tag = rivalExtraInfo.tag) != null && tag.tagType == EnumC75640TmO.COHOST_TYPE.value) {
            z = true;
        } else {
            z = false;
        }
        String str8 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ2.put("is_linked_before", obj);
        if (LIZIZ2.LJIIJ != EnumC75614Tly.RANDOM_LINK_MIC_INVITE) {
            LIZJ2.put("time_stamp", String.valueOf(LIZLLL));
        }
        boolean LJIIJJI2 = C77125UOr.LJIIJJI(((IInteractService) CN1.LIZ(IInteractService.class)).Fy(), 2);
        boolean ta0 = ((IInteractService) CN1.LIZ(IInteractService.class)).ta0();
        if (LJIIJJI2) {
            if (ta0) {
                str3 = "guest";
            } else {
                str3 = "guest_open";
            }
        } else {
            str3 = "guest_close";
        }
        LIZJ2.put("invite_scene", str3);
        LIZJ2.put("source", LJ);
        if (!TextUtils.isEmpty(str2)) {
            LIZJ2.put("click_type", str2);
        }
        long j2 = LIZIZ2.LJFF;
        if (j2 != 0) {
            LIZJ2.put("channel_id", String.valueOf(j2));
        }
        if (!TextUtils.isEmpty(LIZIZ2.LJJJIL)) {
            LIZJ2.put("request_id", LIZIZ2.LJJJIL);
        }
        LIZJ2.put("connection_inviter_id", String.valueOf(C44432HcC.LJI()));
        User owner = room.getOwner();
        if (owner != null) {
            str4 = owner.getIdStr();
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            User owner2 = room.getOwner();
            if (owner2 == null || (str5 = owner2.getIdStr()) == null) {
                str5 = "";
            }
            LIZJ2.put("connection_invitee_id", str5);
            User owner3 = room.getOwner();
            if (owner3 != null) {
                l = Long.valueOf(owner3.getId());
            } else {
                l = null;
            }
            if (o.LJ(l, B5G.LIZIZ().LJLIIL)) {
                LIZJ2.put("is_best_teammate", "1");
            } else {
                LIZJ2.put("is_best_teammate", CardStruct.IStatusCode.DEFAULT);
            }
            if (o.LJ(str, "livesdk_connection_invite_send_success")) {
                User owner4 = room.getOwner();
                if (owner4 == null || (str6 = owner4.getIdStr()) == null) {
                    str6 = "";
                }
                LIZJ2.put("invitee_id", str6);
            }
        }
        if (B5G.LIZIZ().LIZJ) {
            LIZJ2.put("live_icon_show_time", "during_connection");
            LJ(LIZJ2);
        } else {
            LIZJ2.put("live_icon_show_time", "single_live");
        }
        LJIIJ(LIZJ2);
        String str9 = B5G.LIZIZ().LJJLIIIIJ;
        String l3 = Long.valueOf(room.getOwnerUserId()).toString();
        if (str9 != null && o.LJ(str9, l3)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ2.put("is_icon_show_anchor", obj2);
        String str10 = LIZIZ2.LJJLI;
        if (str10 != null) {
            str7 = str10;
        }
        LIZJ2.put("log_id", str7);
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        AgeRestricted ageRestricted3 = room.ageRestricted;
        if (ageRestricted3 != null && ageRestricted3.ageInterval == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            LIZJ2.put("is_invitee_mature", CardStruct.IStatusCode.DEFAULT);
        } else if (ageRestricted3 != null && ageRestricted3.ageInterval == 4) {
            LIZJ2.put("is_invitee_mature", "1");
        }
        if (room2 != null && (ageRestricted2 = room2.ageRestricted) != null && ageRestricted2.ageInterval == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            LIZJ2.put("is_inviter_mature", CardStruct.IStatusCode.DEFAULT);
        } else if (room2 != null && (ageRestricted = room2.ageRestricted) != null && ageRestricted.ageInterval == 4) {
            LIZJ2.put("is_inviter_mature", "1");
        }
        LIZJ2.put("relation_type", String.valueOf(LIZIZ2.LJJLIIIJJI));
        LJIILL(LIZIZ2.LJIIJ, LIZJ2);
        LIZJ2.put("click_time", C44432HcC.LJIIIIZZ().getType());
        if (rivalExtraInfo != null && (optPairInfo2 = rivalExtraInfo.optPairInfo) != null) {
            LIZJ2.put("pk_mapping_id", String.valueOf(optPairInfo2.mappingId));
            C75893TqT.LJII = optPairInfo2.mappingId;
        }
        if (optPairInfo != null) {
            LIZJ2.put("pk_mapping_id", String.valueOf(optPairInfo.mappingId));
            C75893TqT.LJII = optPairInfo.mappingId;
        }
        if (cohostTopic != null) {
            LIZJ2.put("topic_id", String.valueOf(cohostTopic.id));
            if (o.LJ(str2, EnumC75645TmT.TOPIC_LINKMIC.getValue())) {
                LIZJ2.put("invitee_list", "topic");
            }
            if (o.LJ(str2, "apply")) {
                C75633TmH.LJIIIIZZ = cohostTopic.id;
                C75633TmH.LJIIIZ = cohostTopic.totalHeat;
            }
        }
        if (c75647TmV != null) {
            LIZJ2.put("topic_page_level", String.valueOf(c75647TmV.LJLILLLLZI));
            LIZJ2.put("is_default_topic", String.valueOf(c75647TmV.LJLIL));
        }
        LJII(this, LIZJ2);
        if (str.equals("livesdk_connection_invite")) {
            if (rivalExtraInfo != null) {
                RivalExtraInfo.ReserveInfo reserveInfo2 = rivalExtraInfo.reserveInfo;
                if (reserveInfo2 != null) {
                    long j3 = reserveInfo2.reservationId;
                    C75893TqT.LJI = j3;
                    C75893TqT.LJFF = !reserveInfo2.isReservationSender;
                    LIZJ2.put("reservation_id", String.valueOf(j3));
                    if (C75893TqT.LJFF) {
                        obj4 = "1";
                    } else {
                        obj4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZJ2.put("is_reservation_sender", obj4);
                }
            } else {
                C75648TmW c75648TmW = B5G.LIZIZ().LJJJ;
                if (c75648TmW != null && c75648TmW.LIZLLL) {
                    if (reserveInfo != null) {
                        j = reserveInfo.reservationId;
                    } else {
                        j = 0;
                    }
                    C75893TqT.LJI = j;
                    if (reserveInfo != null) {
                        z4 = reserveInfo.isReservationSender;
                    } else {
                        z4 = false;
                    }
                    C75893TqT.LJFF = z4;
                    LIZJ2.put("reservation_id", String.valueOf(C75893TqT.LJI));
                    if (C75893TqT.LJFF) {
                        obj3 = "1";
                    } else {
                        obj3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    LIZJ2.put("is_reservation_sender", obj3);
                }
            }
        }
        if (str.equals("livesdk_connection_invite_send_success")) {
            if (!C75893TqT.LJFF) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ2.put("is_reservation_sender", str8);
            long j4 = C75893TqT.LJI;
            if (j4 != 0) {
                LIZJ2.put("reservation_id", String.valueOf(j4));
            }
            long j5 = C75893TqT.LJII;
            if (j5 != 0) {
                LIZJ2.put("pk_mapping_id", String.valueOf(j5));
            }
        }
        User owner5 = room.getOwner();
        if (owner5 != null) {
            LIZJ.add(Long.valueOf(owner5.getId()));
        }
        LJJLIIJ(str, LIZJ2);
    }

    public static final void LJJIJ(int i, String str, long j, java.util.Map map, CJ2 cj2, CJ2 cj22, Boolean bool, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj;
        CJ2 cj23;
        String num;
        RivalExtraInfo rivalExtraInfo;
        EnumC75909Tqj enumC75909Tqj;
        C75981Trt c75981Trt;
        EnumC75614Tly enumC75614Tly;
        HashMap LIZ2 = C1R5.LIZ(str, "leftType");
        LJII(LIZ, LIZ2);
        LIZ2.put("mutual_follow_cnts", String.valueOf(i));
        LIZ2.put("left_type", str);
        LJIIIIZZ = System.currentTimeMillis();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
            ((Number) entry.getKey()).longValue();
            C53734L7a c53734L7a = (C53734L7a) entry.getValue();
            int i18 = c53734L7a.LIZ;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            i14++;
                            if (o.LJ(c53734L7a.LIZIZ, Boolean.TRUE)) {
                                i17++;
                            }
                        }
                    } else {
                        i13++;
                        if (o.LJ(c53734L7a.LIZIZ, Boolean.TRUE)) {
                            i16++;
                        }
                    }
                } else {
                    i12++;
                    if (o.LJ(c53734L7a.LIZIZ, Boolean.TRUE)) {
                        i15++;
                    }
                }
            } else {
                i10++;
                if (o.LJ(c53734L7a.LIZIZ, Boolean.TRUE)) {
                    i11++;
                }
            }
        }
        if (cj2 != null) {
            int size = cj2.size();
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            for (int i19 = 0; i19 < size; i19++) {
                Object obj2 = cj2.get(i19);
                if ((obj2 instanceof C75981Trt) && (enumC75614Tly = (c75981Trt = (C75981Trt) obj2).LJLJI) != null) {
                    int i20 = C75613Tlx.LIZ[enumC75614Tly.ordinal()];
                    Integer num2 = null;
                    if (i20 != 1) {
                        if (i20 == 2) {
                            RivalExtraInfo rivalExtraInfo2 = c75981Trt.LJLJJI;
                            if (rivalExtraInfo2 != null) {
                                num2 = Integer.valueOf(rivalExtraInfo2.showPlayType);
                            }
                            int i21 = EnumC75767ToR.PLAYTYPE_APPLY.value;
                            if (num2 == null || num2.intValue() != i21) {
                                i8++;
                                if (c75981Trt.LJLJLJ) {
                                    i6++;
                                }
                            } else {
                                i9++;
                                if (c75981Trt.LJLJLJ) {
                                    i7++;
                                }
                            }
                        }
                    } else {
                        RivalExtraInfo rivalExtraInfo3 = c75981Trt.LJLJJI;
                        if (rivalExtraInfo3 != null) {
                            num2 = Integer.valueOf(rivalExtraInfo3.showPlayType);
                        }
                        int i22 = EnumC75767ToR.PLAYTYPE_APPLY.value;
                        if (num2 == null || num2.intValue() != i22) {
                            i5++;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        LIZ2.put("all_mutual_could_apply_cnts", String.valueOf(i4));
        LIZ2.put("all_mutual_could_invite_cnts", String.valueOf(i5));
        LIZ2.put("recommend_could_inivte_cnts", String.valueOf(i6));
        LIZ2.put("recommend_could_apply_cnts", String.valueOf(i7));
        LIZ2.put("all_recommend_could_inivte_cnts", String.valueOf(i8));
        LIZ2.put("all_recommend_could_apply_cnts", String.valueOf(i9));
        LIZ2.put("second_degree_anchor_cnt", String.valueOf(i14));
        LIZ2.put("actual_see_second_degree_anchor_cnt", String.valueOf(i17));
        LIZ2.put("interacted_with_anchor_cnt", String.valueOf(i12));
        LIZ2.put("actual_see_interacted_with_anchor_cnt", String.valueOf(i15));
        LIZ2.put("stranger_anchor_cnt", String.valueOf(i10));
        LIZ2.put("actual_see_stranger_anchor_cnt", String.valueOf(i11));
        LIZ2.put("first_degree_anchor_cnt", String.valueOf(i13));
        LIZ2.put("actual_see_first_degree_anchor_cnt", String.valueOf(i16));
        LIZ2.put("click_to_show_duration", String.valueOf(O6R.LJJIJ(((float) (LJIIIIZZ - LJII)) / 1000.0f)));
        List<C75883TqJ> LJIL2 = C8E.LIZLLL().LJIL();
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : LJIL2) {
            if (!c75883TqJ.LIZJ()) {
                if (LIZJ.contains(Long.valueOf(c75883TqJ.LIZ)) && !c75883TqJ.LIZJ() && c75883TqJ.LJJI == EnumC75909Tqj.LINKED) {
                    arrayList.add(Long.valueOf(c75883TqJ.LIZ));
                } else if (c75883TqJ.LJJIII == null && ((enumC75909Tqj = c75883TqJ.LJJI) == EnumC75909Tqj.APPLIED || enumC75909Tqj == EnumC75909Tqj.INVITED)) {
                    arrayList.add(Long.valueOf(c75883TqJ.LIZ));
                }
            }
        }
        LIZ2.put("uid_list", arrayList.toString());
        LIZ2.put("invite_cnts", String.valueOf(arrayList.size()));
        Long l = B5G.LIZIZ().LJLIIL;
        String str2 = "1";
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (l != null) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_best_teammate_show", obj);
        if (map != null) {
            LIZ2.putAll(map);
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_best_teammate_show", str2);
        LIZ2.put("click_time", C44432HcC.LJIIIIZZ().getType());
        LIZ2.put("reservation_could_send_anchor_cnts", String.valueOf(i2));
        LIZ2.put("actual_see_reservation_could_send_anchor_cnts", String.valueOf(i3));
        if (cj22 == null) {
            cj23 = new CJ2();
        } else {
            cj23 = cj22;
        }
        Iterator<Object> it = cj23.iterator();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && (next instanceof C76032Tsi) && (rivalExtraInfo = ((C75981Trt) next).LJLJJI) != null) {
                RivalExtraInfo.ReserveInfo reserveInfo = rivalExtraInfo.reserveInfo;
                if (reserveInfo != null && reserveInfo.replyStatus == 1) {
                    i23++;
                    if (rivalExtraInfo != null) {
                    }
                }
                if (rivalExtraInfo.inviteBlockReason == 0) {
                    i24++;
                    RivalExtraInfo.ReserveInfo reserveInfo2 = rivalExtraInfo.reserveInfo;
                    if (reserveInfo2 != null && reserveInfo2.replyStatus == 1) {
                        i25++;
                    }
                }
            }
        }
        if (cj22 != null && (num = Integer.valueOf(cj22.size()).toString()) != null) {
            str3 = num;
        }
        LIZ2.put("reservation_anchor_cnts", str3);
        LIZ2.put("reservation_response_anchor_cnts", String.valueOf(i23));
        LIZ2.put("reservation_could_invite_cnts", String.valueOf(i24));
        LIZ2.put("reservation_reponse_could_invite_cnts", String.valueOf(i25));
        BZI LIZ3 = C28787BRn.LIZ("livesdk_connection_list_show");
        LIZ3.LJIIZILJ();
        LIZ3.LJJIFFI(LIZ2);
        C30869C9p.LIZ(j, LIZ3, "list_stay_duration");
    }
}
