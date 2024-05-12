package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CreateTimerResponse_ProtoDecoder implements InterfaceC31105CIr<CreateTimerResponse> {
    @Override // X.InterfaceC31105CIr
    public final CreateTimerResponse LIZ(Q9H q9h) {
        CreateTimerResponse createTimerResponse = new CreateTimerResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    createTimerResponse.data = _CreateTimerResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return createTimerResponse;
            }
        }
    }
}
