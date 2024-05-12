package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Suq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73616Suq extends AtomicReference<InterfaceC92693kP> implements InterfaceC92693kP {
    public static final long serialVersionUID = -754898800686245608L;

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    public C73616Suq() {
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public C73616Suq(InterfaceC92693kP interfaceC92693kP) {
        lazySet(interfaceC92693kP);
    }

    public boolean replace(InterfaceC92693kP interfaceC92693kP) {
        return EnumC73418Sre.replace(this, interfaceC92693kP);
    }

    public boolean update(InterfaceC92693kP interfaceC92693kP) {
        return EnumC73418Sre.set(this, interfaceC92693kP);
    }
}
