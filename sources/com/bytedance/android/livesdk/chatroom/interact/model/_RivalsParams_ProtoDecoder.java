package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RivalsParams_ProtoDecoder implements InterfaceC31105CIr<RivalsParams> {
    @Override // X.InterfaceC31105CIr
    public final RivalsParams LIZ(Q9H q9h) {
        RivalsParams rivalsParams = new RivalsParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 101) {
                            switch (LJI) {
                                case 6:
                                    rivalsParams.topLivingSuggestUid = q9h.LJIIJJI();
                                    break;
                                case 7:
                                    rivalsParams.isOfficialChannel = Q9J.LIZ(q9h);
                                    break;
                                case 8:
                                    rivalsParams.entrance = q9h.LJIIJ();
                                    break;
                                case 9:
                                    rivalsParams.panelStyleVersion = q9h.LJIIJJI();
                                    break;
                                default:
                                    Q9J.LIZJ(q9h);
                                    break;
                            }
                        } else {
                            rivalsParams.clientLogId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        rivalsParams.roomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    rivalsParams.rivalsType = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return rivalsParams;
            }
        }
    }
}
