package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftsBoxInfo_ProtoDecoder implements InterfaceC31105CIr<GiftsBoxInfo> {
    public static GiftsBoxInfo LIZIZ(Q9H q9h) {
        GiftsBoxInfo giftsBoxInfo = new GiftsBoxInfo();
        giftsBoxInfo.gifts = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftsBoxInfo.gifts.add(_GiftInfoInBox_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return giftsBoxInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftsBoxInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
