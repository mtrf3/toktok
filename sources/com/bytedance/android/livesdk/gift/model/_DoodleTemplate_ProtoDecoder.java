package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _DoodleTemplate_ProtoDecoder implements InterfaceC31105CIr<DoodleTemplate> {
    public static DoodleTemplate LIZIZ(Q9H q9h) {
        DoodleTemplate doodleTemplate = new DoodleTemplate();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        doodleTemplate.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    doodleTemplate.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return doodleTemplate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DoodleTemplate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
