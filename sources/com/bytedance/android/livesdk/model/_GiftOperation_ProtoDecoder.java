package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftOperation_ProtoDecoder implements InterfaceC31105CIr<GiftOperation> {
    public static GiftOperation LIZIZ(Q9H q9h) {
        GiftOperation giftOperation = new GiftOperation();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        giftOperation.leftImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        giftOperation.rightImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        giftOperation.title = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        giftOperation.titleColor = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        giftOperation.titleSize = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        giftOperation.schemeUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        giftOperation.eventName = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return giftOperation;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftOperation LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
