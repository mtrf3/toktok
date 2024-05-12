package webcast.api.game;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _GetEmailCntRequest_ProtoDecoder implements InterfaceC31105CIr<GetEmailCntRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetEmailCntRequest LIZ(Q9H q9h) {
        GetEmailCntRequest getEmailCntRequest = new GetEmailCntRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getEmailCntRequest.recipientAddress = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getEmailCntRequest;
            }
        }
    }
}
