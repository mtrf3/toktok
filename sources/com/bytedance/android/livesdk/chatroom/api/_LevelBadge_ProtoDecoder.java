package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LevelBadge_ProtoDecoder implements InterfaceC31105CIr<LevelBadge> {
    public static LevelBadge LIZIZ(Q9H q9h) {
        LevelBadge levelBadge = new LevelBadge();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 3) {
                    if (LJI != 4) {
                        Q9J.LIZJ(q9h);
                    } else {
                        levelBadge.previewImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    levelBadge.originImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return levelBadge;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LevelBadge LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
