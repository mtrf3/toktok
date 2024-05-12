package X;

/* renamed from: X.245, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass245 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ EnumC22040tk LJLILLLLZI;
    public final /* synthetic */ C20140qg LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass245(boolean z, EnumC22040tk enumC22040tk, C20140qg c20140qg, int i) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = enumC22040tk;
        this.LJLJI = c20140qg;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C20160qi.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1);
        return C76800UCe.LIZ;
    }
}
