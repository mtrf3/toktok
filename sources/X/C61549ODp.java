package X;

import Y.ARunnableS29S0200000_10;
import android.os.Handler;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.ODp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61549ODp extends OER {
    public final /* synthetic */ InterfaceC61556ODw LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ UpdatePackage LJLJJL;
    public final /* synthetic */ C61547ODn LJLJJLL;

    public final void LIZJ() {
        C61560OEa c61560OEa = EBC.LIZ.LJIIL;
        if (c61560OEa != null) {
            AtomicBoolean atomicBoolean = c61560OEa.LIZ;
            if (atomicBoolean.get()) {
                synchronized (c61560OEa.LIZIZ) {
                    if (atomicBoolean.get()) {
                        try {
                            c61560OEa.LIZIZ.wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            }
        }
        C61550ODq c61550ODq = this.LJLJJLL.LJIIIIZZ;
        if (c61550ODq != null && c61550ODq.LIZIZ.get()) {
            this.LJLJJLL.LJIIIZ.add(this);
            C61547ODn c61547ODn = this.LJLJJLL;
            C61550ODq c61550ODq2 = c61547ODn.LJIIIIZZ;
            CopyOnWriteArrayList<OER> pendingTasks = c61547ODn.LJIIIZ;
            c61550ODq2.getClass();
            o.LJIIJ(pendingTasks, "pendingTasks");
            if (c61550ODq2.LIZLLL == null && !c61550ODq2.LIZJ) {
                c61550ODq2.LIZLLL = new ARunnableS29S0200000_10(c61550ODq2, pendingTasks, 38);
                ((Handler) c61550ODq2.LJ.getValue()).postDelayed(c61550ODq2.LIZLLL, 60000L);
                return;
            }
            return;
        }
        try {
            this.LJLJI.LIZLLL(Integer.valueOf(this.LJLJJI), "update_priority");
            this.LJLJI.LJ(this.LJLJJL);
            if (C61547ODn.LJIIJJI.decrementAndGet() == 0) {
                C61547ODn.LJIIJ.set(0);
                return;
            }
            C61550ODq c61550ODq3 = this.LJLJJLL.LJIIIIZZ;
            if (c61550ODq3 != null && !c61550ODq3.LIZIZ.get()) {
                this.LJLJJLL.LIZJ();
            }
        } catch (Throwable th) {
            C61547ODn c61547ODn2 = this.LJLJJLL;
            OE9 oe9 = c61547ODn2.LIZLLL;
            if (oe9 == null) {
                return;
            }
            oe9.LJ(c61547ODn2.LJ, c61547ODn2, th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61549ODp(C61547ODn c61547ODn, int i, OES oes, C61548ODo c61548ODo, int i2, UpdatePackage updatePackage) {
        super(i, oes);
        this.LJLJJLL = c61547ODn;
        this.LJLJI = c61548ODo;
        this.LJLJJI = i2;
        this.LJLJJL = updatePackage;
    }
}
