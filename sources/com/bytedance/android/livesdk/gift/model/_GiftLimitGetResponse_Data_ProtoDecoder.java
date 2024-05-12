package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;

/* loaded from: classes6.dex */
public final class _GiftLimitGetResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GiftLimitGetResponse.Data> {
    public static GiftLimitGetResponse.Data LIZIZ(Q9H q9h) {
        GiftLimitGetResponse.Data data = new GiftLimitGetResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        data.notificationStatus = q9h.LJIIJ();
                        break;
                    case 2:
                        data.giftPromptStall = _GiftLimitGetResponse_Data_GiftPromptStall_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        data.setSuccessfullyToast = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        data.setFailedToast = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        data.allowCustomStall = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        data.suggestedCustomStallText = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftLimitGetResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
