package com.bytedance.android.live.base.model.roomcomponents;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.model._RankEntranceV3Response_EntranceGroup_ProtoDecoder;
import java.util.ArrayList;
import webcast.api.room._GetOnlineRoomPCUResponse_ResponseData_ProtoDecoder;

/* loaded from: classes.dex */
public final class _RoomComponentsResponse_ProtoDecoder implements InterfaceC31105CIr<RoomComponentsResponse> {
    @Override // X.InterfaceC31105CIr
    public final RoomComponentsResponse LIZ(Q9H q9h) {
        RoomComponentsResponse roomComponentsResponse = new RoomComponentsResponse();
        roomComponentsResponse.rankingData = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomComponentsResponse.onlineAudienceStatus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        roomComponentsResponse.onlineAudienceData = _OnlineRankListResponse_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        roomComponentsResponse.rankingStatus = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        roomComponentsResponse.rankingData.add(_RankEntranceV3Response_EntranceGroup_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        roomComponentsResponse.roomPcuStatus = q9h.LJIIJJI();
                        break;
                    case 6:
                        roomComponentsResponse.roomPcu = _GetOnlineRoomPCUResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomComponentsResponse;
            }
        }
    }
}
