package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import java.util.Map;

/* loaded from: classes16.dex */
public final class _FansClubMember_ProtoEncoder implements InterfaceC64604PXc<FansClubMember> {
    public static int LIZJ(FansClubMember fansClubMember) {
        int LIZLLL = _FansClubData_ProtoEncoder.LIZLLL(1, fansClubMember.data);
        Map<Integer, FansClubData> map = fansClubMember.preferData;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, FansClubData> entry : fansClubMember.preferData.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int LIZLLL2 = _FansClubData_ProtoEncoder.LIZLLL(2, entry.getValue()) + C30957CCz.LJII(1, entry.getKey());
                    LIZLLL += CD6.LIZ(2) + CD6.LIZIZ(LIZLLL2) + LIZLLL2;
                }
            }
        }
        return LIZLLL;
    }

    public static void LIZIZ(CD6 cd6, FansClubMember fansClubMember) {
        FansClubData fansClubData = fansClubMember.data;
        if (fansClubData != null) {
            cd6.LIZLLL(1, 2);
            cd6.LJ(_FansClubData_ProtoEncoder.LIZJ(fansClubData));
            _FansClubData_ProtoEncoder.LIZIZ(cd6, fansClubData);
        }
        Map<Integer, FansClubData> map = fansClubMember.preferData;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<Integer, FansClubData> entry : fansClubMember.preferData.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    cd6.LIZLLL(2, 2);
                    cd6.LJ(_FansClubData_ProtoEncoder.LIZLLL(2, entry.getValue()) + C30957CCz.LJII(1, entry.getKey()));
                    C30957CCz.LIZIZ(cd6, 1, entry.getKey());
                    FansClubData value = entry.getValue();
                    if (value != null) {
                        cd6.LIZLLL(2, 2);
                        cd6.LJ(_FansClubData_ProtoEncoder.LIZJ(value));
                        _FansClubData_ProtoEncoder.LIZIZ(cd6, value);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, FansClubMember fansClubMember) {
        LIZIZ(cd6, fansClubMember);
    }
}
