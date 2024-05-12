package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _AddToCartButton_ProtoDecoder implements InterfaceC31105CIr<AddToCartButton> {
    public static AddToCartButton LIZIZ(Q9H q9h) {
        AddToCartButton addToCartButton = new AddToCartButton();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        addToCartButton.clickHintStarling = Q9J.LIZIZ(q9h);
                    }
                } else {
                    addToCartButton.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return addToCartButton;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AddToCartButton LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
