package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;

/* loaded from: classes14.dex */
public final class _UpdateGuestSettingResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<UpdateGuestSettingResponse.Extra> {
    public static UpdateGuestSettingResponse.Extra LIZIZ(Q9H q9h) {
        UpdateGuestSettingResponse.Extra extra = new UpdateGuestSettingResponse.Extra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    extra.now = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return extra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UpdateGuestSettingResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
