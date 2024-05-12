package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _ContinueRoomResponse_ProtoDecoder implements InterfaceC31105CIr<ContinueRoomResponse> {
    @Override // X.InterfaceC31105CIr
    public final ContinueRoomResponse LIZ(Q9H q9h) {
        ContinueRoomResponse continueRoomResponse = new ContinueRoomResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                continueRoomResponse.linkMicUserNum = q9h.LJIIJJI();
                            }
                        } else {
                            continueRoomResponse.continueScene = q9h.LJIIJ();
                        }
                    } else {
                        continueRoomResponse.crossDeviceContinueScene = q9h.LJIIJ();
                    }
                } else {
                    continueRoomResponse.room = _Room_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return continueRoomResponse;
            }
        }
    }
}
