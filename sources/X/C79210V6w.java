package X;

/* renamed from: X.V6w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79210V6w extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ A4Y LJLIL;
    public final /* synthetic */ V7H LJLILLLLZI;
    public final /* synthetic */ InterfaceC07790Sh LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79210V6w(A4Y a4y, V7H v7h, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.LJLIL = a4y;
        this.LJLILLLLZI = v7h;
        this.LJLJI = interfaceC07790Sh;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5R.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
