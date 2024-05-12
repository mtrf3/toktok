package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _Img_ProtoDecoder implements InterfaceC31105CIr<Img> {
    public static Img LIZIZ(Q9H q9h) {
        Img img = new Img();
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
                                img.url = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            img.height = q9h.LJIIJ();
                        }
                    } else {
                        img.width = q9h.LJIIJ();
                    }
                } else {
                    img.key = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return img;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Img LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
