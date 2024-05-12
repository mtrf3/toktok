package X;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes16.dex */
public abstract class XJF extends AbstractC78624UtQ {
    public abstract Thread getThread();

    public final void unpark() {
        Thread thread = getThread();
        if (C16880lQ.LLLLIIIILLL() != thread) {
            LockSupport.unpark(thread);
        }
    }

    public final void reschedule(long j, XJB xjb) {
        XJE.LJLIL.schedule(j, xjb);
    }
}
