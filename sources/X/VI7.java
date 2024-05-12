package X;

import J.N;
import com.ttnet.org.chromium.base.task.PostTask;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final /* synthetic */ class VI7 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        VI8 vi8 = VI8.LJI;
        if (!PostTask.LIZJ || vi8.LJFF) {
            PostTask.LJ.get(vi8.LIZLLL).LIZ(vi8, runnable);
            return;
        }
        if (!vi8.LIZJ && vi8.LIZLLL == 0) {
            VI8 vi82 = new VI8(vi8);
            vi82.LIZJ = true;
            vi8 = vi82;
        }
        N.Mwr17eXX(vi8.LIZ, vi8.LIZIZ, vi8.LIZJ, vi8.LIZLLL, vi8.LJ, runnable, 0L, runnable.getClass().getName());
    }
}
