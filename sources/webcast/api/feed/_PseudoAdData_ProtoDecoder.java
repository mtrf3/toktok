package webcast.api.feed;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PseudoAdData_ProtoDecoder implements InterfaceC31105CIr<PseudoAdData> {
    public static PseudoAdData LIZIZ(Q9H q9h) {
        PseudoAdData pseudoAdData = new PseudoAdData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            pseudoAdData.logExtra = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        pseudoAdData.adId = q9h.LJIIJJI();
                    }
                } else {
                    pseudoAdData.creativeId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return pseudoAdData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PseudoAdData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
