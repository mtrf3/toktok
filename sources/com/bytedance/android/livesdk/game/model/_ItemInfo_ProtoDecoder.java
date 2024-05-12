package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ItemInfo_ProtoDecoder implements InterfaceC31105CIr<ItemInfo> {
    public static ItemInfo LIZIZ(Q9H q9h) {
        ItemInfo itemInfo = new ItemInfo();
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
                                itemInfo.statisticsInfo = _ItemStatisticsInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            itemInfo.videoInfo = _VideoInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        itemInfo.creatorInfo = _CreatorInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    itemInfo.id = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return itemInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ItemInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
