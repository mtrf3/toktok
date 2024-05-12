package compliance;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MethodAnnotation_ProtoDecoder implements InterfaceC31105CIr<MethodAnnotation> {
    public static MethodAnnotation LIZIZ(Q9H q9h) {
        MethodAnnotation methodAnnotation = new MethodAnnotation();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            methodAnnotation.biz = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        methodAnnotation.authLevel = q9h.LJIIJ();
                    }
                } else {
                    methodAnnotation.audience = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return methodAnnotation;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MethodAnnotation LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
