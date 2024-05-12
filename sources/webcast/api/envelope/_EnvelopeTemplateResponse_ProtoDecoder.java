package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _EnvelopeTemplateResponse_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateResponse> {
    @Override // X.InterfaceC31105CIr
    public final EnvelopeTemplateResponse LIZ(Q9H q9h) {
        EnvelopeTemplateResponse envelopeTemplateResponse = new EnvelopeTemplateResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    envelopeTemplateResponse.data = _EnvelopeTemplateResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return envelopeTemplateResponse;
            }
        }
    }
}
