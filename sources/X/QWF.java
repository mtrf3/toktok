package X;

import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes12.dex */
public final class QWF {
    public static final C67140QWq LIZ = new C67140QWq();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ() {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (!atomicBoolean.get()) {
            synchronized (atomicBoolean) {
                if (!atomicBoolean.get()) {
                    EventBus LIZJ = EventBus.LIZJ();
                    C67140QWq c67140QWq = LIZ;
                    if (!LIZJ.LJI(c67140QWq)) {
                        atomicBoolean.set(true);
                        if (C35154Dqw.LIZ()) {
                            C67128QWe.LIZIZ.LIZJ(3001, 2, c67140QWq);
                        } else {
                            EventBus.LIZJ().LJIILJJIL(c67140QWq);
                        }
                    }
                }
            }
        }
    }
}
