package X;

/* renamed from: X.V6z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79213V6z extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ InterfaceC07790Sh LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79213V6z(InterfaceC07790Sh interfaceC07790Sh, boolean z, float f, int i, int i2) {
        super(2);
        this.LJLIL = interfaceC07790Sh;
        this.LJLILLLLZI = z;
        this.LJLJI = f;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C79175V5n.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
