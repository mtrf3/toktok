package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes12.dex */
public final class PF4 {
    public static final PF7 LJFF = new PF7();
    public static final PF8 LJI = new PF8();
    public final HandlerThreadC64126PEs LIZ;
    public volatile Handler LIZLLL;
    public final Queue<PFA> LIZIZ = new ConcurrentLinkedQueue();
    public final Queue<Message> LIZJ = new ConcurrentLinkedQueue();
    public final Object LJ = new Object();

    public PF4(String str) {
        this.LIZ = new HandlerThreadC64126PEs(this, str);
    }

    public final boolean LIZ(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        if (this.LIZLLL == null) {
            synchronized (this.LJ) {
                if (this.LIZLLL == null) {
                    ((ConcurrentLinkedQueue) this.LIZIZ).add(new PFA(message, uptimeMillis));
                    return true;
                }
            }
        }
        return this.LIZLLL.sendMessageAtTime(message, uptimeMillis);
    }
}
