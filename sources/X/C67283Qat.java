package X;

import android.os.Process;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.Qat, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67283Qat extends PthreadThread {
    public final Object LJLIL;
    public final BlockingQueue LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ C67284Qau LJLJJI;

    public final void LIZLLL() {
        int i;
        while (true) {
            try {
                this.LJLJJI.LJIIIZ.acquire();
            } catch (InterruptedException e) {
                this.LJLJJI.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, String.valueOf(getName()).concat(" was interrupted"));
            }
            if (1 != 0) {
                try {
                    break;
                } finally {
                    LJFF();
                }
            }
        }
        int threadPriority = Process.getThreadPriority(Process.myTid());
        while (true) {
            C67285Qav c67285Qav = (C67285Qav) this.LJLILLLLZI.poll();
            if (c67285Qav != null) {
                if (true != c67285Qav.LJLILLLLZI) {
                    i = 10;
                } else {
                    i = threadPriority;
                }
                Process.setThreadPriority(i);
                c67285Qav.run();
            } else {
                synchronized (this.LJLIL) {
                    if (this.LJLILLLLZI.peek() == null) {
                        this.LJLJJI.getClass();
                        try {
                            this.LJLIL.wait(30000L);
                        } catch (InterruptedException e2) {
                            this.LJLJJI.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e2, String.valueOf(getName()).concat(" was interrupted"));
                        }
                    }
                }
                synchronized (this.LJLJJI.LJIIIIZZ) {
                    if (this.LJLILLLLZI.peek() == null) {
                        break;
                    }
                }
            }
        }
        if (this.LJLJJI.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJLI)) {
            LJFF();
        }
    }

    public final void LJ() {
        synchronized (this.LJLIL) {
            this.LJLIL.notifyAll();
        }
    }

    public final void LJFF() {
        synchronized (this.LJLJJI.LJIIIIZZ) {
            if (!this.LJLJI) {
                this.LJLJJI.LJIIIZ.release();
                this.LJLJJI.LJIIIIZZ.notifyAll();
                C67284Qau c67284Qau = this.LJLJJI;
                if (this == c67284Qau.LIZJ) {
                    c67284Qau.LIZJ = null;
                } else if (this == c67284Qau.LIZLLL) {
                    c67284Qau.LIZLLL = null;
                } else {
                    c67284Qau.LIZ.LIZJ().LJFF.LIZ("Current scheduler thread is neither worker nor network");
                }
                this.LJLJI = true;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67283Qat(C67284Qau c67284Qau, String str, BlockingQueue blockingQueue) {
        super("internal/zzgg");
        this.LJLJJI = c67284Qau;
        QH7.LJIIIIZZ(blockingQueue);
        this.LJLIL = new Object();
        this.LJLILLLLZI = blockingQueue;
        setName(str);
    }
}
