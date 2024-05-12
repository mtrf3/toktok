package X;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* renamed from: X.Usm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ExecutorC78584Usm implements Executor {
    public static final String LJLJI = C16880lQ.LJLLJ(ExecutorC78584Usm.class);
    public final ArrayBlockingQueue<Runnable> LJLIL;
    public final InterfaceC78587Usp LJLILLLLZI;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        InterfaceC78587Usp interfaceC78587Usp;
        if (!this.LJLIL.offer(runnable) && (interfaceC78587Usp = this.LJLILLLLZI) != null) {
            interfaceC78587Usp.LIZ();
        }
    }

    public ExecutorC78584Usm(int i, FQT fqt, InterfaceC78587Usp interfaceC78587Usp) {
        ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(i);
        this.LJLIL = arrayBlockingQueue;
        fqt.newThread(new RunnableC78585Usn(arrayBlockingQueue)).start();
        this.LJLILLLLZI = interfaceC78587Usp;
    }
}
