package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkLayerListUser_ProtoDecoder implements InterfaceC31105CIr<LinkLayerListUser> {
    public static LinkLayerListUser LIZIZ(Q9H q9h) {
        LinkLayerListUser linkLayerListUser = new LinkLayerListUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    linkLayerListUser.appVersion = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                linkLayerListUser.linkedTimeNano = q9h.LJIIJJI();
                            }
                        } else {
                            linkLayerListUser.positionData = _MicPositionData_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        linkLayerListUser.linkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkLayerListUser.linkUser = _Player_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkLayerListUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkLayerListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
