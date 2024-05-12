package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.envelope.EnvelopeTemplateResponse;

/* loaded from: classes17.dex */
public final class _EnvelopeTemplateResponse_PortalCustomRule_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateResponse.PortalCustomRule> {
    public static EnvelopeTemplateResponse.PortalCustomRule LIZIZ(Q9H q9h) {
        EnvelopeTemplateResponse.PortalCustomRule portalCustomRule = new EnvelopeTemplateResponse.PortalCustomRule();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        portalCustomRule.maxDiamonds = q9h.LJIIJ();
                    }
                } else {
                    portalCustomRule.minDiamonds = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return portalCustomRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnvelopeTemplateResponse.PortalCustomRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
