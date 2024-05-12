package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _LinkedUser_ProtoDecoder implements InterfaceC31105CIr<LinkedUser> {
    public static LinkedUser LIZIZ(Q9H q9h) {
        LinkedUser linkedUser = new LinkedUser();
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
                                    linkedUser.position = q9h.LJIIJ();
                                }
                            } else {
                                linkedUser.videoMuteStatus = q9h.LJIIJ();
                            }
                        } else {
                            linkedUser.audioMuteStatus = q9h.LJIIJ();
                        }
                    } else {
                        linkedUser.linkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkedUser.uid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkedUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkedUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
