package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FeedItemInfo_ProtoDecoder implements InterfaceC31105CIr<FeedItemInfo> {
    public static FeedItemInfo LIZIZ(Q9H q9h) {
        FeedItemInfo feedItemInfo = new FeedItemInfo();
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
                                feedItemInfo.statisticsInfo = _ItemStatisticsInfo_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            feedItemInfo.videoInfo = _VideoInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        feedItemInfo.creatorInfo = _CreatorInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    feedItemInfo.id = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return feedItemInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FeedItemInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
