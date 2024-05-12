package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetRoomGoodyBagResponse_ProtoDecoder implements InterfaceC31105CIr<GetRoomGoodyBagResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetRoomGoodyBagResponse LIZ(Q9H q9h) {
        GetRoomGoodyBagResponse getRoomGoodyBagResponse = new GetRoomGoodyBagResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getRoomGoodyBagResponse.data = _GetRoomGoodyBagResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getRoomGoodyBagResponse;
            }
        }
    }
}
