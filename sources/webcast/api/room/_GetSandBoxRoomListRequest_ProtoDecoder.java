package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetSandBoxRoomListRequest_ProtoDecoder implements InterfaceC31105CIr<GetSandBoxRoomListRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetSandBoxRoomListRequest LIZ(Q9H q9h) {
        GetSandBoxRoomListRequest getSandBoxRoomListRequest = new GetSandBoxRoomListRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return getSandBoxRoomListRequest;
    }
}
