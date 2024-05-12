package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.4iD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116814iD<T> {
    public final C4NF LIZ;
    public final C116864iI<T> LIZIZ;
    public final Executor LIZJ;
    public int LIZLLL;
    public List<? extends T> LJ;

    public C116814iD(C116834iF c116834iF, C116864iI c116864iI) {
        this.LIZ = c116834iF;
        this.LIZIZ = c116864iI;
        Executor executor = c116864iI.LIZJ;
        this.LIZJ = executor == null ? new Executor() { // from class: X.4iC
            public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (runnable == null) {
                    return;
                }
                this.LJLIL.post(runnable);
            }
        } : executor;
    }
}
