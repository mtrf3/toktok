package X;

import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes11.dex */
public final class OE6 {
    public OE7 LIZ;
    public HandlerThread LIZIZ;
    public final String LIZJ;

    public final void LIZ() {
        if (this.LIZ == null || this.LIZIZ.getLooper() == null) {
            HandlerThread handlerThread = new HandlerThread(this.LIZJ, 3);
            this.LIZIZ = handlerThread;
            handlerThread.start();
            this.LIZ = new OE7(this, this.LIZIZ.getLooper());
        }
    }

    public OE6(String str) {
        this.LIZJ = str;
        LIZ();
    }

    public final void LIZIZ(OEL oel, long j, long j2) {
        LIZ();
        int LIZIZ = oel.LIZIZ();
        oel.LIZ = j2;
        Message obtainMessage = this.LIZ.obtainMessage(LIZIZ);
        obtainMessage.obj = oel;
        obtainMessage.what = LIZIZ;
        this.LIZ.sendMessageDelayed(obtainMessage, j);
    }
}
