package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _LiveFragmentMontageRequest_ProtoDecoder implements InterfaceC31105CIr<LiveFragmentMontageRequest> {
    @Override // X.InterfaceC31105CIr
    public final LiveFragmentMontageRequest LIZ(Q9H q9h) {
        LiveFragmentMontageRequest liveFragmentMontageRequest = new LiveFragmentMontageRequest();
        liveFragmentMontageRequest.videoTracks = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveFragmentMontageRequest.roomId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        liveFragmentMontageRequest.title = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        liveFragmentMontageRequest.fragmentId = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        liveFragmentMontageRequest.videoTracks.add(_VideoTrack_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        liveFragmentMontageRequest.isPost = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        liveFragmentMontageRequest.vcloudVideoParamVideoExtra = _VcloudVideoEditParamVideoExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveFragmentMontageRequest;
            }
        }
    }
}
