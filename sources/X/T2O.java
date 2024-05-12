package X;

/* loaded from: classes13.dex */
public final class T2O extends AbstractC84652XKe {
    public final InterfaceC67352kd<C76800UCe> LJLJJL;

    public T2O(XKS xks) {
        this.LJLJJL = xks;
    }

    @Override // X.XL0
    public final void LJJII(Throwable th) {
        InterfaceC67352kd<C76800UCe> interfaceC67352kd = this.LJLJJL;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        interfaceC67352kd.resumeWith(c76800UCe);
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LJJII(th);
        return C76800UCe.LIZ;
    }
}
