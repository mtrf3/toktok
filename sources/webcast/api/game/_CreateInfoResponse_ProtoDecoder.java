package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _CreateInfoResponse_ProtoDecoder implements InterfaceC31105CIr<CreateInfoResponse> {
    @Override // X.InterfaceC31105CIr
    public final CreateInfoResponse LIZ(Q9H q9h) {
        CreateInfoResponse createInfoResponse = new CreateInfoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    createInfoResponse.data = _CreateInfoResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return createInfoResponse;
            }
        }
    }
}
