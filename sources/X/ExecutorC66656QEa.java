package X;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.QEa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ExecutorC66656QEa implements Executor {
    public final /* synthetic */ Executor LJLIL;
    public final /* synthetic */ QEW LJLILLLLZI;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.LJLIL.execute(runnable);
        } catch (RejectedExecutionException e) {
            QET qet = ((QEZ) this.LJLILLLLZI).LJLLILLLL;
            qet.getClass();
            qet.LJIJJ(new C66674QEs("Exception received from UploadDataProvider", e));
        }
    }

    public ExecutorC66656QEa(QEW qew, Executor executor) {
        this.LJLILLLLZI = qew;
        this.LJLIL = executor;
    }
}
