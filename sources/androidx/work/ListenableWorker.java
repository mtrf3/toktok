package androidx.work;

import X.C0VT;
import X.C43731nd;
import X.C76L;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public final Context LJLIL;
    public final WorkerParameters LJLILLLLZI;
    public volatile boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    public void LIZJ() {
    }

    public abstract C43731nd LJ();

    public final void LJI() {
        this.LJLJI = true;
        LIZJ();
    }

    public C76L<C0VT> LIZ() {
        C43731nd c43731nd = new C43731nd();
        c43731nd.LJIIIZ(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c43731nd;
    }

    public boolean LIZIZ() {
        return this.LJLJJL;
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.LJLIL = context;
                this.LJLILLLLZI = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }
}
