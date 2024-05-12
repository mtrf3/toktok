package X;

import Y.ARunnableS48S0100000_12;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Szt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73929Szt implements InterfaceC92693kP {
    public final AtomicBoolean LJLIL = new AtomicBoolean();

    public abstract void LIZ();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (this.LJLIL.compareAndSet(false, true)) {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                LIZ();
            } else {
                C73969T1h.LIZIZ().LIZIZ(new ARunnableS48S0100000_12(this, 112));
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLIL.get();
    }
}
