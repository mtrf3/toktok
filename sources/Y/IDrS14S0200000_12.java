package Y;

import X.C0A6;
import X.C188727au;
import X.C208298Fl;
import X.C70459Rl1;
import X.C70565Rmj;
import X.C72732Sga;
import X.DialogC72721SgP;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC70458Rl0;
import X.InterfaceC70564Rmi;
import X.MKO;
import X.MKQ;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDrS14S0200000_12 extends C0A6 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 4:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 2:
                LJIILL$1(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS14S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJIILJJIL$0(IDrS14S0200000_12 iDrS14S0200000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            InterfaceC70458Rl0 interfaceC70458Rl0 = ((C70459Rl1) iDrS14S0200000_12.l0).LIZJ;
            if (interfaceC70458Rl0 != null) {
                interfaceC70458Rl0.LIZJ();
            }
            ((MKQ) iDrS14S0200000_12.l1).removeCallbacks(((C70459Rl1) iDrS14S0200000_12.l0).LJ);
            ((MKQ) iDrS14S0200000_12.l1).postDelayed(((C70459Rl1) iDrS14S0200000_12.l0).LJ, 500L);
            RecyclerView currentSubRecyclerView = ((MKQ) iDrS14S0200000_12.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView != null) {
                currentSubRecyclerView.LJJLL(((C70459Rl1) iDrS14S0200000_12.l0).LIZLLL);
            }
            RecyclerView currentSubRecyclerView2 = ((MKQ) iDrS14S0200000_12.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView2 != null) {
                currentSubRecyclerView2.LJIIJJI(((C70459Rl1) iDrS14S0200000_12.l0).LIZLLL);
            }
        }
    }

    public static final void LJIILJJIL$1(IDrS14S0200000_12 iDrS14S0200000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDrS14S0200000_12.l0;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            ((MKQ) iDrS14S0200000_12.l1).LJJLL(iDrS14S0200000_12);
        }
    }

    public static final void LJIILJJIL$2(IDrS14S0200000_12 iDrS14S0200000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            InterfaceC70564Rmi interfaceC70564Rmi = ((C70565Rmj) iDrS14S0200000_12.l0).LIZJ;
            if (interfaceC70564Rmi != null) {
                interfaceC70564Rmi.LIZJ();
            }
            ((MKO) iDrS14S0200000_12.l1).removeCallbacks(((C70565Rmj) iDrS14S0200000_12.l0).LJ);
            ((MKO) iDrS14S0200000_12.l1).postDelayed(((C70565Rmj) iDrS14S0200000_12.l0).LJ, 500L);
            RecyclerView currentSubRecyclerView = ((MKO) iDrS14S0200000_12.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView != null) {
                currentSubRecyclerView.LJJLL(((C70565Rmj) iDrS14S0200000_12.l0).LIZLLL);
            }
            RecyclerView currentSubRecyclerView2 = ((MKO) iDrS14S0200000_12.l1).getCurrentSubRecyclerView();
            if (currentSubRecyclerView2 != null) {
                currentSubRecyclerView2.LJIIJJI(((C70565Rmj) iDrS14S0200000_12.l0).LIZLLL);
            }
        }
    }

    public static final void LJIILJJIL$3(IDrS14S0200000_12 iDrS14S0200000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDrS14S0200000_12.l0;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            ((MKO) iDrS14S0200000_12.l1).LJJLL(iDrS14S0200000_12);
        }
    }

    public static final void LJIILJJIL$4(IDrS14S0200000_12 iDrS14S0200000_12, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((DialogC72721SgP) iDrS14S0200000_12.l0).LJJIJIIJI();
        View snappedView = ((C208298Fl) iDrS14S0200000_12.l1).getSnappedView();
        if (snappedView != null && i == 0) {
            ((C208298Fl) iDrS14S0200000_12.l1).getClass();
            int LJJJJIZL = RecyclerView.LJJJJIZL(snappedView);
            if (LJJJJIZL == C72732Sga.LIZ) {
                return;
            }
            C72732Sga.LIZ = LJJJJIZL;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "profile_photo_page");
            c188727au.LJIIIZ("enter_method", "edit_head");
            c188727au.LIZLLL(LJJJJIZL, "order");
            FMX.LJIIL("swipe_avatar_carousel", c188727au.LIZ);
        }
    }

    public static final void LJIILL$0(IDrS14S0200000_12 iDrS14S0200000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C70459Rl1) iDrS14S0200000_12.l0).LIZ = SystemClock.elapsedRealtime();
    }

    public static final void LJIILL$1(IDrS14S0200000_12 iDrS14S0200000_12, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C70565Rmj) iDrS14S0200000_12.l0).LIZ = SystemClock.elapsedRealtime();
    }
}
