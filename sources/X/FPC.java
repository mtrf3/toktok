package X;

import com.google.gson.j;
import com.google.gson.m;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public class FPC {
    public volatile FPA LIZ;
    public final /* synthetic */ FP9 LIZIZ;

    public final void LIZIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = new FPA();
                }
            }
        }
    }

    public FPC(FP9 fp9) {
        this.LIZIZ = fp9;
    }

    public final void LIZ(m mVar) {
        boolean LJFF;
        int LJIILJJIL;
        String LJJIII;
        LIZIZ();
        FPA fpa = this.LIZ;
        ((ReentrantReadWriteLock) fpa.LJIIJ).writeLock().lock();
        j LJJIJ = mVar.LJJIJ("scc_cs_enable_prefetch");
        if (LJJIJ == null) {
            LJFF = false;
        } else {
            LJFF = LJJIJ.LJFF();
        }
        fpa.LJI = LJFF;
        j LJJIJ2 = mVar.LJJIJ("scc_cs_max_wait_time");
        if (LJJIJ2 == null) {
            LJIILJJIL = 1000;
        } else {
            LJIILJJIL = LJJIJ2.LJIILJJIL();
        }
        fpa.LJII = LJIILJJIL;
        if (LJIILJJIL <= 0) {
            fpa.LJII = 1000;
        }
        int i = fpa.LJII;
        if (i > fpa.LJIIIZ) {
            fpa.LJIIIZ = i;
        }
        j LJJIJ3 = mVar.LJJIJ("scc_cs_allow_list");
        if (LJJIJ3 == null) {
            LJJIII = null;
        } else {
            LJJIII = T2R.LJJIII(LJJIJ3.LJIILLIIL());
        }
        fpa.LIZIZ = LJJIII;
        j LJJIJ4 = mVar.LJJIJ("scc_seclink_scene");
        if (LJJIJ4 != null) {
            fpa.LJIIIIZZ = LJJIJ4.LJJIFFI();
        }
        ((ReentrantReadWriteLock) fpa.LJIIJ).writeLock().unlock();
    }
}
