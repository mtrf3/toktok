package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _PrivilegeFAQ_ProtoDecoder implements InterfaceC31105CIr<PrivilegeFAQ> {
    public static PrivilegeFAQ LIZIZ(Q9H q9h) {
        PrivilegeFAQ privilegeFAQ = new PrivilegeFAQ();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        privilegeFAQ.contentText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    privilegeFAQ.contentType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return privilegeFAQ;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PrivilegeFAQ LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
