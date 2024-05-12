package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goal.model.UnPinResponse;

/* loaded from: classes17.dex */
public final class _UnPinResponse_Data_ProtoDecoder implements InterfaceC31105CIr<UnPinResponse.Data> {
    public static UnPinResponse.Data LIZIZ(Q9H q9h) {
        UnPinResponse.Data data = new UnPinResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
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
    public final UnPinResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
