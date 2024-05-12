package X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.T1b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73963T1b extends AbstractC73945T0j {
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

    public C73963T1b(Handler handler, boolean z) {
        o.LJIIIZ(handler, "handler");
        this.LJLIL = handler;
        this.LJLILLLLZI = z;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable rawRunnable, long j, TimeUnit unit) {
        o.LJIIIZ(rawRunnable, "rawRunnable");
        o.LJIIIZ(unit, "unit");
        if (this.LJLJI) {
            EnumC73538Sta enumC73538Sta = EnumC73538Sta.INSTANCE;
            o.LJIIIIZZ(enumC73538Sta, "disposed()");
            return enumC73538Sta;
        }
        boolean LIZ = C73374Sqw.LIZ();
        RunnableC73965T1d runnableC73965T1d = new RunnableC73965T1d(this.LJLIL, rawRunnable, LIZ);
        if (LIZ) {
            runnableC73965T1d.run();
            return runnableC73965T1d;
        }
        Message obtain = Message.obtain(this.LJLIL, runnableC73965T1d);
        obtain.obj = this;
        if (this.LJLILLLLZI) {
            obtain.setAsynchronous(true);
        }
        this.LJLIL.sendMessageDelayed(obtain, unit.toMillis(j));
        if (this.LJLJI) {
            this.LJLIL.removeCallbacks(runnableC73965T1d);
            EnumC73538Sta enumC73538Sta2 = EnumC73538Sta.INSTANCE;
            o.LJIIIIZZ(enumC73538Sta2, "disposed()");
            return enumC73538Sta2;
        }
        return runnableC73965T1d;
    }
}
