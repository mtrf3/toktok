package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AnchorLiveReplayFrameRequest_ProtoDecoder implements InterfaceC31105CIr<AnchorLiveReplayFrameRequest> {
    @Override // X.InterfaceC31105CIr
    public final AnchorLiveReplayFrameRequest LIZ(Q9H q9h) {
        AnchorLiveReplayFrameRequest anchorLiveReplayFrameRequest = new AnchorLiveReplayFrameRequest();
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
                                anchorLiveReplayFrameRequest.generateIfNotGet = Q9J.LIZ(q9h);
                            }
                        } else {
                            anchorLiveReplayFrameRequest.endTime = q9h.LJIIJJI();
                        }
                    } else {
                        anchorLiveReplayFrameRequest.startTime = q9h.LJIIJJI();
                    }
                } else {
                    anchorLiveReplayFrameRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLiveReplayFrameRequest;
            }
        }
    }
}
