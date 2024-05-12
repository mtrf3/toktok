package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _HideTaskResponse_ProtoDecoder implements InterfaceC31105CIr<HideTaskResponse> {
    @Override // X.InterfaceC31105CIr
    public final HideTaskResponse LIZ(Q9H q9h) {
        HideTaskResponse hideTaskResponse = new HideTaskResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return hideTaskResponse;
    }
}
