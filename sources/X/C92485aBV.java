package X;

/* renamed from: X.aBV, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92485aBV extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92485aBV(int i, String str, InterfaceC65784Pro interfaceC65784Pro) {
        super(2);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91749Zzd.LIZ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1);
        return C76800UCe.LIZ;
    }
}