package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.GetOnlineRoomPCUResponse;

/* loaded from: classes6.dex */
public final class _GetOnlineRoomPCUResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetOnlineRoomPCUResponse.ResponseData> {
    public static GetOnlineRoomPCUResponse.ResponseData LIZIZ(Q9H q9h) {
        GetOnlineRoomPCUResponse.ResponseData responseData = new GetOnlineRoomPCUResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        responseData.anonymousUserCount = q9h.LJIIJJI();
                    }
                } else {
                    responseData.totalUserCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetOnlineRoomPCUResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
