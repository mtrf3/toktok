package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _EnvelopeTemplateRequest_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateRequest> {
    @Override // X.InterfaceC31105CIr
    public final EnvelopeTemplateRequest LIZ(Q9H q9h) {
        EnvelopeTemplateRequest envelopeTemplateRequest = new EnvelopeTemplateRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    envelopeTemplateRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return envelopeTemplateRequest;
            }
        }
    }
}
