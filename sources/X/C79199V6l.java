package X;

import com.ss.android.ugc.aweme.model.Price;

/* renamed from: X.V6l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79199V6l extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Price LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79199V6l(Price price, String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i) {
        super(2);
        this.LJLIL = price;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5Z.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1);
        return C76800UCe.LIZ;
    }
}
