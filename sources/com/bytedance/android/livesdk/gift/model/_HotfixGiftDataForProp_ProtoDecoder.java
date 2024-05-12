package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _HotfixGiftDataForProp_ProtoDecoder implements InterfaceC31105CIr<HotfixGiftDataForProp> {
    public static HotfixGiftDataForProp LIZIZ(Q9H q9h) {
        HotfixGiftDataForProp hotfixGiftDataForProp = new HotfixGiftDataForProp();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        hotfixGiftDataForProp.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        hotfixGiftDataForProp.describe = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        hotfixGiftDataForProp.giftId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        hotfixGiftDataForProp.groupCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        hotfixGiftDataForProp.repeatCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 6:
                        hotfixGiftDataForProp.comboCount = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        hotfixGiftDataForProp.msgId = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return hotfixGiftDataForProp;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final HotfixGiftDataForProp LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
