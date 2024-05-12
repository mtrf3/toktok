package webcast.api.creator;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PushStreamInfoRequest_ProtoDecoder implements InterfaceC31105CIr<PushStreamInfoRequest> {
    @Override // X.InterfaceC31105CIr
    public final PushStreamInfoRequest LIZ(Q9H q9h) {
        PushStreamInfoRequest pushStreamInfoRequest = new PushStreamInfoRequest();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return pushStreamInfoRequest;
    }
}
