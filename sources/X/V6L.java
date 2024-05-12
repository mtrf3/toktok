package X;

/* loaded from: classes14.dex */
public final class V6L extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ V7O LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<V75, InterfaceC67352kd<? super C76800UCe>, Object> LJLILLLLZI;
    public final /* synthetic */ V6O<T> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C0UK LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V6L(V7O v7o, InterfaceC88471Ynr<? super V75, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, V6O<T> v6o, int i, int i2, C0UK c0uk, int i3) {
        super(2);
        this.LJLIL = v7o;
        this.LJLILLLLZI = interfaceC88471Ynr;
        this.LJLJI = v6o;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = c0uk;
        this.LJLJL = i3;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V6M.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC24520xk, this.LJLJL | 1);
        return C76800UCe.LIZ;
    }
}
