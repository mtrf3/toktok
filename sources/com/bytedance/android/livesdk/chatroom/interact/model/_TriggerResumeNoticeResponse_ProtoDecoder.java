package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TriggerResumeNoticeResponse;

/* loaded from: classes14.dex */
public final class _TriggerResumeNoticeResponse_ProtoDecoder implements InterfaceC31105CIr<TriggerResumeNoticeResponse> {
    @Override // X.InterfaceC31105CIr
    public final TriggerResumeNoticeResponse LIZ(Q9H q9h) {
        TriggerResumeNoticeResponse triggerResumeNoticeResponse = new TriggerResumeNoticeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    TriggerResumeNoticeResponse.ResponseData responseData = new TriggerResumeNoticeResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    triggerResumeNoticeResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return triggerResumeNoticeResponse;
            }
        }
    }
}