package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RoomGoalsRequest_ProtoDecoder implements InterfaceC31105CIr<RoomGoalsRequest> {
    @Override // X.InterfaceC31105CIr
    public final RoomGoalsRequest LIZ(Q9H q9h) {
        RoomGoalsRequest roomGoalsRequest = new RoomGoalsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomGoalsRequest.secOwnerId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        roomGoalsRequest.roomId = q9h.LJIIJJI();
                        break;
                    case 3:
                        roomGoalsRequest.type = q9h.LJIIJ();
                        break;
                    case 4:
                        roomGoalsRequest.goalId = q9h.LJIIJJI();
                        break;
                    case 5:
                        roomGoalsRequest.source = q9h.LJIIJ();
                        break;
                    case 6:
                        roomGoalsRequest.recommendExtra = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        roomGoalsRequest.goalScene = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomGoalsRequest;
            }
        }
    }
}
