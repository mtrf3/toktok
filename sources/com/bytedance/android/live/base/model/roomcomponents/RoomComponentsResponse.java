package com.bytedance.android.live.base.model.roomcomponents;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import webcast.api.room.GetOnlineRoomPCUResponse;

/* loaded from: classes.dex */
public final class RoomComponentsResponse extends F9E {

    @InterfaceC65349Pkn("online_audience")
    public OnlineRankListResponse onlineAudienceData;

    @InterfaceC65349Pkn("online_audience_status")
    public Long onlineAudienceStatus;

    @InterfaceC65349Pkn("rankings")
    public List<RankEntranceV3Response.EntranceGroup> rankingData;

    @InterfaceC65349Pkn("rankings_status")
    public Long rankingStatus;

    @InterfaceC65349Pkn("room_pcu")
    public GetOnlineRoomPCUResponse.ResponseData roomPcu;

    @InterfaceC65349Pkn("room_pcu_status")
    public long roomPcuStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public RoomComponentsResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoomComponentsResponse copy$default(RoomComponentsResponse roomComponentsResponse, Long l, OnlineRankListResponse onlineRankListResponse, Long l2, List list, long j, GetOnlineRoomPCUResponse.ResponseData responseData, int i, Object obj) {
        if ((i & 1) != 0) {
            l = roomComponentsResponse.onlineAudienceStatus;
        }
        if ((i & 2) != 0) {
            onlineRankListResponse = roomComponentsResponse.onlineAudienceData;
        }
        if ((i & 4) != 0) {
            l2 = roomComponentsResponse.rankingStatus;
        }
        if ((i & 8) != 0) {
            list = roomComponentsResponse.rankingData;
        }
        if ((i & 16) != 0) {
            j = roomComponentsResponse.roomPcuStatus;
        }
        if ((i & 32) != 0) {
            responseData = roomComponentsResponse.roomPcu;
        }
        return roomComponentsResponse.copy(l, onlineRankListResponse, l2, list, j, responseData);
    }

    public final Long component1() {
        return this.onlineAudienceStatus;
    }

    public final OnlineRankListResponse component2() {
        return this.onlineAudienceData;
    }

    public final Long component3() {
        return this.rankingStatus;
    }

    public final List<RankEntranceV3Response.EntranceGroup> component4() {
        return this.rankingData;
    }

    public final long component5() {
        return this.roomPcuStatus;
    }

    public final GetOnlineRoomPCUResponse.ResponseData component6() {
        return this.roomPcu;
    }

    public final RoomComponentsResponse copy(Long l, OnlineRankListResponse onlineRankListResponse, Long l2, List<RankEntranceV3Response.EntranceGroup> list, long j, GetOnlineRoomPCUResponse.ResponseData responseData) {
        return new RoomComponentsResponse(l, onlineRankListResponse, l2, list, j, responseData);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.onlineAudienceStatus, this.onlineAudienceData, this.rankingStatus, this.rankingData, Long.valueOf(this.roomPcuStatus), this.roomPcu};
    }

    public RoomComponentsResponse(Long l, OnlineRankListResponse onlineRankListResponse, Long l2, List<RankEntranceV3Response.EntranceGroup> list, long j, GetOnlineRoomPCUResponse.ResponseData responseData) {
        this.onlineAudienceStatus = l;
        this.onlineAudienceData = onlineRankListResponse;
        this.rankingStatus = l2;
        this.rankingData = list;
        this.roomPcuStatus = j;
        this.roomPcu = responseData;
    }

    public /* synthetic */ RoomComponentsResponse(Long l, OnlineRankListResponse onlineRankListResponse, Long l2, List list, long j, GetOnlineRoomPCUResponse.ResponseData responseData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : onlineRankListResponse, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? 0L : j, (i & 32) == 0 ? responseData : null);
    }
}
