package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _GiftModeMeta_ProtoDecoder implements InterfaceC31105CIr<GiftModeMeta> {
    public static GiftModeMeta LIZIZ(Q9H q9h) {
        GiftModeMeta giftModeMeta = new GiftModeMeta();
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
                                giftModeMeta.giftModeDesc = _Text_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            giftModeMeta.giftIconImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        giftModeMeta.giftNameKey = Q9J.LIZIZ(q9h);
                    }
                } else {
                    giftModeMeta.giftId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return giftModeMeta;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftModeMeta LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
