package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1rG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC45981rG extends AbstractC39201gK implements InterfaceC44861pS {
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJIJ(long j) {
        return a1.LIZIZ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ int LJJIJ(float f) {
        return a1.LIZ(f, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ float LJJIJL(long j) {
        return a1.LIZJ(j, this);
    }

    @Override // X.InterfaceC23370vt
    public final /* synthetic */ long LJJLI(long j) {
        return a1.LIZLLL(j, this);
    }

    @Override // X.InterfaceC44861pS
    public final /* synthetic */ InterfaceC273515n LJJLIL(int i, int i2, java.util.Map map, InterfaceC88472Yns interfaceC88472Yns) {
        return C0ON.LIZ(i, i2, this, map, interfaceC88472Yns);
    }

    public abstract int LJLIL(AbstractC272415c abstractC272415c);

    public abstract AbstractC45981rG LJLILLLLZI();

    public abstract InterfaceC274415w LJLJI();

    public abstract boolean LJLJJI();

    public abstract C29321Dc LJLJJL();

    public abstract InterfaceC273515n LJLJJLL();

    public abstract AbstractC45981rG LJLJL();

    public abstract long LJLJLJ();

    public abstract void LJLL();

    public static void LJLJLLL(AbstractC538029g abstractC538029g) {
        C29321Dc c29321Dc;
        C29331Dd c29331Dd;
        o.LJIIIZ(abstractC538029g, "<this>");
        AbstractC538029g abstractC538029g2 = abstractC538029g.LJLJLJ;
        if (abstractC538029g2 != null) {
            c29321Dc = abstractC538029g2.LJLJL;
        } else {
            c29321Dc = null;
        }
        if (!o.LJ(c29321Dc, abstractC538029g.LJLJL)) {
            abstractC538029g.LJLJL.LLIFFJFJJ.LJIIJ.LJLLILLLL.LJI();
            return;
        }
        InterfaceC40441iK LJJLIIIJJIZ = abstractC538029g.LJLJL.LLIFFJFJJ.LJIIJ.LJJLIIIJJIZ();
        if (LJJLIIIJJIZ == null || (c29331Dd = ((C46111rT) LJJLIIIJJIZ).LJLLILLLL) == null) {
            return;
        }
        c29331Dd.LJI();
    }

    @Override // X.InterfaceC273715p
    public final int LJJJJ(AbstractC272415c alignmentLine) {
        int LJLIL;
        o.LJIIIZ(alignmentLine, "alignmentLine");
        if (!LJLJJI() || (LJLIL = LJLIL(alignmentLine)) == Integer.MIN_VALUE) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return C23450w1.LIZJ(LJJZ()) + LJLIL;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return getDensity() * f;
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return f / getDensity();
    }
}
