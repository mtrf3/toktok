package X;

import com.ss.android.ugc.aweme.model.Price;

/* renamed from: X.V6x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79211V6x extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Price LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C08370Un LJLJI;
    public final /* synthetic */ C08370Un LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ InterfaceC07790Sh LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79211V6x(Price price, String str, C08370Un c08370Un, C08370Un c08370Un2, long j, long j2, InterfaceC07790Sh interfaceC07790Sh, int i, int i2) {
        super(2);
        this.LJLIL = price;
        this.LJLILLLLZI = str;
        this.LJLJI = c08370Un;
        this.LJLJJI = c08370Un2;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = interfaceC07790Sh;
        this.LJLJLJ = i;
        this.LJLJLLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        V5Z.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC24520xk, this.LJLJLJ | 1, this.LJLJLLL);
        return C76800UCe.LIZ;
    }
}
