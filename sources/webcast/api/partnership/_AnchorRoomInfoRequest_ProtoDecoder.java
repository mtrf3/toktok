package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _AnchorRoomInfoRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorRoomInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorRoomInfoRequest LIZ(Q9H q9h) {
        AnchorRoomInfoRequest anchorRoomInfoRequest = new AnchorRoomInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    anchorRoomInfoRequest.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorRoomInfoRequest;
            }
        }
    }
}