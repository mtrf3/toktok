package com.bytedance.android.livesdk.envelope.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _EnvelopeListResponse_ProtoDecoder implements InterfaceC31105CIr<EnvelopeListResponse> {
    @Override // X.InterfaceC31105CIr
    public final EnvelopeListResponse LIZ(Q9H q9h) {
        EnvelopeListResponse envelopeListResponse = new EnvelopeListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    envelopeListResponse.data = _RedEnvelopeListResponse_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return envelopeListResponse;
            }
        }
    }
}
