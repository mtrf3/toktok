package X;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.PiD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65189PiD<T> implements InterfaceC65194PiI {
    public final Context LIZ;
    public final ScheduledExecutorService LIZIZ;
    public final KO5<T> LIZJ;

    @Override // X.InterfaceC65194PiI
    public final void LIZ() {
        try {
            this.LIZIZ.submit(new RunnableC51616KNo(9, this));
        } catch (Exception unused) {
            C78841Uwv.LJJI(this.LIZ);
        }
    }

    public AbstractC65189PiD(Context context, C65186PiA c65186PiA, C65190PiE c65190PiE, ScheduledExecutorService scheduledExecutorService) {
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZIZ = scheduledExecutorService;
        this.LIZJ = c65186PiA;
        ((CopyOnWriteArrayList) c65190PiE.LJFF).add(this);
    }
}
