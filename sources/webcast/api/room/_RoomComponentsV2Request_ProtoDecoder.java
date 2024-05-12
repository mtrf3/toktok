package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RoomComponentsV2Request_ProtoDecoder implements InterfaceC31105CIr<RoomComponentsV2Request> {
    @Override // X.InterfaceC31105CIr
    public final RoomComponentsV2Request LIZ(Q9H q9h) {
        RoomComponentsV2Request roomComponentsV2Request = new RoomComponentsV2Request();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomComponentsV2Request.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        roomComponentsV2Request.anchorId = q9h.LJIIJJI();
                        break;
                    case 3:
                        roomComponentsV2Request.source = q9h.LJIIJJI();
                        break;
                    case 4:
                        roomComponentsV2Request.needOnlineAudience = q9h.LJIIJJI();
                        break;
                    case 5:
                        roomComponentsV2Request.needRankings = q9h.LJIIJJI();
                        break;
                    case 6:
                        roomComponentsV2Request.needComponents = q9h.LJIIJJI();
                        break;
                    case 7:
                        roomComponentsV2Request.roomTag = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        roomComponentsV2Request.needRoomPcu = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomComponentsV2Request;
            }
        }
    }
}
