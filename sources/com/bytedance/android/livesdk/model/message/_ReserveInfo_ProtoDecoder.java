package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _ReserveInfo_ProtoDecoder implements InterfaceC31105CIr<ReserveInfo> {
    public static ReserveInfo LIZIZ(Q9H q9h) {
        ReserveInfo reserveInfo = new ReserveInfo();
        reserveInfo.displayUserList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 6) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    reserveInfo.displayUserList.add(_ReserveInfo_ReserveUser_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                reserveInfo.reservationAnchorCnts = q9h.LJIIJJI();
                            }
                        } else {
                            reserveInfo.acceptAppointmentCnts = q9h.LJIIJJI();
                        }
                    } else {
                        reserveInfo.isReservationSender = Q9J.LIZ(q9h);
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
    public final ReserveInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
