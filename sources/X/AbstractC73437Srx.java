package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Srx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73437Srx implements InterfaceC73442Ss2, InterfaceC92693kP {
    public final AtomicReference<InterfaceC92693kP> LJLIL = new AtomicReference<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this.LJLIL);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLIL.get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        C78999UzT.LJJ(this.LJLIL, interfaceC92693kP, getClass());
    }
}
