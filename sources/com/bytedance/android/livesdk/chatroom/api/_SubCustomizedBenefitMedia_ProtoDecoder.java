package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubCustomizedBenefitMedia_ProtoDecoder implements InterfaceC31105CIr<SubCustomizedBenefitMedia> {
    public static SubCustomizedBenefitMedia LIZIZ(Q9H q9h) {
        SubCustomizedBenefitMedia subCustomizedBenefitMedia = new SubCustomizedBenefitMedia();
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
                                    subCustomizedBenefitMedia.backgroundColor = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                subCustomizedBenefitMedia.url = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            subCustomizedBenefitMedia.content = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        subCustomizedBenefitMedia.title = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subCustomizedBenefitMedia.iconImg = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subCustomizedBenefitMedia;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubCustomizedBenefitMedia LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
