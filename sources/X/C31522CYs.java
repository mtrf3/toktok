package X;

import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.ranklist.HallOfFameRankExtra;
import webcast.api.ranklist.RankExtraInfo;

/* renamed from: X.CYs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31522CYs {
    public static String LIZ = "live_play";
    public static final HashMap<OSZ<Integer, Integer>, String> LIZIZ = new HashMap<>();

    public static void LIZ(BZI bzi, DataChannel dataChannel) {
        long j;
        String str;
        Room room;
        LiveMode streamType;
        Room room2;
        Room room3;
        bzi.LJIJJ(BJM.LJFF(), "enter_from_merge");
        bzi.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        long j2 = 0;
        if (dataChannel != null && (room3 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room3.getOwnerUserId();
        } else {
            j = 0;
        }
        bzi.LJIJJ(Long.valueOf(j), "anchor_id");
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j2 = room2.getId();
        }
        bzi.LJIJJ(Long.valueOf(j2), "room_id");
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            str = C28509BGv.LIZ(streamType);
        } else {
            str = null;
        }
        bzi.LJIJJ(str, "live_type");
        bzi.LJIJJ(BJM.LIZLLL(), "action_type");
    }

    public static BZI LIZLLL(String str, java.util.Map map) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIIZILJ();
        LIZ2.LJJIFFI(map);
        return LIZ2;
    }

    public static void LIZJ(java.util.Map map, C31526CYw rankTypeAll, DataChannel dataChannel) {
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        LIZIZ(map, rankTypeAll.LIZIZ, rankTypeAll.LIZ, rankTypeAll.LJ, dataChannel);
    }

    public static void LJFF(RankListV2Response.RankView rankView, String from, DataChannel dataChannel) {
        String str;
        o.LJIIIZ(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C29306Beo.LJIIJ(dataChannel)) {
            linkedHashMap.put("user_type", "anchor");
        } else {
            linkedHashMap.put("enter_from_merge", BJM.LJFF());
            linkedHashMap.put("enter_method", BJM.LJIIIIZZ());
            linkedHashMap.put("user_type", "user");
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_faq_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(from, "event_page");
        if (rankView != null && rankView.LJLIL == -1) {
            str = "last";
        } else {
            str = "this";
        }
        LIZ2.LJIJJ(str, "rank_period");
        LIZ2.LJJIFFI(linkedHashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJI(RankListV2Response.RankView rankView, C31526CYw rankTypeAll, DataChannel dataChannel) {
        boolean z;
        String str;
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RankTypeV2 rankTypeV2 = rankTypeAll.LIZIZ;
        EnumC31514CYk enumC31514CYk = rankTypeAll.LIZ;
        if (rankView != null && rankView.LJLIL == -1) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ(linkedHashMap, rankTypeV2, enumC31514CYk, z, dataChannel);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_historical_weekly_rank_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ(LIZ2, dataChannel);
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ2.LJIJJ(str, "user_type");
        V0N.LJJIIZ(LIZ2, rankTypeAll);
        LIZ2.LJJIFFI(linkedHashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIIZZ(C31526CYw rankTypeAll, DataChannel dataChannel, String str) {
        Object obj;
        String str2;
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (dataChannel != null) {
            obj = dataChannel.kv0(LiveExtendedScreenStatus.class);
        } else {
            obj = null;
        }
        if (obj == EnumC31158CKs.SHOW) {
            linkedHashMap.put("event_page", "live_extended_comment_filed");
        }
        LIZJ(linkedHashMap, rankTypeAll, dataChannel);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_hourly_rank_entrance_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ(LIZ2, dataChannel);
        if (C29306Beo.LJIIJ(dataChannel)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ2.LJIJJ(str2, "user_type");
        V0N.LJJIIZ(LIZ2, rankTypeAll);
        LIZ2.LJIJJ(str, "position");
        LIZ2.LJIJJ("live_play", "show_reason");
        LIZ2.LJJIFFI(linkedHashMap);
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIIZ(C31526CYw rankTypeAll, DataChannel dataChannel, String str) {
        String str2;
        String str3;
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(linkedHashMap, rankTypeAll, dataChannel);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_hourly_rank_entrance_show");
        LIZ(LIZ2, dataChannel);
        if (dataChannel != null && o.LJ(dataChannel.kv0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZ2.LJIJJ(str2, "user_type");
        V0N.LJJIIZ(LIZ2, rankTypeAll);
        LIZ2.LJIJJ(str, "position");
        if (o.LJ(str, "room_topleft")) {
            str3 = LIZ;
        } else {
            str3 = "live_play";
        }
        LIZ2.LJIJJ(str3, "show_reason");
        LIZ2.LJJIFFI(linkedHashMap);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJJIIJZLJL();
            return;
        }
        LIZ2.LJJIJ();
        BJM bjm = BJM.LJLIL;
        LIZ2.LJIJJ(BJM.LJIILIIL(), "request_id");
        LIZ2.LJIJJ(bjm.LIZJ(), "live_type");
        LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ2.LJJIIZI();
    }

    public static void LJ(RankListV2Response.RankView rankView, C31526CYw rankTypeAll, String from, DataChannel dataChannel) {
        String str;
        String str2;
        Boolean bool;
        RankExtraInfo rankExtraInfo;
        HallOfFameRankExtra hallOfFameRankExtra;
        List<RankListV2Response.RankInfo> list;
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        o.LJIIIZ(from, "from");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(linkedHashMap, rankTypeAll, dataChannel);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_faq_enter_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ(LIZ2, dataChannel);
        boolean z = false;
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ2.LJIJJ(str, "user_type");
        LIZ2.LJIJJ(from, "event_page");
        if (rankView != null && rankView.LJLIL == -1) {
            str2 = "last";
        } else {
            str2 = "this";
        }
        LIZ2.LJIJJ(str2, "rank_period");
        if (rankView != null && (list = rankView.ranks) != null && list.size() == 0) {
            z = true;
        }
        if (!z) {
            if (rankView != null && (rankExtraInfo = rankView.rankExtraInfo) != null && (hallOfFameRankExtra = rankExtraInfo.hallOfFameRankExtra) != null) {
                bool = Boolean.valueOf(hallOfFameRankExtra.isFirstDay);
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool)) {
                LIZ2.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_empty");
                LIZ2.LJJIFFI(linkedHashMap);
                if (rankTypeAll.LIZ == EnumC31514CYk.GAME_RANK && !o.LJ(rankTypeAll.LIZIZ, rankTypeAll.LIZLLL)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("sub_");
                    LIZ3.append(rankTypeAll.LIZLLL.rankName);
                    LIZ2.LJIJJ(X1D.LIZIZ(LIZ3), "event_page");
                    LIZ2.LJIJJ(rankTypeAll.LIZIZ.rankName, "sub_rank_game_name");
                }
                LIZ2.LJJIIJZLJL();
            }
        }
        LIZ2.LJIJJ("1", "is_empty");
        LIZ2.LJJIFFI(linkedHashMap);
        if (rankTypeAll.LIZ == EnumC31514CYk.GAME_RANK) {
            StringBuilder LIZ32 = X1D.LIZ();
            LIZ32.append("sub_");
            LIZ32.append(rankTypeAll.LIZLLL.rankName);
            LIZ2.LJIJJ(X1D.LIZIZ(LIZ32), "event_page");
            LIZ2.LJIJJ(rankTypeAll.LIZIZ.rankName, "sub_rank_game_name");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static void LJII(C31526CYw rankTypeAll, RankListV2Response.RankView rankView, DataChannel dataChannel, boolean z) {
        boolean z2;
        String str;
        String str2;
        boolean z3;
        String str3;
        List<RankListV2Response.RankInfo> list;
        Long l;
        Room room;
        RankListV2Response.RankInfo rankInfo;
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        String str4 = "last";
        String str5 = "1";
        if (rankTypeAll.LIZ == EnumC31514CYk.E_COMMERCE) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_tiktokec_sale_rank_show");
            LIZ2.LJIILLIIL(dataChannel);
            if (!C29306Beo.LJIIJ(dataChannel)) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ2.LJIJJ(str5, "is_self");
            Long l2 = null;
            if (rankView != null && (rankInfo = rankView.ownerRank) != null) {
                l = Long.valueOf(rankInfo.rank);
            } else {
                l = null;
            }
            LIZ2.LJIJJ(l, "author_rank");
            if (rankView == null || rankView.LJLIL != -1) {
                str4 = "this";
            }
            LIZ2.LJIJJ(str4, "rank_period");
            if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            }
            LIZ2.LJIJJ(l2, "author_id");
            LIZ2.LJIJJ("TEMAI", "EVENT_ORIGIN_FEATURE");
            LIZ2.LJIJJ("live", "page_name");
            LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
            LIZ2.LJJIIJZLJL();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (C28652BMi.LIZIZ(dataChannel) != 2) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_ranking_turn_off", str5);
        }
        LIZJ(linkedHashMap, rankTypeAll, dataChannel);
        String str6 = LIZIZ.get(new OSZ(Integer.valueOf(rankTypeAll.LIZIZ.type), Integer.valueOf(rankTypeAll.LIZIZ.rankPhase)));
        if (str6 == null) {
            str6 = "click";
        }
        linkedHashMap.put("enter_from", str6);
        BZI LIZLLL = LIZLLL("livesdk_hourly_live_rank_show", linkedHashMap);
        if (rankView == null || rankView.LJLIL != -1) {
            str4 = "this";
        }
        LIZLLL.LJIJJ(str4, "rank_period");
        if (C29306Beo.LJIIJ(dataChannel) && C28652BMi.LIZIZ(dataChannel) == 2) {
            str = "ranking_turned_off";
        } else {
            str = "null";
        }
        LIZLLL.LJIJJ(str, "bottom_bar_content");
        LIZ(LIZLLL, dataChannel);
        if (dataChannel != null && C29306Beo.LJIIJ(dataChannel)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        LIZLLL.LJIJJ(str2, "user_type");
        V0N.LJJIIZ(LIZLLL, rankTypeAll);
        if (rankView != null && rankView.rankType == RankTypeV2.LJI.type) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            LIZLLL.LJIJJ("full", "list_type");
        } else {
            LIZLLL.LJIJJ("full", "list_type");
        }
        if (z) {
            LIZLLL.LJIJJ("promote_notice", "list_content");
        } else {
            if (rankView != null && (list = rankView.ranks) != null && list.size() == 0) {
                str3 = "empty";
            } else {
                str3 = "rankings";
            }
            LIZLLL.LJIJJ(str3, "list_content");
        }
        LIZLLL.LJJIIJZLJL();
    }

    public static void LJIIJ(C31526CYw rankTypeAll, RankListV2Response.RankView rankView, DataChannel dataChannel, boolean z) {
        RankExtraInfo rankExtraInfo;
        HallOfFameRankExtra hallOfFameRankExtra;
        o.LJIIIZ(rankTypeAll, "rankTypeAll");
        if (rankTypeAll.LIZ == EnumC31514CYk.E_COMMERCE) {
            return;
        }
        Boolean bool = null;
        if (rankView != null && (rankExtraInfo = rankView.rankExtraInfo) != null && (hallOfFameRankExtra = rankExtraInfo.hallOfFameRankExtra) != null) {
            bool = Boolean.valueOf(hallOfFameRankExtra.isFirstDay);
        }
        if (!C29306Beo.LJJIFFI(bool) && rankView != null && rankView.ranks != null && rankView != null) {
            List<RankListV2Response.RankInfo> list = rankView.ranks;
            if (list != null && list.size() == 0) {
                return;
            }
            C70657RoD.LJJI(0.1d, new C31523CYt(rankView, rankTypeAll, dataChannel, rankView, z));
        }
    }

    public static void LIZIZ(java.util.Map map, RankTypeV2 rankTypeV2, EnumC31514CYk enumC31514CYk, boolean z, DataChannel dataChannel) {
        String str;
        Room room;
        RoomAuthStatus roomAuthStatus;
        if (C29306Beo.LJIIJ(dataChannel) && enumC31514CYk == EnumC31514CYk.GAME_RANK && (dataChannel == null || !C29306Beo.LJIIJ(dataChannel) || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || (roomAuthStatus = room.mRoomAuthStatus) == null || roomAuthStatus.gamerankingswitch != 1)) {
            map.put("anchor_rank", "2");
            return;
        }
        if (C29306Beo.LJIIJ(dataChannel) && enumC31514CYk == EnumC31514CYk.GIFT_RANK && !z && C28652BMi.LIZIZ(dataChannel) != 1) {
            map.put("anchor_rank", "2");
            return;
        }
        if (C28652BMi.LIZ(rankTypeV2.type, z) < 0) {
            str = "-1";
        } else {
            long LIZ2 = C28652BMi.LIZ(rankTypeV2.type, z);
            if (1 <= LIZ2 && LIZ2 < 100) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
        }
        map.put("anchor_rank", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (X.C29306Beo.LJIIJ(r4) == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(java.lang.String r1, com.bytedance.android.live.base.model.user.User r2, com.bytedance.android.livesdk.model.BorderInfo r3, com.bytedance.ies.sdk.datachannel.DataChannel r4, boolean r5) {
        /*
            java.lang.String r0 = "rankPageName"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            if (r5 == 0) goto L1f
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = com.bytedance.android.livesdk.rank.api.RankTypeV2.LIZIZ
            java.lang.String r0 = r0.rankName
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L1f
            if (r4 == 0) goto L20
            boolean r0 = X.C29306Beo.LJIIJ(r4)
            r1 = 1
            if (r0 != r1) goto L20
        L1a:
            java.lang.String r0 = "last_week_rank"
            X.C29504Bi0.LIZIZ(r2, r0, r1, r3)
        L1f:
            return
        L20:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31522CYs.LJIIJJI(java.lang.String, com.bytedance.android.live.base.model.user.User, com.bytedance.android.livesdk.model.BorderInfo, com.bytedance.ies.sdk.datachannel.DataChannel, boolean):void");
    }
}
