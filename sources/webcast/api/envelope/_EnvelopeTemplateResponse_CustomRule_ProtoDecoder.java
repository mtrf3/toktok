package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.envelope.EnvelopeTemplateResponse;

/* loaded from: classes17.dex */
public final class _EnvelopeTemplateResponse_CustomRule_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateResponse.CustomRule> {
    public static EnvelopeTemplateResponse.CustomRule LIZIZ(Q9H q9h) {
        EnvelopeTemplateResponse.CustomRule customRule = new EnvelopeTemplateResponse.CustomRule();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        customRule.minDiamond = q9h.LJIIJ();
                        break;
                    case 2:
                        customRule.maxDiamond = q9h.LJIIJ();
                        break;
                    case 3:
                        customRule.minPeopleCount = q9h.LJIIJ();
                        break;
                    case 4:
                        customRule.maxPeopleCount = q9h.LJIIJ();
                        break;
                    case 5:
                        customRule.minCountdownSecond = q9h.LJIIJ();
                        break;
                    case 6:
                        customRule.maxCountdownSecond = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return customRule;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnvelopeTemplateResponse.CustomRule LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
