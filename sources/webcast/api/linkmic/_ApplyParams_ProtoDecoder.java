package webcast.api.linkmic;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _ApplyParams_ProtoDecoder implements InterfaceC31105CIr<ApplyParams> {
    @Override // X.InterfaceC31105CIr
    public final ApplyParams LIZ(Q9H q9h) {
        ApplyParams applyParams = new ApplyParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    if (LJI != 101) {
                                        if (LJI != 200) {
                                            Q9J.LIZJ(q9h);
                                        } else {
                                            applyParams.transparentExtra = Q9J.LIZIZ(q9h);
                                        }
                                    } else {
                                        applyParams.clientLogId = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    applyParams.effectiveSeconds = Long.valueOf(q9h.LJIIJJI());
                                }
                            } else {
                                applyParams.sourceType = Long.valueOf(q9h.LJIIJJI());
                            }
                        } else {
                            applyParams.toUserId = Long.valueOf(q9h.LJIIJJI());
                        }
                    } else {
                        applyParams.toRoomId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    applyParams.roomId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return applyParams;
            }
        }
    }
}
