package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import emotes.model._SubEmoteDetailResult_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GetSubEmoteDetailResponse_ProtoDecoder implements InterfaceC31105CIr<GetSubEmoteDetailResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetSubEmoteDetailResponse LIZ(Q9H q9h) {
        GetSubEmoteDetailResponse getSubEmoteDetailResponse = new GetSubEmoteDetailResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getSubEmoteDetailResponse.data = _SubEmoteDetailResult_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubEmoteDetailResponse;
            }
        }
    }
}
