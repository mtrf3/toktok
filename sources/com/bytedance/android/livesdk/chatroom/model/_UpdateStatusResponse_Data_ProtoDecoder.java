package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.UpdateStatusResponse;

/* loaded from: classes17.dex */
public final class _UpdateStatusResponse_Data_ProtoDecoder implements InterfaceC31105CIr<UpdateStatusResponse.Data> {
    public static UpdateStatusResponse.Data LIZIZ(Q9H q9h) {
        UpdateStatusResponse.Data data = new UpdateStatusResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.endReason = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateStatusResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
