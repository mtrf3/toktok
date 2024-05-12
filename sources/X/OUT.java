package X;

import android.os.HandlerThread;

/* loaded from: classes11.dex */
public class OUT {
    public final HandlerThread LIZ;
    public final OUS LIZIZ;

    public OUT(VAD vad) {
        HandlerThread handlerThread = new HandlerThread("DnsHandlerThread");
        this.LIZ = handlerThread;
        handlerThread.start();
        this.LIZIZ = new OUS(this, handlerThread.getLooper(), vad);
    }

    public final void LIZ(int i) {
        OUS ous;
        if (this.LIZ == null || (ous = this.LIZIZ) == null) {
            return;
        }
        ous.sendEmptyMessage(i);
    }
}
