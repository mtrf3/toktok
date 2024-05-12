package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class OAW implements Executor {
    public final PThreadPoolExecutor LJLIL;
    public final OEZ LJLILLLLZI;

    public OAW() {
        OEZ oez = new OEZ();
        this.LJLILLLLZI = oez;
        this.LJLIL = new PThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, oez.LIZ, new OAV());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LJLIL.execute(runnable);
    }
}
