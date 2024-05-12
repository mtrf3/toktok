package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model._RivalExtraInfo_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _BattleRival_ProtoDecoder implements InterfaceC31105CIr<BattleRival> {
    @Override // X.InterfaceC31105CIr
    public final BattleRival LIZ(Q9H q9h) {
        BattleRival battleRival = new BattleRival();
        battleRival.tags = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    if (LJI != 3) {
                        Q9J.LIZJ(q9h);
                    } else {
                        battleRival.tags.add(_BattleRivalTag_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    battleRival.extraInfo = _RivalExtraInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return battleRival;
            }
        }
    }
}
