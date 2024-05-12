package com.bytedance.android.livesdk.subscribe.model.gift;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _SubGifInfo_ProtoDecoder implements InterfaceC31105CIr<SubGifInfo> {
    public static SubGifInfo LIZIZ(Q9H q9h) {
        SubGifInfo subGifInfo = new SubGifInfo();
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
                                subGifInfo.showEntrance = Q9J.LIZ(q9h);
                            }
                        } else {
                            subGifInfo.subGiftNum = (int) q9h.LJIIJJI();
                        }
                    } else {
                        subGifInfo.sendUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subGifInfo.sendSubGiftNotice = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subGifInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubGifInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
