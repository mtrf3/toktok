package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;

/* loaded from: classes6.dex */
public final class _GuideInfoResponse_UserStats_ProtoDecoder implements InterfaceC31105CIr<GuideInfoResponse.UserStats> {
    public static GuideInfoResponse.UserStats LIZIZ(Q9H q9h) {
        GuideInfoResponse.UserStats userStats = new GuideInfoResponse.UserStats();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    userStats.watchDuration = q9h.LJIIJJI();
                                }
                            } else {
                                userStats.likeCnt = q9h.LJIIJJI();
                            }
                        } else {
                            userStats.giftGuidePopupShowCnt = q9h.LJIIJJI();
                        }
                    } else {
                        userStats.shortcutGiftClickCnt = q9h.LJIIJJI();
                    }
                } else {
                    userStats.giftPanelShowCnt = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return userStats;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideInfoResponse.UserStats LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
