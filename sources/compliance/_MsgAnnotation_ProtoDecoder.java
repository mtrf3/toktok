package compliance;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _MsgAnnotation_ProtoDecoder implements InterfaceC31105CIr<MsgAnnotation> {
    @Override // X.InterfaceC31105CIr
    public final MsgAnnotation LIZ(Q9H q9h) {
        MsgAnnotation msgAnnotation = new MsgAnnotation();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 101) {
                        Q9J.LIZJ(q9h);
                    } else {
                        msgAnnotation.fieldDefault = _FieldAnnotation_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    msgAnnotation.audience = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return msgAnnotation;
            }
        }
    }
}
