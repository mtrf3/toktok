package X;

import android.webkit.WebView;

/* renamed from: X.aEX, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92673aEX extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C11850dJ LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<String, Boolean> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<WebView, C76800UCe> LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92673aEX(C11850dJ c11850dJ, Boolean bool, String str, boolean z, InterfaceC88472Yns<? super String, Boolean> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super WebView, C76800UCe> interfaceC88472Yns3, int i, int i2) {
        super(2);
        this.LJLIL = c11850dJ;
        this.LJLILLLLZI = bool;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC88472Yns2;
        this.LJLJL = interfaceC88472Yns3;
        this.LJLJLJ = i;
        this.LJLJLLL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91860a1Q.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC24520xk, this.LJLJLJ | 1, this.LJLJLLL);
        return C76800UCe.LIZ;
    }
}
