package X;

/* loaded from: classes16.dex */
public final class X9J extends X9H {
    public final T2N LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisposeOnCancel[");
        LIZ.append(this.LJLIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public X9J(T2N t2n) {
        this.LJLIL = t2n;
    }

    @Override // X.X9G
    public final void LIZ(Throwable th) {
        this.LJLIL.dispose();
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LIZ(th);
        return C76800UCe.LIZ;
    }
}
