package X;

/* renamed from: X.68V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68V extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, Integer, C76800UCe> {
    public final /* synthetic */ C68U LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68V(C68U c68u, int i, int i2, int i3, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(2);
        this.LJLIL = c68u;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, Integer num2) {
        num.intValue();
        this.LJLIL.LIZJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, num2.intValue(), this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
