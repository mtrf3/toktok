package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _CreatorInfo_ProtoDecoder implements InterfaceC31105CIr<CreatorInfo> {
    public static CreatorInfo LIZIZ(Q9H q9h) {
        CreatorInfo creatorInfo = new CreatorInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            creatorInfo.icon = _UrlInfo_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        creatorInfo.nickName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    creatorInfo.uid = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return creatorInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CreatorInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
