package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _PageSchemaListRequest_ProtoDecoder implements InterfaceC31105CIr<PageSchemaListRequest> {
    @Override // X.InterfaceC31105CIr
    public final PageSchemaListRequest LIZ(Q9H q9h) {
        PageSchemaListRequest pageSchemaListRequest = new PageSchemaListRequest();
        pageSchemaListRequest.schemaIds = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    pageSchemaListRequest.schemaIds.add(Q9J.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return pageSchemaListRequest;
            }
        }
    }
}