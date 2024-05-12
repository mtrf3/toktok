package com.bytedance.android.livesdk.rank.impl.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.List;
import webcast.api.room.GetOnlineRoomPCUResponse;

/* loaded from: classes6.dex */
public interface RankApi {
    @E8L("/webcast/ranklist/online_audience/")
    AbstractC73672Svk<String> getOnlineRankList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("source") int i, @InterfaceC64986Pew("use_simple_user") boolean z);

    @E8L("/webcast/room/pcu/")
    AbstractC73672Svk<C28467BFf<GetOnlineRoomPCUResponse.ResponseData>> getOnlineRoomPCU(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2);

    @E8L("/webcast/ranklist/list/v2/")
    AbstractC73672Svk<String> getRankListV2(@InterfaceC64986Pew("anchor_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("rank_type") String str, @InterfaceC64986Pew("region_type") int i, @InterfaceC64986Pew("gap_interval") long j3, @InterfaceC64986Pew("use_simple_user") boolean z, @InterfaceC64986Pew("league_phase") int i2);

    @E8L("/webcast/ranklist/entrance/v3/")
    AbstractC73672Svk<C28467BFf<List<RankEntranceV3Response.EntranceGroup>>> queryRankEntrancesV3(@InterfaceC64986Pew("anchor_id") long j, @InterfaceC64986Pew("room_id") long j2);
}
