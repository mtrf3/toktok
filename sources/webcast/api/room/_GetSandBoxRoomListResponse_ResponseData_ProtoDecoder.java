package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import webcast.api.room.GetSandBoxRoomListResponse;

/* loaded from: classes17.dex */
public final class _GetSandBoxRoomListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<GetSandBoxRoomListResponse.ResponseData> {
    public static GetSandBoxRoomListResponse.ResponseData LIZIZ(Q9H q9h) {
        GetSandBoxRoomListResponse.ResponseData responseData = new GetSandBoxRoomListResponse.ResponseData();
        responseData.sandBoxRooms = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.sandBoxRooms.add(_GetSandBoxRoomListResponse_SandBoxRoom_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSandBoxRoomListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
