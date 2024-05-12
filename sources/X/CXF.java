package X;

/* loaded from: classes6.dex */
public final class CXF extends AbstractC32664Crs<Boolean> {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public CXF(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<Boolean> w4w) {
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }

    @Override // X.AbstractC32664Crs
    public final void LJFF(W4W<Boolean> w4w) {
        Boolean bool;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            if (w4w == null || (bool = w4w.getResult()) == null) {
                bool = Boolean.FALSE;
            }
            interfaceC88472Yns.invoke(bool);
        }
    }
}
