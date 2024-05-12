package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;

/* loaded from: classes14.dex */
public final class _RivalExtraInfo_ReserveInfo_ProtoDecoder implements InterfaceC31105CIr<RivalExtraInfo.ReserveInfo> {
    public static RivalExtraInfo.ReserveInfo LIZIZ(Q9H q9h) {
        RivalExtraInfo.ReserveInfo reserveInfo = new RivalExtraInfo.ReserveInfo();
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
                                    reserveInfo.isReservationSender = Q9J.LIZ(q9h);
                                }
                            } else {
                                reserveInfo.responseTime = q9h.LJIIJJI();
                            }
                        } else {
                            reserveInfo.bubbleTip = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        reserveInfo.replyStatus = q9h.LJIIJ();
                    }
                } else {
                    reserveInfo.reservationId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return reserveInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalExtraInfo.ReserveInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
