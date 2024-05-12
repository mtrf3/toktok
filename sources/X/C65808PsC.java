package X;

import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.PsC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65808PsC extends PthreadThread implements WeakHandler.IHandler {
    public static final C65810PsE LJLJJL = C65810PsE.LIZ();
    public final WeakHandler LJLIL;
    public final BlockingQueue<InterfaceC65812PsG> LJLILLLLZI;
    public volatile boolean LJLJI;
    public volatile boolean LJLJJI;

    public void LJ() {
        this.LJLIL.removeMessages(0);
    }

    public final void LJFF() {
        String str;
        Process.setThreadPriority(10);
        while (true) {
            try {
                InterfaceC65812PsG take = this.LJLILLLLZI.take();
                LJ();
                if (take != null && (take instanceof AbstractRunnableC65809PsD)) {
                    AbstractRunnableC65809PsD abstractRunnableC65809PsD = (AbstractRunnableC65809PsD) take;
                    String str2 = null;
                    try {
                        this.LJLJJI = true;
                        LIZLLL(abstractRunnableC65809PsD);
                    } catch (Throwable unused) {
                        str = null;
                    }
                    if (abstractRunnableC65809PsD.LJLILLLLZI.get()) {
                        this.LJLJJI = false;
                    } else {
                        String str3 = C16880lQ.LLLLIIIILLL().getName();
                        try {
                            str2 = abstractRunnableC65809PsD.LJLJJL;
                            if (!C38354F3m.LJ(str2) && !C38354F3m.LJ(str3)) {
                                C16880lQ.LLLLIIIILLL().setName(str2);
                            }
                            abstractRunnableC65809PsD.run();
                            LJI();
                        } catch (Throwable unused2) {
                            str = str2;
                            str2 = str3;
                            str3 = str2;
                            str2 = str;
                            this.LJLJJI = false;
                            if (!C38354F3m.LJ(str2)) {
                                C16880lQ.LLLLIIIILLL().setName(str3);
                            }
                        }
                        this.LJLJJI = false;
                        if (!C38354F3m.LJ(str2) && !C38354F3m.LJ(str3)) {
                            C16880lQ.LLLLIIIILLL().setName(str3);
                        }
                    }
                }
            } catch (InterruptedException unused3) {
                if (this.LJLJI) {
                    return;
                }
            }
        }
    }

    static {
        new AtomicInteger();
    }

    public void LJI() {
        LJ();
        this.LJLIL.sendEmptyMessageDelayed(0, 2000L);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean LIZ;
        try {
            LJFF();
        } finally {
            if (LIZ) {
            }
        }
    }

    public void LIZLLL(AbstractRunnableC65809PsD abstractRunnableC65809PsD) {
        abstractRunnableC65809PsD.LJLJI.removeMessages(0);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            if (message.what == 0) {
                LJLJJL.LJ();
            }
        } catch (Throwable unused) {
        }
    }

    public C65808PsC(BlockingQueue blockingQueue, String str) {
        super(TextUtils.isEmpty(str) ? "ApiDispatcher-Thread" : str);
        this.LJLIL = new WeakHandler(C16880lQ.LLJJJJ(), this);
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLILLLLZI = blockingQueue;
    }
}
