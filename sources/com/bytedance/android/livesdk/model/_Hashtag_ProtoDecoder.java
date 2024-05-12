package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _Hashtag_ProtoDecoder implements InterfaceC31105CIr<Hashtag> {
    public static Hashtag LIZIZ(Q9H q9h) {
        Hashtag hashtag = new Hashtag();
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
                                hashtag.namespace = q9h.LJIIJ();
                            }
                        } else {
                            hashtag.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        hashtag.title = Q9J.LIZIZ(q9h);
                    }
                } else {
                    hashtag.id = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return hashtag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Hashtag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
