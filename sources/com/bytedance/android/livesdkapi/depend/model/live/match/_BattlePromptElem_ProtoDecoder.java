package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BattlePromptElem_ProtoDecoder implements InterfaceC31105CIr<BattlePromptElem> {
    public static BattlePromptElem LIZIZ(Q9H q9h) {
        BattlePromptElem battlePromptElem = new BattlePromptElem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battlePromptElem.promptFieldValue = Q9J.LIZIZ(q9h);
                    }
                } else {
                    battlePromptElem.promptFieldKey = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battlePromptElem;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BattlePromptElem LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
