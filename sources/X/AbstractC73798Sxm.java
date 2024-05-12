package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Sxm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73798Sxm<T> implements InterfaceC73812Sy0<T>, InterfaceC92693kP {
    public final AtomicReference<InterfaceC73651SvP> LJLIL = new AtomicReference<>();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73755Sx5.cancel(this.LJLIL);
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLIL.get() == EnumC73755Sx5.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73812Sy0, X.InterfaceC73740Swq
    public final void onSubscribe(InterfaceC73651SvP interfaceC73651SvP) {
        AtomicReference<InterfaceC73651SvP> atomicReference = this.LJLIL;
        Class<?> cls = getClass();
        C73320Sq4.LIZ(interfaceC73651SvP, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC73651SvP)) {
            if (atomicReference.get() != null) {
                interfaceC73651SvP.cancel();
                if (atomicReference.get() == EnumC73755Sx5.CANCELLED) {
                    return;
                }
                C78999UzT.LJIL(cls);
                return;
            }
        }
        this.LJLIL.get().request(Long.MAX_VALUE);
    }
}
