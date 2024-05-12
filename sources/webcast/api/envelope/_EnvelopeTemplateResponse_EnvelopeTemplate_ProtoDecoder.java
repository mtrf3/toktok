package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.envelope.EnvelopeTemplateResponse;

/* loaded from: classes17.dex */
public final class _EnvelopeTemplateResponse_EnvelopeTemplate_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateResponse.EnvelopeTemplate> {
    public static EnvelopeTemplateResponse.EnvelopeTemplate LIZIZ(Q9H q9h) {
        EnvelopeTemplateResponse.EnvelopeTemplate envelopeTemplate = new EnvelopeTemplateResponse.EnvelopeTemplate();
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
                                    envelopeTemplate.countdownSecond = q9h.LJIIJ();
                                }
                            } else {
                                envelopeTemplate.diamondCount = q9h.LJIIJ();
                            }
                        } else {
                            envelopeTemplate.peopleCount = q9h.LJIIJ();
                        }
                    } else {
                        envelopeTemplate.businessType = q9h.LJIIJ();
                    }
                } else {
                    envelopeTemplate.envelopeTemplateId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return envelopeTemplate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnvelopeTemplateResponse.EnvelopeTemplate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
