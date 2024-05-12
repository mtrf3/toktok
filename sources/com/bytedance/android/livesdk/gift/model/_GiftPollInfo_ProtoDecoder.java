package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftPollInfo_ProtoDecoder implements InterfaceC31105CIr<GiftPollInfo> {
    public static GiftPollInfo LIZIZ(Q9H q9h) {
        GiftPollInfo giftPollInfo = new GiftPollInfo();
        giftPollInfo.giftPollOptions = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    giftPollInfo.giftPollOptions.add(_GiftPollOption_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return giftPollInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftPollInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
