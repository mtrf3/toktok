package com.bytedance.android.livesdk.envelope.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RedEnvelopeListResponse_ProtoDecoder implements InterfaceC31105CIr<RedEnvelopeListResponse> {
    public static RedEnvelopeListResponse LIZIZ(Q9H q9h) {
        RedEnvelopeListResponse redEnvelopeListResponse = new RedEnvelopeListResponse();
        redEnvelopeListResponse.envelopList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            redEnvelopeListResponse.prompts = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        redEnvelopeListResponse.message = Q9J.LIZIZ(q9h);
                    }
                } else {
                    redEnvelopeListResponse.envelopList.add(_RedEnvelopInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return redEnvelopeListResponse;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RedEnvelopeListResponse LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
