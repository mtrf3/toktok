package compliance;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FieldAnnotation_ProtoDecoder implements InterfaceC31105CIr<FieldAnnotation> {
    public static FieldAnnotation LIZIZ(Q9H q9h) {
        FieldAnnotation fieldAnnotation = new FieldAnnotation();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 101) {
                                if (LJI != 102) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    fieldAnnotation.mapValue = LIZIZ(q9h);
                                }
                            } else {
                                fieldAnnotation.mapKey = LIZIZ(q9h);
                            }
                        } else {
                            fieldAnnotation.texas = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        fieldAnnotation.authDependent = Q9J.LIZ(q9h);
                    }
                } else {
                    fieldAnnotation.hiddenIfUnauth = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fieldAnnotation;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FieldAnnotation LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
