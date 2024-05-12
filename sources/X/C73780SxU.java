package X;

/* renamed from: X.SxU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73780SxU<T> extends AbstractC73739Swp<T, T> {
    public final InterfaceC64592gB<? super T> LJLJI;
    public final InterfaceC64592gB<? super Throwable> LJLJJI;
    public final InterfaceC29937Boz LJLJJL;
    public final InterfaceC29937Boz LJLJJLL;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        if (interfaceC73740Swq instanceof InterfaceC73813Sy1) {
            this.LJLILLLLZI.LJIIL(new C73827SyF((InterfaceC73813Sy1) interfaceC73740Swq, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL));
        } else {
            this.LJLILLLLZI.LJIIL(new C73832SyK(interfaceC73740Swq, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73780SxU(AbstractC73745Swv abstractC73745Swv, InterfaceC64592gB interfaceC64592gB, InterfaceC64592gB interfaceC64592gB2) {
        super(abstractC73745Swv);
        IMU imu = C73674Svm.LIZJ;
        this.LJLJI = interfaceC64592gB;
        this.LJLJJI = interfaceC64592gB2;
        this.LJLJJL = imu;
        this.LJLJJLL = imu;
    }
}
