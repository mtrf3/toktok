package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ShortTouchArea_ProtoDecoder implements InterfaceC31105CIr<ShortTouchArea> {
    @Override // X.InterfaceC31105CIr
    public final ShortTouchArea LIZ(Q9H q9h) {
        ShortTouchArea shortTouchArea = new ShortTouchArea();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    shortTouchArea.shortTouchInfo = _ShortTouchInfo_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                shortTouchArea.shortTouchType = q9h.LJIIJ();
                            }
                        } else {
                            shortTouchArea.minWebcastSdkVersion = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        shortTouchArea.priority = Integer.valueOf(q9h.LJIIJ());
                    }
                } else {
                    shortTouchArea.type = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return shortTouchArea;
            }
        }
    }
}
