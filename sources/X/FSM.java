package X;

import Y.ACallableS109S0100000_6;
import Y.ARunnableS16S0201000_13;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.TraceEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public abstract class FSM<Result> {
    public static final VI7 LJ = new VI7();
    public volatile int LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean();
    public final AtomicBoolean LIZLLL = new AtomicBoolean();
    public final FSM<Result>.b LIZ = new b(new ACallableS109S0100000_6(this, 34));

    /* loaded from: classes7.dex */
    public class b extends FutureTask<Result> {
        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                FSM fsm = FSM.this;
                Result result = get();
                if (!fsm.LIZLLL.get()) {
                    fsm.LIZIZ(result);
                }
            } catch (InterruptedException e) {
                Object[] objArr = new Object[0];
                C78939UyV.LJIILIIL(e.toString(), C78939UyV.LJJII(objArr), objArr);
            } catch (CancellationException unused) {
                FSM fsm2 = FSM.this;
                if (!fsm2.LIZLLL.get()) {
                    fsm2.LIZIZ(null);
                }
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            }
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AsyncTask.run: ");
            LIZ.append(FSM.this.getClass().getName());
            TraceEvent LIZ2 = TraceEvent.LIZ(X1D.LIZIZ(LIZ));
            try {
                super.run();
                if (LIZ2 != null) {
                    LIZ2.close();
                }
            } catch (Throwable th) {
                if (LIZ2 != null) {
                    try {
                        LIZ2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public b(ACallableS109S0100000_6 aCallableS109S0100000_6) {
            super(aCallableS109S0100000_6);
        }
    }

    public abstract void LIZ();

    static {
        new FSO();
    }

    public final void LIZIZ(Result result) {
        if (this instanceof FSS) {
            this.LIZIZ = 2;
        } else {
            ThreadUtils.LIZ().post(new ARunnableS16S0201000_13(4, this, result, 2));
        }
    }
}
