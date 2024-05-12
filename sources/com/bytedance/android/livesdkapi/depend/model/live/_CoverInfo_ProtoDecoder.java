package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class _CoverInfo_ProtoDecoder implements InterfaceC31105CIr<CoverInfo> {
    @Override // X.InterfaceC31105CIr
    public final CoverInfo LIZ(Q9H q9h) {
        CoverInfo coverInfo = new CoverInfo();
        coverInfo.urlList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                coverInfo.height = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            coverInfo.width = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        coverInfo.uri = Q9J.LIZIZ(q9h);
                    }
                } else {
                    coverInfo.urlList.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return coverInfo;
            }
        }
    }
}
