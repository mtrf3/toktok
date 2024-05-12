package X;

/* renamed from: X.aHW, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92858aHW extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC91771Zzz LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92858aHW(String str, InterfaceC91771Zzz interfaceC91771Zzz, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC91771Zzz;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91982a3O.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
