package com.bytedance.android.livesdk.live.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FilterInfoData_ProtoDecoder implements InterfaceC31105CIr<FilterInfoData> {
    public static FilterInfoData LIZIZ(Q9H q9h) {
        FilterInfoData filterInfoData = new FilterInfoData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        filterInfoData.reason = Q9J.LIZIZ(q9h);
                    }
                } else {
                    filterInfoData.isFiltered = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return filterInfoData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FilterInfoData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
