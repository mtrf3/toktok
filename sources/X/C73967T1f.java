package X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: X.T1f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73967T1f extends AbstractC73946T0k {
    public final Handler LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC73946T0k
    public final AbstractC73945T0j LIZ() {
        return new C73966T1e(this.LIZIZ, this.LIZJ);
    }

    public C73967T1f(Handler handler, boolean z) {
        this.LIZIZ = handler;
        this.LIZJ = z;
    }

    @Override // X.AbstractC73946T0k
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                Handler handler = this.LIZIZ;
                RunnableC73968T1g runnableC73968T1g = new RunnableC73968T1g(handler, runnable);
                Message obtain = Message.obtain(handler, runnableC73968T1g);
                if (this.LIZJ) {
                    obtain.setAsynchronous(true);
                }
                this.LIZIZ.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return runnableC73968T1g;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
