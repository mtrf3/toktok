package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _PageSchemaListResponse_ProtoDecoder implements InterfaceC31105CIr<PageSchemaListResponse> {
    @Override // X.InterfaceC31105CIr
    public final PageSchemaListResponse LIZ(Q9H q9h) {
        PageSchemaListResponse pageSchemaListResponse = new PageSchemaListResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    pageSchemaListResponse.data = _PageSchemaListResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return pageSchemaListResponse;
            }
        }
    }
}
