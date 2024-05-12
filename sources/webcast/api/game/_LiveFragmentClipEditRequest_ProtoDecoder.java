package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LiveFragmentClipEditRequest_ProtoDecoder implements InterfaceC31105CIr<LiveFragmentClipEditRequest> {
    @Override // X.InterfaceC31105CIr
    public final LiveFragmentClipEditRequest LIZ(Q9H q9h) {
        LiveFragmentClipEditRequest liveFragmentClipEditRequest = new LiveFragmentClipEditRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    liveFragmentClipEditRequest.isPost = Q9J.LIZ(q9h);
                                }
                            } else {
                                liveFragmentClipEditRequest.vcloudVideoParamVideoExtra = _VcloudVideoEditParamVideoExtra_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            liveFragmentClipEditRequest.fragmentId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        liveFragmentClipEditRequest.title = Q9J.LIZIZ(q9h);
                    }
                } else {
                    liveFragmentClipEditRequest.roomId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveFragmentClipEditRequest;
            }
        }
    }
}
