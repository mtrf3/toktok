package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _Tip_ProtoDecoder implements InterfaceC31105CIr<Tip> {
    public static Tip LIZIZ(Q9H q9h) {
        Tip tip = new Tip();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        tip.tipType = q9h.LJIIJ();
                    }
                } else {
                    tip.tipText = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return tip;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Tip LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
