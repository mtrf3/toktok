package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.api._TimerConfig_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._TimerDetail_ProtoDecoder;
import com.bytedance.android.livesdk.subscribe.model.GetSubTimerDetailResponse;

/* loaded from: classes17.dex */
public final class _GetSubTimerDetailResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetSubTimerDetailResponse.Data> {
    public static GetSubTimerDetailResponse.Data LIZIZ(Q9H q9h) {
        GetSubTimerDetailResponse.Data data = new GetSubTimerDetailResponse.Data();
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
    public final GetSubTimerDetailResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
