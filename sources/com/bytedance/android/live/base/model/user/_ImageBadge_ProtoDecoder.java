package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _ImageBadge_ProtoDecoder implements InterfaceC31105CIr<ImageBadge> {
    public static ImageBadge LIZIZ(Q9H q9h) {
        ImageBadge imageBadge = new ImageBadge();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        imageBadge.imageModel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    imageBadge.badgeDisplayType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return imageBadge;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ImageBadge LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
