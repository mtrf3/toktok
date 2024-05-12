package X;

import android.os.Message;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.PsF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65811PsF extends C65808PsC {
    @Override // X.C65808PsC
    public final void LJ() {
        this.LJLIL.removeMessages(1);
    }

    @Override // X.C65808PsC
    public final void LJI() {
        LJ();
        this.LJLIL.sendEmptyMessageDelayed(1, 2000L);
    }

    @Override // X.C65808PsC, java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            super.run();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C65811PsF(BlockingQueue blockingQueue) {
        super(blockingQueue, "Account-DownloadDispatcher-Thread");
    }

    @Override // X.C65808PsC
    public final void LIZLLL(AbstractRunnableC65809PsD abstractRunnableC65809PsD) {
        abstractRunnableC65809PsD.LJLJI.removeMessages(1);
    }

    @Override // X.C65808PsC, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        try {
            if (message.what == 1) {
                C65808PsC.LJLJJL.LIZLLL();
            }
        } catch (Throwable unused) {
        }
    }
}
