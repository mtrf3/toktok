package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PWm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64588PWm {
    public ExecutorService LIZJ;
    public final int LIZ = 64;
    public final int LIZIZ = 5;
    public final Deque<C64589PWn> LIZLLL = new ArrayDeque();
    public final Deque<C64589PWn> LJ = new ArrayDeque();
    public final Deque<C64587PWl> LJFF = new ArrayDeque();

    public final synchronized ExecutorService LIZJ() {
        if (this.LIZJ == null) {
            this.LIZJ = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new P8T("OkHttp Dispatcher", false));
        }
        return this.LIZJ;
    }

    public final synchronized int LJI() {
        return this.LJ.size() + this.LJFF.size();
    }

    public final void LJFF() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = ((ArrayDeque) this.LIZLLL).iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C64589PWn c64589PWn = (C64589PWn) it.next();
                if (((ArrayDeque) this.LJ).size() >= this.LIZ) {
                    break;
                }
                Iterator it2 = ((ArrayDeque) this.LJ).iterator();
                while (it2.hasNext()) {
                    C64587PWl c64587PWl = ((C64589PWn) it2.next()).LJLJJI;
                    if (!c64587PWl.LJLJJLL && c64587PWl.LJLJJL.url().LIZLLL.equals(c64589PWn.LJLJJI.LJLJJL.url().LIZLLL)) {
                        i++;
                    }
                }
                if (i < this.LIZIZ) {
                    it.remove();
                    arrayList.add(c64589PWn);
                    ((ArrayDeque) this.LJ).add(c64589PWn);
                }
            }
            LJI();
        }
        int size = arrayList.size();
        while (i < size) {
            C64589PWn c64589PWn2 = (C64589PWn) ListProtector.get(arrayList, i);
            ExecutorService LIZJ = LIZJ();
            c64589PWn2.getClass();
            try {
                try {
                    LIZJ.execute(c64589PWn2);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    c64589PWn2.LJLJJI.LJLJJI.callFailed(c64589PWn2.LJLJJI, interruptedIOException);
                    c64589PWn2.LJLJI.onFailure(c64589PWn2.LJLJJI, interruptedIOException);
                    c64589PWn2.LJLJJI.LJLIL.LJLIL.LIZLLL(c64589PWn2);
                }
                i++;
            } catch (Throwable th) {
                c64589PWn2.LJLJJI.LJLIL.LJLIL.LIZLLL(c64589PWn2);
                throw th;
            }
        }
    }

    public C64588PWm() {
    }

    public C64588PWm(ExecutorService executorService) {
        this.LIZJ = executorService;
    }

    public final void LIZ(C64589PWn c64589PWn) {
        synchronized (this) {
            ((ArrayDeque) this.LIZLLL).add(c64589PWn);
        }
        LJFF();
    }

    public final synchronized void LIZIZ(C64587PWl c64587PWl) {
        ((ArrayDeque) this.LJFF).add(c64587PWl);
    }

    public final void LIZLLL(C64589PWn c64589PWn) {
        Deque<C64589PWn> deque = this.LJ;
        synchronized (this) {
            if (!((ArrayDeque) deque).remove(c64589PWn)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        LJFF();
    }

    public final void LJ(C64587PWl c64587PWl) {
        Deque<C64587PWl> deque = this.LJFF;
        synchronized (this) {
            if (!((ArrayDeque) deque).remove(c64587PWl)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        LJFF();
    }
}
