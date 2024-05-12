package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: X.1PE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1PE<D> extends C0ZP<D> {
    public final Executor LJIIIIZZ;
    public volatile C1PE<D>.a LJIIIZ;
    public volatile C1PE<D>.a LJIIJ;

    /* renamed from: X.1PE$a */
    /* loaded from: classes.dex */
    public final class a extends C0ZX<Void, Void, D> implements Runnable {
        public final CountDownLatch LJLJLLL = new CountDownLatch(1);

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                C1PE.this.LJIIIZ();
            } finally {
                if (LIZ) {
                }
            }
        }

        public a() {
        }

        @Override // X.C0ZX
        public final Object LIZ(Void[] voidArr) {
            try {
                return C1PE.this.LJIIJ();
            } catch (C10680bQ e) {
                if (this.LJLJJI.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // X.C0ZX
        public final void LIZIZ(D d) {
            try {
                C1PE c1pe = C1PE.this;
                c1pe.LJIIJJI(d);
                if (c1pe.LJIIJ == this) {
                    if (c1pe.LJII) {
                        c1pe.LJ();
                    }
                    SystemClock.uptimeMillis();
                    c1pe.LJIIJ = null;
                    c1pe.LJIIIZ();
                }
            } finally {
                this.LJLJLLL.countDown();
            }
        }

        @Override // X.C0ZX
        public final void LIZJ(D d) {
            try {
                C1PE c1pe = C1PE.this;
                if (c1pe.LJIIIZ != this) {
                    c1pe.LJIIJJI(d);
                    if (c1pe.LJIIJ == this) {
                        if (c1pe.LJII) {
                            c1pe.LJ();
                        }
                        SystemClock.uptimeMillis();
                        c1pe.LJIIJ = null;
                        c1pe.LJIIIZ();
                    }
                } else if (c1pe.LJ) {
                    c1pe.LJIIJJI(d);
                } else {
                    c1pe.LJII = false;
                    SystemClock.uptimeMillis();
                    c1pe.LJIIIZ = null;
                    c1pe.LIZIZ(d);
                }
            } finally {
                this.LJLJLLL.countDown();
            }
        }
    }

    public void LJIIIIZZ() {
    }

    public abstract D LJIIJ();

    public void LJIIJJI(D d) {
    }

    public final void LJIIIZ() {
        if (this.LJIIJ == null && this.LJIIIZ != null) {
            this.LJIIIZ.getClass();
            C1PE<D>.a aVar = this.LJIIIZ;
            Executor executor = this.LJIIIIZZ;
            if (aVar.LJLJI != C0ZV.PENDING) {
                int i = C0ZS.LIZ[aVar.LJLJI.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            aVar.LJLJI = C0ZV.RUNNING;
            aVar.LJLIL.LJLIL = null;
            executor.execute(aVar.LJLILLLLZI);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1PE(Context context) {
        super(context);
        PThreadPoolExecutor pThreadPoolExecutor = C0ZX.LJLJJLL;
        this.LJIIIIZZ = pThreadPoolExecutor;
    }

    @Override // X.C0ZP
    public void LIZJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.LIZ);
        printWriter.print(" mListener=");
        printWriter.println(this.LIZIZ);
        if (this.LIZLLL || this.LJI || this.LJII) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.LIZLLL);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.LJI);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.LJII);
        }
        if (this.LJ || this.LJFF) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.LJ);
            printWriter.print(" mReset=");
            printWriter.println(this.LJFF);
        }
        if (this.LJIIIZ != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.LJIIIZ);
            printWriter.print(" waiting=");
            this.LJIIIZ.getClass();
            printWriter.println(false);
        }
        if (this.LJIIJ != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.LJIIJ);
            printWriter.print(" waiting=");
            this.LJIIJ.getClass();
            printWriter.println(false);
        }
    }
}
