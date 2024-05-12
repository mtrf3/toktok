package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;

/* loaded from: classes16.dex */
public final class _EcommerceEntrance_ShowcaseEntranceInfo_ProtoDecoder implements InterfaceC31105CIr<EcommerceEntrance.ShowcaseEntranceInfo> {
    public static EcommerceEntrance.ShowcaseEntranceInfo LIZIZ(Q9H q9h) {
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = new EcommerceEntrance.ShowcaseEntranceInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        showcaseEntranceInfo.soldCount = q9h.LJIIJJI();
                    }
                } else {
                    showcaseEntranceInfo.formatSoldCount = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return showcaseEntranceInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EcommerceEntrance.ShowcaseEntranceInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
