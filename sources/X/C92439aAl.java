package X;

/* renamed from: X.aAl, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92439aAl extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ EnumC91751Zzf LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92439aAl(Boolean bool, EnumC91751Zzf enumC91751Zzf, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.LJLIL = bool;
        this.LJLILLLLZI = enumC91751Zzf;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91735ZzP.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
