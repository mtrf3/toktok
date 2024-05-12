package X;

/* loaded from: classes16.dex */
public final class X9M extends X9K {
    public final XKE<?> LJLIL;
    public final /* synthetic */ XK4<E> LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoveReceiveOnCancel[");
        LIZ.append(this.LJLIL);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.X9G
    public final void LIZ(Throwable th) {
        if (this.LJLIL.LJIL()) {
            this.LJLILLLLZI.getClass();
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LIZ(th);
        return C76800UCe.LIZ;
    }

    public X9M(XK4 xk4, XKE<?> xke) {
        this.LJLILLLLZI = xk4;
        this.LJLIL = xke;
    }
}
