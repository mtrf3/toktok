package compliance;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _ServiceAnnotation_ProtoDecoder implements InterfaceC31105CIr<ServiceAnnotation> {
    @Override // X.InterfaceC31105CIr
    public final ServiceAnnotation LIZ(Q9H q9h) {
        ServiceAnnotation serviceAnnotation = new ServiceAnnotation();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    serviceAnnotation.methodDefault = _MethodAnnotation_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return serviceAnnotation;
            }
        }
    }
}
