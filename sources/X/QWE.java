package X;

import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes12.dex */
public final class QWE {
    public static final QWQ LIZ = new QWQ();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ() {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (!atomicBoolean.get()) {
            synchronized (atomicBoolean) {
                if (!atomicBoolean.get()) {
                    EventBus LIZJ = EventBus.LIZJ();
                    QWQ qwq = LIZ;
                    if (!LIZJ.LJI(qwq)) {
                        atomicBoolean.set(true);
                        if (C35154Dqw.LIZ()) {
                            C67128QWe.LIZIZ.LIZJ(3001, -10000, qwq);
                        } else {
                            EventBus.LIZJ().LJIILJJIL(qwq);
                        }
                    }
                }
            }
        }
    }
}
