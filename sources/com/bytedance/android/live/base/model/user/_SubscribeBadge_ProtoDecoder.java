package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _SubscribeBadge_ProtoDecoder implements InterfaceC31105CIr<SubscribeBadge> {
    public static SubscribeBadge LIZIZ(Q9H q9h) {
        SubscribeBadge subscribeBadge = new SubscribeBadge();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 3) {
                    if (LJI != 4) {
                        Q9J.LIZJ(q9h);
                    } else {
                        subscribeBadge.previewImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subscribeBadge.originImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subscribeBadge;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscribeBadge LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
