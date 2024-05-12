package com.bytedance.android.live.base.model.emoji;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _EmoteWithIndex_ProtoDecoder implements InterfaceC31105CIr<EmoteWithIndex> {
    public static EmoteWithIndex LIZIZ(Q9H q9h) {
        EmoteWithIndex emoteWithIndex = new EmoteWithIndex();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        emoteWithIndex.emoteModel = _EmoteModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    emoteWithIndex.index = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return emoteWithIndex;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EmoteWithIndex LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
