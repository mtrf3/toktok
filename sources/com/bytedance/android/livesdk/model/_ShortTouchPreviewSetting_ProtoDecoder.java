package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes13.dex */
public final class _ShortTouchPreviewSetting_ProtoDecoder implements InterfaceC31105CIr<ShortTouchPreviewSetting> {
    public static ShortTouchPreviewSetting LIZIZ(Q9H q9h) {
        ShortTouchPreviewSetting shortTouchPreviewSetting = new ShortTouchPreviewSetting();
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
                                    shortTouchPreviewSetting.discountText = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                shortTouchPreviewSetting.amountText = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            shortTouchPreviewSetting.previewImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        shortTouchPreviewSetting.previewShowTime = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    shortTouchPreviewSetting.previewSchema = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return shortTouchPreviewSetting;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ShortTouchPreviewSetting LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
