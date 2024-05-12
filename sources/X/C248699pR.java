package X;

import com.ss.android.ugc.aweme.model.Price;

/* renamed from: X.9pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248699pR extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C65767PrX<Price> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Price LJLJJI;
    public final /* synthetic */ InterfaceC248679pP LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C248699pR(C65767PrX<Price> c65767PrX, String str, String str2, Price price, InterfaceC248679pP interfaceC248679pP, int i) {
        super(2);
        this.LJLIL = c65767PrX;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = price;
        this.LJLJJL = interfaceC248679pP;
        this.LJLJJLL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C79167V5f.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC24520xk, this.LJLJJLL | 1);
        return C76800UCe.LIZ;
    }
}
