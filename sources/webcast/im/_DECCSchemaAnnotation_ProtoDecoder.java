package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _DECCSchemaAnnotation_ProtoDecoder implements InterfaceC31105CIr<DECCSchemaAnnotation> {
    @Override // X.InterfaceC31105CIr
    public final DECCSchemaAnnotation LIZ(Q9H q9h) {
        DECCSchemaAnnotation dECCSchemaAnnotation = new DECCSchemaAnnotation();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                dECCSchemaAnnotation.reason = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            dECCSchemaAnnotation.texasCatalog = q9h.LJIIJ();
                        }
                    } else {
                        dECCSchemaAnnotation.description = Q9J.LIZIZ(q9h);
                    }
                } else {
                    dECCSchemaAnnotation.needSync = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return dECCSchemaAnnotation;
            }
        }
    }
}
