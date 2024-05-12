package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.list.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UiV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77947UiV implements CZ9 {
    public final /* synthetic */ RankListFragment LIZ;

    public C77947UiV(RankListFragment rankListFragment) {
        this.LIZ = rankListFragment;
    }

    @Override // X.CZ9
    public final void LIZ(RankListV2Response.RankInfo rank) {
        Long l;
        String str;
        Room room;
        Long l2;
        o.LJIIIZ(rank, "rank");
        RankListFragment rankListFragment = this.LIZ;
        C78000UjM c78000UjM = rankListFragment.LJLLL;
        long j = c78000UjM.LJ;
        long j2 = rank.rank;
        if (j < j2) {
            j = j2;
        }
        c78000UjM.LJ = j;
        RankListController rankListController = rankListFragment.LJLJJLL;
        if (rankListController != null && rankListController.LJII().LJLILLLLZI != null) {
            C31526CYw rankTypeAll = rankListFragment.LJLJJI;
            RankListV2Response.RankView rankView = rankListController.LJII().LJLILLLLZI;
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(rankListFragment);
            o.LJIIIZ(rankTypeAll, "rankTypeAll");
            EnumC31514CYk enumC31514CYk = rankTypeAll.LIZ;
            EnumC31514CYk enumC31514CYk2 = EnumC31514CYk.E_COMMERCE;
            String str2 = CardStruct.IStatusCode.DEFAULT;
            Long l3 = null;
            if (enumC31514CYk != enumC31514CYk2) {
                if (rank.roomId <= 0) {
                    return;
                }
                HashMap LIZJ = C03660Ck.LIZJ("enter_from_merge", "live_detail");
                LIZJ.put("enter_method", rankTypeAll.LIZIZ.rankName);
                User user = rank.user;
                if (user != null) {
                    l3 = Long.valueOf(user.getId());
                }
                LIZJ.put("anchor_id", String.valueOf(l3));
                User user2 = rank.user;
                if (user2 != null && (l2 = user2.followStatus) != null) {
                    LIZJ.put("initial_follow_status", String.valueOf(l2.longValue()));
                }
                C43881HKb.LIZJ(rank.roomId, LIZJ, "room_id", "action_type", "draw");
                LIZJ.put("is_return", CardStruct.IStatusCode.DEFAULT);
                LIZJ.put("content_type", rankTypeAll.LIZIZ.rankName);
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
                LIZJ.put("from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                LIZJ.put("from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                BZI LIZ = C28787BRn.LIZ("livesdk_live_show");
                LIZ.LJIILLIIL(LJIILIIL);
                LIZ.LJJIFFI(LIZJ);
                LIZ.LJJIIJZLJL();
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_tiktokec_sale_rank_head_show");
            LIZ2.LJIILLIIL(LJIILIIL);
            if (C29306Beo.LJIIJ(LJIILIIL)) {
                str2 = "1";
            }
            LIZ2.LJIJJ(str2, "is_self");
            User user3 = rank.user;
            if (user3 != null) {
                l = Long.valueOf(user3.getId());
            } else {
                l = null;
            }
            LIZ2.LJIJJ(l, "head_author_id");
            LIZ2.LJIJJ(Long.valueOf(rank.roomId), "head_room_id");
            LIZ2.LJIJJ(Long.valueOf(rank.rank), "head_position");
            if (rankView != null && rankView.LJLIL == -1) {
                str = "last";
            } else {
                str = "this";
            }
            LIZ2.LJIJJ(str, "rank_period");
            if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
                l3 = Long.valueOf(room.getOwnerUserId());
            }
            LIZ2.LJIJJ(l3, "author_id");
            LIZ2.LJIJJ(Long.valueOf(C28652BMi.LIZ(rankTypeAll.LIZIZ.type, false)), "author_rank");
            LIZ2.LJIJJ("TEMAI", "EVENT_ORIGIN_FEATURE");
            LIZ2.LJIJJ("live", "page_name");
            LIZ2.LIZLLL(C28835BTj.LIZJ("user_live_duration"));
            LIZ2.LJJIIJZLJL();
        }
    }

    @Override // X.CZ9
    public final void LIZIZ(RankListV2Response.RankInfo rank) {
        RankListV2Response.RankView rankView;
        long j;
        long j2;
        User user;
        o.LJIIIZ(rank, "rank");
        RankListFragment rankListFragment = this.LIZ;
        RankListController rankListController = rankListFragment.LJLJJLL;
        if (rankListController != null && (rankView = rankListController.LJII().LJLILLLLZI) != null) {
            C31526CYw rankTypeAll = rankListFragment.LJLJJI;
            o.LJIIIZ(rankTypeAll, "rankTypeAll");
            IChildController iChildController = (IChildController) rankListController.LJLILLLLZI;
            iChildController.getClass();
            RankRootController rankRootController = (RankRootController) iChildController.LJLILLLLZI;
            rankRootController.getClass();
            WeeklyRankRegionInfo weeklyRankRegionInfo = rankView.weeklyRegionInfo;
            List<RankListV2Response.RankInfo> list = rankView.ranks;
            RankListV2Response.RankInfo rankInfo = rankView.ownerRank;
            if (rankInfo != null && (user = rankInfo.user) != null) {
                j = user.getId();
            } else {
                j = 0;
            }
            RankListV2Response.RankInfo rankInfo2 = rankView.ownerRank;
            if (rankInfo2 != null) {
                j2 = rankInfo2.rank;
            } else {
                j2 = 0;
            }
            rankRootController.LJ(rank, new C77935UiJ(rankTypeAll, weeklyRankRegionInfo, null, list, j, j2, false, false));
        }
    }
}
