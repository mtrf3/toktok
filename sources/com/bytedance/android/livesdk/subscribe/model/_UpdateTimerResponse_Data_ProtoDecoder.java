package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._TimerConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.UpdateTimerResponse;

/* loaded from: classes17.dex */
public final class _UpdateTimerResponse_Data_ProtoDecoder implements InterfaceC31105CIr<UpdateTimerResponse.Data> {
    public static UpdateTimerResponse.Data LIZIZ(Q9H q9h) {
        UpdateTimerResponse.Data data = new UpdateTimerResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        data.timerDetail = _TimerDetail_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    data.timerConfig = _TimerConfig_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateTimerResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
