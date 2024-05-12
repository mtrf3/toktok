package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PushStreamInfoResponse_ProtoDecoder implements InterfaceC31105CIr<PushStreamInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final PushStreamInfoResponse LIZ(Q9H q9h) {
        PushStreamInfoResponse pushStreamInfoResponse = new PushStreamInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        pushStreamInfoResponse.extra = _PushStreamInfoExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    pushStreamInfoResponse.data = _PushStreamInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pushStreamInfoResponse;
            }
        }
    }
}
