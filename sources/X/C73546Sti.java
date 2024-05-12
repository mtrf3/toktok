package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sti, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73546Sti extends AtomicReference<InterfaceC92693kP> implements InterfaceC73442Ss2, InterfaceC92693kP {
    public static final long serialVersionUID = -7545121636549663526L;

    public boolean hasCustomOnError() {
        return false;
    }

    @Override // X.InterfaceC73442Ss2
    public void onComplete() {
        lazySet(EnumC73418Sre.DISPOSED);
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == EnumC73418Sre.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73442Ss2
    public void onError(Throwable th) {
        lazySet(EnumC73418Sre.DISPOSED);
        C73548Stk.LIZIZ(new C73545Sth(th));
    }

    @Override // X.InterfaceC73442Ss2
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }
}
