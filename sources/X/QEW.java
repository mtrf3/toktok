package X;

import Y.ARunnableS30S0200000_11;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public abstract class QEW extends QXX {
    public final AtomicInteger LJLIL;
    public final ExecutorC66656QEa LJLILLLLZI;
    public final Executor LJLJI;
    public final AbstractC66664QEi LJLJJI;
    public ByteBuffer LJLJJL;
    public long LJLJJLL;
    public long LJLJL;

    @Override // X.QXX
    public final void LLLIZZ() {
        if (this.LJLIL.compareAndSet(1, 2)) {
            Executor executor = this.LJLJI;
            QEY qey = new QEY(this);
            QET qet = ((QEZ) this).LJLLILLLL;
            qet.getClass();
            executor.execute(new ARunnableS30S0200000_11(qet, qey, 25));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRewindSucceeded() called when not awaiting a rewind; in state: ");
        LIZ.append(this.LJLIL.get());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.QXX
    public final void LLLIL(boolean z) {
        if (this.LJLIL.compareAndSet(0, 2)) {
            Executor executor = this.LJLJI;
            QEX qex = new QEX(this, z);
            QET qet = ((QEZ) this).LJLLILLLL;
            qet.getClass();
            executor.execute(new ARunnableS30S0200000_11(qet, qex, 25));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReadSucceeded() called when not awaiting a read result; in state: ");
        LIZ.append(this.LJLIL.get());
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.QXX
    public final void LLLILZLLLI(Exception exc) {
        QET qet = ((QEZ) this).LJLLILLLL;
        qet.getClass();
        qet.LJIJJ(new C66674QEs("Exception received from UploadDataProvider", exc));
    }

    public final void LLLLZ(QF3 qf3) {
        try {
            ExecutorC66656QEa executorC66656QEa = this.LJLILLLLZI;
            QET qet = ((QEZ) this).LJLLILLLL;
            qet.getClass();
            executorC66656QEa.execute(new ARunnableS30S0200000_11(qet, qf3, 27));
        } catch (RejectedExecutionException e) {
            QET qet2 = ((QEZ) this).LJLLILLLL;
            qet2.getClass();
            qet2.LJIJJ(new C66674QEs("Exception received from UploadDataProvider", e));
        }
    }

    public QEW(Executor executor, NC5 nc5, AbstractC66664QEi abstractC66664QEi) {
        super((Object) null);
        this.LJLIL = new AtomicInteger(3);
        this.LJLILLLLZI = new ExecutorC66656QEa(this, executor);
        this.LJLJI = nc5;
        this.LJLJJI = abstractC66664QEi;
    }
}
