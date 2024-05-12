package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _PreviewProductCardInfo_ProtoDecoder implements InterfaceC31105CIr<PreviewProductCardInfo> {
    public static PreviewProductCardInfo LIZIZ(Q9H q9h) {
        PreviewProductCardInfo previewProductCardInfo = new PreviewProductCardInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    previewProductCardInfo.recommendInfo = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return previewProductCardInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PreviewProductCardInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
