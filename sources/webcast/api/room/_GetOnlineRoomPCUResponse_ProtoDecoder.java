package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetOnlineRoomPCUResponse_ProtoDecoder implements InterfaceC31105CIr<GetOnlineRoomPCUResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetOnlineRoomPCUResponse LIZ(Q9H q9h) {
        GetOnlineRoomPCUResponse getOnlineRoomPCUResponse = new GetOnlineRoomPCUResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getOnlineRoomPCUResponse.data = _GetOnlineRoomPCUResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getOnlineRoomPCUResponse;
            }
        }
    }
}
