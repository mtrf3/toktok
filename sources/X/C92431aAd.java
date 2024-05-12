package X;

/* renamed from: X.aAd, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92431aAd extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92431aAd(Object obj, String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.LJLIL = obj;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91730ZzK.LJFF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
