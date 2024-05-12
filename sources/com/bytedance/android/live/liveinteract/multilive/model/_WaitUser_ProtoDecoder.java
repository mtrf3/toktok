package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _WaitUser_ProtoDecoder implements InterfaceC31105CIr<WaitUser> {
    public static WaitUser LIZIZ(Q9H q9h) {
        WaitUser waitUser = new WaitUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        waitUser.linkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    waitUser.uid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return waitUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final WaitUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
