package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _UpdateBlockStatusResponse_ProtoDecoder implements InterfaceC31105CIr<UpdateBlockStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final UpdateBlockStatusResponse LIZ(Q9H q9h) {
        UpdateBlockStatusResponse updateBlockStatusResponse = new UpdateBlockStatusResponse();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return updateBlockStatusResponse;
    }
}