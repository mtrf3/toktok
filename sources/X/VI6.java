package X;

import J.N;
import Y.IDRunnableS6S0101000;
import android.util.Pair;
import com.ttnet.org.chromium.base.task.PostTask;
import defpackage.i0;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes15.dex */
public final class VI6 implements InterfaceC79497VHx {
    public static final ReferenceQueue<Object> LJIIIZ = new ReferenceQueue<>();
    public static final java.util.Set<VI9> LJIIJ = new HashSet();
    public final VI8 LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public volatile long LIZLLL;
    public final IDRunnableS6S0101000 LJ = new IDRunnableS6S0101000(6, this, 39);
    public final Object LJFF = new Object();
    public boolean LJI;
    public LinkedList<Runnable> LJII;
    public List<Pair<Runnable, Long>> LJIIIIZZ;

    public static void LIZIZ() {
        while (true) {
            VI9 vi9 = (VI9) LJIIIZ.poll();
            if (vi9 == null) {
                return;
            }
            N.Mvd960xb(vi9.LIZ);
            java.util.Set<VI9> set = LJIIJ;
            synchronized (set) {
                ((HashSet) set).remove(vi9);
            }
        }
    }

    public final void LIZJ() {
        int i = this.LIZJ;
        VI8 vi8 = this.LIZ;
        long MLtH82Um = N.MLtH82Um(i, vi8.LIZ, vi8.LIZIZ, vi8.LIZJ, vi8.LIZLLL, vi8.LJ);
        synchronized (this.LJFF) {
            LinkedList<Runnable> linkedList = this.LJII;
            if (linkedList != null) {
                Iterator<Runnable> it = linkedList.iterator();
                while (it.hasNext()) {
                    Runnable next = it.next();
                    N.MJ_h_2p2(MLtH82Um, next, 0L, next.getClass().getName());
                }
                this.LJII = null;
            }
            List<Pair<Runnable, Long>> list = this.LJIIIIZZ;
            if (list != null) {
                for (Pair<Runnable, Long> pair : list) {
                    N.MJ_h_2p2(MLtH82Um, (Runnable) pair.first, ((Long) pair.second).longValue(), pair.getClass().getName());
                }
                this.LJIIIIZZ = null;
            }
            this.LIZLLL = MLtH82Um;
        }
        java.util.Set<VI9> set = LJIIJ;
        synchronized (set) {
            ((HashSet) set).add(new VI9(this));
        }
        LIZIZ();
    }

    public final void LIZLLL() {
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        synchronized (PostTask.LIZ) {
            List<VI6> list = PostTask.LIZIZ;
            if (list != null) {
                list.add(this);
                this.LJII = new LinkedList<>();
                this.LJIIIIZZ = new ArrayList();
                return;
            }
            LIZJ();
        }
    }

    public VI6(VI8 vi8) {
        if (!vi8.LIZJ && vi8.LIZLLL == 0) {
            VI8 vi82 = new VI8(vi8);
            vi82.LIZJ = true;
            vi8 = vi82;
        }
        this.LIZ = vi8;
        this.LIZIZ = i0.LJFF("TaskRunnerImpl", ".PreNativeTask.run");
        this.LIZJ = 0;
        LIZIZ();
    }

    @Override // X.InterfaceC79497VHx
    public final void LIZ(Runnable runnable) {
        if (this.LIZLLL != 0) {
            N.MJ_h_2p2(this.LIZLLL, runnable, 0L, runnable.getClass().getName());
            return;
        }
        synchronized (this.LJFF) {
            LIZLLL();
            if (this.LIZLLL != 0) {
                N.MJ_h_2p2(this.LIZLLL, runnable, 0L, runnable.getClass().getName());
            } else {
                this.LJII.add(runnable);
                PostTask.LIZLLL.execute(this.LJ);
            }
        }
    }
}
