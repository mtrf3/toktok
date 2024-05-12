package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerResponse;
import com.bytedance.android.livesdk.model.message._GiftGuideMessage_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GiftGuideTriggerResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GiftGuideTriggerResponse.Data> {
    public static GiftGuideTriggerResponse.Data LIZIZ(Q9H q9h) {
        GiftGuideTriggerResponse.Data data = new GiftGuideTriggerResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.giftGuideMessage = _GiftGuideMessage_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    data.success = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftGuideTriggerResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
