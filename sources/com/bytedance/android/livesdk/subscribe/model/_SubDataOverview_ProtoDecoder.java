package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubDataOverview_ProtoDecoder implements InterfaceC31105CIr<SubDataOverview> {
    public static SubDataOverview LIZIZ(Q9H q9h) {
        SubDataOverview subDataOverview = new SubDataOverview();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subDataOverview.activeSubscribersCount = _SubDataItemView_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        subDataOverview.totalSubscriptionIncome = _SubDataItemView_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subDataOverview.inPeriodicPayoutRegion = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subDataOverview;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubDataOverview LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
