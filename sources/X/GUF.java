package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUF extends AbstractC65781Prl implements InterfaceC88472Yns<GUU, C76800UCe> {
    public static final GUF LJLIL = new GUF();

    public GUF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GUU guu) {
        GUU it = guu;
        o.LJIIIZ(it, "it");
        if (it.LIZLLL instanceof C41442GOg) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishParallel try taskPause id=");
            LIZ.append(it.LIZIZ);
            H78.LJI(X1D.LIZIZ(LIZ));
            GUQ guq = it.LJI;
            if (guq != null && !guq.LJLLI) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("PublishParallel PublishTask(");
                LIZ2.append(guq.LJLJJL.LIZIZ);
                LIZ2.append(") invoke pause");
                H78.LJI(X1D.LIZIZ(LIZ2));
                GUG gug = guq.LJLJL;
                if (gug != null && gug.LJFF(guq.LJLLLLLL)) {
                    guq.LJLLI = true;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
