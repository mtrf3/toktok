package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes12.dex */
public class PCZ extends HandlerThread {
    public final /* synthetic */ C64056PCa LJLIL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (this.LJLIL.LJ) {
            this.LJLIL.LIZLLL = new Handler();
        }
        this.LJLIL.LIZLLL.post(new RunnableC64057PCb(this.LJLIL));
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCZ(C64056PCa c64056PCa) {
        super("AsyncEventManager-Thread");
        this.LJLIL = c64056PCa;
    }
}
