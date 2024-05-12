package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC91573ib implements InterfaceC92693kP {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);

    public abstract void LIZ();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (this.LJLIL.compareAndSet(false, true)) {
            LIZ();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLIL.get();
    }
}
