package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.GetSandBoxRoomListResponse;

/* loaded from: classes17.dex */
public final class _GetSandBoxRoomListResponse_SandBoxRoom_ProtoDecoder implements InterfaceC31105CIr<GetSandBoxRoomListResponse.SandBoxRoom> {
    public static GetSandBoxRoomListResponse.SandBoxRoom LIZIZ(Q9H q9h) {
        GetSandBoxRoomListResponse.SandBoxRoom sandBoxRoom = new GetSandBoxRoomListResponse.SandBoxRoom();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        sandBoxRoom.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        sandBoxRoom.userId = q9h.LJIIJJI();
                        break;
                    case 3:
                        sandBoxRoom.userName = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        sandBoxRoom.imageModel = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        sandBoxRoom.liveRoomType = q9h.LJIIJ();
                        break;
                    case 6:
                        sandBoxRoom.title = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return sandBoxRoom;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSandBoxRoomListResponse.SandBoxRoom LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
