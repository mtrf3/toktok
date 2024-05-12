package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.base.ITaskManagerConfig;
import com.ss.android.ugc.aweme.legoImp.TaskManagerConfigImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class FGR {
    public static volatile FGR LIZJ;
    public boolean LIZ;
    public Executor LIZIZ;

    public static FGR LIZIZ() {
        if (LIZJ == null) {
            synchronized (FGR.class) {
                if (LIZJ == null) {
                    LIZJ = new FGR();
                }
            }
        }
        return LIZJ;
    }

    public final void LIZ(Handler handler, Callable<?> callable, int i) {
        FAF faf;
        ITaskManagerConfig iTaskManagerConfig;
        if (!this.LIZ) {
            Object LIZ = C58096Mr6.LIZ(ITaskManagerConfig.class, false);
            if (LIZ != null) {
                iTaskManagerConfig = (ITaskManagerConfig) LIZ;
            } else {
                if (C58096Mr6.k2 == null) {
                    synchronized (ITaskManagerConfig.class) {
                        if (C58096Mr6.k2 == null) {
                            C58096Mr6.k2 = new TaskManagerConfigImpl();
                        }
                    }
                }
                iTaskManagerConfig = C58096Mr6.k2;
            }
            if (iTaskManagerConfig != null) {
                this.LIZIZ = iTaskManagerConfig.LIZ().LIZ;
                this.LIZ = true;
            } else {
                throw new IllegalStateException("TaskManager not init");
            }
        }
        Executor executor = this.LIZIZ;
        if (handler == null) {
            faf = new FAF(callable, null);
        } else {
            faf = new FAF(callable, handler.obtainMessage(i));
        }
        executor.execute(faf);
    }
}
