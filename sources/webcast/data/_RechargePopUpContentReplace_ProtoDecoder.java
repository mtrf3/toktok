package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _RechargePopUpContentReplace_ProtoDecoder implements InterfaceC31105CIr<RechargePopUpContentReplace> {
    public static RechargePopUpContentReplace LIZIZ(Q9H q9h) {
        RechargePopUpContentReplace rechargePopUpContentReplace = new RechargePopUpContentReplace();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            rechargePopUpContentReplace.replaceType = q9h.LJIIJ();
                        }
                    } else {
                        rechargePopUpContentReplace.valueSchema = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rechargePopUpContentReplace.replaceValue = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rechargePopUpContentReplace;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RechargePopUpContentReplace LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
