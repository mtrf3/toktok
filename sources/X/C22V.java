package X;

/* renamed from: X.22V, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22V extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C34331Wj LJLIL;
    public final /* synthetic */ java.util.Map<String, InterfaceC17620mc> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C22V(C34331Wj c34331Wj, java.util.Map<String, ? extends InterfaceC17620mc> map, int i, int i2) {
        super(2);
        this.LJLIL = c34331Wj;
        this.LJLILLLLZI = map;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C17490mP.LIZ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
