package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _BattleNoticeCommonGuide_ProtoDecoder implements InterfaceC31105CIr<BattleNoticeCommonGuide> {
    public static BattleNoticeCommonGuide LIZIZ(Q9H q9h) {
        BattleNoticeCommonGuide battleNoticeCommonGuide = new BattleNoticeCommonGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleNoticeCommonGuide.exceptAnchor = Q9J.LIZ(q9h);
                    }
                } else {
                    battleNoticeCommonGuide.displayText = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleNoticeCommonGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleNoticeCommonGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
