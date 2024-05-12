package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GuestClientList_ProtoDecoder implements InterfaceC31105CIr<GuestClientList> {
    public static GuestClientList LIZIZ(Q9H q9h) {
        GuestClientList guestClientList = new GuestClientList();
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
                                    guestClientList.rtcStatus = q9h.LJIIJ();
                                }
                            } else {
                                guestClientList.source = q9h.LJIIJ();
                            }
                        } else {
                            guestClientList.status = q9h.LJIIJ();
                        }
                    } else {
                        guestClientList.linkMicId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    guestClientList.uid = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return guestClientList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuestClientList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
