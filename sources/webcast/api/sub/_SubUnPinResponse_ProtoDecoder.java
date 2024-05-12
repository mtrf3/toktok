package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubUnPinResponse_ProtoDecoder implements InterfaceC31105CIr<SubUnPinResponse> {
    @Override // X.InterfaceC31105CIr
    public final SubUnPinResponse LIZ(Q9H q9h) {
        SubUnPinResponse subUnPinResponse = new SubUnPinResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return subUnPinResponse;
    }
}
