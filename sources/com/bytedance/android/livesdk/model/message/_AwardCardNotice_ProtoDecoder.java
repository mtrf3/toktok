package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _AwardCardNotice_ProtoDecoder implements InterfaceC31105CIr<AwardCardNotice> {
    public static AwardCardNotice LIZIZ(Q9H q9h) {
        AwardCardNotice awardCardNotice = new AwardCardNotice();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    awardCardNotice.displayContent = _Text_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return awardCardNotice;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AwardCardNotice LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
