package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.envelope.EnvelopeTemplateResponse;

/* loaded from: classes17.dex */
public final class _EnvelopeTemplateResponse_AnchorOnBoardPermit_ProtoDecoder implements InterfaceC31105CIr<EnvelopeTemplateResponse.AnchorOnBoardPermit> {
    public static EnvelopeTemplateResponse.AnchorOnBoardPermit LIZIZ(Q9H q9h) {
        EnvelopeTemplateResponse.AnchorOnBoardPermit anchorOnBoardPermit = new EnvelopeTemplateResponse.AnchorOnBoardPermit();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        anchorOnBoardPermit.permitTips = Q9J.LIZIZ(q9h);
                    }
                } else {
                    anchorOnBoardPermit.anchorOnboardPermit = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorOnBoardPermit;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EnvelopeTemplateResponse.AnchorOnBoardPermit LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
