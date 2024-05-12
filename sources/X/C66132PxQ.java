package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PxQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66132PxQ extends AbstractC66121PxF {
    public static final C66132PxQ LJ;

    static {
        C66132PxQ c66132PxQ = new C66132PxQ();
        LJ = c66132PxQ;
        c66132PxQ.LJI(C66172Py4.LIZJ);
    }

    @Override // X.AbstractC66131PxP
    public final int[] LIZLLL() {
        return C66172Py4.LIZ;
    }

    @Override // X.AbstractC66121PxF
    public final String LJIIIZ() {
        return "ar";
    }

    @Override // X.AbstractC66131PxP
    public final void LJFF(C66120PxE event) {
        o.LJIIIZ(event, "event");
        C66152Pxk c66152Pxk = this.LIZ.get(event.LJLJI);
        if (c66152Pxk.LIZIZ == 3) {
            int i = event.LJLJI;
            if (i != 100401 && i != 100403) {
                switch (i) {
                    case 102200:
                        LJIILIIL(c66152Pxk, event, C47261Igj.LJJIJ(100400));
                        return;
                    case 102201:
                        LJIILIIL(c66152Pxk, event, C47261Igj.LJJIJ(100404));
                        return;
                    case 102202:
                        LJIILIIL(c66152Pxk, event, C47261Igj.LJJIJIIJI(100400, 100402));
                        return;
                    default:
                        return;
                }
            }
            LJIILJJIL(event);
            return;
        }
        if (c66152Pxk.LIZJ == 100400) {
            C66150Pxi.LIZ("ar", event);
        }
        LJIIL(c66152Pxk, event);
    }

    @Override // X.AbstractC66121PxF
    public final List<Integer> LJIIIIZZ(int i) {
        switch (i) {
            case 100404:
                return C47261Igj.LJJIJ(100400);
            case 100405:
                return C47261Igj.LJJIJIIJI(100402, 100400);
            case 100501:
                return C47261Igj.LJJIJ(100500);
            case 100503:
                return C47261Igj.LJJIJ(100502);
            default:
                return C61878OQg.INSTANCE;
        }
    }
}
