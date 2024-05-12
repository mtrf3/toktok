package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _QueryCommercialContentToggleResponse_ProtoDecoder implements InterfaceC31105CIr<QueryCommercialContentToggleResponse> {
    @Override // X.InterfaceC31105CIr
    public final QueryCommercialContentToggleResponse LIZ(Q9H q9h) {
        QueryCommercialContentToggleResponse queryCommercialContentToggleResponse = new QueryCommercialContentToggleResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    queryCommercialContentToggleResponse.data = _QueryCommercialContentToggleResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return queryCommercialContentToggleResponse;
            }
        }
    }
}
