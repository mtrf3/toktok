package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class HWL implements InterfaceC92693kP {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public final /* synthetic */ HW9 LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLILLLLZI.cancel();
        this.LJLIL.set(true);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLIL.get();
    }

    public HWL(HW9 hw9) {
        this.LJLILLLLZI = hw9;
    }
}
