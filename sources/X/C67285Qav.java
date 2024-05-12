package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.Qav, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67285Qav extends FutureTask implements Comparable {
    public final long LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final /* synthetic */ C67284Qau LJLJJI;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C67285Qav c67285Qav = (C67285Qav) obj;
        boolean z = this.LJLILLLLZI;
        if (z != c67285Qav.LJLILLLLZI) {
            if (!z) {
                return 1;
            }
            return -1;
        }
        long j = this.LJLIL;
        long j2 = c67285Qav.LJLIL;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.LJLJJI.LIZ.LIZJ().LJI.LIZIZ(Long.valueOf(this.LJLIL), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.LJLJJI.LIZ.LIZJ().LJFF.LIZIZ(th, this.LJLJI);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67285Qav(C67284Qau c67284Qau, Callable callable, boolean z) {
        super(callable);
        this.LJLJJI = c67284Qau;
        long andIncrement = C67284Qau.LJIIJ.getAndIncrement();
        this.LJLIL = andIncrement;
        this.LJLJI = "Task exception on worker thread";
        this.LJLILLLLZI = z;
        if (andIncrement == Long.MAX_VALUE) {
            c67284Qau.LIZ.LIZJ().LJFF.LIZ("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67285Qav(C67284Qau c67284Qau, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.LJLJJI = c67284Qau;
        long andIncrement = C67284Qau.LJIIJ.getAndIncrement();
        this.LJLIL = andIncrement;
        this.LJLJI = str;
        this.LJLILLLLZI = z;
        if (andIncrement == Long.MAX_VALUE) {
            c67284Qau.LIZ.LIZJ().LJFF.LIZ("Tasks index overflow");
        }
    }
}
