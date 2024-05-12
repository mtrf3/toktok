package com.bytedance.android.livesdk.model;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _Reservation_ProtoDecoder implements InterfaceC31105CIr<Reservation> {
    @Override // X.InterfaceC31105CIr
    public final Reservation LIZ(Q9H q9h) {
        Reservation reservation = new Reservation();
        reservation.btnRect = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        reservation.appointmentId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        reservation.anchorId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 3:
                        reservation.roomId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        reservation.startTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        reservation.endTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        C29991Fr.LIZ(q9h, reservation.btnRect);
                        break;
                    case 7:
                        reservation.btnColor = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        reservation.isReserved = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return reservation;
            }
        }
    }
}
