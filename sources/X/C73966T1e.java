package X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: X.T1e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73966T1e extends AbstractC73945T0j {
    public final Handler LJLIL;
    public final boolean LJLILLLLZI;
    public volatile boolean LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI = true;
        this.LJLIL.removeCallbacksAndMessages(this);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI;
    }

    public C73966T1e(Handler handler, boolean z) {
        this.LJLIL = handler;
        this.LJLILLLLZI = z;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable != null) {
            if (timeUnit != null) {
                if (this.LJLJI) {
                    return EnumC73538Sta.INSTANCE;
                }
                Handler handler = this.LJLIL;
                RunnableC73968T1g runnableC73968T1g = new RunnableC73968T1g(handler, runnable);
                Message obtain = Message.obtain(handler, runnableC73968T1g);
                obtain.obj = this;
                if (this.LJLILLLLZI) {
                    obtain.setAsynchronous(true);
                }
                this.LJLIL.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (this.LJLJI) {
                    this.LJLIL.removeCallbacks(runnableC73968T1g);
                    return EnumC73538Sta.INSTANCE;
                }
                return runnableC73968T1g;
            }
            throw new NullPointerException("unit == null");
        }
        throw new NullPointerException("run == null");
    }
}
