package webcast.api.goody_bag;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SendGoodyBagResponse_ProtoDecoder implements InterfaceC31105CIr<SendGoodyBagResponse> {
    @Override // X.InterfaceC31105CIr
    public final SendGoodyBagResponse LIZ(Q9H q9h) {
        SendGoodyBagResponse sendGoodyBagResponse = new SendGoodyBagResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    sendGoodyBagResponse.data = _SendGoodyBagResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return sendGoodyBagResponse;
            }
        }
    }
}
