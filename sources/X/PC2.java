package X;

import Y.ARunnableS18S0000000_11;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedTransferQueue;

/* loaded from: classes12.dex */
public final class PC2 {
    public static final List<InterfaceC64047PBr> LIZ = new CopyOnWriteArrayList();
    public static final List<PC3> LIZIZ = new CopyOnWriteArrayList();
    public static final List<PC1> LIZJ = new CopyOnWriteArrayList();
    public static final BlockingQueue<InterfaceC64036PBg> LIZLLL = new LinkedTransferQueue();
    public static volatile boolean LJ = false;

    public static void LIZ(InterfaceC64036PBg interfaceC64036PBg) {
        while (C79146V4k.LIZ) {
            if (C79146V4k.LIZ) {
                try {
                    if (C79146V4k.LIZIZ < 100) {
                        Thread.sleep(100L);
                    } else {
                        C79146V4k.LIZ = false;
                    }
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C79146V4k.LIZIZ++;
            } else {
                C79146V4k.LIZIZ = 0L;
            }
        }
        if (interfaceC64036PBg == null) {
            return;
        }
        ((LinkedTransferQueue) LIZLLL).offer(interfaceC64036PBg);
        if (LJ) {
            return;
        }
        synchronized (PC2.class) {
            if (LJ) {
                return;
            }
            LJ = true;
            new PthreadThread(new ARunnableS18S0000000_11(29), "APM-Monitor").start();
        }
    }
}
