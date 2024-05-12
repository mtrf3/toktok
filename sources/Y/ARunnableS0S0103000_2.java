package Y;

import X.C113584d0;
import X.C162626Zu;
import X.C169776lR;
import X.C169786lS;
import X.C1FJ;
import X.C5UO;
import X.C6YX;
import X.U26;
import java.util.List;

/* loaded from: classes3.dex */
public class ARunnableS0S0103000_2 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S0103000_2 aRunnableS0S0103000_2) {
        C169776lR c169776lR = (C169776lR) aRunnableS0S0103000_2.l0;
        int i = aRunnableS0S0103000_2.i1;
        int i2 = aRunnableS0S0103000_2.i2;
        int i3 = aRunnableS0S0103000_2.i3;
        c169776lR.LJJIFFI.setCoverSize(i);
        if (c169776lR.LIZ.isMvThemeVideoType()) {
            final C113584d0 c113584d0 = new C113584d0(i2, i3);
            c169776lR.LJJIFFI.setAdapter(c113584d0);
            C6YX c6yx = new C6YX();
            c6yx.LIZIZ = new U26();
            c6yx.LJIIL = c169776lR.LJJJJZ;
            c6yx.LJIIJJI = c169776lR.LJJJJLL;
            c6yx.LJIILJJIL = i2;
            c6yx.LIZ(c169776lR.LJJIZ, c169776lR.LJJIIJZLJL, i, new C5UO() { // from class: X.6Yd
                @Override // X.C5UO
                public final void LIZ(List list) {
                    C113584d0.this.LJLLLLLL(list);
                }
            });
            c169776lR.LJJIFFI.setAdapter(c113584d0);
        } else {
            c169776lR.LJJIFFI.setAdapter(new C162626Zu(c169776lR.LJJIIZI, i2, i3));
        }
        c169776lR.LJI();
    }

    public static final void run$1(ARunnableS0S0103000_2 aRunnableS0S0103000_2) {
        C169786lS c169786lS = (C169786lS) aRunnableS0S0103000_2.l0;
        int i = aRunnableS0S0103000_2.i1;
        int i2 = aRunnableS0S0103000_2.i2;
        int i3 = aRunnableS0S0103000_2.i3;
        c169786lS.LJIJJLI.setCoverSize(i);
        if (c169786lS.LIZ.isMvThemeVideoType()) {
            final C113584d0 c113584d0 = new C113584d0(i2, i3);
            c169786lS.LJIJJLI.setAdapter(c113584d0);
            C6YX c6yx = new C6YX();
            c6yx.LIZIZ = new C1FJ();
            c6yx.LJIIL = c169786lS.LJJJJIZL;
            c6yx.LJIIJJI = c169786lS.LJJJJI;
            c6yx.LJIILJJIL = i2;
            c6yx.LIZ(c169786lS.LJJIJIL, c169786lS.LJJIFFI, i, new C5UO() { // from class: X.6Ye
                @Override // X.C5UO
                public final void LIZ(List list) {
                    C113584d0.this.LJLLLLLL(list);
                }
            });
            c169786lS.LJIJJLI.setAdapter(c113584d0);
            return;
        }
        c169786lS.LJIJJLI.setAdapter(new C162626Zu(c169786lS.LJJIII, i2, i3));
        c169786lS.LJII();
    }

    public ARunnableS0S0103000_2(Object obj, int i, int i2, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
    }
}
