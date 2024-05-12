package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aGc, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92802aGc extends AbstractC65781Prl implements InterfaceC88473Ynt<C23390vv, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Boolean LJLIL;
    public final /* synthetic */ PIViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<WebView, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Boolean LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ Context LJLJLJ;
    public final /* synthetic */ C91706Zyw LJLJLLL;
    public final /* synthetic */ View LJLL;
    public final /* synthetic */ InterfaceC91780a08 LJLLI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92802aGc(Boolean bool, PIViewModel pIViewModel, String str, InterfaceC88472Yns<? super WebView, C76800UCe> interfaceC88472Yns, int i, Boolean bool2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Context context, C91706Zyw c91706Zyw, View view, InterfaceC91780a08 interfaceC91780a08, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(3);
        this.LJLIL = bool;
        this.LJLILLLLZI = pIViewModel;
        this.LJLJI = str;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = i;
        this.LJLJJLL = bool2;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = context;
        this.LJLJLLL = c91706Zyw;
        this.LJLL = view;
        this.LJLLI = interfaceC91780a08;
        this.LJLLILLLL = interfaceC65784Pro2;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(C23390vv c23390vv, InterfaceC24520xk interfaceC24520xk, Integer num) {
        C11850dJ c11850dJ;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 81) ^ 16) != 0 || !interfaceC24520xk2.LIZ()) {
            interfaceC24520xk2.LJJIIJ(1678101904);
            Boolean bool = this.LJLIL;
            Boolean bool2 = Boolean.TRUE;
            if (o.LJ(bool, bool2)) {
                c11850dJ = null;
            } else {
                c11850dJ = new C11850dJ(C91671ZyN.LIZ(interfaceC24520xk2).LIZIZ);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            C93174aMc c93174aMc = new C93174aMc(this.LJLILLLLZI);
            String str = this.LJLJI;
            C92806aGg c92806aGg = new C92806aGg(this.LJLILLLLZI, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL);
            InterfaceC88472Yns<WebView, C76800UCe> interfaceC88472Yns = this.LJLJJI;
            int i = this.LJLJJL;
            C91860a1Q.LIZ(c11850dJ, bool2, str, false, c92806aGg, c93174aMc, interfaceC88472Yns, interfaceC24520xk2, ((i >> 9) & 3670016) | ((i >> 15) & 896) | 48, 8);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
