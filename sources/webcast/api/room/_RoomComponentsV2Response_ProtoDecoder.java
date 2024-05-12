package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.roomcomponents._OnlineRankListResponse_ProtoDecoder;
import com.bytedance.android.livesdk.rank.model._RankEntranceV3Response_EntranceGroup_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RoomComponentsV2Response_ProtoDecoder implements InterfaceC31105CIr<RoomComponentsV2Response> {
    @Override // X.InterfaceC31105CIr
    public final RoomComponentsV2Response LIZ(Q9H q9h) {
        RoomComponentsV2Response roomComponentsV2Response = new RoomComponentsV2Response();
        roomComponentsV2Response.rankings = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomComponentsV2Response.onlineAudienceStatus = q9h.LJIIJJI();
                        break;
                    case 2:
                        roomComponentsV2Response.onlineAudience = _OnlineRankListResponse_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        roomComponentsV2Response.rankingsStatus = q9h.LJIIJJI();
                        break;
                    case 4:
                        roomComponentsV2Response.rankings.add(_RankEntranceV3Response_EntranceGroup_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        roomComponentsV2Response.componentsStatus = q9h.LJIIJJI();
                        break;
                    case 6:
                        roomComponentsV2Response.components = _FirstScreenResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        roomComponentsV2Response.roomPcuStatus = q9h.LJIIJJI();
                        break;
                    case 8:
                        roomComponentsV2Response.roomPcu = _GetOnlineRoomPCUResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomComponentsV2Response;
            }
        }
    }
}
