package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _ShortTouchIconSkin_ProtoDecoder implements InterfaceC31105CIr<ShortTouchIconSkin> {
    @Override // X.InterfaceC31105CIr
    public final ShortTouchIconSkin LIZ(Q9H q9h) {
        ShortTouchIconSkin shortTouchIconSkin = new ShortTouchIconSkin();
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
                                shortTouchIconSkin.closeDarkIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            shortTouchIconSkin.closeBrightIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        shortTouchIconSkin.openDarkIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    shortTouchIconSkin.openBrightIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return shortTouchIconSkin;
            }
        }
    }
}
