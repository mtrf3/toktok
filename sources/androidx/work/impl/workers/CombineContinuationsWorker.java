package androidx.work.impl.workers;

import X.C0CS;
import X.C29261Cw;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class CombineContinuationsWorker extends Worker {
    @Override // androidx.work.Worker
    public final C0CS LJII() {
        return new C29261Cw(this.LJLILLLLZI.LIZIZ);
    }

    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
