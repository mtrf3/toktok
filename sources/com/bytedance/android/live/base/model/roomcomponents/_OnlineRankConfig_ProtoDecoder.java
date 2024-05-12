package com.bytedance.android.live.base.model.roomcomponents;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _OnlineRankConfig_ProtoDecoder implements InterfaceC31105CIr<OnlineRankConfig> {
    public static OnlineRankConfig LIZIZ(Q9H q9h) {
        OnlineRankConfig onlineRankConfig = new OnlineRankConfig();
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
                                    onlineRankConfig.scoreShow = Q9J.LIZ(q9h);
                                }
                            } else {
                                onlineRankConfig.avatarNumber = (int) q9h.LJIIJJI();
                            }
                        } else {
                            onlineRankConfig.avatarShow = Q9J.LIZ(q9h);
                        }
                    } else {
                        onlineRankConfig.onlinePanelClick = Q9J.LIZ(q9h);
                    }
                } else {
                    onlineRankConfig.onlinePanelShow = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return onlineRankConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OnlineRankConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
