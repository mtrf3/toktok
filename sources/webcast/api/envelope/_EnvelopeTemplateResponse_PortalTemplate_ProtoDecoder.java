package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.envelope.EnvelopeTemplateResponse;

/* loaded from: classes17.dex */
public final class _EnvelopeTemplateResponse_PortalTemplate_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateResponse.PortalTemplate> {
    public static EnvelopeTemplateResponse.PortalTemplate LIZIZ(Q9H q9h) {
        EnvelopeTemplateResponse.PortalTemplate portalTemplate = new EnvelopeTemplateResponse.PortalTemplate();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    portalTemplate.targetTouchCount = q9h.LJIIJ();
                                }
                            } else {
                                portalTemplate.portalDiamonds = q9h.LJIIJ();
                            }
                        } else {
                            portalTemplate.envelopeDiamonds = q9h.LJIIJ();
                        }
                    } else {
                        portalTemplate.totalDiamonds = q9h.LJIIJ();
                    }
                } else {
                    portalTemplate.templateId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return portalTemplate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnvelopeTemplateResponse.PortalTemplate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
