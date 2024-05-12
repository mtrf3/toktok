package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.PKy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class HandlerThreadC64288PKy extends HandlerThread {
    public volatile int LJLIL;
    public volatile boolean LJLILLLLZI;
    public final /* synthetic */ C64284PKu LJLJI;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (this.LJLJI.LJ) {
            this.LJLJI.LIZLLL = new Handler();
        }
        this.LJLJI.LIZLLL.post(new PL8(this.LJLJI));
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                try {
                    if (this.LJLIL < 5) {
                        PJZ.LIZ.getClass();
                        PJY.LIZ("NPTH_CATCH", th);
                    } else if (!this.LJLILLLLZI) {
                        this.LJLILLLLZI = true;
                        PJY pjy = PJZ.LIZ;
                        RuntimeException runtimeException = new RuntimeException();
                        pjy.getClass();
                        PJY.LIZ("NPTH_ERR_MAX", runtimeException);
                    }
                    this.LJLIL++;
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC64288PKy(C64284PKu c64284PKu) {
        super("default_npth_thread");
        this.LJLJI = c64284PKu;
    }
}
