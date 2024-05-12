package X;

import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.PsB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65807PsB extends PthreadThread {
    public final BlockingQueue<InterfaceC65812PsG> LJLIL;
    public final BlockingQueue<InterfaceC65812PsG> LJLILLLLZI;
    public volatile boolean LJLJI;

    public final void LIZLLL() {
        AbstractRunnableC65809PsD abstractRunnableC65809PsD;
        Process.setThreadPriority(10);
        while (true) {
            try {
                InterfaceC65812PsG take = this.LJLIL.take();
                if ((take instanceof AbstractRunnableC65809PsD) && (abstractRunnableC65809PsD = (AbstractRunnableC65809PsD) take) != null) {
                    String name = C16880lQ.LLLLIIIILLL().getName();
                    String str = abstractRunnableC65809PsD.LJLJJL;
                    if (!abstractRunnableC65809PsD.LJLILLLLZI.get()) {
                        if (!C38354F3m.LJ(str) && !C38354F3m.LJ(name)) {
                            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("ApiLocalDispatcher-");
                            LIZ.append(str);
                            LLLLIIIILLL.setName(X1D.LIZIZ(LIZ));
                        }
                        if (Logger.debug()) {
                            this.LJLIL.size();
                            this.LJLILLLLZI.size();
                        }
                        if (abstractRunnableC65809PsD.LJLJJLL == EnumC65806PsA.IMMEDIATE) {
                            RunnableC39007FSp.LIZIZ(abstractRunnableC65809PsD);
                        } else {
                            abstractRunnableC65809PsD.LJLJI.removeMessages(0);
                            abstractRunnableC65809PsD.LJLJI.sendEmptyMessageDelayed(0, 1000L);
                            this.LJLILLLLZI.add(abstractRunnableC65809PsD);
                        }
                        if (!C38354F3m.LJ(str) && !C38354F3m.LJ(name)) {
                            C16880lQ.LLLLIIIILLL().setName(name);
                        }
                    }
                }
            } catch (InterruptedException unused) {
                if (this.LJLJI) {
                    return;
                }
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

    public C65807PsB(BlockingQueue<InterfaceC65812PsG> blockingQueue, BlockingQueue<InterfaceC65812PsG> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.LJLIL = blockingQueue;
        this.LJLILLLLZI = blockingQueue2;
    }
}
