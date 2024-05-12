package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.IDqS422S0100000_31;

/* renamed from: X.aGb, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92801aGb extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ PIViewModel LJLIL;
    public final /* synthetic */ C08370Un LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ C91706Zyw LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92801aGb(PIViewModel pIViewModel, C08370Un c08370Un, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2, C91706Zyw c91706Zyw) {
        super(2);
        this.LJLIL = pIViewModel;
        this.LJLILLLLZI = c08370Un;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
        this.LJLJL = c91706Zyw;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            String webViewTitle = this.LJLIL.getUiState().getWebViewTitle();
            C08370Un c08370Un = this.LJLILLLLZI;
            IDqS422S0100000_31 iDqS422S0100000_31 = new IDqS422S0100000_31(this.LJLJL, 89);
            boolean z = this.LJLJI;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
            int i = this.LJLJJL;
            C91877a1h.LIZ(webViewTitle, null, c08370Un, null, true, iDqS422S0100000_31, false, z, false, interfaceC65784Pro, interfaceC24520xk2, ((i << 3) & 29360128) | ((i >> 18) & 896) | 1597440 | ((this.LJLJJLL << 24) & 1879048192), 266);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
