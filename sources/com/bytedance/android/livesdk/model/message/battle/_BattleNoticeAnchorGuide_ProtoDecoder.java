package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BattleNoticeAnchorGuide_ProtoDecoder implements InterfaceC31105CIr<BattleNoticeAnchorGuide> {
    public static BattleNoticeAnchorGuide LIZIZ(Q9H q9h) {
        BattleNoticeAnchorGuide battleNoticeAnchorGuide = new BattleNoticeAnchorGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleNoticeAnchorGuide.buttonContent = _BattleNoticeText_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    battleNoticeAnchorGuide.content = _BattleNoticeText_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleNoticeAnchorGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleNoticeAnchorGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
