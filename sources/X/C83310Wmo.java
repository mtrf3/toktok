package X;

import Y.ACallableS91S0200000_14;
import Y.ARunnableS33S0200000_14;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS74S0400000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wmo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83310Wmo<Param, Target> implements InterfaceC83286WmQ<Param, Target> {
    public static final /* synthetic */ int LJIILIIL = 0;
    public boolean LIZIZ;
    public InterfaceC83315Wmt LIZJ;
    public boolean LIZLLL;
    public final AbstractC83313Wmr<Param, Target> LJIIL;
    public boolean LIZ = true;
    public final Queue<AbstractC83312Wmq<Param, Target>> LJ = new ConcurrentLinkedQueue();
    public final Queue<AbstractC83312Wmq<Param, Target>> LJFF = new ConcurrentLinkedQueue();
    public final Queue<AbstractC83312Wmq<Param, Target>> LJI = new ConcurrentLinkedQueue();
    public final C62822Ol8 LJII = C221108m2.LIZIZ(C65759PrP.LJLIL);
    public final Handler LJIIIIZZ = new Handler(C16880lQ.LLJJJJ());
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C36575EXb.INSTANCE);
    public final AtomicInteger LJIIJ = new AtomicInteger(3);
    public final List<Param> LJIIJJI = FII.LIZ();

    public final InterfaceC65637PpR<Param, InterfaceC83314Wms<Param, Target>> LJ() {
        return (InterfaceC65637PpR) this.LJII.getValue();
    }

    public final void LJIIIZ() {
        AbstractC83312Wmq abstractC83312Wmq;
        while (this.LIZLLL && this.LJIIJ.get() > 0) {
            if (!((ConcurrentLinkedQueue) this.LJFF).isEmpty()) {
                abstractC83312Wmq = (AbstractC83312Wmq) ((ConcurrentLinkedQueue) this.LJFF).poll();
            } else if (!((ConcurrentLinkedQueue) this.LJ).isEmpty()) {
                abstractC83312Wmq = (AbstractC83312Wmq) ((ConcurrentLinkedQueue) this.LJ).poll();
            } else {
                return;
            }
            if (abstractC83312Wmq != null) {
                ((ConcurrentLinkedQueue) this.LJI).offer(abstractC83312Wmq);
                C10K.LIZJ(new ACallableS91S0200000_14(abstractC83312Wmq, this, 1));
                this.LJIIJ.decrementAndGet();
            } else {
                return;
            }
        }
    }

    public C83310Wmo(AbstractC83313Wmr abstractC83313Wmr) {
        this.LJIIL = abstractC83313Wmr;
    }

    public static void LJII(String str) {
        C82891Wg3.LIZLLL().d(str);
    }

    @Override // X.InterfaceC83286WmQ
    public final void LIZ(AbstractC83312Wmq<Param, Target> task) {
        o.LJIIIZ(task, "task");
        task.LIZ(4);
        ((ConcurrentLinkedQueue) this.LJI).remove(task);
        int i = task.LIZIZ;
        if (i < 0) {
            task.LIZIZ = i + 1;
            ((ConcurrentLinkedQueue) this.LJ).offer(task);
        }
        LJIIIIZZ(new AqS161S0200000_14(this, task, 35));
        this.LJIIJ.incrementAndGet();
        LJIIIIZZ(new AqS164S0100000_14(this, 284));
    }

    @Override // X.InterfaceC83286WmQ
    public final void LIZIZ(AbstractC83312Wmq<Param, Target> task) {
        o.LJIIIZ(task, "task");
        int i = task.LIZ.get();
        if (3 != i && 4 != i) {
            task.LIZ(2);
        }
        LJIIIIZZ(new AqS161S0200000_14(this, task, 35));
    }

    @Override // X.InterfaceC83286WmQ
    public final void LIZJ(AbstractC83312Wmq<Param, Target> task) {
        o.LJIIIZ(task, "task");
        task.LIZ(3);
        ((ConcurrentLinkedQueue) this.LJI).remove(task);
        LJIIIIZZ(new AqS161S0200000_14(this, task, 35));
        this.LJIIJ.incrementAndGet();
        LJIIIIZZ(new AqS164S0100000_14(this, 284));
    }

    public final boolean LJFF(Param param) {
        if (param == null) {
            return false;
        }
        for (Object obj : this.LJFF) {
            Param param2 = ((AbstractC83312Wmq) obj).LJ;
            if (param2 != null && param2.equals(param)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LJI(Param param) {
        if (param == null) {
            return false;
        }
        for (Object obj : this.LJI) {
            Param param2 = ((AbstractC83312Wmq) obj).LJ;
            if (param2 != null && param2.equals(param)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJIIIIZZ(InterfaceC65784Pro<? extends Object> interfaceC65784Pro) {
        if (o.LJ(this.LJIIIZ.getValue(), C16880lQ.LLLLIIIILLL())) {
            try {
                interfaceC65784Pro.invoke();
                return;
            } catch (Exception e) {
                InterfaceC83315Wmt interfaceC83315Wmt = this.LIZJ;
                if (interfaceC83315Wmt != null) {
                    interfaceC83315Wmt.LIZ(e);
                    return;
                }
                return;
            }
        }
        this.LJIIIIZZ.post(new ARunnableS33S0200000_14(interfaceC65784Pro, this, 60));
    }

    public final void LIZLLL(Param param, InterfaceC83314Wms<Param, Target> interfaceC83314Wms) {
        if (param != null) {
            Object obj = null;
            if (LJFF(param) || LJI(param)) {
                if (this.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("add priority task, download is already started, no reentrance, info: ");
                    LIZ.append(param);
                    LJII(X1D.LIZIZ(LIZ));
                    return;
                }
                LJIIIIZZ(new AqS74S0400000_14(this, param, interfaceC83314Wms, (InterfaceC65784Pro) null, 2));
                return;
            }
            Iterator it = ((ConcurrentLinkedQueue) this.LJ).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Param param2 = ((AbstractC83312Wmq) next).LJ;
                if (param2 != null && param2.equals(param)) {
                    obj = next;
                    break;
                }
            }
            AbstractC83312Wmq<Param, Target> abstractC83312Wmq = (AbstractC83312Wmq) obj;
            if (abstractC83312Wmq != null) {
                ((ConcurrentLinkedQueue) this.LJ).remove(abstractC83312Wmq);
            } else {
                AbstractC83313Wmr<Param, Target> abstractC83313Wmr = this.LJIIL;
                abstractC83312Wmq = abstractC83313Wmr.LIZ(param, abstractC83313Wmr.LIZ.LIZJ());
                if (abstractC83312Wmq == null) {
                    return;
                }
            }
            ((ConcurrentLinkedQueue) this.LJFF).offer(abstractC83312Wmq);
            this.LIZLLL = true;
            LJIIIIZZ(new AqS74S0400000_14(this, param, interfaceC83314Wms, new AqS161S0200000_14(this, abstractC83312Wmq, 33), 2));
            LJIIIZ();
        }
    }
}
