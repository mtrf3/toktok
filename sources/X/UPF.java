package X;

/* loaded from: classes14.dex */
public final class UPF<T> implements InterfaceC86003Zc {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ UPG LJLILLLLZI;

    public UPF(UPG upg, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = upg;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77150UPq> interfaceC73573Su9) {
        if (this.LJLIL) {
            String LIZLLL = this.LJLILLLLZI.LIZLLL();
            String LJ = this.LJLILLLLZI.LJ();
            UPG upg = this.LJLILLLLZI;
            UQ4.LIZJ(LIZLLL, "user", "facebook", LJ, "token", "process", upg.LJLL, upg.LJLLI, upg.LJLJJL);
        }
        interfaceC73573Su9.onNext(new C77150UPq(this.LJLIL, 0, 0, null, 30));
        UPG upg2 = this.LJLILLLLZI;
        ((InterfaceC58007Mpf) upg2.LJLLL.getValue()).LIZJ(new UPQ(upg2, this.LJLIL));
        interfaceC73573Su9.onComplete();
    }
}
