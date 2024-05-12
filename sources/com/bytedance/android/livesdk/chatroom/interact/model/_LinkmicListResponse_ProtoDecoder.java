package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostListUser_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkmicListResponse_ProtoDecoder implements InterfaceC31105CIr<LinkmicListResponse> {
    @Override // X.InterfaceC31105CIr
    public final LinkmicListResponse LIZ(Q9H q9h) {
        LinkmicListResponse linkmicListResponse = new LinkmicListResponse();
        linkmicListResponse.users = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        linkmicListResponse.users.add(_CohostListUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    linkmicListResponse.totalPositionCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkmicListResponse;
            }
        }
    }
}
