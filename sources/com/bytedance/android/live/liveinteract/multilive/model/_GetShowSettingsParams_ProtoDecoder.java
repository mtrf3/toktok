package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _GetShowSettingsParams_ProtoDecoder implements InterfaceC31105CIr<GetShowSettingsParams> {
    @Override // X.InterfaceC31105CIr
    public final GetShowSettingsParams LIZ(Q9H q9h) {
        GetShowSettingsParams getShowSettingsParams = new GetShowSettingsParams();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return getShowSettingsParams;
    }
}
