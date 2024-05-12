package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.T1a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73962T1a extends AbstractC73945T0j {
    public volatile boolean LJLIL;
    public final Handler LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLIL = true;
        this.LJLILLLLZI.removeCallbacksAndMessages(this);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLIL;
    }

    public C73962T1a(Handler handler, boolean z) {
        o.LJIIJ(handler, "handler");
        this.LJLILLLLZI = handler;
        this.LJLJI = z;
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable rawRunnable, long j, TimeUnit unit) {
        boolean z;
        o.LJIIJ(rawRunnable, "rawRunnable");
        o.LJIIJ(unit, "unit");
        if (this.LJLIL) {
            EnumC73538Sta enumC73538Sta = EnumC73538Sta.INSTANCE;
            o.LJFF(enumC73538Sta, "Disposables.disposed()");
            return enumC73538Sta;
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            z = true;
        } else {
            z = false;
        }
        T1Y t1y = new T1Y(this.LJLILLLLZI, rawRunnable, z);
        if (z) {
            t1y.run();
            return t1y;
        }
        Message obtain = Message.obtain(this.LJLILLLLZI, t1y);
        obtain.obj = this;
        if (this.LJLJI) {
            obtain.setAsynchronous(true);
        }
        this.LJLILLLLZI.sendMessageDelayed(obtain, unit.toMillis(j));
        if (this.LJLIL) {
            this.LJLILLLLZI.removeCallbacks(t1y);
            EnumC73538Sta enumC73538Sta2 = EnumC73538Sta.INSTANCE;
            o.LJFF(enumC73538Sta2, "Disposables.disposed()");
            return enumC73538Sta2;
        }
        return t1y;
    }
}
