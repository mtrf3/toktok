package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.QueryCommercialContentToggleResponse;

/* loaded from: classes6.dex */
public final class _QueryCommercialContentToggleResponse_Data_ProtoDecoder implements InterfaceC31105CIr<QueryCommercialContentToggleResponse.Data> {
    public static QueryCommercialContentToggleResponse.Data LIZIZ(Q9H q9h) {
        QueryCommercialContentToggleResponse.Data data = new QueryCommercialContentToggleResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            data.promoteThirdParty = Q9J.LIZ(q9h);
                        }
                    } else {
                        data.promoteMyself = Q9J.LIZ(q9h);
                    }
                } else {
                    data.openCommercialContentToggle = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final QueryCommercialContentToggleResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
