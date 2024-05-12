package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _LivePermissionApply_ProtoDecoder implements InterfaceC31105CIr<LivePermissionApply> {
    public static LivePermissionApply LIZIZ(Q9H q9h) {
        LivePermissionApply livePermissionApply = new LivePermissionApply();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            livePermissionApply.enableLiveVideo = Q9J.LIZ(q9h);
                        }
                    } else {
                        livePermissionApply.enableScreenshot = Q9J.LIZ(q9h);
                    }
                } else {
                    livePermissionApply.enableThirdParty = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return livePermissionApply;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LivePermissionApply LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
