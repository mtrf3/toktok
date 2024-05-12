package webcast.api.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MultiUserRequestParams_ProtoDecoder implements InterfaceC31105CIr<MultiUserRequestParams> {
    @Override // X.InterfaceC31105CIr
    public final MultiUserRequestParams LIZ(Q9H q9h) {
        MultiUserRequestParams multiUserRequestParams = new MultiUserRequestParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    multiUserRequestParams.secAnchorId = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                multiUserRequestParams.secTargetUids = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            multiUserRequestParams.requestFrom = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        multiUserRequestParams.currentRoomId = q9h.LJIIJJI();
                    }
                } else {
                    multiUserRequestParams.packedLevel = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return multiUserRequestParams;
            }
        }
    }
}
