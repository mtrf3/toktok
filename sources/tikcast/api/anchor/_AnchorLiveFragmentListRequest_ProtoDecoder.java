package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _AnchorLiveFragmentListRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveFragmentListRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorLiveFragmentListRequest LIZ(Q9H q9h) {
        AnchorLiveFragmentListRequest anchorLiveFragmentListRequest = new AnchorLiveFragmentListRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        anchorLiveFragmentListRequest.fragmentType = q9h.LJIIJ();
                    }
                } else {
                    anchorLiveFragmentListRequest.roomIds = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLiveFragmentListRequest;
            }
        }
    }
}
