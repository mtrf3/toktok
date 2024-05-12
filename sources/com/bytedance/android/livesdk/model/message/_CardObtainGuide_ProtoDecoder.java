package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _CardObtainGuide_ProtoDecoder implements InterfaceC31105CIr<CardObtainGuide> {
    @Override // X.InterfaceC31105CIr
    public final CardObtainGuide LIZ(Q9H q9h) {
        CardObtainGuide cardObtainGuide = new CardObtainGuide();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return cardObtainGuide;
    }
}
