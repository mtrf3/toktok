package X;

/* loaded from: classes16.dex */
public final class X9I extends X9H {
    public final InterfaceC88472Yns<Throwable, C76800UCe> LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InvokeOnCancel[");
        LIZ.append(C16880lQ.LJLLJ(this.LJLIL.getClass()));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X9I(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.X9G
    public final void LIZ(Throwable th) {
        this.LJLIL.invoke(th);
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LIZ(th);
        return C76800UCe.LIZ;
    }
}
