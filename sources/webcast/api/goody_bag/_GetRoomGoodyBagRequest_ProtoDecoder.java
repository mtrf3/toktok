package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetRoomGoodyBagRequest_ProtoDecoder implements InterfaceC31105CIr<GetRoomGoodyBagRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetRoomGoodyBagRequest LIZ(Q9H q9h) {
        GetRoomGoodyBagRequest getRoomGoodyBagRequest = new GetRoomGoodyBagRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getRoomGoodyBagRequest.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getRoomGoodyBagRequest;
            }
        }
    }
}
