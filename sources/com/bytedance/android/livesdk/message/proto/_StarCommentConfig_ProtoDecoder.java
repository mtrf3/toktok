package com.bytedance.android.livesdk.message.proto;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _StarCommentConfig_ProtoDecoder implements InterfaceC31105CIr<StarCommentConfig> {
    public static StarCommentConfig LIZIZ(Q9H q9h) {
        StarCommentConfig starCommentConfig = new StarCommentConfig();
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
                                    starCommentConfig.displayLock = Q9J.LIZ(q9h);
                                }
                            } else {
                                starCommentConfig.starCommentQualification = Q9J.LIZ(q9h);
                            }
                        } else {
                            starCommentConfig.grantLevel = q9h.LJIIJ();
                        }
                    } else {
                        starCommentConfig.grantGroup = q9h.LJIIJ();
                    }
                } else {
                    starCommentConfig.starCommentSwitch = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return starCommentConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StarCommentConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}