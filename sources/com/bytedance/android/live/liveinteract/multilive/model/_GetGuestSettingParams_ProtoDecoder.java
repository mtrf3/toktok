package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _GetGuestSettingParams_ProtoDecoder implements InterfaceC31105CIr<GetGuestSettingParams> {
    @Override // X.InterfaceC31105CIr
    public final GetGuestSettingParams LIZ(Q9H q9h) {
        GetGuestSettingParams getGuestSettingParams = new GetGuestSettingParams();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return getGuestSettingParams;
    }
}
