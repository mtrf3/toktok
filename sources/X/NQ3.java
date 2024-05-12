package X;

import Y.ARunnableS21S0300000_10;
import android.view.View;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NQ3 {
    public ARunnableS21S0300000_10 LIZ;
    public NQ5 LIZIZ;
    public final PThreadScheduledThreadPoolExecutor LIZJ = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("VisibleTaskUtil"));
    public boolean LIZLLL;

    public final void LIZ(View view, Runnable callback, boolean z) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(callback, "callback");
        if (!C16330kX.LIZIZ(view)) {
            return;
        }
        if (C27740Aue.LJI(view) && !C84763XOl.LJIIJJI && C2YY.LIZ(view.getContext()) != 2) {
            this.LIZJ.remove(this.LIZ);
            callback.run();
            NQ5 nq5 = this.LIZIZ;
            if (nq5 != null) {
                nq5.dispose();
                return;
            }
            return;
        }
        if (z) {
            this.LIZLLL = false;
            ARunnableS21S0300000_10 aRunnableS21S0300000_10 = this.LIZ;
            if (aRunnableS21S0300000_10 != null) {
                this.LIZJ.remove(aRunnableS21S0300000_10);
            }
            this.LIZ = new ARunnableS21S0300000_10(this, view, callback, 26);
        }
        if (this.LIZLLL) {
            return;
        }
        if (this.LIZIZ == null) {
            NQ5 nq52 = new NQ5(this);
            this.LIZIZ = nq52;
            C84763XOl.LJI().LIZ(nq52);
        }
        ARunnableS21S0300000_10 aRunnableS21S0300000_102 = this.LIZ;
        if (aRunnableS21S0300000_102 != null) {
            this.LIZJ.remove(aRunnableS21S0300000_102);
            this.LIZJ.schedule(aRunnableS21S0300000_102, 100L, TimeUnit.MILLISECONDS);
        }
    }
}
