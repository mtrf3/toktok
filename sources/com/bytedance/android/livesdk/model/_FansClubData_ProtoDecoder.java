package com.bytedance.android.livesdk.model;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _FansClubData_ProtoDecoder implements InterfaceC31105CIr<FansClubData> {
    public static FansClubData LIZIZ(Q9H q9h) {
        FansClubData fansClubData = new FansClubData();
        fansClubData.availableGiftIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        fansClubData.clubName = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        fansClubData.level = q9h.LJIIJ();
                        break;
                    case 3:
                        fansClubData.userFansClubStatus = q9h.LJIIJ();
                        break;
                    case 4:
                        fansClubData.badge = _FansClubData_UserBadge_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        C29991Fr.LIZ(q9h, fansClubData.availableGiftIds);
                        break;
                    case 6:
                        fansClubData.anchorId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return fansClubData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansClubData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
