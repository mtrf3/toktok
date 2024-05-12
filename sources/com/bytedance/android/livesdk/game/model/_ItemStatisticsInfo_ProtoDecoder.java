package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ItemStatisticsInfo_ProtoDecoder implements InterfaceC31105CIr<ItemStatisticsInfo> {
    public static ItemStatisticsInfo LIZIZ(Q9H q9h) {
        ItemStatisticsInfo itemStatisticsInfo = new ItemStatisticsInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                itemStatisticsInfo.playCount = q9h.LJIIJ();
                            }
                        } else {
                            itemStatisticsInfo.commentCount = q9h.LJIIJ();
                        }
                    } else {
                        itemStatisticsInfo.shareCount = q9h.LJIIJ();
                    }
                } else {
                    itemStatisticsInfo.diggCount = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return itemStatisticsInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ItemStatisticsInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
