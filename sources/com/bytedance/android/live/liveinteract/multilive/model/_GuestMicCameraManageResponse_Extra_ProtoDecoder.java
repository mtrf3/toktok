package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;

/* loaded from: classes14.dex */
public final class _GuestMicCameraManageResponse_Extra_ProtoDecoder implements InterfaceC31105CIr<GuestMicCameraManageResponse.Extra> {
    public static GuestMicCameraManageResponse.Extra LIZIZ(Q9H q9h) {
        GuestMicCameraManageResponse.Extra extra = new GuestMicCameraManageResponse.Extra();
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
    public final GuestMicCameraManageResponse.Extra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
