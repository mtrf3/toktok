package androidx.work.impl.workers;

import X.C0CS;
import X.C0VW;
import X.C16880lQ;
import X.C43731nd;
import X.InterfaceC13820gU;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC13820gU {
    public final WorkerParameters LJLJJLL;
    public final Object LJLJL;
    public volatile boolean LJLJLJ;
    public final C43731nd<C0CS> LJLJLLL;
    public ListenableWorker LJLL;

    @Override // X.InterfaceC13820gU
    public final void LJFF(List<String> list) {
    }

    static {
        C0VW.LIZIZ("ConstraintTrkngWrkr");
    }

    @Override // androidx.work.ListenableWorker
    public final boolean LIZIZ() {
        ListenableWorker listenableWorker = this.LJLL;
        if (listenableWorker != null && listenableWorker.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void LIZJ() {
        ListenableWorker listenableWorker = this.LJLL;
        if (listenableWorker != null && !listenableWorker.LJLJI) {
            this.LJLL.LJI();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final C43731nd LJ() {
        this.LJLILLLLZI.LIZJ.execute(new IDRunnableS85S0100000(this, 106));
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC13820gU
    public final void LIZLLL(List<String> list) {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Constraints changed for %s", new Object[]{list});
        LIZ.getClass();
        synchronized (this.LJLJL) {
            this.LJLJLJ = true;
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.LJLJJLL = workerParameters;
        this.LJLJL = new Object();
        this.LJLJLJ = false;
        this.LJLJLLL = new C43731nd<>();
    }
}
