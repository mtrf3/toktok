package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Srv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73435Srv extends AtomicReference<InterfaceC73436Srw> implements InterfaceC92693kP {
    public static final long serialVersionUID = 5718521705281392066L;

    @Override // X.InterfaceC92693kP
    public void dispose() {
        InterfaceC73436Srw andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            try {
                andSet.cancel();
            } catch (Exception e) {
                V0N.LJJIL(e);
                C73548Stk.LIZIZ(e);
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == null) {
            return true;
        }
        return false;
    }

    public C73435Srv(InterfaceC73436Srw interfaceC73436Srw) {
        super(interfaceC73436Srw);
    }
}
