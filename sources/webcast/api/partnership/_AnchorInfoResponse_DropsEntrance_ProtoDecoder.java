package webcast.api.partnership;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.partnership.AnchorInfoResponse;

/* loaded from: classes6.dex */
public final class _AnchorInfoResponse_DropsEntrance_ProtoDecoder implements InterfaceC31105CIr<AnchorInfoResponse.DropsEntrance> {
    public static AnchorInfoResponse.DropsEntrance LIZIZ(Q9H q9h) {
        AnchorInfoResponse.DropsEntrance dropsEntrance = new AnchorInfoResponse.DropsEntrance();
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
                                    dropsEntrance.dropsCount = q9h.LJIIJJI();
                                }
                            } else {
                                dropsEntrance.icon = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            dropsEntrance.rewarded = Q9J.LIZ(q9h);
                        }
                    } else {
                        dropsEntrance.hasSign = Q9J.LIZ(q9h);
                    }
                } else {
                    dropsEntrance.permission = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dropsEntrance;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorInfoResponse.DropsEntrance LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
