package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.IDqS174S0200000_31;

/* renamed from: X.aGQ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92790aGQ extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ PIViewModel LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C92145a61 LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C08370Un LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92790aGQ(PIViewModel pIViewModel, Boolean bool, boolean z, C92145a61 c92145a61, float f, String str, C08370Un c08370Un, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(2);
        this.LJLIL = pIViewModel;
        this.LJLILLLLZI = bool;
        this.LJLJI = z;
        this.LJLJJI = c92145a61;
        this.LJLJJL = f;
        this.LJLJJLL = str;
        this.LJLJL = c08370Un;
        this.LJLJLJ = interfaceC65784Pro;
        this.LJLJLLL = i;
        this.LJLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            boolean isFullScreen = this.LJLIL.getUiState().isFullScreen();
            C93168aMW c93168aMW = new C93168aMW(this.LJLIL);
            Boolean bool = this.LJLILLLLZI;
            Boolean valueOf = Boolean.valueOf(this.LJLJI);
            PIViewModel pIViewModel = this.LJLIL;
            C92145a61 c92145a61 = this.LJLJJI;
            float f = this.LJLJJL;
            String str = this.LJLJJLL;
            C08370Un c08370Un = this.LJLJL;
            IDqS174S0200000_31 iDqS174S0200000_31 = new IDqS174S0200000_31(pIViewModel, c92145a61, 16);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
            int i = ((this.LJLJLLL >> 6) & 14) | 1577472;
            int i2 = this.LJLL;
            C91904a28.LIZ(bool, valueOf, pIViewModel, c92145a61, f, isFullScreen, false, str, c08370Un, iDqS174S0200000_31, c93168aMW, interfaceC65784Pro, interfaceC24520xk2, ((i2 << 21) & 234881024) | i, (i2 >> 9) & 112, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
