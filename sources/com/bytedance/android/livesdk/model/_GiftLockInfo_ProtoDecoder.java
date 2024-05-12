package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GiftLockInfo_ProtoDecoder implements InterfaceC31105CIr<GiftLockInfo> {
    public static GiftLockInfo LIZIZ(Q9H q9h) {
        GiftLockInfo giftLockInfo = new GiftLockInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            giftLockInfo.giftLevel = q9h.LJIIJ();
                        }
                    } else {
                        giftLockInfo.mLockType = q9h.LJIIJ();
                    }
                } else {
                    giftLockInfo.mLock = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return giftLockInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftLockInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
