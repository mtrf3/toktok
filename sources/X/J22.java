package X;

/* loaded from: classes9.dex */
public final class J22 implements InterfaceC92693kP {
    public final InterfaceC37276Ek4<?> LJLIL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLIL.cancel();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLIL.isCanceled();
    }

    public J22(InterfaceC37276Ek4<?> interfaceC37276Ek4) {
        this.LJLIL = interfaceC37276Ek4;
    }
}
