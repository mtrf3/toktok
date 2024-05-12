package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RankAnimationInfo_ProtoDecoder implements InterfaceC31105CIr<RankAnimationInfo> {
    public static RankAnimationInfo LIZIZ(Q9H q9h) {
        RankAnimationInfo rankAnimationInfo = new RankAnimationInfo();
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
                                rankAnimationInfo.duration = q9h.LJIIJJI();
                            }
                        } else {
                            rankAnimationInfo.contentText = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        rankAnimationInfo.backgroundColorString = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rankAnimationInfo.type = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return rankAnimationInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankAnimationInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
