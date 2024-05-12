package webcast.api.room;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.ArrayList;
import java.util.List;
import webcast.api.room.FirstScreenResponse;
import webcast.api.room.GetOnlineRoomPCUResponse;

/* loaded from: classes6.dex */
public final class RoomComponentsV2Response {

    @InterfaceC65349Pkn("components")
    public FirstScreenResponse.ResponseData components;

    @InterfaceC65349Pkn("components_status")
    public long componentsStatus;

    @InterfaceC65349Pkn("online_audience")
    public OnlineRankListResponse onlineAudience;

    @InterfaceC65349Pkn("online_audience_status")
    public long onlineAudienceStatus;

    @InterfaceC65349Pkn("rankings")
    public List<RankEntranceV3Response.EntranceGroup> rankings = new ArrayList();

    @InterfaceC65349Pkn("rankings_status")
    public long rankingsStatus;

    @InterfaceC65349Pkn("room_pcu")
    public GetOnlineRoomPCUResponse.ResponseData roomPcu;

    @InterfaceC65349Pkn("room_pcu_status")
    public long roomPcuStatus;
}
