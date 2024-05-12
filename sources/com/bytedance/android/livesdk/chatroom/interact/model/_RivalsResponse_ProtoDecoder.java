package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RivalsResponse_ProtoDecoder implements InterfaceC31105CIr<RivalsResponse> {
    @Override // X.InterfaceC31105CIr
    public final RivalsResponse LIZ(Q9H q9h) {
        RivalsResponse rivalsResponse = new RivalsResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        rivalsResponse.extra = _RivalsListExtra_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    rivalsResponse.data = _RivalsListsData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rivalsResponse;
            }
        }
    }
}
