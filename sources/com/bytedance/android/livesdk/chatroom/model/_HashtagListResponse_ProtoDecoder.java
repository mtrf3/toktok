package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._HashtagResponse_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _HashtagListResponse_ProtoDecoder implements InterfaceC31105CIr<HashtagListResponse> {
    @Override // X.InterfaceC31105CIr
    public final HashtagListResponse LIZ(Q9H q9h) {
        HashtagListResponse hashtagListResponse = new HashtagListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    hashtagListResponse.data = _HashtagResponse_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return hashtagListResponse;
            }
        }
    }
}
