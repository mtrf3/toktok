package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AnchorLiveFragmentEditRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveFragmentEditRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorLiveFragmentEditRequest LIZ(Q9H q9h) {
        AnchorLiveFragmentEditRequest anchorLiveFragmentEditRequest = new AnchorLiveFragmentEditRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                anchorLiveFragmentEditRequest.action = q9h.LJIIJ();
                            }
                        } else {
                            anchorLiveFragmentEditRequest.endTime = q9h.LJIIJJI();
                        }
                    } else {
                        anchorLiveFragmentEditRequest.startTime = q9h.LJIIJJI();
                    }
                } else {
                    anchorLiveFragmentEditRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLiveFragmentEditRequest;
            }
        }
    }
}