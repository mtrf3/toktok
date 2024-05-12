package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetSettingsParams_ProtoDecoder implements InterfaceC31105CIr<GetSettingsParams> {
    @Override // X.InterfaceC31105CIr
    public final GetSettingsParams LIZ(Q9H q9h) {
        GetSettingsParams getSettingsParams = new GetSettingsParams();
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
                                getSettingsParams.getAbParams = Boolean.valueOf(Q9J.LIZ(q9h));
                            }
                        } else {
                            getSettingsParams.ownerId = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        getSettingsParams.secOwnerId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    getSettingsParams.roomId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return getSettingsParams;
            }
        }
    }
}
