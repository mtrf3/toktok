package com.bytedance.android.livesdk.goody_bag.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GoodyBagUserInfo_ProtoDecoder implements InterfaceC31105CIr<GoodyBagUserInfo> {
    public static GoodyBagUserInfo LIZIZ(Q9H q9h) {
        GoodyBagUserInfo goodyBagUserInfo = new GoodyBagUserInfo();
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
                                goodyBagUserInfo.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            goodyBagUserInfo.displayId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        goodyBagUserInfo.nickname = Q9J.LIZIZ(q9h);
                    }
                } else {
                    goodyBagUserInfo.userId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return goodyBagUserInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GoodyBagUserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
