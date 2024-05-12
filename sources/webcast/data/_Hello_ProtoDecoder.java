package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes12.dex */
public final class _Hello_ProtoDecoder implements InterfaceC31105CIr<Hello> {
    @Override // X.InterfaceC31105CIr
    public final Hello LIZ(Q9H q9h) {
        Hello hello = new Hello();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        hello.id = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    hello.content = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return hello;
            }
        }
    }
}
