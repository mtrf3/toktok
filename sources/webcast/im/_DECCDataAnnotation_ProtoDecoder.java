package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DECCDataAnnotation_ProtoDecoder implements InterfaceC31105CIr<DECCDataAnnotation> {
    @Override // X.InterfaceC31105CIr
    public final DECCDataAnnotation LIZ(Q9H q9h) {
        DECCDataAnnotation dECCDataAnnotation = new DECCDataAnnotation();
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
                                    dECCDataAnnotation.needSync = Q9J.LIZ(q9h);
                                }
                            } else {
                                dECCDataAnnotation.tiktokCatalog = q9h.LJIIJ();
                            }
                        } else {
                            dECCDataAnnotation.reason = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        dECCDataAnnotation.description = Q9J.LIZIZ(q9h);
                    }
                } else {
                    dECCDataAnnotation.name = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dECCDataAnnotation;
            }
        }
    }
}
