package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _CheckActivityRoomResponse_ProtoDecoder implements InterfaceC31105CIr<CheckActivityRoomResponse> {
    @Override // X.InterfaceC31105CIr
    public final CheckActivityRoomResponse LIZ(Q9H q9h) {
        CheckActivityRoomResponse checkActivityRoomResponse = new CheckActivityRoomResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    checkActivityRoomResponse.data = _CheckActivityRoomResponse_ResponseData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return checkActivityRoomResponse;
            }
        }
    }
}
