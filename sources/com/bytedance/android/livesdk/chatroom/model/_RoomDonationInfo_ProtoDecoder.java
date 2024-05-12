package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RoomDonationInfo_ProtoDecoder implements InterfaceC31105CIr<RoomDonationInfo> {
    @Override // X.InterfaceC31105CIr
    public final RoomDonationInfo LIZ(Q9H q9h) {
        RoomDonationInfo roomDonationInfo = new RoomDonationInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 5) {
                    if (LJI != 6) {
                        if (LJI != 7) {
                            Q9J.LIZJ(q9h);
                        } else {
                            roomDonationInfo.currency = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        roomDonationInfo.totalMoney = Q9J.LIZIZ(q9h);
                    }
                } else {
                    roomDonationInfo.totalUser = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomDonationInfo;
            }
        }
    }
}
