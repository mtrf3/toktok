package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.PEs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class HandlerThreadC64126PEs extends HandlerThread {
    public final /* synthetic */ PF4 LJLIL;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (this.LJLIL.LJ) {
            this.LJLIL.LIZLLL = new Handler();
        }
        this.LJLIL.LIZLLL.post(new PF3(this.LJLIL));
        while (true) {
            try {
                Looper.loop();
            } catch (Throwable th) {
                C10060aQ.LIZ.LIZ(th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC64126PEs(PF4 pf4, String str) {
        super(str);
        this.LJLIL = pf4;
    }
}
