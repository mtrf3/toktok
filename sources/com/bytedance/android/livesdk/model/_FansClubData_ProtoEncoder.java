package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes16.dex */
public final class _FansClubData_ProtoEncoder implements InterfaceC64604PXc<FansClubData> {
    public static int LIZJ(FansClubData fansClubData) {
        int LIZ;
        if (fansClubData == null) {
            return 0;
        }
        int LJI = C30957CCz.LJI(3, fansClubData.userFansClubStatus) + C30957CCz.LJI(2, fansClubData.level) + C30957CCz.LJIIL(1, fansClubData.clubName);
        FansClubData.UserBadge userBadge = fansClubData.badge;
        if (userBadge == null) {
            LIZ = 0;
        } else {
            int LIZJ = _FansClubData_UserBadge_ProtoEncoder.LIZJ(userBadge);
            LIZ = CD6.LIZ(4) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int i = LJI + LIZ;
        List<Long> list = fansClubData.availableGiftIds;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < fansClubData.availableGiftIds.size(); i2++) {
                i += C30957CCz.LJIIJ(5, (Long) ListProtector.get(fansClubData.availableGiftIds, i2));
            }
        }
        return C30957CCz.LJIIIZ(6, fansClubData.anchorId) + i;
    }

    public static void LIZIZ(CD6 cd6, FansClubData fansClubData) {
        C30957CCz.LIZLLL(cd6, 1, fansClubData.clubName);
        int i = fansClubData.level;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i);
        int i2 = fansClubData.userFansClubStatus;
        cd6.LIZLLL(3, 0);
        cd6.LIZJ(i2);
        FansClubData.UserBadge userBadge = fansClubData.badge;
        if (userBadge != null) {
            cd6.LIZLLL(4, 2);
            cd6.LJ(_FansClubData_UserBadge_ProtoEncoder.LIZJ(userBadge));
            _FansClubData_UserBadge_ProtoEncoder.LIZIZ(cd6, userBadge);
        }
        List<Long> list = fansClubData.availableGiftIds;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < fansClubData.availableGiftIds.size(); i3++) {
                C30957CCz.LIZJ(cd6, 5, (Long) ListProtector.get(fansClubData.availableGiftIds, i3));
            }
        }
        long j = fansClubData.anchorId;
        cd6.LIZLLL(6, 0);
        cd6.LJFF(j);
    }

    public static int LIZLLL(int i, FansClubData fansClubData) {
        if (fansClubData == null) {
            return 0;
        }
        int LIZJ = LIZJ(fansClubData);
        return CD6.LIZ(i) + CD6.LIZIZ(LIZJ) + LIZJ;
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, FansClubData fansClubData) {
        LIZIZ(cd6, fansClubData);
    }
}
