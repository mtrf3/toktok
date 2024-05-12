package Y;

import X.AG6;
import X.AbstractC84920XUm;
import X.C1DH;
import X.C2U8;
import X.C34821Yg;
import X.C84767XOp;
import X.C84916XUi;
import X.C84923XUp;
import X.C84942XVi;
import X.C84943XVj;
import X.IKV;
import X.JJ4;
import android.app.Activity;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class IDgS140S0200000_15 implements JJ4 {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final /* synthetic */ void LIZIZ$1(IDgS140S0200000_15 iDgS140S0200000_15) {
    }

    public static final /* synthetic */ void LIZIZ$2(IDgS140S0200000_15 iDgS140S0200000_15) {
    }

    @Override // X.JJ4
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                return;
            case 1:
                LIZIZ$1(this);
                return;
            case 2:
                LIZIZ$2(this);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$0(IDgS140S0200000_15 iDgS140S0200000_15) {
        if (!((C84923XUp) iDgS140S0200000_15.l1).LJFF.LIZLLL.isFinishing()) {
            C84923XUp c84923XUp = (C84923XUp) iDgS140S0200000_15.l1;
            C84916XUi LJ = c84923XUp.LJFF.LJ(c84923XUp.LIZ, c84923XUp.LIZJ);
            LJ.LJFF = null;
            LJ.LJI = null;
            C84923XUp c84923XUp2 = (C84923XUp) iDgS140S0200000_15.l1;
            C34821Yg LJFF = c84923XUp2.LJFF.LJFF(c84923XUp2.LIZ, c84923XUp2.LIZJ);
            C84923XUp c84923XUp3 = (C84923XUp) iDgS140S0200000_15.l1;
            LJFF.LJIIIZ(null, c84923XUp3.LJFF.LJFF, c84923XUp3.LIZIZ, ((AbstractC84920XUm) LJFF.LIZ).LIZIZ, false);
        }
    }

    public static final void LIZ$1(IDgS140S0200000_15 iDgS140S0200000_15) {
        C84943XVj c84943XVj = (C84943XVj) iDgS140S0200000_15.l0;
        Activity activity = (Activity) iDgS140S0200000_15.l1;
        c84943XVj.getClass();
        if (activity != null && !activity.isFinishing()) {
            C84942XVi c84942XVi = c84943XVj.LIZ;
            c84942XVi.LIZLLL(false, c84942XVi.LIZLLL, false, false);
        }
    }

    public static final void LIZ$2(IDgS140S0200000_15 iDgS140S0200000_15) {
        if (!((HashSet) iDgS140S0200000_15.l0).isEmpty()) {
            Iterator it = ((HashSet) iDgS140S0200000_15.l0).iterator();
            while (it.hasNext()) {
                ((AG6) it.next()).LJIIIZ(true);
            }
            ((HashSet) iDgS140S0200000_15.l0).clear();
        }
        C2U8.LIZ(new IKV());
        C1DH.LJJIJIIJIL(500L, new ARunnableS51S0100000_15((Activity) iDgS140S0200000_15.l1, 121));
    }

    public static final void LIZIZ$0(IDgS140S0200000_15 iDgS140S0200000_15) {
        C84923XUp c84923XUp = (C84923XUp) iDgS140S0200000_15.l1;
        c84923XUp.LJFF((C84767XOp) iDgS140S0200000_15.l0, c84923XUp.LIZ, c84923XUp.LIZIZ, c84923XUp.LIZLLL, c84923XUp.LJ);
    }

    public IDgS140S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
