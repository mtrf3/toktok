package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftHintResponse;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _GiftHintResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GiftHintResponse.Data> {
    public static GiftHintResponse.Data LIZIZ(Q9H q9h) {
        GiftHintResponse.Data data = new GiftHintResponse.Data();
        data.hints = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.hints.add(_GiftHintInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftHintResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
