package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SkinDrawerEntrance_ProtoDecoder implements InterfaceC31105CIr<SkinDrawerEntrance> {
    public static SkinDrawerEntrance LIZIZ(Q9H q9h) {
        SkinDrawerEntrance skinDrawerEntrance = new SkinDrawerEntrance();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        skinDrawerEntrance.cover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    skinDrawerEntrance.style = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return skinDrawerEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SkinDrawerEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
