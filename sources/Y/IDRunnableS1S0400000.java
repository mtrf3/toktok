package Y;

import X.C02G;
import X.C09900aA;
import X.C0P3;
import X.C0PA;
import X.C10I;
import X.C10K;
import X.C12U;
import X.C266312t;
import X.C281118l;
import X.C281318n;
import X.C30611Ib;
import X.C36581c6;
import X.C38459F7n;
import X.C64096PDo;
import Y.IDRunnableS1S0400000;
import android.animation.ValueAnimator;
import android.view.MenuItem;
import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import v5.n;

/* loaded from: classes.dex */
public class IDRunnableS1S0400000 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C02G c02g = (C02G) this.l0;
        if (c02g != null) {
            ((C281118l) this.l3).LJLIL.LLFZ = true;
            c02g.LIZIZ.LIZJ(false);
            ((C281118l) this.l3).LJLIL.LLFZ = false;
        }
        if (((MenuItem) this.l1).isEnabled() && ((MenuItem) this.l1).hasSubMenu()) {
            ((C281318n) this.l2).LJIILLIIL((MenuItem) this.l1, null, 4);
        }
    }

    public final void LIZ$1() {
        C36581c6 c36581c6 = (C36581c6) this.l0;
        if (c36581c6 != null && c36581c6.LIZIZ()) {
            ((n) this.l1).LIZ();
            return;
        }
        try {
            C10K c10k = (C10K) ((C10I) this.l2).then((C10K) this.l3);
            if (c10k == null) {
                ((n) this.l1).LIZJ(null);
            } else {
                c10k.LIZLLL(new C10I<Object, Void>() { // from class: X.1cC
                    @Override // X.C10I
                    public final Void then(C10K<Object> c10k2) {
                        C36581c6 c36581c62 = (C36581c6) IDRunnableS1S0400000.this.l0;
                        if (c36581c62 != null && c36581c62.LIZIZ()) {
                            ((n) IDRunnableS1S0400000.this.l1).LIZ();
                            return null;
                        }
                        if (c10k2.LJIIL()) {
                            ((n) IDRunnableS1S0400000.this.l1).LIZ();
                            return null;
                        }
                        if (c10k2.LJIILJJIL()) {
                            ((n) IDRunnableS1S0400000.this.l1).LIZIZ(c10k2.LJIIJ());
                            return null;
                        }
                        ((n) IDRunnableS1S0400000.this.l1).LIZJ(c10k2.LJIIJJI());
                        return null;
                    }
                });
            }
        } catch (CancellationException unused) {
            ((n) this.l1).LIZ();
        } catch (Exception e) {
            ((n) this.l1).LIZIZ(e);
        }
    }

    public final void LIZ$2() {
        int width = ((C12U) this.l0).LIZ.LIZIZ().getWidth();
        int height = ((C12U) this.l0).LIZ.LIZIZ().getHeight();
        int width2 = ((C12U) this.l0).LIZIZ.LIZIZ().getWidth();
        int height2 = ((C12U) this.l0).LIZIZ.LIZIZ().getHeight();
        C12U c12u = (C12U) this.l0;
        Integer lastX = (Integer) this.l1;
        o.LJIIIIZZ(lastX, "lastX");
        int intValue = lastX.intValue();
        Integer lastY = (Integer) this.l2;
        o.LJIIIIZZ(lastY, "lastY");
        c12u.LJIIJJI(true, intValue, lastY.intValue(), width, height, width2, height2, new IDqS443S0100000((C12U) this.l0, 44));
        ((C12U) this.l0).LJIIJJI.LJIILL(((C266312t) this.l3).LIZIZ);
    }

    public static final void run$0(IDRunnableS1S0400000 iDRunnableS1S0400000) {
        boolean LIZ;
        try {
            iDRunnableS1S0400000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS1S0400000 iDRunnableS1S0400000) {
        boolean LIZ;
        try {
            C30611Ib.LJII((View) iDRunnableS1S0400000.l0, (C0PA) iDRunnableS1S0400000.l1, (C0P3) iDRunnableS1S0400000.l2);
            ((ValueAnimator) iDRunnableS1S0400000.l3).start();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS1S0400000 iDRunnableS1S0400000) {
        boolean LIZ;
        try {
            C38459F7n c38459F7n = (C38459F7n) iDRunnableS1S0400000.l0;
            JSONObject LIZ2 = new C64096PDo(c38459F7n.LIZ, c38459F7n.LIZIZ, (JSONObject) iDRunnableS1S0400000.l1, (JSONObject) iDRunnableS1S0400000.l2, (JSONObject) iDRunnableS1S0400000.l3).LIZ();
            if (LIZ2 != null) {
                C09900aA.LJIILLIIL("monitorEvent", LIZ2.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS1S0400000 iDRunnableS1S0400000) {
        boolean LIZ;
        try {
            C36581c6 c36581c6 = (C36581c6) iDRunnableS1S0400000.l0;
            if (c36581c6 != null && c36581c6.LIZIZ()) {
                ((n) iDRunnableS1S0400000.l1).LIZ();
            } else {
                try {
                    ((n) iDRunnableS1S0400000.l1).LIZJ(((C10I) iDRunnableS1S0400000.l2).then((C10K) iDRunnableS1S0400000.l3));
                } catch (CancellationException unused) {
                    ((n) iDRunnableS1S0400000.l1).LIZ();
                } catch (Exception e) {
                    ((n) iDRunnableS1S0400000.l1).LIZIZ(e);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS1S0400000 iDRunnableS1S0400000) {
        boolean LIZ;
        try {
            iDRunnableS1S0400000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS1S0400000 iDRunnableS1S0400000) {
        boolean LIZ;
        try {
            iDRunnableS1S0400000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS1S0400000(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
