package X;

/* renamed from: X.aBa, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92490aBa extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ EnumC92109a5R LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92490aBa(EnumC92109a5R enumC92109a5R, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.LJLIL = enumC92109a5R;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91753Zzh.LIZ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
