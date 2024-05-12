package X;

import android.os.Handler;

/* renamed from: X.Qo6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68102Qo6 {
    public static volatile HandlerC68138Qog LIZLLL;
    public final InterfaceC68124QoS LIZ;
    public final RunnableC68099Qo3 LIZIZ;
    public volatile long LIZJ;

    public abstract void LIZIZ();

    public final void LIZ() {
        this.LIZJ = 0L;
        LIZLLL().removeCallbacks(this.LIZIZ);
    }

    public final Handler LIZLLL() {
        HandlerC68138Qog handlerC68138Qog;
        if (LIZLLL != null) {
            return LIZLLL;
        }
        synchronized (AbstractC68102Qo6.class) {
            if (LIZLLL == null) {
                LIZLLL = new HandlerC68138Qog(this.LIZ.LIZ().getMainLooper());
            }
            handlerC68138Qog = LIZLLL;
        }
        return handlerC68138Qog;
    }

    public AbstractC68102Qo6(InterfaceC68124QoS interfaceC68124QoS) {
        QH7.LJIIIIZZ(interfaceC68124QoS);
        this.LIZ = interfaceC68124QoS;
        this.LIZIZ = new RunnableC68099Qo3(0, this, interfaceC68124QoS);
    }

    public final void LIZJ(long j) {
        LIZ();
        if (j >= 0) {
            this.LIZ.LIZLLL().getClass();
            this.LIZJ = System.currentTimeMillis();
            if (!LIZLLL().postDelayed(this.LIZIZ, j)) {
                this.LIZ.LIZJ().LJFF.LIZIZ(Long.valueOf(j), "Failed to schedule delayed post. time");
            }
        }
    }
}
