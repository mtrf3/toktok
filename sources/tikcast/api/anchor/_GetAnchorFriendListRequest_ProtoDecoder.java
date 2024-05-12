package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _GetAnchorFriendListRequest_ProtoDecoder implements InterfaceC31105CIr<GetAnchorFriendListRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetAnchorFriendListRequest LIZ(Q9H q9h) {
        GetAnchorFriendListRequest getAnchorFriendListRequest = new GetAnchorFriendListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            getAnchorFriendListRequest.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        getAnchorFriendListRequest.count = q9h.LJIIJ();
                    }
                } else {
                    getAnchorFriendListRequest.offset = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return getAnchorFriendListRequest;
            }
        }
    }
}
