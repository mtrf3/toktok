package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AnchorInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorInfoResponse_ToggleInfo_ProtoDecoder implements InterfaceC31105CIr<AnchorInfoResponse.ToggleInfo> {
    public static AnchorInfoResponse.ToggleInfo LIZIZ(Q9H q9h) {
        AnchorInfoResponse.ToggleInfo toggleInfo = new AnchorInfoResponse.ToggleInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        toggleInfo.toggleStatus = q9h.LJIIJ();
                    }
                } else {
                    toggleInfo.gameTagId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return toggleInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorInfoResponse.ToggleInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
