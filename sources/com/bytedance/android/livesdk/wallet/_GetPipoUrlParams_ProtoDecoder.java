package com.bytedance.android.livesdk.wallet;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetPipoUrlParams_ProtoDecoder implements InterfaceC31105CIr<GetPipoUrlParams> {
    @Override // X.InterfaceC31105CIr
    public final GetPipoUrlParams LIZ(Q9H q9h) {
        GetPipoUrlParams getPipoUrlParams = new GetPipoUrlParams();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return getPipoUrlParams;
    }
}
