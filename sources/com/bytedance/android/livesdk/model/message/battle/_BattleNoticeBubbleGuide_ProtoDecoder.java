package com.bytedance.android.livesdk.model.message.battle;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BattleNoticeBubbleGuide_ProtoDecoder implements InterfaceC31105CIr<BattleNoticeBubbleGuide> {
    public static BattleNoticeBubbleGuide LIZIZ(Q9H q9h) {
        BattleNoticeBubbleGuide battleNoticeBubbleGuide = new BattleNoticeBubbleGuide();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    battleNoticeBubbleGuide.content = _BattleNoticeText_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleNoticeBubbleGuide;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattleNoticeBubbleGuide LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}