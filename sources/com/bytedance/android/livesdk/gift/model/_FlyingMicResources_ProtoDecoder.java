package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _FlyingMicResources_ProtoDecoder implements InterfaceC31105CIr<FlyingMicResources> {
    public static FlyingMicResources LIZIZ(Q9H q9h) {
        FlyingMicResources flyingMicResources = new FlyingMicResources();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        flyingMicResources.micImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    flyingMicResources.pathImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return flyingMicResources;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FlyingMicResources LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}