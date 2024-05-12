package X;

/* loaded from: classes16.dex */
public final class X9L extends X9K {
    public final C84629XJh LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoveOnCancel[");
        LIZ.append(this.LJLIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public X9L(C84629XJh c84629XJh) {
        this.LJLIL = c84629XJh;
    }

    @Override // X.X9G
    public final void LIZ(Throwable th) {
        this.LJLIL.LJIL();
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LIZ(th);
        return C76800UCe.LIZ;
    }
}
