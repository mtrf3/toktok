package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _UpdateBlockStatusRequestParams_ProtoDecoder implements InterfaceC31105CIr<UpdateBlockStatusRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final UpdateBlockStatusRequestParams LIZ(Q9H q9h) {
        UpdateBlockStatusRequestParams updateBlockStatusRequestParams = new UpdateBlockStatusRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            updateBlockStatusRequestParams.secTargetUid = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        updateBlockStatusRequestParams.targetUid = q9h.LJIIJJI();
                    }
                } else {
                    updateBlockStatusRequestParams.blockType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return updateBlockStatusRequestParams;
            }
        }
    }
}
