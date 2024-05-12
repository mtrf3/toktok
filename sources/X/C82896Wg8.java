package X;

/* renamed from: X.Wg8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82896Wg8 implements InterfaceC82912WgO {
    public C5NP LIZ;
    public InterfaceC88472Yns<? super InterfaceC82912WgO, C76800UCe> LIZIZ;

    @Override // X.InterfaceC82912WgO
    public final void LIZ() {
        this.LIZ = C5SL.LIZ;
    }

    @Override // X.InterfaceC82912WgO
    public final C5NP getLogger() {
        if (this.LIZIZ != null) {
            synchronized (this) {
                InterfaceC88472Yns<? super InterfaceC82912WgO, C76800UCe> interfaceC88472Yns = this.LIZIZ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(this);
                }
                this.LIZIZ = null;
            }
        }
        return this.LIZ;
    }
}
