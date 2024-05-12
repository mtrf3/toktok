package X;

/* loaded from: classes14.dex */
public final class V6C extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ V68 LJLIL;
    public final /* synthetic */ V5Q LJLILLLLZI;
    public final /* synthetic */ InterfaceC23370vt LJLJI;
    public final /* synthetic */ V6X LJLJJI;
    public final /* synthetic */ V7E LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V6C(V68 v68, V5Q v5q, InterfaceC23370vt interfaceC23370vt, V6X v6x, V7E v7e, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, int i, int i2) {
        super(2);
        this.LJLIL = v68;
        this.LJLILLLLZI = v5q;
        this.LJLJI = interfaceC23370vt;
        this.LJLJJI = v6x;
        this.LJLJJL = v7e;
        this.LJLJJLL = interfaceC88471Ynr;
        this.LJLJL = i;
        this.LJLJLJ = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V66.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC24520xk, this.LJLJL | 1, this.LJLJLJ);
        return C76800UCe.LIZ;
    }
}
