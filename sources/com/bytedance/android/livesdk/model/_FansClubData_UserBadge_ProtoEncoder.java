package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.model.FansClubData;
import java.util.Map;

/* loaded from: classes16.dex */
public final class _FansClubData_UserBadge_ProtoEncoder implements InterfaceC64604PXc<FansClubData.UserBadge> {
    public static int LIZJ(FansClubData.UserBadge userBadge) {
        Map<Integer, ImageModel> map = userBadge.icons;
        int i = 0;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, ImageModel> entry : userBadge.icons.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int LJ = _ImageModel_ProtoEncoder.LJ(2, entry.getValue()) + C30957CCz.LJII(1, entry.getKey());
                    i += CD6.LIZ(1) + CD6.LIZIZ(LJ) + LJ;
                }
            }
        }
        return C30957CCz.LJIIL(2, userBadge.title) + i;
    }

    public static void LIZIZ(CD6 cd6, FansClubData.UserBadge userBadge) {
        Map<Integer, ImageModel> map = userBadge.icons;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, ImageModel> entry : userBadge.icons.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    cd6.LIZLLL(1, 2);
                    cd6.LJ(_ImageModel_ProtoEncoder.LJ(2, entry.getValue()) + C30957CCz.LJII(1, entry.getKey()));
                    C30957CCz.LIZIZ(cd6, 1, entry.getKey());
                    _ImageModel_ProtoEncoder.LIZJ(cd6, 2, entry.getValue());
                }
            }
        }
        C30957CCz.LIZLLL(cd6, 2, userBadge.title);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, FansClubData.UserBadge userBadge) {
        LIZIZ(cd6, userBadge);
    }
}
