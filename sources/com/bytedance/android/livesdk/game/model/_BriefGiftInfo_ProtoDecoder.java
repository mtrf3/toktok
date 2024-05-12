package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _BriefGiftInfo_ProtoDecoder implements InterfaceC31105CIr<BriefGiftInfo> {
    public static BriefGiftInfo LIZIZ(Q9H q9h) {
        BriefGiftInfo briefGiftInfo = new BriefGiftInfo();
        briefGiftInfo.items = new ArrayList();
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
                                briefGiftInfo.items.add(_GiftItem_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            briefGiftInfo.iconUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        briefGiftInfo.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    briefGiftInfo.idStr = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return briefGiftInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BriefGiftInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
